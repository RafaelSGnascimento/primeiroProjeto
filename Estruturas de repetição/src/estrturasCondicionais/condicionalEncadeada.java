package estrturasCondicionais;
public class condicionalEncadeada {
    public static void main(String[] args) {
        //variaveis declaradas.
        int nota = 6;

        //fluxo condicional caso a condição seja positiva.
        if (nota >= 7)
            System.out.println("Aprovado!");
        
        //fluxo condicional caso a primeira e a segunda condição sejam positivas!
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação!");

        //fluxo condicional caso a condição seja negativa.
        else
            System.out.println("Reprovado!");
    }
}
