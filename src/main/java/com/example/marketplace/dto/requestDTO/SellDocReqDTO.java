package com.example.marketplace.dto.requestDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class SellDocReqDTO {
    String docNumber;
    LocalDate date;
}
