package com.ex;


public class Main {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        game.init();
        game.start();
    }
}

