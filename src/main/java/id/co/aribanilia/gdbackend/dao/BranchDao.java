package id.co.aribanilia.gdbackend.dao;

import id.co.aribanilia.gdbackend.entity.Branch;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ivan_j4u on 2/24/2017.
 */
public interface BranchDao extends MongoRepository<Branch, String> {
    Branch findByBranchCode(String branchCode);
}
