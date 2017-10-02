package lista.exercicios.isp.violation;

public class Drone extends Aeromotor implements UsaCamera {

    private boolean cameraOn;

    public boolean isCameraOn() {
        return cameraOn;
    }


	public void ligarCamera() {
		cameraOn = true;
	}


	public void desligarCamera() {
		cameraOn = false;
	}


	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		
	}
}