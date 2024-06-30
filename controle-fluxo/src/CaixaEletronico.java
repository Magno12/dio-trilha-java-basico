public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

        //Controle de fluxo simples.

        double saldo = 25.00;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println("Novo saldo R$ " + saldo);
        }
        else
            System.out.println("Saldo Insuficiente");

    }
}
