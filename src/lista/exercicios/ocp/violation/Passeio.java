package lista.exercicios.ocp.violation;

public class Passeio extends ModoDirecao{

	public Passeio(Veiculo veiculo) {
		super(veiculo);
		this.veiculo.setPotencia(500);	
		this.veiculo.setAlturaSuspencao(10);
	}

}
