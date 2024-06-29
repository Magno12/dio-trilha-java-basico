public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void volumeAumentar() {
        volume++;
    }

    public void volumeDiminuir() {
        volume--;
    }

    public void canalProximo() {
        canal++;
    }

    public void canalAnterior() {
        canal++;
    }

    public void canalMudar(int novoCanal){
        canal = novoCanal;
    }

}
