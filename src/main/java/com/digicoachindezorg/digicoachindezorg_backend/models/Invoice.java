package com.digicoachindezorg.digicoachindezorg_backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Invoices")
public class Invoice {
    @Id
    @GeneratedValue
    private Long invoiceId;
    private LocalDate orderDate;
    private Double totalPrice;
    private String address;
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;
    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "invoice_product",
            joinColumns = @JoinColumn(name = "invoice_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;
    private Integer amountOfParticipants;
    private String invoiceAddress;
    private Integer frequency;
    private String comments;
    private Boolean termsOfCondition;
}
