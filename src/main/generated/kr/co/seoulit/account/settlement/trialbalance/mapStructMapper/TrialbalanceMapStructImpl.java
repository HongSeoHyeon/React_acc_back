package kr.co.seoulit.account.settlement.trialbalance.mapStructMapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.settlement.trialbalance.entity.TotalTriabalanceEntity;
import kr.co.seoulit.account.settlement.trialbalance.to.TotalTrialBalanceDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-23T15:57:22+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8.1 (JetBrains s.r.o.)"
)
public class TrialbalanceMapStructImpl implements TrialbalanceMapStruct {

    @Override
    public TotalTriabalanceEntity toEntity(TotalTrialBalanceDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TotalTriabalanceEntity totalTriabalanceEntity = new TotalTriabalanceEntity();

        return totalTriabalanceEntity;
    }

    @Override
    public ArrayList<TotalTriabalanceEntity> toEntity(ArrayList<TotalTrialBalanceDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        ArrayList<TotalTriabalanceEntity> arrayList = new ArrayList<TotalTriabalanceEntity>();
        for ( TotalTrialBalanceDTO totalTrialBalanceDTO : dtos ) {
            arrayList.add( toEntity( totalTrialBalanceDTO ) );
        }

        return arrayList;
    }

    @Override
    public List<TotalTriabalanceEntity> toEntity(List<TotalTrialBalanceDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<TotalTriabalanceEntity> list = new ArrayList<TotalTriabalanceEntity>( dtos.size() );
        for ( TotalTrialBalanceDTO totalTrialBalanceDTO : dtos ) {
            list.add( toEntity( totalTrialBalanceDTO ) );
        }

        return list;
    }

    @Override
    public TotalTrialBalanceDTO toDto(TotalTriabalanceEntity entity) {
        if ( entity == null ) {
            return null;
        }

        TotalTrialBalanceDTO totalTrialBalanceDTO = new TotalTrialBalanceDTO();

        return totalTrialBalanceDTO;
    }

    @Override
    public List<TotalTrialBalanceDTO> toDto(List<TotalTriabalanceEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TotalTrialBalanceDTO> list = new ArrayList<TotalTrialBalanceDTO>( entities.size() );
        for ( TotalTriabalanceEntity totalTriabalanceEntity : entities ) {
            list.add( toDto( totalTriabalanceEntity ) );
        }

        return list;
    }

    @Override
    public ArrayList<TotalTrialBalanceDTO> toDto(ArrayList<TotalTriabalanceEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        ArrayList<TotalTrialBalanceDTO> arrayList = new ArrayList<TotalTrialBalanceDTO>();
        for ( TotalTriabalanceEntity totalTriabalanceEntity : entities ) {
            arrayList.add( toDto( totalTriabalanceEntity ) );
        }

        return arrayList;
    }
}
