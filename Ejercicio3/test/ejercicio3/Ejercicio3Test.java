package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ejercicio3.Ejercicio3;

public class Ejercicio3Test {
	@CsvSource({"1,lunes","2,martes","3,miercoles","4,jueves","5,viernes","6,sabado","7,domingo","0,ERROR!"})
	
	@ParameterizedTest 
	void testDiaSemana(int input, String expected) {
		Ejercicio3 dia = new Ejercicio3();
		assertEquals(expected, dia.diaSemana(input));
	}
}
