package com.digicoachindezorg.digicoachindezorg_backend.dtos.output;

import com.digicoachindezorg.digicoachindezorg_backend.models.Product;
import com.digicoachindezorg.digicoachindezorg_backend.models.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class InvoiceOutputDto {
    private Long invoiceId;
    public LocalDate orderDate;
    public Double totalPrice;
    public String address;
    public Double travelCost;
    public User user;
    public List<Product> products;
    public Integer amountOfParticipants;
    public String invoiceAddress;
    public Integer frequency;
    public String comments;
    public Boolean termsOfCondition;
}
