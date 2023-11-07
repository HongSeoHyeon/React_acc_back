package kr.co.seoulit.account.sys.base.to;

import lombok.Data;

import java.io.Serializable;

@Data
public class PeriodDTO implements Serializable {
    private String accountPeriodNo;
    private String periodStartDate;
    private String periodEndDate;
    private String workplaceCode;
}
