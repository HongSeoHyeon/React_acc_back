package kr.co.seoulit.account.settlement.trialbalance.entity;

import javax.persistence.*;

@Entity
@NamedStoredProcedureQuery(name = "TotalTriabalanceEntity.GetTriabalanceProcedure",
        procedureName = "P_TOTAL_TRIAL_BALANCE", parameters = {
        @StoredProcedureParameter( mode = ParameterMode.IN, name = "SEARCH_PERIOD_NO" , type = Integer.class),
        @StoredProcedureParameter( mode = ParameterMode.IN, name = "ACCOUNTING_SETTLEMENT_STATUS" , type = String.class),
        @StoredProcedureParameter( mode = ParameterMode.OUT, name = "ERROR_CODE", type = Integer.class),
        @StoredProcedureParameter( mode = ParameterMode.OUT, name = "ERROR_MSG", type = String.class),
        @StoredProcedureParameter( mode = ParameterMode.REF_CURSOR, name = "RESULT", type = String.class),
        @StoredProcedureParameter( mode = ParameterMode.REF_CURSOR, name = "RESULT2", type = String.class)
})
public class TotalTriabalanceEntity {
    @Id
    private String id;
}
