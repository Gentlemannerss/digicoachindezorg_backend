package com.digicoachindezorg.digicoachindezorg_backend.dtos.input;

import com.digicoachindezorg.digicoachindezorg_backend.models.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class UserInputDto {
    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Password is required")
    private String password;

    @NotBlank(message = "Full name is required")
    private String fullName;

    @Email(message = "Invalid email format")
    private String privateEMail;

    @Email(message = "Invalid email format")
    private String workEMail;

    @NotNull(message = "Date of birth is required")
    private LocalDate dateOfBirth;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Authority is required")
    private String authority;

    private LocalDate availability;

    private String companyName;

    private String companyAddress;

    private String gender;

    @NotNull(message = "Phone number is required")
    private String phoneNumber;

    private List<StudyGroup> studyGroups;

    private List<Review> reviews;

    private List<Message> messages;

    private List<ContactForm> contactForms;

    private List<Invoice> invoices;

    private String profilePicUrl;
    private String fileName;

    private Boolean enabled;
    @JsonSerialize
    private Set<Authority> authorities;
}
