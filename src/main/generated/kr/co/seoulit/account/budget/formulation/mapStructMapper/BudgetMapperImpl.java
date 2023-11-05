package kr.co.seoulit.account.budget.formulation.mapStructMapper;

import javax.annotation.processing.Generated;
import kr.co.seoulit.account.budget.formulation.entity.BudgetEntity;
import kr.co.seoulit.account.budget.formulation.to.BudgetDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-01T01:33:56+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class BudgetMapperImpl implements BudgetMapper {

    @Override
    public BudgetDTO entityToBudgetDTO(BudgetEntity entity) {
        if ( entity == null ) {
            return null;
        }

        BudgetDTO budgetDTO = new BudgetDTO();

        budgetDTO.setM1Budget( entity.getM1Budget() );
        budgetDTO.setM2Budget( entity.getM2Budget() );
        budgetDTO.setM3Budget( entity.getM3Budget() );
        budgetDTO.setM4Budget( entity.getM4Budget() );
        budgetDTO.setM5Budget( entity.getM5Budget() );
        budgetDTO.setM6Budget( entity.getM6Budget() );
        budgetDTO.setM7Budget( entity.getM7Budget() );
        budgetDTO.setM8Budget( entity.getM8Budget() );
        budgetDTO.setM9Budget( entity.getM9Budget() );
        budgetDTO.setM10Budget( entity.getM10Budget() );
        budgetDTO.setM11Budget( entity.getM11Budget() );
        budgetDTO.setM12Budget( entity.getM12Budget() );

        return budgetDTO;
    }
}
