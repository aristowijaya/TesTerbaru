package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	int menu = 0;
	String string = "Ini_bukan_angka";
	int[] array = {1,2,3};

	public Main() {
		
		
//			try {
//				System.out.println("Input angka 1: ");
//				int a = scan.nextInt();
//				
//				System.out.println("Input angka 2: ");
//				int b = scan.nextInt();
//				
//				int c = a/b;
//				
//				System.out.println("Result:" + c);
//				} catch (ArithmeticException e) {
//					System.out.println("Jangan dibagi dengan nilai 0 di angka kedua");
//				} catch (InputMismatchException e) {
//					System.out.println("Harus angka");	
//				} catch (Exception e) {
//					System.out.println("Ada error");
//				} finally {
//					System.out.println("Kalimat ini akan terus di print");
//				}
//		try {
//		
//			String a = null;
//			System.out.println(a.charAt(1));
//			
//		} catch (NullPointerException e) {
//			System.out.println("Error stringnya null");
//		}
//			
//	}
//		try {
//		
//		char ch = string.charAt(15);
//		System.out.println(ch);
//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println("Charnya melebihi dari yang seharusnya");
//		}
//		
		try {
		int number = array[3];
		System.out.println("angka:" + number);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutofBounds");
		}
		
		// codingan baruuu 
		// codingan terbaru
		
	}
		
			
		
			
		
		
	

	public static void main(String[] args) {
		new Main();

	}

}
