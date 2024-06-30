public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 4;
       //IF ternario com else
       

        String resultado2 = nota >=7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println("IF ternario com else if : " + resultado2);

        //If Ternario
        
        
        String resultado = nota >= 7 ? "IF ternario Aprovado :" : "Reprovado";
        System.out.println(resultado);

        /* 
                
        int nota = 8;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Prova de Recuperação");
        } else {
            System.out.println("Reprovado");
        } */
    }
}
