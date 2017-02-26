package id.co.aribanilia.gdbackend.controller;

import id.co.aribanilia.gdbackend.entity.Lookup;
import id.co.aribanilia.gdbackend.service.LookupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ivan_j4u on 2/24/2017.
 */
@RestController
@RequestMapping("/api")
public class LookupController {
    @Autowired
    private LookupService service;

    @GetMapping("/lookup/{lookupName}")
    public List<Lookup> getLookupByName(String lookupName) {
        return service.getLookupByName(lookupName);
    }

    @GetMapping("/combo-lookup/{lookupName}")
    public List<String> getComboboxByName(@PathVariable String lookupName) {
        return service.getListCombobox(lookupName);
    }
}
