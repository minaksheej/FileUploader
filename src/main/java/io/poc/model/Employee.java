package io.poc.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Employee {
    private String name;
    private Integer  age;
    private String role;
    private long mobileNumber;

}
