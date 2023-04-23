package com.example.bookmyshow.ReqDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntryDto {

    private String name;
    private int age;
    private String mobNo;
    private String email;
    private String address;
}
