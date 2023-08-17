/* Write a program in java to input and display the details of n number of students 
having roll, name and cgpa as data members. Also display the name of the 
student having lowest cgpa.*/

import java.util.Scanner;
class Student {
	String Name;
	String Roll;
	int cgpa;
	public Student() {
		this(" ", " ", 0);
	}
	public Student(String initName, String initId, int initScore) {
		Name = initName;
		Roll = initId;
		cgpa = initScore;
	}
}

public class program4_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n = Integer.parseInt(in.nextLine().trim());
		System.out.println("Enter Student Name, Roll, cgpa:");
		Student stu = new Student();
		Student max = new Student();
		Student min = new Student(" ", " ", 100);
		for (int i = 0; i < n; i ++) {
			stu.Name = in.next();
			stu.Roll = in.next();
			stu.cgpa = in.nextInt();
			if (max.cgpa < stu.cgpa) {
				max.Name = stu.Name;
				max.Roll = stu.Roll;
				max.cgpa = stu.cgpa;
			}
            if (min.cgpa> stu.cgpa) {
				min.Name = stu.Name;
				min.Roll = stu.Roll;
				min.cgpa = stu.cgpa;
			}
		}
		System.out.println("Name of the  student having the lowest cgpa:");
		System.out.println(min.Name + " " );
		in.close();
	}
}
