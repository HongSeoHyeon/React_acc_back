package kr.co.seoulit.account.operate.system.to;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountDTO implements Serializable {
    private String accountInnerCode;
    private String parentAccountInnerCode;
    private String accountCode;
    private String accountCharacter;
    private String accountName;
    private String accountDisplayNameWithCode;
    private String accountDisplayName;
    private String accountDivision;
    private String accountUseCheck;
    private String accountDescription;
    private String groupCode;
    private String editable;
    private String target;
    private String budget;
}
