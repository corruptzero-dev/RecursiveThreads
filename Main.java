package ru.corruptzero;

import java.util.ArrayList;
import java.util.function.IntToDoubleFunction;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            new MyThread(i).start();
        }
    }
}
