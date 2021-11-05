package com.company;

public class Creatures {
    private boolean live = true;
    private boolean eat = true;
    private boolean breathe = true;
    private boolean reproduce = true;
    int paws;
    int size;
    String name;
    double speed;
    String habitat;
    String sounds;
    int lifespan;
    double distance = 0;
    String type;

    public void move() {
        if (paws == 0) {
            distance += speed;
            System.out.println(name + " passed " + distance + "km in " + habitat);
            System.out.println(sounds);
            System.out.println();
        }
        for (int i = 1;i <= paws;i++){
            distance += speed;
            System.out.println(name + " passed " + distance + "km in " + habitat);
            System.out.println(sounds);
        }
        System.out.println();
    }
}
