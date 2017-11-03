package com.example.carolinereid.fruitmachine;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by carolinereid on 03/11/2017.
 */

public class FruitMachine {

    private String name;
    private int bank;
    public String symbol;
    private ArrayList<Symbol> symbols;

    public FruitMachine(String name, int bank, String symbol) {
        this.name = name;
        this.bank = bank;
        this.symbol = symbol;
        this.symbols = new ArrayList<>();
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

    public ArrayList<Symbol> getSymbols() {
        return symbols;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void add(Symbol symbol) {
        symbols.add(symbol);
    }

    public String getSymbolAtIndex(int index) {
        return symbols.get(index);
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
}
