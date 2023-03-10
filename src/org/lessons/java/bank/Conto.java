package org.lessons.java.bank;

import java.util.Random;
public class Conto {

    Random rand = new Random();
    private int acount_id;
    private String name;
    private double balance;

    public Conto(String name){
        acount_id = rand.nextInt(1000);
        this.name = name;
        balance = 0;
    }

    public int getAcount_id() {
        return acount_id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double num) {
        this.balance += num;
    }

    public boolean removeBalance(double num){
        boolean success = false;
        if (this.balance < num){
            return success = false;
        }
        this.balance -= num;
       return success;
    }


}
