package com.cc.java;
public class App {
    public static void main(String[] args) {
    
        Player player = new Player();
        int rounds = 11;

        for (int i = 0; i < rounds; i++) {
            ausgabe(player.play());  
        }

    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
