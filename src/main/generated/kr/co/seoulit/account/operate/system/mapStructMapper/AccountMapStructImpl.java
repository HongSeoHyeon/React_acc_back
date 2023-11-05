package kr.co.seoulit.account.operate.system.mapStructMapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.operate.system.entity.AccountEntity;
import kr.co.seoulit.account.operate.system.to.AccountDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-01T01:33:57+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
public class AccountMapStructImpl implements AccountMapStruct {

    @Override
    public AccountEntity toEntity(AccountDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AccountEntity accountEntity = new AccountEntity();

        accountEntity.setAccountInnerCode( dto.getAccountInnerCode() );
        accountEntity.setParentAccountInnerCode( dto.getParentAccountInnerCode() );
        accountEntity.setAccountCode( dto.getAccountCode() );
        accountEntity.setAccountCharacter( dto.getAccountCharacter() );
        accountEntity.setAccountName( dto.getAccountName() );
        accountEntity.setAccountDisplayNameWithCode( dto.getAccountDisplayNameWithCode() );
        accountEntity.setAccountDisplayName( dto.getAccountDisplayName() );
        accountEntity.setAccountDivision( dto.getAccountDivision() );
        accountEntity.setAccountUseCheck( dto.getAccountUseCheck() );
        accountEntity.setAccountDescription( dto.getAccountDescription() );
        accountEntity.setGroupCode( dto.getGroupCode() );
        accountEntity.setEditable( dto.getEditable() );
        accountEntity.setTarget( dto.getTarget() );
        accountEntity.setBudget( dto.getBudget() );

        return accountEntity;
    }

    @Override
    public ArrayList<AccountEntity> toEntity(ArrayList<AccountDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        ArrayList<AccountEntity> arrayList = new ArrayList<AccountEntity>();
        for ( AccountDTO accountDTO : dtos ) {
            arrayList.add( toEntity( accountDTO ) );
        }

        return arrayList;
    }

    @Override
    public List<AccountEntity> toEntity(List<AccountDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<AccountEntity> list = new ArrayList<AccountEntity>( dtos.size() );
        for ( AccountDTO accountDTO : dtos ) {
            list.add( toEntity( accountDTO ) );
        }

        return list;
    }

    @Override
    public AccountDTO toDto(AccountEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AccountDTO accountDTO = new AccountDTO();

        accountDTO.setAccountInnerCode( entity.getAccountInnerCode() );
        accountDTO.setParentAccountInnerCode( entity.getParentAccountInnerCode() );
        accountDTO.setAccountCode( entity.getAccountCode() );
        accountDTO.setAccountCharacter( entity.getAccountCharacter() );
        accountDTO.setAccountName( entity.getAccountName() );
        accountDTO.setAccountDisplayNameWithCode( entity.getAccountDisplayNameWithCode() );
        accountDTO.setAccountDisplayName( entity.getAccountDisplayName() );
        accountDTO.setAccountDivision( entity.getAccountDivision() );
        accountDTO.setAccountUseCheck( entity.getAccountUseCheck() );
        accountDTO.setAccountDescription( entity.getAccountDescription() );
        accountDTO.setGroupCode( entity.getGroupCode() );
        accountDTO.setEditable( entity.getEditable() );
        accountDTO.setTarget( entity.getTarget() );
        accountDTO.setBudget( entity.getBudget() );

        return accountDTO;
    }

    @Override
    public List<AccountDTO> toDto(List<AccountEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AccountDTO> list = new ArrayList<AccountDTO>( entities.size() );
        for ( AccountEntity accountEntity : entities ) {
            list.add( toDto( accountEntity ) );
        }

        return list;
    }

    @Override
    public ArrayList<AccountDTO> toDto(ArrayList<AccountEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        ArrayList<AccountDTO> arrayList = new ArrayList<AccountDTO>();
        for ( AccountEntity accountEntity : entities ) {
            arrayList.add( toDto( accountEntity ) );
        }

        return arrayList;
    }
}
