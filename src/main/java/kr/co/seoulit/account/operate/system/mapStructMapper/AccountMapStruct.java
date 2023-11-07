package kr.co.seoulit.account.operate.system.mapStructMapper;

import kr.co.seoulit.account.operate.system.entity.AccountEntity;
import kr.co.seoulit.account.operate.system.mapper.EntityMapper;
import kr.co.seoulit.account.operate.system.to.AccountDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapStruct extends EntityMapper<AccountEntity, AccountDTO> {

}
