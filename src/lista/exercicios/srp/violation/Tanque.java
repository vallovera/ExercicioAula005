package lista.exercicios.srp.violation;

public class Tanque {
	private final int capacidadeTanqueCombustivel;
	private int quantidadeCombustivel;

	public Tanque(int capacidade, int qtdCombustivel) {
		this.capacidadeTanqueCombustivel = capacidade;
		this.quantidadeCombustivel = qtdCombustivel;
	}

	public void reabastecimento() {
		quantidadeCombustivel = capacidadeTanqueCombustivel;
	}

	public int getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(int quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}

	public void gastaCombustive() {
		quantidadeCombustivel--;
	}
	public int getCapacidadeTanqueCombustivel() {
		return capacidadeTanqueCombustivel;
	}
}
