package com.coding.jpa.models;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
public class BaseEntity {
    /*
     *  This class is mapped by MappedSuperclass which tells that this can be access by other table to get field of this class but have separate table in database
     *  The other table will get this fields via inheritance with help of extend
     *  Need to use SuperBuilder instead of builder along on those entity where we are going extends this as an entity
     *
     */

    @Id
    @GeneratedValue
    private Integer id;

    private LocalDateTime createdAt;

    private LocalDateTime lastModifiedAt;

    private String createdBy;

    private String lastModifiedBy;


}
