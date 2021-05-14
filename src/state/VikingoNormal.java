package state;

public class VikingoNormal extends EstadoMonjeVikingo {

	@Override
	public EstadoMonjeVikingo recibirAtaque(MonjeVikingo vikingoAtacado, MonjeVikingo vikingoAtaca) {
		vikingoAtacado.nivelDeVida -= vikingoAtaca.ataque;
		vikingoAtacado.ataque = 20;
		return new VikingoColerico();
	}

	@Override
	public EstadoMonjeVikingo atacar(MonjeVikingo vikingoAtaca, MonjeVikingo vikingoAtacado) {
		//vikingoAtacado.nivelDeVida -= vikingoAtaca.ataque;
		return this;
	}

	@Override
	public EstadoMonjeVikingo meditar(MonjeVikingo vikingo) {
		return new VikingoCalmado();
	}


}
