package com.company;

public class Main {

	public static void main(String[] args) {
		Firma firma = new Firma();
		firma.addWorker("Jan", "Kowalski", Stanowisko.DYREKTOR, 15000.00);
		firma.addWorker("Jann", "Kowalskii", Stanowisko.DYREKTOR, 15000.00);
		firma.addWorker("Janek", "Kowal", Stanowisko.KIEROWNIK, 5000.00);
		firma.addWorker("Julian", "Kowala", Stanowisko.KIEROWNIK, 15000.00);

		firma.listOfWorkers();
		System.out.println(firma.numberOfWorkers());
		System.out.println(firma.averageSalary());
		System.out.println(firma.averageSalary(Stanowisko.KIEROWNIK));
	}
}
