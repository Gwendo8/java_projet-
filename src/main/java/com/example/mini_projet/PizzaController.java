package com.example.mini_projet;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.w3c.dom.Text;
import java.util.ResourceBundle;

import java.net.URL;

public class PizzaController implements Initializable {
    @FXML
    private TextField nbIngredientField;
    @FXML
    private TextField recetteField;
    @FXML
    private TextField prixField;
    @FXML
    private TableView tablePizza;
    @FXML
    private TableColumn recette_colonne;
    @FXML
    private TableColumn prix_colonne;
    @FXML
    private TableColumn ingredient_colonne;
    @FXML
    private Button btnajouter;
    @FXML
    private Button btnvider;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        recette_colonne.setCellValueFactory(new PropertyValueFactory<Pizza,String>("_nom"));
        prix_colonne.setCellValueFactory(new PropertyValueFactory<Pizza,Integer>("_prix"));
        ingredient_colonne.setCellValueFactory(new PropertyValueFactory<Pizza,Integer>("_nbIngredient"));
        PizzaDAO pizzaDAO = new PizzaDAO();
        ObservableList<Pizza> pizzas = FXCollections.observableArrayList(pizzaDAO.getPizza());
        tablePizza.setItems(pizzas);
        System.out.println(pizzas);
    }
    @FXML
    public void ajouterPizza(){
        try{
            String recette = recetteField.getText();
            Integer prix = Integer.parseInt(prixField.getText());
            Integer nbIngredient = Integer.parseInt(nbIngredientField.getText());
            recetteField.setText("");
            prixField.setText("");
            nbIngredientField.setText("");
            Pizza pizza = new Pizza(recette,prix,nbIngredient);
            ObservableList<Pizza> pizzas = tablePizza.getItems();
            pizzas.add(pizza);
            tablePizza.setItems(pizzas);
            PizzaDAO pizzaDAO = new PizzaDAO();
            pizzaDAO.ajouterPizza(pizza);
        }
       catch (Exception e){

       }
    }

    public void supprimerToutesPizzas(){
        PizzaDAO pizzaDAO = new PizzaDAO();
        pizzaDAO.supprimerToutesPizzas();
        tablePizza.getItems().clear();
    }

}
