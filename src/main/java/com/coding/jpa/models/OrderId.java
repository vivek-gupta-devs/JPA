package com.coding.jpa.models;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class OrderId {

    private String username;

    private LocalDateTime order_date;

}
