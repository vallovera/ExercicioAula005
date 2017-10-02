package lista.exercicios.lsp.violation;

public class Aviao extends Veiculo {

    // Um avi�o pode reverter o motor enquanto se movimenta para frente
	@Override
    public void mudaMarcha(Marcha marcha) {
        if(!Marcha.P.equals(marcha)){
            throw new RuntimeException("N�o pode mudar para REVERSE quando n�o est� em movimento!");
        }
    }
}
