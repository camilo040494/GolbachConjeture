package principal;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();

		leer(numeros);
//		for (int i = 6; i <= 1000000; i+=2) {
//			numeros.add(i);
//		}
		
//		numeros.add(635463);
//		numeros.add(1000000);
		
//		for (Integer integer : numeros) {
//			System.out.println(integer);
//		}
		resolver(numeros);
		
	}

	static void resolver(ArrayList<Integer> numeros) {
		Conjeturas conj = new Conjeturas();
		for (Integer integer : numeros) {
			System.out.println(conj.darSumaPrimos(integer));			
		}
	}

	static void leer(ArrayList<Integer> array) {
		Scanner scan = new Scanner(System.in);
		String siguiente = scan.next();
		while(siguiente!=null && !siguiente.equals("0")){
			array.add(Integer.parseInt(siguiente));
			siguiente=scan.next();
		}
		scan.close();
	}
}
class Conjeturas {
	ArrayList<Integer> primoses;
	
	public String darSumaPrimos(int suma) {
		
		primoses = new ArrayList<>();
		
		int max = suma/2;
		primoses.add(2);
		primoses.add(3);
		
		primosMenores(523, primoses);
		
		for (Integer integer : primoses) {
			if (integer>max) {
				break;
			}
			int resta = suma-integer;
			if (esPrimo(resta)) {
				return suma+" = "+ integer + " + " + (resta);
			}			
		}

		return suma+" = 0 + "+suma;
		
	}
	
	private void primosMenores(int max, ArrayList<Integer> primes) {
		for (int i = 5; i < max; i+=2) {
			if (esPrimo(i)) {
				primes.add(i);
			}
		}
	}

	public Boolean esPrimo(int esPrimo) {
		if (esPrimo%2==0) {
			return false;
		}else{
			int max = (int) Math.sqrt(esPrimo);
			for (int i = 2; i <= max; i++) {
				if (esPrimo%i==0) {
					return false;
				}
			}
			return true;
		}
	}
}
