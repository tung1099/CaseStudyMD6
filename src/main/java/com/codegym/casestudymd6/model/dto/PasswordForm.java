package com.codegym.casestudymd6.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasswordForm {
    private String password;
    private String confirmPassword;
}
