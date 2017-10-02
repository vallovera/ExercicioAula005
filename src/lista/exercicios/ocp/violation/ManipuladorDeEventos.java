package lista.exercicios.ocp.violation;

public class ManipuladorDeEventos {

    private Veiculo veiculo;
    private ModoDirecao modoDirecao;
    
    public ManipuladorDeEventos(final Veiculo veiculo) {
        this.veiculo = veiculo;
        
    }

    public void mudarModoDirecao(final ModoDirecao modoDirecao){
    
    	this.modoDirecao = modoDirecao;
     }
}
