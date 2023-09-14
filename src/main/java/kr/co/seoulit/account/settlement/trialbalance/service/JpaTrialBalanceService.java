package kr.co.seoulit.account.settlement.trialbalance.service;

import kr.co.seoulit.account.settlement.trialbalance.to.TotalTrialBalanceDTO;

import java.util.List;

public interface JpaTrialBalanceService {
    List<TotalTrialBalanceDTO> findTotalTrialBalance();

}
