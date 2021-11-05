package com.company;

public class InGround extends Creatures{
    @Override
    public void move(){
        if (paws == 0) {
            distance += speed;
            System.out.println(name + " dug " + distance + "km in " + habitat);
            System.out.println(sounds);
            System.out.println();
        }
        for (int i = 1;i <= paws;i++){
            distance += speed;
            System.out.println(name + " dug " + distance + "km in " + habitat);
            System.out.println(sounds);
        }
        System.out.println();
    }
}
