package id.co.aribanilia.gdbackend;

import id.co.aribanilia.gdbackend.dao.BranchDao;
import id.co.aribanilia.gdbackend.dao.LookupDao;
import id.co.aribanilia.gdbackend.entity.Branch;
import id.co.aribanilia.gdbackend.entity.Lookup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GdBackendApplicationTests {

	@Autowired
	BranchDao branchDao;

	@Autowired
	LookupDao lookupDao;

	@Test
	public void addBranch() {
		Branch branch = new Branch(
				"13439",
				"CPP Jepara",
				"00103"
		);
		branchDao.save(branch);
		branch = new Branch(
				"60139",
				"CPS Kramat Raya",
				"00209"
		);
		branchDao.save(branch);
	}

	@Test
	public void addLookup() {
		Lookup lookup = new Lookup(
				1,
				"GADAI-KARATASE",
				"18 Karat",
				"18"
		);
		lookupDao.save(lookup);
		lookup = new Lookup(
				2,
				"GADAI-KARATASE",
				"20 Karat",
				"20"
		);
		lookupDao.save(lookup);
		lookup = new Lookup(
				3,
				"GADAI-KARATASE",
				"24 Karat",
				"24"
		);
		lookupDao.save(lookup);
	}

}
