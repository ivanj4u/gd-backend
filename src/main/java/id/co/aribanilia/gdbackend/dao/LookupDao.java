package id.co.aribanilia.gdbackend.dao;

import id.co.aribanilia.gdbackend.entity.Lookup;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by ivan_j4u on 2/24/2017.
 */
public interface LookupDao extends MongoRepository<Lookup, String> {

    List<Lookup> findByLookupName(String lookupName);
}
