package org.jasr.shopping.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;

@ToString(includeFieldNames = true)
@NoArgsConstructor
@Entity
public class Product implements Serializable
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String picture;
    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private int position;
    @Getter
    @Setter
    private boolean favorite;
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;
}
