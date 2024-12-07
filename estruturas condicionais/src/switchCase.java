public class switchCase {
    public static void main(String[] args) {
        //variaveis declaradas
        String sigla = "M";

        //switch case acha uma condição compativel com o parametro de maneira mais organizada.
        switch (sigla) {
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Medio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
            System.out.println("Indefinido");
            break;
        }
    }
}
