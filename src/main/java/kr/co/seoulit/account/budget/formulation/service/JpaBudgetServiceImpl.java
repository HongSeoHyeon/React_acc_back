package kr.co.seoulit.account.budget.formulation.service;

import kr.co.seoulit.account.budget.formulation.entity.BudgetEntity;
import kr.co.seoulit.account.budget.formulation.entity.BudgetEntityPK;
import kr.co.seoulit.account.budget.formulation.mapStructMapper.BudgetMapper;
import kr.co.seoulit.account.budget.formulation.repository.BudgetRepository;
import kr.co.seoulit.account.budget.formulation.to.BudgetDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JpaBudgetServiceImpl implements JpaBudgetService {
   @Autowired
   private BudgetRepository budgetRepository;
   @Autowired
   private BudgetMapper budgetMapper;

   @Override
   public void save(BudgetEntity budgetEntity){
      budgetRepository.save(budgetEntity);
   }

   @Override
   public ArrayList<BudgetDTO> findBudget(BudgetEntityPK budgetEntityPK) {

      ArrayList<BudgetEntity> budgetList = budgetRepository.findByBudgetEntityPK(budgetEntityPK);
      List<BudgetDTO> budgetDTOs = budgetList.stream()
              .map(BudgetMapper.INSTANCE::entityToBudgetDTO)
              .collect(Collectors.toList());
      System.out.println("findBudget");
      System.out.println("================t"+budgetDTOs);
      return (ArrayList<BudgetDTO>) budgetDTOs;
   }
}

