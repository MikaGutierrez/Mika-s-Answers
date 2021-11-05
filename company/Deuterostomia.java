package com.company;

public class Deuterostomia extends Creatures{
    boolean type_Echinodermata;
    boolean type_Hemichordata;
    boolean type_Chordata;

    public String Who(){
        if (type_Chordata == true) {
            type_Hemichordata = false;
            type_Echinodermata = false;
            type = "Chordata";
        }
        if (type_Hemichordata == true) {
            type_Echinodermata = false;
            type = "Hemichordata";
        }
        if (type_Echinodermata == true) {
            type = "Echinodermata";
        }
        return type;
    }
}
