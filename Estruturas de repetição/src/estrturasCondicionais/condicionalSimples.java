package estrturasCondicionais;
public class condicionalSimples {
    public static void main(String[] args){
        //variveis declaradas.
        double saldo = 20.5;
        double valorSolicitado = 17.0;

        //fluxo condicional verificando se o saldo é inferior ao valor solicitado.
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        }
    }
}
