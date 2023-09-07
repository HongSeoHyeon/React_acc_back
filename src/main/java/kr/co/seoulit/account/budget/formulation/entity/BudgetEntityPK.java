package kr.co.seoulit.account.budget.formulation.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class BudgetEntityPK implements Serializable {

    private String accountInnerCode;
    private String accountPeriodNo;
    private String budgetingCode;
    private String deptCode;
    private String workplaceCode;

}
