package kr.co.seoulit.account.sys.base.mapStructMapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.sys.base.entity.PeriodEntity;
import kr.co.seoulit.account.sys.base.to.PeriodDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-23T15:57:23+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8.1 (JetBrains s.r.o.)"
)
public class PeriodMapStructImpl implements PeriodMapStruct {

    @Override
    public PeriodEntity toEntity(PeriodDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PeriodEntity periodEntity = new PeriodEntity();

        periodEntity.setAccountPeriodNo( dto.getAccountPeriodNo() );
        periodEntity.setPeriodStartDate( dto.getPeriodStartDate() );
        periodEntity.setPeriodEndDate( dto.getPeriodEndDate() );
        periodEntity.setWorkplaceCode( dto.getWorkplaceCode() );

        return periodEntity;
    }

    @Override
    public ArrayList<PeriodEntity> toEntity(ArrayList<PeriodDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        ArrayList<PeriodEntity> arrayList = new ArrayList<PeriodEntity>();
        for ( PeriodDTO periodDTO : dtos ) {
            arrayList.add( toEntity( periodDTO ) );
        }

        return arrayList;
    }

    @Override
    public List<PeriodEntity> toEntity(List<PeriodDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<PeriodEntity> list = new ArrayList<PeriodEntity>( dtos.size() );
        for ( PeriodDTO periodDTO : dtos ) {
            list.add( toEntity( periodDTO ) );
        }

        return list;
    }

    @Override
    public PeriodDTO toDto(PeriodEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PeriodDTO periodDTO = new PeriodDTO();

        periodDTO.setAccountPeriodNo( entity.getAccountPeriodNo() );
        periodDTO.setPeriodStartDate( entity.getPeriodStartDate() );
        periodDTO.setPeriodEndDate( entity.getPeriodEndDate() );
        periodDTO.setWorkplaceCode( entity.getWorkplaceCode() );

        return periodDTO;
    }

    @Override
    public List<PeriodDTO> toDto(List<PeriodEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PeriodDTO> list = new ArrayList<PeriodDTO>( entities.size() );
        for ( PeriodEntity periodEntity : entities ) {
            list.add( toDto( periodEntity ) );
        }

        return list;
    }

    @Override
    public ArrayList<PeriodDTO> toDto(ArrayList<PeriodEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        ArrayList<PeriodDTO> arrayList = new ArrayList<PeriodDTO>();
        for ( PeriodEntity periodEntity : entities ) {
            arrayList.add( toDto( periodEntity ) );
        }

        return arrayList;
    }
}
