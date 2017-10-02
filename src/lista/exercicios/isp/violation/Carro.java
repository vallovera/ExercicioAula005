package lista.exercicios.isp.violation;

public class Carro extends Veiculo implements UsaRadio, UsaCamera {

    private boolean radioOn;

    public boolean isRadioOn() {
        return radioOn;
    }
    
	public void ligarRadio() {
		radioOn = true;
	}

	
	public void desligarRadio() {
        radioOn = false;
	}

	@Override
	public void ligarCamera() {
		//nada pra fazer aqui
	}

	@Override
	public void desligarCamera() {
		// nada pra fazer aqui
	}
}