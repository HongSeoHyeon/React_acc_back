package kr.co.seoulit.account.budget.formulation.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.seoulit.account.budget.formulation.mapper.FormulationMapper;
import kr.co.seoulit.account.budget.formulation.to.BudgetBean;
import org.springframework.ui.ModelMap;

@Service
@Transactional
public class FormulationServiceImpl implements FormulationService {

    @Autowired
    private FormulationMapper formulationDAO;


    @Override
    public HashMap<String, Object> findBudgetStatus(HashMap<String, Object> params) {
        // TODO Auto-generated method stub
        HashMap<String, Object> budgetStatus = formulationDAO.selectBudgetStatus(params);
        System.out.println("budgetStatus = " + budgetStatus );
        return budgetStatus;
    }


    @Override
    public BudgetBean findBudgetAppl(BudgetBean bean) {
        // TODO Auto-generated method stub

        return formulationDAO.selectBudgetAppl(bean);
    }

    @Override
    public ModelMap modifyBudget(BudgetBean bean) {
        ModelMap map = new ModelMap();
        try{
            formulationDAO.updateBudget(bean);
            map.put("errorCode", 1);
            map.put("errorMsg", "성공!");
        }
        catch (Exception e) {
            map.put("errorCode", -1);
            map.put("exceptionClass", e.getClass());
        }
        return map;
    }


    @Override
    public HashMap<String, Object> findComparisonBudget(HashMap<String, Object> params) {
        formulationDAO.selectComparisonBudget(params);


        return params;
    }

    @Override
    public ArrayList<BudgetBean> findCurrentBudget(String deptCode , String workplaceCode, String accountPeriodNo, String accountInnerCode){
        //budgetBean = formulationDAO.selectCurrentBudget(budgetBean);

        ArrayList<BudgetBean> budgetBean= null;

        budgetBean= formulationDAO.selectCurrentBudget(deptCode,workplaceCode,accountInnerCode,accountPeriodNo);

        return budgetBean;

    }
}
