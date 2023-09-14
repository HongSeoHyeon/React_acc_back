package kr.co.seoulit.account.operate.system.service;

import kr.co.seoulit.account.operate.system.entity.AccountEntity;
import kr.co.seoulit.account.operate.system.mapStructMapper.AccountMapStruct;
import kr.co.seoulit.account.operate.system.mapStructMapper.AccountMapper;
import kr.co.seoulit.account.operate.system.repository.AccountRepository;
import kr.co.seoulit.account.operate.system.to.AccountDTO;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JpaAccountSerivceImpl implements JpaAccountService{
    @Autowired
    AccountRepository accountRepository;
    AccountMapStruct accountMapStruct = Mappers.getMapper(AccountMapStruct.class);

    @Override
    public ArrayList<AccountDTO> findParentAccountList(String accountInnerCode, ArrayList<String> parentAccountInnerCode) {
        ArrayList<AccountEntity> account = accountRepository.findByAccountInnerCodeLikeAndParentAccountInnerCodeNotInOrderByAccountInnerCode(accountInnerCode, parentAccountInnerCode);
        List<AccountDTO> accountDTOs = account.stream()
                .map(AccountMapper.INSTANCE::entityToAccountDTO)
                .collect(Collectors.toList());
        System.out.println("findParentAccountList");
        System.out.println("===============t"+accountDTOs);



        return (ArrayList<AccountDTO>) accountDTOs;
    }

    @Override
    public ArrayList<AccountDTO> findDetailAccountList(String code) {
        ArrayList<AccountEntity> account = accountRepository.selectAccountInnerCodeLikeAndParentAccountInnerCodeNotInOrderByAccountInnerCode(code);
        System.out.println("================ENTITY 변환 전 : "+account);
        ArrayList<AccountDTO> result = new ArrayList<>();
        for(AccountEntity entity : account){
            AccountDTO accountDTO = accountMapStruct.toDto(entity);
            result.add(accountDTO);
        }
            System.out.println("findParentAccountList");
            System.out.println("================DTO 변환 후 : "+result);

        return result;

//                List<AccountDTO> accountDTOs = account.stream()
//                .map(AccountMapper.INSTANCE::entityToAccountDTO)
//                .collect(Collectors.toList());
//        System.out.println("findParentAccountList");
//        System.out.println("===============t"+accountDTOs);
//
//        return (ArrayList<AccountDTO>) accountDTOs;


    }
}
