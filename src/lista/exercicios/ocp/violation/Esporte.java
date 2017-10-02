package lista.exercicios.ocp.violation;

public class Esporte extends ModoDirecao{

	public Esporte(Veiculo veiculo) {
		super(veiculo);
		this.veiculo.setPotencia(400);	
		this.veiculo.setAlturaSuspencao(20);
	}

}
