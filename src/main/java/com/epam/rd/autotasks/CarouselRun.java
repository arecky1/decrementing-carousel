package com.epam.rd.autotasks;

public class CarouselRun {

    private final int[] array;
    private int position = 0;

    public CarouselRun(int[] array) {
        this.array = array;
    }

    public int next() {
        if (isFinished()) {
            return -1;
        }

        while (array[position] == 0) {
            position = (position + 1) % array.length;
        }

        int value = array[position];
        array[position]--;

        position = (position + 1) % array.length;

        return value;
    }

    public boolean isFinished() {
        for (int e : array) {
            if (e > 0) return false;
        }
        return true;
    }
}
