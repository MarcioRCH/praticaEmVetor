package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Data;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Data[] vect = new Data[10];
		System.out.println("Rooms to rent");
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			while (vect[room] != null) {
				System.out.println("This room was rented, try other: ");
				room = sc.nextInt();
			}
			vect[room] = new Data(name,email);
		}
		
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
				if (vect[i] != null) {
					System.out.println("Rented Room: " + i + ", " + vect[i]);
			}
		}
		
		sc.close();

	}

}
