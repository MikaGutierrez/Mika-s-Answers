package com.company;

public class InWater extends Creatures{
    @Override
    public void move(){
        if (paws == 0) {
            distance += speed;
            System.out.println(name + " swam " + distance + "km in " + habitat);
            System.out.println();
        }
        for (int i = 1;i <= paws;i++){
            distance += speed;
            System.out.println(name + " swam " + distance + "km in " + habitat);
        }
        System.out.println();
    }
}
