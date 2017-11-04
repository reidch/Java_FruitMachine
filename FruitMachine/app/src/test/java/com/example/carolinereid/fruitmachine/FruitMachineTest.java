package com.example.carolinereid.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static com.example.carolinereid.fruitmachine.Symbol.CHERRY;
import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 03/11/2017.
 */

public class FruitMachineTest {

    FruitMachine fruitMachine;
    ArrayList<String> testSymbols;

    @Before
    public void before() {
        fruitMachine = new FruitMachine("Eyes on the pies", 500);
        testSymbols = new ArrayList<>();
    }

    @Test
    public void testCheckAmountInBank(){
        assertEquals(500, fruitMachine.getBank());
    }

    @Test
    public void testGetRandomSymbol(){
        Symbol testSymbol = CHERRY;
        fruitMachine.getRandomSymbol();
        FruitMachine spy = Mockito.spy(new FruitMachine("Eyes on the pies", 500));
        Mockito.when(spy.getRandomSymbol()).thenReturn(testSymbol);
        assertEquals(CHERRY, spy.getRandomSymbol());
    }

    @Test
    public void testReturnsJackpot(){
        ArrayList<Symbol> results = new ArrayList<Symbol>();
        results.add(Symbol.PIE);
        results.add(Symbol.PIE);
        results.add(Symbol.PIE);
        assertEquals("You've hit the jackpot!", fruitMachine.resultJackpot());
    }

//    sometimes returns a match, sometimes doesn't. also, I'm only feeding one PIE into the function in FruitMachine.
//    to be tested against compareResults(), using mokito to guarantee a jackpot.
}













