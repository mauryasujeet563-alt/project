
import java.util.Scanner;

public class c1{
    public static class Student{
        String name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "sujeet";
        s1.rno = 25;
        s1.cgpa = 8.5;

        Student s2 = new Student();
        s2.name = "Abhimanyu";
        s2.rno = 54;
        s2.cgpa = 8.7;

        Student s3 = new Student();
        s3.name = "Aditya";
        s3.rno = sc.nextInt();
        s3.cgpa = sc.nextDouble();

        System.out.println(s3.name+" "+s3.rno+" "+s3.cgpa);
    }
}