package elementos;

import logicaJuego.Constantes;

public class Jugador extends Element{

	private int dinero;
	private int gemas;
	private PlayerType player;
	private int pociones;
	
	
	public Jugador (PlayerType type) {
		super(ElementType.valueOf(type.name()));
		this.player=type;
	}

	public String getNombre() {
		return this.player.name();
	}
	
	public int getFuerza() {
		return this.player.getFuerza();
	}
	
	public int getFuerzaParaLuchar() {
		return (int)Math.random()*getFuerza();
	}
	
	public int getVelocidad() {
		return this.player.getVelocidad();
	}

	
	public int getVelocidadParaLuchar() {
		return (int)Math.random()*getVelocidad();
	}
	
	public int getMagia() {
		return this.player.getMagia();
	}
	
	public int getMagiaParaLuchar() {
		return (int)Math.random()*getMagia();
	}
	
	public int getDinero() {
		return dinero;
	}


	public void setDinero(int dinero) {
		this.dinero = dinero;
	}


	public int getGemas() {
		return gemas;
	}


	public void setGemas(int gemas) {
		this.gemas = gemas;
	}


	public PlayerType getPlayer() {
		return player;
	}


	public int getPociones() {
		return pociones;
	}


	public void setPociones(int pociones) {
		this.pociones = pociones;
	}
	
	
	public int lucha (Jugador enemigo) {
		int result=0;
		if (getFuerzaParaLuchar()>enemigo.getFuerzaParaLuchar()) {
			 if (enemigo.getDinero()==0 && enemigo.getPociones()==0) {
				result=Constantes.GANA_MUERE;
			}else if (enemigo.getDinero()==0 && enemigo.getPociones()!=0) {
				result=Constantes.GANA_USA_POCIMA;
			}else if (enemigo.getDinero()!=0 && enemigo.getPociones()==0) {
				result=Constantes.GANA_DINERO;
				setDinero(enemigo.getDinero());
			}
			 
		}else if (getFuerzaParaLuchar()<enemigo.getFuerzaParaLuchar()) {
			 if (getDinero()==0 && getPociones()==0) {
					result=Constantes.PIERDE_MUERE;
				}else if (getDinero()==0 && getPociones()!=0) {
					result=Constantes.PIERDE_USA_POCIMA;
				}else if (getDinero()!=0 && getPociones()==0) {
					result=Constantes.PIERDE_DINERO;
					enemigo.setDinero(getDinero());
				}
		}
		return result;
	}
	
	
	public void encuentraDinero() {
		this.dinero++;
	}
	
	public void encuentraPocion() {
		this.pociones++;
	}
	
	public void encuentraRoca() {
		
	}
	
	public String resumen () {
		return "Jugador con dinero: " + dinero + ", gemas: " + gemas + ", de tipo " + player + "y pociones: " + pociones;
	}

	

	
	
	
	
	
	
}
