package com.example.mini_projet;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PizzaDAOTest {

    @Test
    void getPizza() {
        PizzaDAO pizzas = new PizzaDAO();
        pizzas.supprimerToutesPizzas();
        Pizza pizzap= new Pizza("peperoni",14,5);
        pizzas.ajouterPizza(pizzap);
        assertEquals(1,pizzas.getPizza().size());
    }

    @Test
    void ajouterPizza() {
        PizzaDAO pizzas = new PizzaDAO();
        pizzas.supprimerToutesPizzas();
        Pizza pizzap= new Pizza("peperoni",14,5);
        int nbPizzasDebut = pizzas.getPizza().size();
        pizzas.ajouterPizza(pizzap);
        int nbPizzasFin = pizzas.getPizza().size();
        assertEquals(1,nbPizzasFin-nbPizzasDebut);
    }

    @Test
    void supprimerToutesPizzas() {
        PizzaDAO pizzas = new PizzaDAO();
        pizzas.supprimerToutesPizzas();
        Pizza pizzap= new Pizza("peperoni",14,5);
        pizzas.ajouterPizza(pizzap);
        pizzas.supprimerToutesPizzas();
        assertEquals(0,pizzas.getPizza().size());
    }
}