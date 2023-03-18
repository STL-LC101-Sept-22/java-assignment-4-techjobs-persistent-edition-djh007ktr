package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.*;;

@Entity
public class Employer extends AbstractEntity {

    @NotEmpty
    @Size(min=3, max=30, message="Must be between 3 and 30 characters")
    private String location;

    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
