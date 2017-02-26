package id.co.aribanilia.gdbackend.service;

import id.co.aribanilia.gdbackend.dao.BranchDao;
import id.co.aribanilia.gdbackend.entity.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ivan_j4u on 2/24/2017.
 */
@Service
public class BranchService {
    @Autowired
    private BranchDao dao;

    public Branch getBranchByCode(String branchCode){
        return dao.findByBranchCode(branchCode);
    }

    public List<Branch> getAllBranch() {
        return dao.findAll();
    }

    public Page<Branch> getAllBranchPage(Pageable pageable) {
        return dao.findAll(pageable);
    }
}
