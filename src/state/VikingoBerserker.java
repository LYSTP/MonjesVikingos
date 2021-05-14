package state;

public class VikingoBerserker extends EstadoMonjeVikingo {

	@Override
	public EstadoMonjeVikingo recibirAtaque(MonjeVikingo vikingoAtacado, MonjeVikingo vikingoAtaca) {
		vikingoAtacado.nivelDeVida -= vikingoAtaca.ataque / 2;
		return this;
	}

	@Override
	public EstadoMonjeVikingo atacar(MonjeVikingo vikingoAtaca, MonjeVikingo vikingoAtacado) {
//		vikingoAtacado.nivelDeVida -= 3 * vikingoAtaca.ataque;
		return this;
	}

	@Override
	public EstadoMonjeVikingo meditar(MonjeVikingo vikingo) {
		vikingo.ataque = 10;
		return new VikingoNormal();
	}

}
