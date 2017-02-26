package id.co.aribanilia.gdbackend.service;

import id.co.aribanilia.gdbackend.dao.LookupDao;
import id.co.aribanilia.gdbackend.entity.Lookup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan_j4u on 2/24/2017.
 */
@Service
public class LookupService {

    @Autowired
    private LookupDao dao;

    public List<Lookup> getAllLookup() {
        return dao.findAll();
    }

    public List<Lookup> getLookupByName(String lookupName) {
        return dao.findByLookupName(lookupName);
    }

    public List<String> getListCombobox(String lookupName) {
        //Container Penampung Combobox
        List<String> listString = new ArrayList<>();

        List<Lookup> listLookup = dao.findByLookupName(lookupName);
        for (Lookup lookup : listLookup) {
            String data = lookup.getLookupName();
            listString.add(data);
        }
        return listString;
    }
}
