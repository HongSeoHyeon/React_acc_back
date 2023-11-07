package kr.co.seoulit.account.operate.system.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name = "ACCOUNT")
public class AccountDetailEntity{
    @Id
    @Column(name = "accountInnerCode")
    private String accountInnerCode;

    @Column(name = "accountName")
    private String accountName;

    @Column(name = "parentAccountInnerCode")
    private String parentAccountInnerCode;

    @Column(name = "groupCode")
    private String groupCode;

    @Column(name = "accountCode")
    private String accountCode;

    // 다른 필드 및 getter, setter 메서드 등도 필요할 수 있습니다.
}