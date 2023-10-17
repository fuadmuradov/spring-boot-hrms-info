package com.hrmsinformationmanagement.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

//Ishchilerin siyahisi
@Data
@FieldDefaults(level = AccessLevel.PUBLIC)
@Entity
public class Employee {
    @Id
    Long id;
    String firstname;
    String lastname;
    Date birthdate;
    String email;
    String address;
    Date hiredate;
    Date terminateddate;

}
