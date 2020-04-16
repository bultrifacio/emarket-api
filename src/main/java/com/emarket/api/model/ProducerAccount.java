package com.emarket.api.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "producer_account")
public class ProducerAccount {

    @Id
    @GeneratedValue
    private Long id;

    private String shopName;
    private String cif;
    private String description;
    private String address;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private UserAccount userAccount;
}
