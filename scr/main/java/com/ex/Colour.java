package com.ex;
import java.util.Scanner;


public class Colour {
    GreenLight greenLight;
    YellowLight yellowLight;
    RedLight redLight;

    void blinkGreen() {
        if (countDownGreen()) {
        }
    }

    void blinkYellow() {
        if (countDownYellow()) {
        }
    }

    void blinkRed() {
        if (countDownRed()) {
        }
    }

    boolean countDownGreen() {
        greenLight.burn();
        for (int i = 1; i <= 120; i++) {
            System.out.println(i);
            pause();
        }
        return true;
    }

    private boolean countDownYellow() {
        yellowLight.burn();
        for (int i = 120; i <= 300; i++) {
            System.out.println(i);
            pause();
        }
        return true;
    }

    private boolean countDownRed() {
        redLight.burn();
        for (int i = 300; i <= 600; i++) {
            System.out.println(i);
            pause();
        }
        return true;
    }

    void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    int getShootGreen() {
        int shoot = 0;
        System.out.println("Введите число в минутах для зелёного сигнала светофора: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                shoot = scanner.nextInt();
                break;
            } else {
                System.out.println("ERROR: ВЫ ВВЕЛИ НЕ ЧИСЛО !!! Введите число ");
                scanner.nextLine();
            }
        }
        return shoot;
    }

    int getShootYellow() {
        int shoot = 0;
        System.out.println("Введите число в минутах для жёлтого сигнала светофора: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                shoot = scanner.nextInt();
                break;
            } else {
                System.out.println("ERROR: ВЫ ВВЕЛИ НЕ ЧИСЛО !!! Введите число");
                scanner.nextLine();
            }
        }
        return shoot;
    }

    int getShootRed() {
        int shoot = 0;
        System.out.println("Введите число в минутах для красного сигнала светофора: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                shoot = scanner.nextInt();
                break;
            } else {
                System.out.println("ERROR: ВЫ ВВЕЛИ НЕ ЧИСЛО !!! Введите число");
                scanner.nextLine();
            }
        }
        return shoot;
    }

}


