package com.example.mini_projet;

public class Pizza {

    private String _nom;
    private int _prix;

    public String get_nom() {
        return _nom;
    }

    public Pizza(String nom,int prix,int nbIngredient){
        this._nom=nom;
        this._prix=prix;
        this._nbIngredient=nbIngredient;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nom : '" + _nom + '\'' +
                " prix : " + _prix +
                " nbIngredient : " + _nbIngredient +
                '}';
    }
    public void set_nom(String _nom) {
        this._nom = _nom;
    }

    public int get_prix() {
        return _prix;
    }

    public void set_prix(int _prix) {
        this._prix = _prix;
    }

    public int get_nbIngredient() {
        return _nbIngredient;
    }

    public void set_nbIngredient(int _nbIngredient) {
        this._nbIngredient = _nbIngredient;
    }

    private int _nbIngredient;


}
