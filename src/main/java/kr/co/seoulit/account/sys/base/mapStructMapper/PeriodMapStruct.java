package kr.co.seoulit.account.sys.base.mapStructMapper;

import kr.co.seoulit.account.operate.system.mapper.EntityMapper;
import kr.co.seoulit.account.sys.base.entity.PeriodEntity;
import kr.co.seoulit.account.sys.base.to.PeriodDTO;
import org.mapstruct.Mapper;

@Mapper
public interface PeriodMapStruct extends EntityMapper<PeriodEntity, PeriodDTO> {

}
