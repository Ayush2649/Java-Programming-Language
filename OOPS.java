public class OOPS{
    public static void main(String args[]){
        // Pen p1 = new Pen();
        // p1.SetColor("Orange");
        // System.out.println(p1.color);

        // Fish Shark = new Fish();
        // Shark.eat();

        // Dog Sheru = new Dog();
        // Sheru.eat();
        // Sheru.legs = 4;
        // System.out.println(Sheru.legs);
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
    }
}

// class Pen{
//     String color;
//     int tip;

//     void SetColor(String newColor){
//         color = newColor;
//     }

//     void SetTip(int newTip){
//         tip = newTip;
//     }
// }

// class Strudent{
//     String name;
//     int age;
//     float percentage;

//     void calcPercentage(int phy, int chem, int maths){
//         percentage = (phy + chem + maths) / 3;
//     }
// }

// class Animal {
//     String color;

//     void eat(){
//         System.out.println("Eats");
//     }

//     void breathe(){
//         System.out.println("Breathes");
//     }
// }

// class Mammal extends Animal{
//     int legs;
// }

// class Cat extends Mammal{
//     void sound(){
//         System.out.println("Meow");
//     }
// }

// class Human extends Mammal{
//     int brain;
// }

// class Dog extends Mammal{
//     String bread;
// }

// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swims");
//     }
// }

// class Tuna extends Fish{
//     void shape(){
//         System.out.println("Looks good");
//     }
// }

// class Shark extends Fish{
//     void smells(){
//         System.out.println("Smells blood very efficiently");
//     }
// }

abstract class Animal{
    String color;

    Animal(){
        color = "brown";
    }
   
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Walks on 4 legs");
    }

    void changeColor(){
        color = "dark Brown";
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}