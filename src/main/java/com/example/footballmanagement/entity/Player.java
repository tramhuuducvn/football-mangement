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

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "TRAINING_PLAYER", schema = "ACME")
public class Player {
    @Id
    @Column(name = "PK_PLAYER_ID")
    private Integer id;

    @Column(name = "PLAYER_NAME")
    private String name;

    @Column(name = "DOB")
    private Date dob;

    @Column(name = "NATION")
    private String nation;

    @Column(name = "HEIGHT")
    private Integer height;

    @Column(name = "FOOT")
    private String foot;

    @Column(name = "FK_CLUB_ID")
    private String club;
}
