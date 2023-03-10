package org.lessons.java.bank;

import java.util.Scanner;
//        Dopo la scelta dell’utente chiediamo quanti soldi vuole versare o prelevare e proviamo ad effettuare l’operazione sul conto.
//        Se l’operazione non è valida mostriamo un messaggio di errore.
//        Se l’operazione va a buon fine mostriamo il saldo attuale del conto.
//        Il menu continua ad apparire fino a che l’utente sceglie di uscire.
public class Bank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome: ");
        String name = scan.next();
        Conto conto = new Conto(name);

        System.out.print("Che operazione vuoi eseguire? 1. versare 2. prelevare 3.uscire");
        int option = scan.nextInt();

        if (option == 1){
            System.out.println("Quanto vuoi versare? ");
            int num = scan.nextInt();
            conto.addBalance(num);
            System.out.println(num + " € aggiunti al conto!");

        }else if (option == 2){
            System.out.println("Quanto vuoi prelevare? ");
            int num = scan.nextInt();

            if (conto.removeBalance(num)){
                System.out.println("Operazione andata a buon fine!");
            }else {
                System.out.println("Operazione fallita!");
            };

        }else{
            System.out.println("Uscito!");
        }
    }

}
