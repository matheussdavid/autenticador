package br.edu.ifpb.autenticador.autenticador.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter /*É necessário remover esse cara?*/
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String street;

    @NotBlank
    private String neighborhood;

    @NotBlank
    private String number;

    @ManyToOne
    @NotNull
    @Cascade({CascadeType.ALL})
    private City city;

    public Address(String street, String neighborhood, String number, City city){
        this.street = street;
        this.neighborhood = neighborhood;
        this.number = number;
        this.city = city;
    }


    public Address() {

    }
}
