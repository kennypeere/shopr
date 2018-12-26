package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "order")
public class Order {

    @Id
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "order_date")
    private LocalDate orderDate;

    @ManyToMany
    @JoinTable(
            name = "OrderProducts",
            joinColumns = { @JoinColumn(name = "order_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "product_id", referencedColumnName = "id") })
    private List<Product> products;

    @JoinColumn(foreignKey = "user_id")
    private User user;
}
