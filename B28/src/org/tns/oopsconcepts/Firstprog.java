package org.tns.oopsconcepts;
import java.util.Scanner;
public class Firstprog {

	public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        try {
		String name=o.nextLine();
		int age=o.nextInt();
		int c=o.nextInt();
		int java=o.nextInt();
		int python=o.nextInt();
		int total=c+java+python;
		float avg=total/3;
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Marks in c="+c);
		System.out.println("Marks in java="+java);
		System.out.println("Marks in python="+python);
		System.out.println("Total="+total);
		System.out.println("Average="+avg);

	}finally {
		Scanner in;
		in.close();
	}

}
