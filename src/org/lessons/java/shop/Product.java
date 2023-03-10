package org.lessons.java.shop;

import java.util.Random;

/*
Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
BONUS: create un metodo che restituisca il codice con un pad left di 0 per arrivare a 8 caratteri
(ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)  */
public class Product {
    Random rand = new Random();
    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;

    public Product() {
        code = rand.nextInt( 100000);
        name = "";
        description ="";
        price = 0;
        iva = 0;
    }

    public Product(String name,String description,double price,double iva) {
        this.code = rand.nextInt();
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    //get product's code
    public int getCode() {
        return code;
    }

    //get and set name
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //get and set product's description
    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    //get and set product's price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }


    //get and set product's iva
    public double getIva(){
        return iva;
    }

    public void setIva(double iva){
        this.iva = iva;
    }



    public double getIvaPrice(){
        return price * (1 + (iva / 100));
    }


    public String getExtendedName(){
        return name + "-" + code;
    }


}
