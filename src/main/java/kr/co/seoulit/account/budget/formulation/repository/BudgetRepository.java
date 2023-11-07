package kr.co.seoulit.account.budget.formulation.repository;

import kr.co.seoulit.account.budget.formulation.entity.BudgetEntity;
import kr.co.seoulit.account.budget.formulation.entity.BudgetEntityPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface BudgetRepository extends CrudRepository<BudgetEntity, BudgetEntityPK>{

    ArrayList<BudgetEntity> findByBudgetEntityPK(BudgetEntityPK budgetEntityPK);
}
