package com.example.carolinereid.fruitmachine;

/**
 * Created by carolinereid on 03/11/2017.
 */

public enum Symbol {
    APPLE(1),
    CHERRY(2),
    LEMON(3),
    PECAN(4),
    PUMPKIN(5),
    PIE(10);

    private int winnings;

    Symbol(int winnings) {
        this.winnings = winnings;
    }

    public int getWinnings() {
        return winnings;
    }
}
