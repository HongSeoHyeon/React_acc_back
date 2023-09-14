package kr.co.seoulit.account.operate.system.mapStructMapper;

import kr.co.seoulit.account.operate.system.entity.AccountDetailEntity;
import kr.co.seoulit.account.operate.system.entity.AccountEntity;
import kr.co.seoulit.account.operate.system.to.AccountDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    AccountDTO entityToAccountDTO(AccountEntity entity);


    AccountDTO entityToAccountDTO(AccountDetailEntity entity);
}
