package kr.co.seoulit.account.operate.system.repository;

import kr.co.seoulit.account.operate.system.entity.AccountEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface AccountRepository extends CrudRepository<AccountEntity, String> {


    ArrayList<AccountEntity> findByAccountInnerCodeLikeAndParentAccountInnerCodeNotInOrderByAccountInnerCode(String accountInnerCode, ArrayList<String> parentAccountInnerCode);

//            @Query("SELECT a " +
//            "FROM AccountEntity a " +
//            "WHERE a.accountInnerCode LIKE :accountInnerCode " +
//            "AND a.parentAccountInnerCode NOT IN :parentAccountInnerCode " +
//            "GROUP BY a.accountInnerCode, a.accountCharacter, a.accountCode, a.accountDescription, a.accountDisplayName, a.accountDisplayNameWithCode, a.accountDivision, a.accountName, a.accountUseCheck, a.budget, a.editable, a.groupCode, a.parentAccountInnerCode, a.target " +
//            "ORDER BY a.accountInnerCode")
//    ArrayList<AccountEntity> findByAccountInnerCodeLikeAndParentAccountInnerCodeNotInOrderByAccountInnerCode(
//            @Param("accountInnerCode") String accountInnerCode,
//            @Param("parentAccountInnerCode") ArrayList<String> parentAccountInnerCode);

    // JPQL이라 사용하지 않음.
    @Query("SELECT b " +
            "FROM AccountEntity a, AccountEntity b " +
            "WHERE b.accountInnerCode NOT LIKE '%-%' AND b.parentAccountInnerCode = :accountInnerCode " +
            "AND a.accountInnerCode = b.parentAccountInnerCode ORDER BY b.accountInnerCode")
    ArrayList<AccountEntity> selectAccountInnerCodeLikeAndParentAccountInnerCodeNotInOrderByAccountInnerCode(
            @Param("accountInnerCode") String accountInnerCode);
}
