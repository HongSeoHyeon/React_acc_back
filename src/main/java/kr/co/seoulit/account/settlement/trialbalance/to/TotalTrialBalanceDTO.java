package kr.co.seoulit.account.settlement.trialbalance.to;

import lombok.Data;

import java.io.Serializable;

@Data
public class TotalTrialBalanceDTO implements Serializable {
    private String debitsSumBalance;
    private String debitsSum;
    private String accountName;
    private String creditsSum;
    private String creditsSumBalance;

}
