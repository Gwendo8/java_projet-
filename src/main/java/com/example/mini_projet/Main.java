package com.example.mini_projet;

import java.sql.*;
import java.util.List;


public class Main {

    public static void main(String[]args){
        PizzaDAO pizzas = new PizzaDAO();
        //afficherPizza();
        Pizza pizzap= new Pizza("peperoni",14,5);
//        pizzas.ajouterPizza(pizzap);
        //afficherPizza();
     //   pizzas.supprimerToutesPizzas();
        afficherPizza();
        }

        public static void afficherPizza(){
            List<Pizza> pizzas = (new PizzaDAO().getPizza());
            pizzas.stream().forEach((pizza -> {
                System.out.println(pizza.toString());
            }));
        }
    }

