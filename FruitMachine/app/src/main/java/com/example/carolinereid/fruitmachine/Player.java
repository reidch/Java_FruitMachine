package com.example.carolinereid.fruitmachine;

/**
 * Created by carolinereid on 05/11/2017.
 */

public class Player {

    private String name;
    private int funds;

    public Player(String name, int funds) {
        this.name = name;
        this.funds = funds;
    }

    public String getName() {
        return name;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }
}
