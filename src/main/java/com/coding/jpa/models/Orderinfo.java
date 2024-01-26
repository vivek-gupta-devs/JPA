package com.coding.jpa.models;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orderinfo {

    /*
        This we use in case where do not want to rely on single value id, we have requirement for composite primary key.
        We will do that via Embeddable & EmbeddedId
        This Embeddable also can use for optimization . Where we have common fields that can be used for storing some common so can be used in other classes as it is.
    */
    @EmbeddedId
    private OrderId id;

    @Embedded
    private Address address;

    private String orderSummary;

    private int itemCount;

    private double totalPrice;


}
