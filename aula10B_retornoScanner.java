import java.util.Scanner;
import java.util.scanner;
public class aula10B_retornoScanner {
    public void main(String[] args){
        Scanner teclado = new scanner(system.in);
        contaScanner minhaConta = new contaScanner();

        system.out.println("saldo inicial: R$" + minhaConta.verificarSaldo());

        system.out.println("digite o valor que deseja sacar: R$");
        double valorSaque = teclado.nextDouble();

        minhaConta.sacar(valorSaque);

        system.out.println("saldo atualizado: R$" + minhaConta.verificarSaldo());

        teclado.close();





    }
}