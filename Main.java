package ru.corruptzero;

import java.util.ArrayList;
import java.util.function.IntToDoubleFunction;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <= 100; i++) {
            MyThread myThread = new MyThread(i);
            myThread.start();
            myThread.join();
        }
    }
}
