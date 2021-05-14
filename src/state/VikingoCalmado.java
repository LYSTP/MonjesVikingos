package state;

public class VikingoCalmado extends EstadoMonjeVikingo {

	@Override
	public EstadoMonjeVikingo recibirAtaque(MonjeVikingo vikingoAtacado, MonjeVikingo vikingoAtaca) {
		return this;
	}

	@Override
	public EstadoMonjeVikingo atacar(MonjeVikingo vikingoAtaca, MonjeVikingo vikingoAtacado) {
		return new VikingoNormal();
	}
}
