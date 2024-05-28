package com.example.mini_projet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pizza_Test {

    @Test
    void get_nom() {
        Pizza pizza = new Pizza("Margherita",8,3);
        assertEquals("Margherita",pizza.get_nom());
        assertNotEquals("Pepo",pizza.get_nom());
    }

    @Test
    void set_nom() {
        Pizza pizza = new Pizza("Margherita", 8, 3);
        pizza.set_nom("Pepperoni");
        assertEquals("Pepperoni", pizza.get_nom());
        assertNotEquals("Marg",pizza.get_nom());
    }

    @Test
    void get_prix() {
        Pizza pizza = new Pizza("Margherita",8,3);
        assertEquals(8,pizza.get_prix());
        assertNotEquals(5,pizza.get_prix());
    }

    @Test
    void set_prix() {
        Pizza pizza = new Pizza("Margherita", 8, 3);
        pizza.set_prix(9);
        assertEquals(9, pizza.get_prix());
        assertNotEquals(8,pizza.get_prix());
    }

    @Test
    void get_nbIngredient() {
        Pizza pizza = new Pizza("Margherita",8,3);
        assertEquals(3,pizza.get_nbIngredient());
        assertNotEquals(4,pizza.get_nbIngredient());
    }

    @Test
    void set_nbIngredient() {
        Pizza pizza = new Pizza("Margherita", 8, 3);
        pizza.set_nbIngredient(5);
        assertEquals(5, pizza.get_nbIngredient());
        assertNotEquals(8,pizza.get_nbIngredient());
    }
}