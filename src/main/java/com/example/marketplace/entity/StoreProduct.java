package com.example.marketplace.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class StoreProduct {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long Id;
        @OneToOne
        Product product;
        Double amount;
}
