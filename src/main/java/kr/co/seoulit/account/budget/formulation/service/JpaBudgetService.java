package kr.co.seoulit.account.budget.formulation.service;

import kr.co.seoulit.account.budget.formulation.entity.BudgetEntity;
import kr.co.seoulit.account.budget.formulation.entity.BudgetEntityPK;
import kr.co.seoulit.account.budget.formulation.to.BudgetDTO;

import java.util.ArrayList;

public interface JpaBudgetService {
    void save(BudgetEntity budgetEntity);
    ArrayList<BudgetDTO> findBudget(BudgetEntityPK budgetEntityPK);
}

