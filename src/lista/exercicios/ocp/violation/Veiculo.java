package lista.exercicios.ocp.violation;

public abstract class Veiculo {

	private int potencia = 400;
	private int alturaSuspencao = 20;

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAlturaSuspencao() {
		return alturaSuspencao;
	}

	public void setAlturaSuspencao(int alturaSuspencao) {
		this.alturaSuspencao = alturaSuspencao;
	}

}