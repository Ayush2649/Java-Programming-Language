class Student{ // Class is a blueprint or a user-defined data type
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Student(){
    //     this.name = name;
    //     this.age = age;
    // } // Non-Parameterized Constructor

    // Student(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // } // Parametrized Constructor

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    } // Copy Constructor

    Student(){}
}

public class OOP {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Ayush";
        s1.age = 20;

        Student s2 = new Student(s1);

        s2.printInfo();
    }
}
