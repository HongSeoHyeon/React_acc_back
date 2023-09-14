package kr.co.seoulit.account.operate.system.service;

import kr.co.seoulit.account.operate.system.entity.AccountEntity;
import kr.co.seoulit.account.operate.system.to.AccountDTO;

import java.util.ArrayList;

public interface JpaAccountService {
    public ArrayList<AccountDTO> findParentAccountList(String accountInnerCode, ArrayList<String> parentAccountInnerCode);

    public ArrayList<AccountDTO> findDetailAccountList(String code);
}
