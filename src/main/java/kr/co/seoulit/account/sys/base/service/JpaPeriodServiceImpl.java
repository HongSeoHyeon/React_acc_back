package kr.co.seoulit.account.sys.base.service;



import kr.co.seoulit.account.sys.base.entity.PeriodEntity;
import kr.co.seoulit.account.sys.base.mapStructMapper.PeriodMapStruct;
import kr.co.seoulit.account.sys.base.repository.JpaPeriodRepository;
import kr.co.seoulit.account.sys.base.to.PeriodDTO;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JpaPeriodServiceImpl implements JpaPeriodService{
    @Autowired
    JpaPeriodRepository jpaPeriodRepository;
    PeriodMapStruct periodMapStruct = Mappers.getMapper(PeriodMapStruct.class);

    @Override
    public List<PeriodDTO> findPeriodNo() {
        List<PeriodEntity> period = jpaPeriodRepository.findAllBy();
        System.out.println("================ENTITY 변환 전 : "+period);
        List<PeriodDTO> result = new ArrayList<>();
        for(PeriodEntity entity : period){
            PeriodDTO periodDTO = periodMapStruct.toDto(entity);
            result.add(periodDTO);
        }
            System.out.println("findPeriodNo");
            System.out.println("================DTO 변환 후 : " +result);
        return result;
    }

    @Override

    public PeriodEntity findTPeriodNo(String periodStartDate,String periodEndDate) {
        PeriodEntity map = jpaPeriodRepository.findAccountPeriodNoByPeriodStartDateAndPeriodEndDate(periodStartDate, periodEndDate);

        return map;
    }

    ;




}
