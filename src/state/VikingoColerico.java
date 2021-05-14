package state;

public class VikingoColerico extends EstadoMonjeVikingo {

	@Override
	public EstadoMonjeVikingo recibirAtaque(MonjeVikingo vikingoAtacado, MonjeVikingo vikingoAtaca) {
		vikingoAtacado.nivelDeVida -= 2 * vikingoAtaca.ataque;
		vikingoAtacado.ataque = 30;
		return new VikingoBerserker();
	}

	@Override
	public EstadoMonjeVikingo atacar(MonjeVikingo vikingoAtaca, MonjeVikingo vikingoAtacado) {
//		vikingoAtacado.nivelDeVida -= 2 * vikingoAtaca.ataque;
		return this;
	}

	@Override
	public EstadoMonjeVikingo meditar(MonjeVikingo vikingo) {
		vikingo.ataque = 10;
		return new VikingoNormal();
	}

}
