package com.example.mini_projet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PizzaDAO {
    public List<Pizza> getPizza(){
       List<Pizza> pizzas = new ArrayList<>();
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/e6447u_mini_projet_java","e6447u_appli", "32319255");
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from pizza");

        while (rs.next()){
       pizzas.add(new Pizza(rs.getString(2),rs.getInt(3),rs.getInt(4)));

        }
        con.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
        System.out.println(pizzas);
    return pizzas;
    }

    public void ajouterPizza(Pizza pizza){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/e6447u_mini_projet_java","e6447u_appli", "32319255");
            PreparedStatement statement = con.prepareStatement("INSERT INTO pizza(nom,prix,nbIngredient)VALUES(?,?,?)");
            statement.setString(1,pizza.get_nom());
            statement.setInt(2,pizza.get_prix());
            statement.setInt(3,pizza.get_nbIngredient());
            statement.executeUpdate();
            con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void supprimerToutesPizzas(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/e6447u_mini_projet_java", "e6447u_appli", "32319255");
            PreparedStatement statement = con.prepareStatement("DELETE FROM pizza");
            statement.executeUpdate();
            con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
