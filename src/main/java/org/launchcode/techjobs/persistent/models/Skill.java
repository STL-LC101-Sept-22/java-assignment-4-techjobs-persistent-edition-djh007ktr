package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Skill extends AbstractEntity {

    @Size(min=3, max=100, message = "Short description under 100 characters")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}