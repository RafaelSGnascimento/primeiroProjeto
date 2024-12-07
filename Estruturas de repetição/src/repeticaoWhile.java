import java.util.Random;
public class repeticaoWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        double valorCarrinho = 0;
        double troco = mesada;
        Random valorDocerRandom = new Random();

        while (troco > 0) {
            double valorDoce = valorDocerRandom.nextDouble()  * 10;
            if (valorDoce > troco) {
                break;
            }
            valorCarrinho += valorDoce;
            troco -= valorDoce;
            
            System.out.println("Valor do doce: " + valorDoce);
            System.out.println("Saldo do carrinho: " + valorCarrinho);
            System.out.println("Valor troco: " + troco);
        }
        System.out.println("Valor gasto em doces: " + valorCarrinho);
        System.out.println("Troco: " + troco);
    }
}
