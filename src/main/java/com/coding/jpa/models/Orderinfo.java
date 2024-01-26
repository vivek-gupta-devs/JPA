package com.coding.jpa.models;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {

    /*
        This we use in case where do not want to rely on single value id, we have requirement for composite primary key.
        We will do that via Embeddable & EmbeddedId
     */
    @EmbeddedId
    private OrderId id;

    private String orderInfo;

    private int itemCount;

    private double totalPrice;


}
