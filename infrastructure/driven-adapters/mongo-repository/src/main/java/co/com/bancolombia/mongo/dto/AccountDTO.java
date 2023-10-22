package co.com.bancolombia.mongo.dto;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "accounts")
@Data
public class AccountDTO {
    @Field(name = "idAccount")
    private Integer accountNumber;
    @Field(name = "type")
    private Integer accountType;
}
