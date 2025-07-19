class Student{ // Polymorphism Example
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(this.name);
    }

    public void printInfo(int age){
        System.out.println(this.age);
    }

    public void printInfo(String name, int age){
        System.out.println(this.name + " " + this.age);
    }
}

public class Polymorphism {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Ayush";
        s1.age = 20;

        s1.printInfo(s1.age); // 20
        s1.printInfo(s1.name); // Ayush
        s1.printInfo(s1.name, s1.age); // Ayush 20
    }
}