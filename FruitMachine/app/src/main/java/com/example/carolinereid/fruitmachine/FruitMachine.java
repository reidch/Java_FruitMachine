package com.example.carolinereid.fruitmachine;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by carolinereid on 03/11/2017.
 */

public class FruitMachine {

    private String name;
    private int bank;

    public FruitMachine(String name, int bank) {
        this.name = name;
        this.bank = bank;
    }

    public String getName() {
        return this.name;
    }

    public int getBank() {
        return this.bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public Symbol getRandomSymbol(){
        Symbol[] fruit = Symbol.values();
        Random rand = new Random();
        int newRandom = rand.nextInt(fruit.length);
        return fruit[newRandom];
    }

    public ArrayList<Symbol> spinWheels() {
        ArrayList<Symbol> results = new ArrayList<Symbol>();
        results.add(getRandomSymbol());
        results.add(getRandomSymbol());
        results.add(getRandomSymbol());

        return results;
    }

    public String compareResults(){
        ArrayList<Symbol> results = new ArrayList<Symbol>();
        results = spinWheels();
        if (results.get(0) == results.get(1) && results.get(1) == results.get(2)) {
            return "Congratulations!! You have won " + results.get(0).getWinnings();
        } else {
            return "0";
        }
    }

//    public String resultJackpot() {
//        ArrayList<Symbol> results = new ArrayList<Symbol>();
//        results = spinWheels();
//        boolean retval = results.contains("pie");
//        if (retval == true) {
//            return "You've hit the jackpot!";
//        } else {
//            return "Keep your eyes on the pies!";
//        }
//    }
}
