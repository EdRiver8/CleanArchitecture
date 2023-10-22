package co.com.bancolombia.api;
import co.com.bancolombia.model.account.Account;
import co.com.bancolombia.usecase.account.AccountUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final AccountUseCase accountUseCase;


    @GetMapping(path = "/hello")
    public String commandName() {
//      return useCase.doAction();
        return "Hello World";
    }

    @GetMapping(path = "/list-all")
    public ResponseEntity<List<Account>> getAccounts() {
        return new ResponseEntity<List<Account>>(accountUseCase.getAllAccounts(), new HttpHeaders(), HttpStatusCode.valueOf(200));
    }

    @GetMapping(path = "/account/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable Integer id) {
        return new ResponseEntity<Account>(accountUseCase.getAccountById(id), new HttpHeaders(), HttpStatusCode.valueOf(200));
    }
}
