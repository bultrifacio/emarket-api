package com.emarket.api.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "consumer_account")
public class ConsumerAccount {

    @Id
    @GeneratedValue
    private Long id;

    private String address;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private User user;
}
