package com.client.ws.com.rasmooplus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user_payment_info")
public class UserPaymentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_payment_info_id")
    private Long id;

    @Column(name = "card_number")
    private String cardNumber;
    @Column(name = "card_expiration_month")
    private Integer cardExpirationMonth;
    @Column(name = "card_expiration_year")

    private Integer card_expirationYear;
    @Column(name = "card_security_code")
    private String cardSecurityCode;
    private BigDecimal price;
    private Integer instalments;
    @Column(name = "dt_payment")
    private LocalDate dtPayment;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
