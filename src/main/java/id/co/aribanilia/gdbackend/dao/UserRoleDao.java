package id.co.aribanilia.gdbackend.dao;

import id.co.aribanilia.gdbackend.entity.UserRole;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ivan_j4u on 2/23/2017.
 */
public interface UserRoleDao extends MongoRepository<UserRole, String> {
    UserRole findByUsername(String username);
}
