package lista.exercicios.srp.violation;

public class Veiculo {

	public Tanque tanque;
   
    public Veiculo(int capacidadeTanque) {
        tanque = new Tanque(capacidadeTanque, capacidadeTanque);
    }

    public void acelerar() {
        tanque.gastaCombustive();
    }
}
