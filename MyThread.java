package ru.corruptzero;

import java.util.function.IntToDoubleFunction;

public class MyThread extends Thread {
    private final Recursive<IntToDoubleFunction> recursive = new Recursive<>();
    private final int i;

    public MyThread(int i) {
        this.i = i;
        this.setName("Thread " + i);
    }

    @Override
    public void run(){
        recursive.func = x -> (x == 0) ? 1 : x * recursive.func.applyAsDouble(x - 1);
        System.out.println(this.getName() + ": " + recursive.func.applyAsDouble(i));

    }
}
