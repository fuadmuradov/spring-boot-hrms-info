package com.hrmsinformationmanagement.entity;

import com.hrmsinformationmanagement.enums.RelationTypeEnum;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Dependent {
    @Id
    Long id;
    String fullname;
    RelationTypeEnum relationship;
    Date birthDate;
    @ManyToOne(optional = false)
    @JoinColumn(name = "employee_id")
    Employee employee;
}
