package com.digicoachindezorg.digicoachindezorg_backend.dtos.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceWithNewUserInputDto {
    public UserInputDto user;
    public InvoiceInputDto invoice;
}
