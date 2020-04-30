package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MakeAbbaTest {

    public MakeAbbaTest() {
    }

    @Test
    public void testMakeAbba() {
        System.out.println("makeAbba");
        MakeAbba instance = new MakeAbba();
        assertEquals("HiByeByeHi", instance.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", instance.makeAbba("Yo", "Alice"));
        assertEquals("WhatUpUpWhat", instance.makeAbba("What", "Up"));
        assertEquals("", instance.makeAbba("", ""));
        assertEquals("ABBA", instance.makeAbba("A", "B"));
    }

}
