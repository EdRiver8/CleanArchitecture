package co.com.bancolombia.mongo;

import co.com.bancolombia.mongo.dto.AccountDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface MongoDBRepository extends MongoRepository<AccountDTO, Integer> , QueryByExampleExecutor<AccountDTO> {
    @Query("{ 'idAccount' : ?0 }")
    AccountDTO findByAccountNumber(Integer accountNumber);
}
