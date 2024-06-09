package com.rudiger.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
){
}
