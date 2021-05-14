package state;

public class MonjeVikingo {

	private EstadoMonjeVikingo estado = new VikingoNormal();

	public int ataque = 10;
	public int nivelDeVida = 100;

	private void recibirAtaque(MonjeVikingo vikingo) {
		estado = estado.recibirAtaque(this, vikingo);
	}

	public void atacar(MonjeVikingo vikingo) {
		vikingo.recibirAtaque(this);
		estado = estado.atacar(this, vikingo);
	}

	public void meditar() {
		estado = estado.meditar(this);
	}
	
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	@Override
	public String toString() {
		return estado.toString() + " " + nivelDeVida;
	}

	public static void main(String[] args) {

		MonjeVikingo vikingo = new MonjeVikingo();
		MonjeVikingo vikingoOtro = new MonjeVikingo();

//		Estado inicial normal
		System.out.println("vikingo es un " + vikingo);

//		Recibe ataque y pasa a colerico
		vikingoOtro.atacar(vikingo);
		System.out.println("vikingo es un " + vikingo);

//		Recibe ataque y pasa a Berserker
		vikingoOtro.atacar(vikingo);
		System.out.println("vikingo es un " + vikingo);

//		Recibe ataque y queda igual berserker
		vikingoOtro.atacar(vikingo);
		System.out.println("vikingo es un " + vikingo);

//		Otro recibe ataque de berserker y Otro pasa a colerico
		System.out.println("vikingoOtro es un " + vikingoOtro);
		vikingo.atacar(vikingoOtro);
		System.out.println("vikingoOtro es un " + vikingoOtro);

//		Medita y vuelve a normal
		vikingo.meditar();
		System.out.println("vikingo es un " + vikingo);

//		Medita y pasa a calmado
		vikingo.meditar();
		System.out.println("vikingo es un " + vikingo);

//		Medita y sigue calmado
		vikingo.meditar();
		System.out.println("vikingo es un " + vikingo);

//		Ataca y cambia a Normal
		vikingo.atacar(vikingoOtro);
		System.out.println("vikingo es un " + vikingo);
		System.out.println("vikingoOtro es un " + vikingoOtro);

//		Recibe ataque de Otro
		vikingoOtro.atacar(vikingo);
		System.out.println("vikingo es un " + vikingo);
	}
}
