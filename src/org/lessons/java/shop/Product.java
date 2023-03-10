package org.lessons.java.shop;

import java.util.Random;

/*  Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private),
 i costruttori, i metodi getter e setter ed eventuali altri metodi di “servizio” per fare in modo che:
alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
Il codice prodotto sia accessibile solo in lettura
Gli altri attributi siano accessibili sia in lettura che in scrittura
Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto
BONUS: create un metodo che restituisca il codice con un pad left di 0 per arrivare a 8 caratteri
(ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è) Buon lavoro!  */
public class Product {
    Random rand = new Random();
    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;

    public Product() {
        code = rand.nextInt();
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
}
