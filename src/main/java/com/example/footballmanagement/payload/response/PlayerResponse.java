package com.example.footballmanagement.payload.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerResponse {
    private Integer id;

    private String name;

    private Date dob;

    private String nation;

    private Integer height;

    private String foot;

    private String club;

    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + ", dob=" + dob + ", nation=" + nation + ", height=" + height
                + ", foot=" + foot + ", club=" + club + "]";
    }
}
