package kr.co.seoulit.account.budget.formulation.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import kr.co.seoulit.account.budget.formulation.to.BudgetBean;
import kr.co.seoulit.account.budget.formulation.to.BudgetStatusBean;
import kr.co.seoulit.account.budget.formulation.to.ComparisonBudgetBean;
import org.springframework.ui.ModelMap;

public interface FormulationService {

	public BudgetBean findBudgetAppl(BudgetBean bean);

	public HashMap<String, Object> findBudgetStatus(HashMap<String, Object> bean);

	public ModelMap modifyBudget(BudgetBean bean);

	public HashMap<String, Object> findComparisonBudget(HashMap<String, Object> bean);

	public ArrayList<BudgetBean> findCurrentBudget(String deptCode , String workplaceCode, String accountPeriodNo, String accountInnerCode);

}
