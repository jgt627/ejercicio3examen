package ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ejercicio3Test {

	@CsvSource({"1, lunes","2, martes","3, miercoles","0, ERROR!", "10, ERROR!"})
	@ParameterizedTest 
	void testCursoSegunEdad(int input,String expected) {
		Ejercicio3 a = new Ejercicio3();
		assertEquals(expected,a.diaSemana(input));
	}
}
