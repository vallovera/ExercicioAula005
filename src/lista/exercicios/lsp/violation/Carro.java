package lista.exercicios.lsp.violation;

public class Carro extends Veiculo {

    @Override
    public void mudaMarcha(Marcha marcha) {
        if(Marcha.R.equals(marcha) && getMarcha().equals(Marcha.D)){
            throw new RuntimeException("N�o pode mudar para REVERSE quando " + getMarcha().toString() + " marcha est� engatada!");
        }
    }
}
