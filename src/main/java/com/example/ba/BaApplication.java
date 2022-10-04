package com.example.ba;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
public class BaApplication {

	public static void main(String[] args) {



		String x;

		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				x = "SOMOS BA";
				System.out.println(x);
			}else{
				if (i % 3 != 0 && i % 5 != 0) {

				System.out.println(i);}}
			if (i % 3 == 0) {
				x ="SOMOS";
				System.out.println(x);
			}else
				if (i % 5 == 0) {
				x ="BA";
					System.out.println(x);
			}}

		System.out.println("--------------------------------");

		int [] a  = {50,5,10,36,25,85,23,65};
		Arrays.sort(a);
		int menor;

		for(int i = 0; i < 8; i++){
			menor = a[0];

			if (a[i] < menor){
				menor = a[i];
			}
			else{
				if (a[i] > menor){
					menor = menor;
				}
			}
		}
		System.out.println(Arrays.toString(a));

		System.out.println("--------------------------------");

		Scanner sc=new Scanner(System.in);
		Scanner cs=new Scanner(System.in);

		String palabraUno = "";
		String palabraDos = "";
		System.out.print("Primera Palabra: ");

		palabraUno=sc.nextLine().trim();

		System.out.print("Segunda palabra: ");
		palabraDos=sc.nextLine().trim();

		if(palabraUno.length()==palabraDos.length()){

			for(int i = 0;i<palabraUno.length();i++){


				if(!palabraDos.contains(String.valueOf(palabraUno.charAt(i)))){
					System.out.println("No es un anagrama");
					return;
				}
			}

			System.out.println("SI es un anagrama");
		}
		else{
			System.out.println("La cantidad de caracteres es diferente!");
		}



}
}
