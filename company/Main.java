package com.company;

public class Main{
    public static void main(String[] args) {
        // Первичноротый по имени Дэйв проодолевает 0.1km глубоко в океане, говорит "Brl" и узнаёт что он плоский червь
        Protostomia C1 = new Protostomia();
        C1.name = "Дэйв";
        C1.paws = 0;
        C1.speed = 0.1;
        C1.sounds = "Brl";
        C1.habitat = "deep ocean";
        C1.type_Plathelminthes = true;
        C1.move();
        C1.Who();

        // Первичноротый по имени Генри проодолевает 0.008km где-то, говорит "Habr" и узнаёт что он тихоходка
        Protostomia C2 = new Protostomia();
        C2.name = "Генри";
        C2.paws = 8;
        C2.speed = 0.001;
        C2.sounds = "Habr";
        C2.habitat = "some where";
        C2.type_Tardingnata = true;
        C2.move();
        C2.Who();

        // Вторичноротый по имени Марти проодолевает 40km в саванне, говорит что он зебра и узнаёт что он хордовый
        Deuterostomia C3 = new Deuterostomia();
        C3.name = "Марти";
        C3.paws = 4;
        C3.speed = 10;
        C3.sounds = "I'm zebra";
        C3.habitat = "savanna";
        C3.type_Chordata = true;
        C3.move();
        C3.Who();

        // Вторичноротый по имени Авраам Линкольн проодолевает 6km в США и узнаёт что он хордовый
        Deuterostomia C4 = new Deuterostomia();
        C4.name = "Авраам Линкольн";
        C4.paws = 2;
        C4.speed = 3;
        C4.sounds = "Мы не поможем людям, делая за них то, что они могли бы сделать сами.";
        C4.habitat = "USA";
        C4.type_Chordata = true;
        C4.move();
        C4.Who();

        //Каркарыч пролитает 50km в облаках и каракет
        InAir C5 = new InAir();
        C5.name = "Каркарыч";
        C5.paws = 2;
        C5.speed = 25;
        C5.sounds = "Car";
        C5.habitat = "clouds";
        C5.move();

        //Monkey проплывает 240km в реке, но не издаёт звуки
        InWater C6 = new InWater();
        C6.name = "Monkey";
        C6.paws = 4;
        C6.speed = 60;
        C6.sounds = "Oaoa";
        C6.habitat = "river";
        C6.move();

        //Звездонос прорыл 40km в пещере и постоянно фыркает
        InGround C7 = new InGround();
        C7.name = "Звездонос";
        C7.paws = 4;
        C7.speed = 10;
        C7.sounds = "Fur fur";
        C7.habitat = "cave";
        C7.move();
    }
}
