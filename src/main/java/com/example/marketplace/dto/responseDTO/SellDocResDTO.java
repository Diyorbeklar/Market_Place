package com.example.marketplace.dto.responseDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class SellDocResDTO {
    Long id;
    String docNumber;
    LocalDate date;
}
