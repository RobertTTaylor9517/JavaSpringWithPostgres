package com.okta.developer.postgresql.entities;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor(onConstructor = @__(@Autowired))
@NoArgsConstructor
public class Course extends EntityWithUUID {

    private String name;
    private int workload;
    private short rate;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "teacher_id"))
    private Teacher teacher;


    // public Course(String name, int workload, short rate, Teacher teacher) {
    //     this.name = name;
    //     this.workload = workload;
    //     this.rate = rate;
    //     this.teacher = teacher;
    // }

    
}