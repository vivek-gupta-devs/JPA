package com.coding.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@PrimaryKeyJoinColumn(name = "video_id")
/*
* This is used to generally change f key name as other name rather than default name coming from parent class id ==> f key
* here for video entity
*
* If you want to not create child subclass entity then use
* @Polymorphism(type = PolymorphismType.EXPLICIT)
*/

public class Video extends Resource {


    private int length;
}
