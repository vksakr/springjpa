package com.example.springjpa.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class TestDomain {

    @Id
    @GeneratedValue
    Long id;

    String name;
}
