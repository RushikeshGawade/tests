package com.truemeds.test.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "input_details")
@Data
@NoArgsConstructor
@Getter
@Setter
public class InputDetails {
    @Id
    private int id;

    @Column(name = "input_string")
    private String inputString;
}
