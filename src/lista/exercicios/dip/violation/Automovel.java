package lista.exercicios.dip.violation;

public class Automovel {
	protected int capacidadeTanqueCombustivel;
	protected int quantidadeCombustivel;
	protected int potencia;

	public Automovel(int combustivel) {
		capacidadeTanqueCombustivel = combustivel;
		quantidadeCombustivel = combustivel;
	}

	public void acelerar() {
		potencia++;
		quantidadeCombustivel--;
	}

}
