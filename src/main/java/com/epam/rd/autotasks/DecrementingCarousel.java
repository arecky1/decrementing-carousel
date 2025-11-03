package com.epam.rd.autotasks;

public class DecrementingCarousel {

    public final int capacity;
    private boolean running = false;
    private int size = 0;
    private final int[] array;

   public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        this.array = new int [capacity];
    }

    public boolean addElement(int element){


        if(running){
            return false;
        }

        if(element <= 0){
            return false;
        }

        if (size >= capacity){
            return false;
        }

        array[size++] = element;
        return true;
    }

    public CarouselRun run(){

        if(running){
            return null;
        }

        running = true;

        return new CarouselRun(array.clone());
    }
}
