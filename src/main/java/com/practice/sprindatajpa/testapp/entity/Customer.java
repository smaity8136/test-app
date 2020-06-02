package com.practice.sprindatajpa.testapp.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Table (name ="customer", schema = "dev")
public class Customer implements Serializable {

    @Id
    @Column(name = "cust_id")
    private int custid;

    @Column(name = "cust_name")
    @NotEmpty
    private String custName;

    @Column(name = "cust_detail")
    @NotEmpty
    private String custDetail;



}
