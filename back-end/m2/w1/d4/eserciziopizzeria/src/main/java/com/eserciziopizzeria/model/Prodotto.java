package com.eserciziopizzeria.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public abstract class Prodotto extends MenuItem{
 double prezzo;
 String nome;

}
