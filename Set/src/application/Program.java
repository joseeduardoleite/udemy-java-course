package application;

import demos.Demo1;
import demos.Demo2;
import demos.DemoIgualdadeHashSet;
import demos.DemoIgualdadeTreeSet;

public class Program {

	public static void main(String[] args) {
		System.out.println("Primeira Demo");
		Demo1.Exemplo();
		System.out.println("Segunda Demo");
		Demo2.Exemplo();
		System.out.println("Terceira Demo");
		DemoIgualdadeHashSet.exe();
		System.out.println("Quarta Demo");
		DemoIgualdadeTreeSet.exe();
	}
}
