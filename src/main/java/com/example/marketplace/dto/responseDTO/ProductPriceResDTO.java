package com.example.marketplace.dto.responseDTO;

import com.example.marketplace.entity.Product;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class ProductPriceResDTO {
    ProductResDTO productResDTO;
    Double price;
    Date date;
    Boolean status;
}
