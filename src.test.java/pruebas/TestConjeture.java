package pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

import principal.Conjetura;

public class TestConjeture {

	@Test
	public void test() {
		Conjetura conje = new Conjetura();
		int[] numeros = {4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		boolean[] correctos = {false, true, false, true, false, false, false, true, false, 
				true, false, false, false, true};
		boolean[] comparar = new boolean[numeros.length];
		for (int i = 0; i < correctos.length; i++) {
			comparar[i] = conje.esPrimo(numeros[i]);
		}
		for (int i = 0; i < comparar.length; i++) {
			if (comparar[i]!=correctos[i]) {
				fail("Fallo "+numeros[i]);
			}
		}
		
		assertTrue(conje.esPrimo(37));
		assertTrue(conje.esPrimo(41));
		assertTrue(conje.esPrimo(61));
		assertFalse(conje.esPrimo(21));
	}

}
