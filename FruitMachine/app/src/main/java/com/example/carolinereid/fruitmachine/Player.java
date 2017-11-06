package com.example.carolinereid.fruitmachine;

/**
 * Created by carolinereid on 05/11/2017.
 */

public class Player {

    private String name;
    private int funds;

    protected Player(String name, int funds) {
        this.name = name;
        this.funds = funds;
    }

    protected String getName() {
        return name;
    }

    protected int getFunds() {
        return funds;
    }

    private void setFunds(int funds) {
        this.funds = funds;
    }
}
