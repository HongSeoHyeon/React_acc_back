package kr.co.seoulit.account.operate.system.mapStructMapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kr.co.seoulit.account.operate.system.entity.AccountEntity;
import kr.co.seoulit.account.operate.system.to.AccountDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-13T10:03:06+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
public class AccountMapStructImpl implements AccountMapStruct {

    @Override
    public AccountEntity toEntity(AccountDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AccountEntity accountEntity = new AccountEntity();

        accountEntity.setAccountInnerCode( arg0.getAccountInnerCode() );
        accountEntity.setParentAccountInnerCode( arg0.getParentAccountInnerCode() );
        accountEntity.setAccountCode( arg0.getAccountCode() );
        accountEntity.setAccountCharacter( arg0.getAccountCharacter() );
        accountEntity.setAccountName( arg0.getAccountName() );
        accountEntity.setAccountDisplayNameWithCode( arg0.getAccountDisplayNameWithCode() );
        accountEntity.setAccountDisplayName( arg0.getAccountDisplayName() );
        accountEntity.setAccountDivision( arg0.getAccountDivision() );
        accountEntity.setAccountUseCheck( arg0.getAccountUseCheck() );
        accountEntity.setAccountDescription( arg0.getAccountDescription() );
        accountEntity.setGroupCode( arg0.getGroupCode() );
        accountEntity.setEditable( arg0.getEditable() );
        accountEntity.setTarget( arg0.getTarget() );
        accountEntity.setBudget( arg0.getBudget() );

        return accountEntity;
    }

    @Override
    public ArrayList<AccountEntity> toEntity(ArrayList<AccountDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ArrayList<AccountEntity> arrayList = new ArrayList<AccountEntity>();
        for ( AccountDTO accountDTO : arg0 ) {
            arrayList.add( toEntity( accountDTO ) );
        }

        return arrayList;
    }

    @Override
    public List<AccountEntity> toEntity(List<AccountDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AccountEntity> list = new ArrayList<AccountEntity>( arg0.size() );
        for ( AccountDTO accountDTO : arg0 ) {
            list.add( toEntity( accountDTO ) );
        }

        return list;
    }

    @Override
    public AccountDTO toDto(AccountEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AccountDTO accountDTO = new AccountDTO();

        accountDTO.setAccountInnerCode( arg0.getAccountInnerCode() );
        accountDTO.setParentAccountInnerCode( arg0.getParentAccountInnerCode() );
        accountDTO.setAccountCode( arg0.getAccountCode() );
        accountDTO.setAccountCharacter( arg0.getAccountCharacter() );
        accountDTO.setAccountName( arg0.getAccountName() );
        accountDTO.setAccountDisplayNameWithCode( arg0.getAccountDisplayNameWithCode() );
        accountDTO.setAccountDisplayName( arg0.getAccountDisplayName() );
        accountDTO.setAccountDivision( arg0.getAccountDivision() );
        accountDTO.setAccountUseCheck( arg0.getAccountUseCheck() );
        accountDTO.setAccountDescription( arg0.getAccountDescription() );
        accountDTO.setGroupCode( arg0.getGroupCode() );
        accountDTO.setEditable( arg0.getEditable() );
        accountDTO.setTarget( arg0.getTarget() );
        accountDTO.setBudget( arg0.getBudget() );

        return accountDTO;
    }

    @Override
    public List<AccountDTO> toDto(List<AccountEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AccountDTO> list = new ArrayList<AccountDTO>( arg0.size() );
        for ( AccountEntity accountEntity : arg0 ) {
            list.add( toDto( accountEntity ) );
        }

        return list;
    }

    @Override
    public ArrayList<AccountDTO> toDto(ArrayList<AccountEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ArrayList<AccountDTO> arrayList = new ArrayList<AccountDTO>();
        for ( AccountEntity accountEntity : arg0 ) {
            arrayList.add( toDto( accountEntity ) );
        }

        return arrayList;
    }
}
