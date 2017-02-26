package id.co.aribanilia.gdbackend.controller;

import id.co.aribanilia.gdbackend.entity.Branch;
import id.co.aribanilia.gdbackend.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ivan_j4u on 2/24/2017.
 */
@RestController
@RequestMapping("/api")
public class BranchController {

    @Autowired
    private BranchService service;

    @GetMapping("/branch/id/{branchCode}")
    @ResponseBody
    public Branch getBranchById(@PathVariable String branchCode) {
        return service.getBranchByCode(branchCode);
    }

    @GetMapping("/branch")
    public Page<Branch> getAllBranch(Pageable pageable) {
        return service.getAllBranchPage(pageable);
    }

}
