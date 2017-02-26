package id.co.aribanilia.gdbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

/**
 * Created by ivan_j4u on 2/24/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Branch {

    @Id
    private String id;
    private String branchCode;
    private String branchName;
    private String parentBranch;

    public Branch() {
    }

    public Branch(String branchCode, String branchName, String parentBranch) {
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.parentBranch = parentBranch;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getParentBranch() {
        return parentBranch;
    }

    public void setParentBranch(String parentBranch) {
        this.parentBranch = parentBranch;
    }
}
