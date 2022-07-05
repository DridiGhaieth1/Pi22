package com.example.pi22.requests;

import lombok.Data;

@Data
public class PasswordRequest {

    private Long id;
    private String oldPassword;
    private String newPassword;

}
