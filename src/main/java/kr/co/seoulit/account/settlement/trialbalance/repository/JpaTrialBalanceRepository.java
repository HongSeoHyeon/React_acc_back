package kr.co.seoulit.account.settlement.trialbalance.repository;

import kr.co.seoulit.account.settlement.trialbalance.entity.TotalTriabalanceEntity;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface JpaTrialBalanceRepository extends CrudRepository<TotalTriabalanceEntity, String> {

    @Procedure(name = "TotalTriabalanceEntity.GetTriabalanceProcedure")
    ArrayList<TotalTriabalanceEntity> findTotalTriabal(String accountPeriodNo, String callResult);

}