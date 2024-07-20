package com.raikar.dto;

import com.raikar.model.User;
import com.raikar.model.UserType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class UserRequest {


    private String name;


    private String email;

    @Positive(message = "Enter Phone number")
    private int phoneNo;


    private UserType userType;

    private String address;

    public User toStudent() {
      return   User.builder().address(this.address)
                .phoneNo(this.phoneNo).email(this.email).build();
    }
}
