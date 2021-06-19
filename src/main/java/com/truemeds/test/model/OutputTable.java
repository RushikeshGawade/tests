package com.truemeds.test.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rushikesh_gawade_java_output")
@NoArgsConstructor
@Getter
@Setter
@Data
public class OutputTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(name = "original_data")
    private String originalData;
    @Column(name = "processed_data")
    private String processedData;
    @Column(name = "time_stamp")
    private LocalDateTime timeStamp;
}
