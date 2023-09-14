package kr.co.seoulit.account.settlement.trialbalance.mapStructMapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.settlement.trialbalance.entity.TotalTriabalanceEntity;
import kr.co.seoulit.account.settlement.trialbalance.to.TotalTrialBalanceDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-14T21:03:56+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
public class TrialbalanceMapStructImpl implements TrialbalanceMapStruct {

    @Override
    public TotalTriabalanceEntity toEntity(TotalTrialBalanceDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TotalTriabalanceEntity totalTriabalanceEntity = new TotalTriabalanceEntity();

        return totalTriabalanceEntity;
    }

    @Override
    public ArrayList<TotalTriabalanceEntity> toEntity(ArrayList<TotalTrialBalanceDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ArrayList<TotalTriabalanceEntity> arrayList = new ArrayList<TotalTriabalanceEntity>();
        for ( TotalTrialBalanceDTO totalTrialBalanceDTO : arg0 ) {
            arrayList.add( toEntity( totalTrialBalanceDTO ) );
        }

        return arrayList;
    }

    @Override
    public List<TotalTriabalanceEntity> toEntity(List<TotalTrialBalanceDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<TotalTriabalanceEntity> list = new ArrayList<TotalTriabalanceEntity>( arg0.size() );
        for ( TotalTrialBalanceDTO totalTrialBalanceDTO : arg0 ) {
            list.add( toEntity( totalTrialBalanceDTO ) );
        }

        return list;
    }

    @Override
    public TotalTrialBalanceDTO toDto(TotalTriabalanceEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TotalTrialBalanceDTO totalTrialBalanceDTO = new TotalTrialBalanceDTO();

        return totalTrialBalanceDTO;
    }

    @Override
    public List<TotalTrialBalanceDTO> toDto(List<TotalTriabalanceEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<TotalTrialBalanceDTO> list = new ArrayList<TotalTrialBalanceDTO>( arg0.size() );
        for ( TotalTriabalanceEntity totalTriabalanceEntity : arg0 ) {
            list.add( toDto( totalTriabalanceEntity ) );
        }

        return list;
    }

    @Override
    public ArrayList<TotalTrialBalanceDTO> toDto(ArrayList<TotalTriabalanceEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ArrayList<TotalTrialBalanceDTO> arrayList = new ArrayList<TotalTrialBalanceDTO>();
        for ( TotalTriabalanceEntity totalTriabalanceEntity : arg0 ) {
            arrayList.add( toDto( totalTriabalanceEntity ) );
        }

        return arrayList;
    }
}
