package com.digicoachindezorg.digicoachindezorg_backend.dtos.output;

import com.digicoachindezorg.digicoachindezorg_backend.models.Invoice;
import com.digicoachindezorg.digicoachindezorg_backend.models.ProductType;
import com.digicoachindezorg.digicoachindezorg_backend.models.Review;
import com.digicoachindezorg.digicoachindezorg_backend.models.StudyGroup;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductOutputDto {
    private Long productId;
    private String productName;
    private Double price;
    private List<Review> reviews;
    private ProductType productType;
    private StudyGroup studyGroup;
    private Invoice invoice;
    private String productDescription;
}
