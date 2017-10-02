package lista.exercicios.lsp.violation;

public class Aviao extends Veiculo {

    // Um avião pode reverter o motor enquanto se movimenta para frente
	@Override
    public void mudaMarcha(Marcha marcha) {
        if(!Marcha.P.equals(marcha)){
            throw new RuntimeException("Não pode mudar para REVERSE quando não está em movimento!");
        }
    }
}
