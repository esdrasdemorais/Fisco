import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.mongodb.repository.Query;

import com.esdrasmorais.cashflow.domain.model.User;

public interface UserRepository2 extends MongoRepository<User, String> {
    @Query("{ 'number' : {$regex: ?0, $options: 'i' }}")
    JusticeLeagueMemberDetail findByMobile(final String number);
}
