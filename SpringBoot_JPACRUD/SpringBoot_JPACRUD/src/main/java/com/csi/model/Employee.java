package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int empId;

    private String empFirstName;

    private String empLastName;

    private String empAddress;

    private String empEmaild;

    private long empContactNo;

    @JsonFormat(pattern = "dd-mm-yyy")
    private Date empDOB;

}
