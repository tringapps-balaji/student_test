import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class student {
    String name;
    int age;
    double gpa;

student (String name,int age,double gpa){
    this.name = name;
    this.age = age;
    this.gpa = gpa;
}
double getgpa(){
    return gpa;
}
public String toString(){
    return ("Name : "+name+"    " +"Age : "+age+"   " +"Gpa : "+gpa+" ");
}
}
public class student_test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Number of students  : ");
        int num = scan.nextInt();

        ArrayList<student> arr = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter Student Name -->" + (i + 1));
            System.out.println("Enter the name : ");
            String name = scan.next();
            System.out.println("Enter the age : ");
            int age = scan.nextInt();
            System.out.println("Enter the Gpa : ");
            double gpa = scan.nextDouble();

            student obj = new student(name, age, gpa);
            arr.add(obj);
        }

        System.out.println("The array is : "+arr);
        Collections.sort(arr ,(s1,s2)-> Double.compare(s2.getgpa(),s1.getgpa()));
        System.out.println("Sorted array is : "+arr);

    }
}












