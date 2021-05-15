package condicionales;

public class MonjeVikingo {

	private String estado;
	private int ataque;
	private int vida;

	public MonjeVikingo() {
		this.estado = "normal";
		this.ataque = 10;
		this.vida = 100;
	}

	private void recibirAtaque(MonjeVikingo vikingo) {

		if (this.estado.equals("normal")) {
			this.vida -= vikingo.ataque;
			this.estado = "colerico";
			this.ataque = 20;
			return;
		}

		if (this.estado.equals("colerico")) {
			this.vida -= vikingo.ataque * 2;
			this.estado = "berserker";
			this.ataque = 30;
			return;
		}

		if (this.estado.equals("berserker")) {
			this.vida -= vikingo.ataque / 2;
			return;
		}
	}

	public void atacar(MonjeVikingo vikingo) {

		if (this.estado.equals("calmado")) {
			this.estado = "normal";
		}

		vikingo.recibirAtaque(this);
	}

	public void meditar() {

		if (this.estado.equals("normal")) {
			this.estado = "calmado";
		}

		else {
			this.estado = "normal";
			this.ataque = 10;
		}
	}

	@Override
	public String toString() {
		return "Vikingo" + this.estado + " " + this.vida;
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
