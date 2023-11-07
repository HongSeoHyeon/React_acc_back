package kr.co.seoulit.account.operate.system.mapStructMapper;

import javax.annotation.processing.Generated;
import kr.co.seoulit.account.operate.system.entity.AccountDetailEntity;
import kr.co.seoulit.account.operate.system.entity.AccountEntity;
import kr.co.seoulit.account.operate.system.to.AccountDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-23T15:57:23+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8.1 (JetBrains s.r.o.)"
)
@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public AccountDTO entityToAccountDTO(AccountEntity entity) {
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
    public AccountDTO entityToAccountDTO(AccountDetailEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AccountDTO accountDTO = new AccountDTO();

        return accountDTO;
    }
}
