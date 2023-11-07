package kr.co.seoulit.account.settlement.trialbalance.service;

import kr.co.seoulit.account.settlement.trialbalance.entity.TotalTriabalanceEntity;
import kr.co.seoulit.account.settlement.trialbalance.mapStructMapper.TrialbalanceMapStruct;
import kr.co.seoulit.account.settlement.trialbalance.repository.JpaTrialBalanceRepository;
import kr.co.seoulit.account.settlement.trialbalance.to.TotalTrialBalanceDTO;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JpaTrialBalanceServiceImpl implements JpaTrialBalanceService {

    @Autowired
    JpaTrialBalanceRepository jpaTrialBalanceRepository;
    TrialbalanceMapStruct trialbalanceMapStruct = Mappers.getMapper(TrialbalanceMapStruct.class);

    @Override
    public List<TotalTrialBalanceDTO> findTotalTrialBalance(String accountPeriodNo, String callResult) {
        List<TotalTriabalanceEntity> trialBalance = jpaTrialBalanceRepository.findTotalTriabal(accountPeriodNo, callResult);
        System.out.println("================ENTITY 변환 전 : "+trialBalance);
        List<TotalTrialBalanceDTO> result = new ArrayList<>();
        for(TotalTriabalanceEntity entity : trialBalance){
            TotalTrialBalanceDTO totalTrialBalanceDTO = trialbalanceMapStruct.toDto(entity);
            result.add(totalTrialBalanceDTO);
        }
            System.out.println("findTotalTrialBalance");
            System.out.println("================DTO 변환 후 : " +result);
        return result;
    }
}
