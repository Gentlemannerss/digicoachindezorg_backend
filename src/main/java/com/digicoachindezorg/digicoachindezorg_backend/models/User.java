package com.digicoachindezorg.digicoachindezorg_backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false)
    private boolean enabled = true;

    @Column
    private String apikey;
    private String fullName;
    @Email
    private String privateEMail;
    @Email
    private String workEMail;
    private LocalDate dateOfBirth;
    private String address;
    private String companyName;
    private String companyAddress;
    private String phoneNumber;
    private String gender;
    private String profilePicUrl;
    private String fileName;

    @ManyToMany(mappedBy = "users")
    @JsonIgnore
    private List<StudyGroup> studyGroups;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List <Review> reviews;

    @OneToMany(mappedBy = "receiver")
    @JsonIgnore
    private List<Message> messages;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<ContactForm> contactForms;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Invoice> invoices;

    @OneToMany(
            targetEntity = Authority.class,
            mappedBy = "userId",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Authority> authorities = new HashSet<>();

    //Getters and Setters

    public void addAuthority(Authority authority) {
        this.authorities.add(authority);
    }
    public void removeAuthority(Authority authority) {
        this.authorities.remove(authority);
    }
}