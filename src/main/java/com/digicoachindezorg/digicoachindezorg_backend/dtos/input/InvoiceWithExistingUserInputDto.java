package com.digicoachindezorg.digicoachindezorg_backend.dtos.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceWithExistingUserInputDto {
    public Long userId;
    public InvoiceInputDto invoice;
}
