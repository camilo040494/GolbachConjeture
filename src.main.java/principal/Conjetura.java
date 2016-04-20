package principal;

import java.util.HashMap;
import java.util.TreeMap;

public class Conjetura {

	HashMap<Integer, Boolean> primos;
	
	public String darSumaPrimos(int suma) {
		if (suma<4) {
			//error
		}
		int max = suma/2;
		primos = new HashMap<>();
		primos.put(1, true);
		primos.put(2, true);
		primos.put(3, true);
		
		for (int i = 2; i <= max; i++) {
			int resta = suma-i;
			if (!primos.containsKey(i)) {
				primos.put(i, esPrimo(i));
			}
			if (!primos.containsKey(resta)) {
				primos.put(resta, esPrimo(resta));
			}
			if (primos.get(i) && primos.get(resta)) {
				return suma+" = "+ i + " + " + (resta);
			}
		}
		return suma+" = 0 + "+suma;
	}
		
	public String darSumaPrimos4(int suma) {
		if (suma<4) {
			//error
		}
		int max = suma/2;
		if (primos==null) {
			primos = new HashMap<>();			
		}
		primos.put(1, true);
		primos.put(2, true);
		primos.put(3, true);
		
		int resta = suma-2;
		if (!primos.containsKey(resta)) {
			primos.put(resta, esPrimo(resta));
		}
		if (primos.get(resta)) {
			return suma+" = "+ 2 + " + " + (resta);
		}
		
		for (int i = 3; i <= max; i+=2) {
			if (i>501) {
				System.out.println("-------------------------------");
				break;
			}
			resta = suma-i;
			if (!primos.containsKey(i)) {
				primos.put(i, esPrimo(i));
			}
			if (!primos.containsKey(resta)) {
				primos.put(resta, esPrimo(resta));
			}
			if (primos.get(i) && primos.get(resta)) {
				return suma+" = "+ i + " + " + (resta);
			}
		}
		return suma+" = 0 + "+suma;
//		return "Goldbach's conjecture is wrong.";
	}
	
	public int maxLocal = 0;
	
	public String darSumaPrimos2(int suma) {
		if (suma<4) {
			//error
		}
		
		if (primos==null) {
			primos = new HashMap<>();			
		}
		
		if (suma%2==0) {
			//numero par
			//probar solo con impares y 2
		}else{
			//numero impar
		}
		
		int max = suma/2;
		primos.put(2, true);
		primos.put(3, true);
		
		int resta = suma-2;
		if (!primos.containsKey(resta)) {
			primos.put(resta, esPrimo(resta));
		}
		if (primos.get(resta)) {
			return suma+" = "+ 2 + " + " + (resta);
		}
		
		for (int i = 3; i <= max; i+=2) {
			if (i>523) {//maximo primo en i
				break;
			}
			
			resta = suma-i;
			if (!primos.containsKey(i)) {
				primos.put(i, esPrimo(i));
			}
			if (!primos.containsKey(resta)) {
				primos.put(resta, esPrimo(resta));
			}
			if (primos.get(i) && primos.get(resta)) {
				if (i>maxLocal) {
					maxLocal = i;
				}
				return suma+" = "+ i + " + " + (resta);
			}
		}
		return suma+" = 0 + "+suma;
//		return "Goldbach's conjecture is wrong.";
	}
	
	TreeMap<Integer, Boolean> primose;
	
	public String darSumaPrimos3(int suma) {
		if (suma<4) {
			//error
		}
		
		if (primose==null) {
			primose = new TreeMap<>();			
		}
		
		if (suma%2==0) {
			//numero par
			//probar solo con impares y 2
		}else{
			//numero impar
		}
		
		int max = suma/2;
		primose.put(2, true);
		primose.put(3, true);
		
		int resta = suma-2;
		if (!primose.containsKey(resta)) {
			primose.put(resta, esPrimo(resta));
		}
		if (primose.get(resta)) {
			return suma+" = "+ 2 + " + " + (resta);
		}
		
		for (int i = 3; i <= max; i+=2) {
			if (i>523) {//maximo primo en i
				break;
			}
			resta = suma-i;
			if (!primose.containsKey(i)) {
				primose.put(i, esPrimo(i));
			}
			if (!primose.containsKey(resta)) {
				primose.put(resta, esPrimo(resta));
			}
			if (primose.get(i) && primose.get(resta)) {
				return suma+" = "+ i + " + " + (resta);
			}
		}
		return suma+" = 0 + "+suma;
		
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
