/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author Utilisateur
 */
public class Depense {
    private double frais;
    private double max;
    private String type;

    public Depense() {
    }
       public Depense(double frais, double max, String type) {
        this.frais = frais;
        this.max = max;
        this.type = type;
    }

    public void setFrais(double frais) {
        this.frais = frais;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFrais() {
        return frais;
    }

    public double getMax() {
        return max;
    }

    public String getType() {
        return type;
    }

 
    
    
    
}
