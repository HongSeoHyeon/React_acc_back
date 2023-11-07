package kr.co.seoulit.account.budget.formulation.mapStructMapper;

import kr.co.seoulit.account.budget.formulation.entity.BudgetEntity;

import kr.co.seoulit.account.budget.formulation.to.BudgetDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring") // 빌드 시 구현체를 만들고 빈으로 등록
public interface BudgetMapper {
    BudgetMapper INSTANCE = Mappers.getMapper(BudgetMapper.class);


    BudgetDTO entityToBudgetDTO(BudgetEntity entity);
}
