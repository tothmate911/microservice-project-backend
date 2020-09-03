package com.codecool.microserviceprojectbackend.apigateway.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCredentials {

    private Long id;
    private String username;
    private String password;
}
