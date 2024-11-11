package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name can not be null or empty!")
    @Size(min = 5, max = 10, message = "Name length should be between 5 tp 10 character!")
    private String name;

    @NotEmpty(message = "Email field is required!")
    @Email(message = "Email should be valid format")
    private String email;

    @NotEmpty(message = "Mobile number field is required!")
    @Pattern(regexp = "(^|[0-9]{10})", message = "Mobile number must be 10 digits!")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
