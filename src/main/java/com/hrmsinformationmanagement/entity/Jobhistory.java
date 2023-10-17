package com.hrmsinformationmanagement.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Jobhistory {
    @Id
    Long id;
    String position;
    String department;
    Date startdate;
    Date enddate;
    @ManyToOne(optional = false)
    Employee employee;
}
