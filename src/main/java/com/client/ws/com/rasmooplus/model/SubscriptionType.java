package com.client.ws.com.rasmooplus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "subscription_type")
public class SubscriptionType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscription_type_id")
    private Long id;

    private String name;
    @Column(name = "access_months")
    private Long accessMonths;
    private BigDecimal price;
    @Column(name = "product_key")
    private String productKey;
}
