package co.com.bancolombia.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {
    @Value("${mongoConfig.user}")
    private String dbUser;
    @Value("${mongoConfig.password}")
    private String dbPassword;
    @Value("${mongoConfig.database}")
    private String dbName;
    @Value("${mongoConfig.connectionString}")
    private String dbConnectionString;

//    @Bean
//    public SimpleMongoDbFactory mongoDbFactory() {
//        MongoClientURI mongoClientURI = new MongoClientURI(dbConnectionString);
//        MongoClient mongoClient = new MongoClient(mongoClientURI);
//        return new SimpleMongoDbFactory(mongoClient, dbName);
//    }
//
//    public MongoTemplate mongoTemplate() {
//        return new MongoTemplate(mongoDbFactory());
//    }
}
