package elementos;

import java.util.Objects;

import logicaJuego.Constantes;

public class Coordenada {

	private int x;
	private int y;
	
	public Coordenada () {}
	
	public Coordenada(int x, int y) {
		this.x=x;
		this.y=y;
	}

	
	public boolean goRight () {
		boolean res =true;
		if (x<Constantes.TAMANNO-1) {
			x++;
		}else {
			res=false;
		}
		
		return res;
	}
	
	
	public boolean goLeft () {
		boolean res =true;
		if (x>0) {
			x--;
		}else {
			res=false;
		}
		
		return res;
	}
	
	
	public boolean goUp () {
		boolean res =true;
		if (y>0) {
			y--;
		}else {
			res=false;
		}
		
		return res;
	}
	
	
	public boolean goDown () {
		boolean res =true;
		if (y<Constantes.TAMANNO-1) {
			y++;
		}else {
			res=false;
		}
		
		return res;
	}
	
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenada other = (Coordenada) obj;
		return x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "Coordenada con Eje x = " + x + " y Eje y = " + y;
	}
	
	
	
}
