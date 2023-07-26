package com.example.footballmanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "TRAINING_CLUB", schema = "ACME")
public class Club {
    @Id
    @Column(name = "PK_CLUB_ID")
    private Long id;

    @Column(name = "CLUB_NAME", length = 40)
    private String name;

    @Column(name = "CLUB_ABBREV", length = 20)
    private String abbrevName;

    @Column(name = "FOUNDING_DATE")
    private Date foundingDate;

    @Column(name = "STADIUM", length = 40)
    private String stadium;

    @Column(name = "TOURNAMENT", length = 40)
    private String tournament;

    @Column(name = "ABOUT")
    private String about;
}
