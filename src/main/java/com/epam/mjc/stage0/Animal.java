package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur)
    {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    String getDescription()
    {
        String description = "This animal is mostly " + color + ". It has " + numberOfPaws +
                (numberOfPaws==1?" paw":" paws") + " and " + (hasFur?"a":"no") + " fur.";
        return description;
    }
    public static void main(String[]args)
    {
        Animal a1 = new Animal("white", 1, false);
        Dog d1 = new Dog();
        Bird b1 = new Bird();
        System.out.println(a1.getDescription());
        System.out.println(b1.getDescription());
        System.out.println(d1.getDescription());
    }
}
