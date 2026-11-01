import java.util.Scanner;

class Student {
  int roll_no;
  String name;
  int marks;
}
public class Prectics3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Student s1 = new Student();
    s1.roll_no = 1;
    s1.name = "Rohit";
    s1.marks = 60;

    Student s2 = new Student();
    s2.roll_no = 2;
    s2.name = "Aman Kumar";
    s2.marks = 87;

    Student s3 = new Student();
    s3.roll_no = 3;
    s3.name = "Jyoti";
    s3.marks = 90;

    Student student[] = new Student[3];
    student[0] = s1;
    student[1] = s2;
    student[2] = s3;

    for (int i = 0; i < student.length; i++) {
      System.out.println(student[i].name +" : "+student[i].marks);
    }
  }
}
