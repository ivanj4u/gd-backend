package id.co.aribanilia.gdbackend.dao;

import id.co.aribanilia.gdbackend.entity.Permission;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ivan_j4u on 2/23/2017.
 */
public interface PermissionDao extends MongoRepository<Permission,String> {
    Permission findByPermissionId(String permissionId);
}
