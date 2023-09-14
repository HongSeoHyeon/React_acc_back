package kr.co.seoulit.account.sys.base.service;

import kr.co.seoulit.account.sys.base.entity.PeriodEntity;
import kr.co.seoulit.account.sys.base.to.PeriodDTO;

import java.time.LocalDate;
import java.util.List;

public interface JpaPeriodService {
    List<PeriodDTO> findPeriodNo();


    PeriodEntity findTPeriodNo(String periodStartDate, String periodEndDate);

}
