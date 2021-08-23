package io.poc.model;

import com.opencsv.bean.CsvBindByName;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Employee {
    @CsvBindByName(column = "name",required = true)
    private String name;
    @CsvBindByName(column = "age")
    private Integer  age;
    @CsvBindByName(column = "role")
    private String role;
    @CsvBindByName(column = "mobileNumber")
    private long mobileNumber;

}
