package com.company;

public class Protostomia extends Creatures{
    boolean type_Plathelminthes;
    boolean type_Nemertini;
    boolean type_Gnathostomulida;
    boolean type_Micrognathozoa;
    boolean type_Nemathelminthes;
    boolean type_Tardingnata;

    public String Who(){
        if (type_Nemathelminthes == true) {
            type_Gnathostomulida = false;
            type_Nemertini = false;
            type_Plathelminthes = false;
            type_Micrognathozoa = false;
            type_Tardingnata = false;
            type = "Nemathelminthes";
        }
        if (type_Micrognathozoa == true) {
            type_Gnathostomulida = false;
            type_Nemertini = false;
            type_Plathelminthes = false;
            type_Tardingnata = false;
            type = "Micrognathozoa";
        }
        if (type_Gnathostomulida == true) {
            type_Nemertini = false;
            type_Plathelminthes = false;
            type_Tardingnata = false;
            type = "Gnathostomulida";
        }
        if (type_Nemertini == true) {
            type_Plathelminthes = false;
            type_Tardingnata = false;
            type = "Nemertini";
        }
        if (type_Plathelminthes == true) {
            type_Tardingnata = false;
            type = "Plathelminthes";
        }
        if (type_Tardingnata == true) {
            type = "Tardingnata";
        }
        return type;
    }
}