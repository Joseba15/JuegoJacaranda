package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import elementos.Jugador;
import elementos.PlayerType;

class JugadorTest {


	@Test
	void testLucha() {
		Jugador j1= new Jugador(PlayerType.OGRO);
		Jugador j2= new Jugador(PlayerType.OGRO);
		j1.lucha(j2);
	
	}

	@Test
	void testEncuentraDinero() {
		fail("Not yet implemented");
	}

	@Test
	void testEncuentraPocion() {
		fail("Not yet implemented");
	}

	@Test
	void testEncuentraRoca() {
		fail("Not yet implemented");
	}

}
