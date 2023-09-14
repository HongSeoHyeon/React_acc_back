package kr.co.seoulit.account.sys.base.mapStructMapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.sys.base.entity.PeriodEntity;
import kr.co.seoulit.account.sys.base.to.PeriodDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-14T15:34:08+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
public class PeriodMapStructImpl implements PeriodMapStruct {

    @Override
    public PeriodEntity toEntity(PeriodDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PeriodEntity periodEntity = new PeriodEntity();

        periodEntity.setAccountPeriodNo( arg0.getAccountPeriodNo() );
        periodEntity.setPeriodStartDate( arg0.getPeriodStartDate() );
        periodEntity.setPeriodEndDate( arg0.getPeriodEndDate() );
        periodEntity.setWorkplaceCode( arg0.getWorkplaceCode() );

        return periodEntity;
    }

    @Override
    public ArrayList<PeriodEntity> toEntity(ArrayList<PeriodDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ArrayList<PeriodEntity> arrayList = new ArrayList<PeriodEntity>();
        for ( PeriodDTO periodDTO : arg0 ) {
            arrayList.add( toEntity( periodDTO ) );
        }

        return arrayList;
    }

    @Override
    public List<PeriodEntity> toEntity(List<PeriodDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<PeriodEntity> list = new ArrayList<PeriodEntity>( arg0.size() );
        for ( PeriodDTO periodDTO : arg0 ) {
            list.add( toEntity( periodDTO ) );
        }

        return list;
    }

    @Override
    public PeriodDTO toDto(PeriodEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PeriodDTO periodDTO = new PeriodDTO();

        periodDTO.setAccountPeriodNo( arg0.getAccountPeriodNo() );
        periodDTO.setPeriodStartDate( arg0.getPeriodStartDate() );
        periodDTO.setPeriodEndDate( arg0.getPeriodEndDate() );
        periodDTO.setWorkplaceCode( arg0.getWorkplaceCode() );

        return periodDTO;
    }

    @Override
    public List<PeriodDTO> toDto(List<PeriodEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<PeriodDTO> list = new ArrayList<PeriodDTO>( arg0.size() );
        for ( PeriodEntity periodEntity : arg0 ) {
            list.add( toDto( periodEntity ) );
        }

        return list;
    }

    @Override
    public ArrayList<PeriodDTO> toDto(ArrayList<PeriodEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ArrayList<PeriodDTO> arrayList = new ArrayList<PeriodDTO>();
        for ( PeriodEntity periodEntity : arg0 ) {
            arrayList.add( toDto( periodEntity ) );
        }

        return arrayList;
    }
}
