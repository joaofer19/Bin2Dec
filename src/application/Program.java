package application;

import java.util.Scanner;

import entities.Calculator;

public class Program {
	public  static void main(String[] args) {
		String bin;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in binary");
		bin = sc.nextLine();
		Calculator calc = new Calculator(bin);
		calc.bin2dec(bin);
		System.out.println("Decimal : " + calc.getDecimal());
	}
}
