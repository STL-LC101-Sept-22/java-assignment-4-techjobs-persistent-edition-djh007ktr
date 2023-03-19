package org.launchcode.techjobs.persistent.models;

import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(min=3, max=100, message = "Short description under 100 characters")
    private String description;
    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}