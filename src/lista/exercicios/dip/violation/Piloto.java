package lista.exercicios.dip.violation;

public class Piloto {

    private Automovel veiculo;

    public Piloto(){
        this.veiculo = new CarroDeCorrida(100);
    }

    public void aumentaVelocidade(){
        veiculo.acelerar();
    }
}
