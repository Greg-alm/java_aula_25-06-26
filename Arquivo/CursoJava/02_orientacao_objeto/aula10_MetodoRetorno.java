public class aula10_MetodoRetorno {
    public static void main(String[] args){
        conta10 minhaConta = new conta10();
        double valorAtual = minhaConta.verificarSaldo();
        System.out.println("---------------------------------------------------------");
        System.out.println("saldo atual" + valorAtual);
        System.out.println("---------------------------------------------------------");
    }
}