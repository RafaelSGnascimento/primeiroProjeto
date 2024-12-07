public class condicaoTernaria {
    public static void main(String[] args) {
        //variaveis declaradas
        int nota = 7;

        //expressao ternaria "simplificando" o if else.
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
