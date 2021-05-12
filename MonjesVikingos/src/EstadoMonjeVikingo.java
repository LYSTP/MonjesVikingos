
public abstract class EstadoMonjeVikingo {

//	protected int ataque = 10;
//	protected int nivelDeVida = 100;
	
	public EstadoMonjeVikingo recibirAtaque(MonjeVikingo vikingoAtacado, MonjeVikingo vikingoAtaca) {
		return this;
	}
	
	public EstadoMonjeVikingo atacar(MonjeVikingo vikingoAtaca, MonjeVikingo vikingoAtacado) {
		return this;
	}
	
	public EstadoMonjeVikingo meditar(MonjeVikingo vikingo) {
		return this;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
