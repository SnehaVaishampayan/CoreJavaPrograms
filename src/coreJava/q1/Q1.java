package src.coreJava.q1;

public class Q1 {
    public static void main(String args[]) {

        Student s1 = new Student(1, "name1", 100, 10);
        Student s2 = new Student(2, "name2", 200, 20);
        Student s3 = new Student(3, "name3", 300, 30);
        Student s4 = new Student(4, "name4", 400, 40);
        s1.printStudent();
        s2.printStudent();
        s3.printStudent();
        s4.printStudent();
    }
}

class Student {
    int id;
    String name;
    int fees;
    int marks;
    public Student(int id, String name, int fees, int marks) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.marks = marks;
    }

    public void printStudent() {
        System.out.println("Student Id " + id);
        System.out.println("Student name " + name);
        System.out.println("Student fees " + fees);
        System.out.println("Student marks " + marks);
    }
}