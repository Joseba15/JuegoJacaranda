package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import elementos.Coordenada;

class CoordenadaTest {

	@Test
	void goRightErrorTest() {
		Coordenada c1=new Coordenada(20, 0);
		
		assertFalse(c1.goRight());
	}
	
	@Test
	void goRightTest() {
		Coordenada c1=new Coordenada(4, 2);
		
		assertTrue(c1.goRight());
	}
	
	@Test
	void goDownErrorTest() {
		Coordenada c1=new Coordenada(0,40);
		
		assertFalse(c1.goDown());
	}
	

	@Test
	void goDownTest() {
		Coordenada c1=new Coordenada(8,4);
		
		assertTrue(c1.goDown());
	}
	
	@Test
	void goLeftErrorTest() {
		Coordenada c1=new Coordenada(-5, 0);
		
		assertFalse(c1.goLeft());
	}
	
	@Test
	void goLeftTest() {
		Coordenada c1=new Coordenada(5, 1);
		
		assertTrue(c1.goLeft());
	}
	
	
	@Test
	void goUpErrorTest() {
		Coordenada c1=new Coordenada(0, -10);
		
		assertFalse(c1.goUp());
	}
	
	
	@Test
	void goUpTest() {
		Coordenada c1=new Coordenada(7, 1);
		
		assertTrue(c1.goUp());
	}

}
