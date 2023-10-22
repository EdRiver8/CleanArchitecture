package co.com.bancolombia.model.account.gateways;

import co.com.bancolombia.model.account.Account;

import java.util.List;

public interface AccountRepository {

    List<Account> getAllAccounts();
    Account getAccountById(Integer accountNumber);

}
