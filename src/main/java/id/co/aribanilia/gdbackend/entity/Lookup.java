package id.co.aribanilia.gdbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

/**
 * Created by ivan_j4u on 2/24/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Lookup {

    @Id
    private String id;
    private int lookupId;
    private String lookupName;
    private String lookupLabel;
    private String lookupValue;

    public Lookup() {
    }

    public Lookup(int lookupId, String lookupName, String lookupLabel, String lookupValue) {
        this.lookupId = lookupId;
        this.lookupName = lookupName;
        this.lookupLabel = lookupLabel;
        this.lookupValue = lookupValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLookupId() {
        return lookupId;
    }

    public void setLookupId(int lookupId) {
        this.lookupId = lookupId;
    }

    public String getLookupName() {
        return lookupName;
    }

    public void setLookupName(String lookupName) {
        this.lookupName = lookupName;
    }

    public String getLookupLabel() {
        return lookupLabel;
    }

    public void setLookupLabel(String lookupLabel) {
        this.lookupLabel = lookupLabel;
    }

    public String getLookupValue() {
        return lookupValue;
    }

    public void setLookupValue(String lookupValue) {
        this.lookupValue = lookupValue;
    }

}
