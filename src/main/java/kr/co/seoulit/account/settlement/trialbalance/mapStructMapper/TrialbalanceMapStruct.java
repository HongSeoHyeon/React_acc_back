package kr.co.seoulit.account.settlement.trialbalance.mapStructMapper;

import kr.co.seoulit.account.operate.system.mapper.EntityMapper;
import kr.co.seoulit.account.settlement.trialbalance.entity.TotalTriabalanceEntity;
import kr.co.seoulit.account.settlement.trialbalance.to.TotalTrialBalanceDTO;
import org.mapstruct.Mapper;

@Mapper
public interface TrialbalanceMapStruct extends EntityMapper<TotalTriabalanceEntity, TotalTrialBalanceDTO> {

}
