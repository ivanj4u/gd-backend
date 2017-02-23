package id.co.aribanilia.gdbackend.dao;

import id.co.aribanilia.gdbackend.entity.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ivan_j4u on 2/23/2017.
 */
public interface RoleDao extends MongoRepository<Role, String> {
    Role findByRoleId(String roleId);
}
