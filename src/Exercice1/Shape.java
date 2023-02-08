package Exercice1;


/*
*@author SORO
*/

public class Shape {
    protected int largeur;
    protected int hauteur;

    public Shape(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getArea(){
        return largeur * hauteur;
    }
}
