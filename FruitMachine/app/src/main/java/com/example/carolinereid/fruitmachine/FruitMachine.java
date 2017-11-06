package com.example.carolinereid.fruitmachine;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by carolinereid on 03/11/2017.
 */

public class FruitMachine {

    private String name;
    private int bank;

    protected FruitMachine(String name, int bank) {
        this.name = name;
        this.bank = bank;
    }

    protected String getName() {
        return this.name;
    }

    protected int getBank() {
        return this.bank;
    }

    private void setBank(int bank) {
        this.bank = bank;
    }

    protected Symbol getRandomSymbol() {
        Symbol[] fruit = Symbol.values();
        Random rand = new Random();
        int newRandom = rand.nextInt(fruit.length);
        return fruit[newRandom];
    }

    protected ArrayList<Symbol> spinWheels() {
        ArrayList<Symbol> results = new ArrayList<Symbol>();
        results.add(getRandomSymbol());
        results.add(getRandomSymbol());
        results.add(getRandomSymbol());

        return results;
    }

    protected String compareResults() {
        ArrayList<Symbol> results = new ArrayList<Symbol>();
        results = spinWheels();
        if (results.get(0) == results.get(1) && results.get(1) == results.get(2)) {
            return "Congratulations!! You win £" + results.get(0).getWinnings();
        } else {
            return "No luck this time. Try again!";
        }
    }

    protected String resultJackpot() {
        ArrayList<Symbol> results = new ArrayList<Symbol>();
        results = spinWheels();
        if (results.get(0) == Symbol.PIE && results.get(1) == Symbol.PIE && results.get(2) == Symbol.PIE) {
            return "You've hit the jackpot!";
        } else {
            return "Keep your eyes on the pies!";
        }
    }

    protected int adjustBank() {
        ArrayList<Symbol> results = new ArrayList<Symbol>();
        results = spinWheels();
        if (results.get(0) == results.get(1) && results.get(1) == results.get(2)) {
            return this.bank - results.get(0).getWinnings();
        } else {
            return this.bank;
        }
    }
}
