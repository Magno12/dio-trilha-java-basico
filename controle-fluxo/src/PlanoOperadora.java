public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "P";

        switch (plano) {
            case "P": {
                System.out.println("5Gb Youtube");
               
            }
            case "M": {
                System.out.println("Whats e Instagram gratis");
                
            }
            case "G": {
                System.out.println("100 minutos de ligações");
               break;
            }
            default:
                System.out.println("defaul");
                break;
        }
    }
}
