package com.okta.developer.postgresql.entities;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor(onConstructor = @__(@Autowired))
@NoArgsConstructor
public class Teacher extends EntityWithUUID {
	private String name;
    private String pictureUrl;
    private String email;


    // public Teacher(String name, String pictureUrl, String email) {
    //     this.name = name;
    //     this.pictureUrl = pictureUrl;
    //     this.email = email;
    // }
    


}