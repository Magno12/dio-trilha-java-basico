public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        smartTv.volumeDiminuir();
        smartTv.volumeDiminuir();
        smartTv.volumeDiminuir();

        System.out.println("TV Liagada ? " + smartTv.ligada);

        System.out.println("Canal Atual : " + smartTv.canal);

        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Liagada ? " + smartTv.ligada);

        smartTv.canalProximo();
        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.volumeAumentar();
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.canalMudar(12);
        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.volumeAumentar();
        System.out.println("Volume Atual : " + smartTv.volume);


    }
}
