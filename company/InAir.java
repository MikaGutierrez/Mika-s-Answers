package com.company;

public class InAir extends Creatures{
    @Override
    public void move(){
        if (paws == 0) {
            distance += speed;
            System.out.println(name + " flew " + distance + "km in " + habitat);
            System.out.println(sounds);
            System.out.println();
        }
        for (int i = 1;i <= paws;i++){
            distance += speed;
            System.out.println(name + " flew " + distance + "km in " + habitat);
            System.out.println(sounds);
        }
        System.out.println();
    }
}
