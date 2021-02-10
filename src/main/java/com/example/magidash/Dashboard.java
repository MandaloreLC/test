package com.example.magidash;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "dashboards")
public class Dashboard {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @Column private Timestamp createdAt;
    @Column private Timestamp updatedAt;
    @Column private String title;
}