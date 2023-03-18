package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
public class Skill extends AbstractEntity {

    @Min(value = 100, message = "Short description under 100 characteres")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}