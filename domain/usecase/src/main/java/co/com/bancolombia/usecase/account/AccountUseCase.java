package co.com.bancolombia.usecase.account;

import co.com.bancolombia.model.account.Account;
import co.com.bancolombia.model.account.gateways.AccountRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class AccountUseCase{

    private final AccountRepository accountRepository;

    public List<Account> getAllAccounts(){
        return accountRepository.getAllAccounts();
    }

    public Account getAccountById(Integer accountNumber){
        return accountRepository.getAccountById(accountNumber);
    }

}
