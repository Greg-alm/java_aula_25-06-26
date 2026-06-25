public class aula09_ClassesAtributos {
    public static void main(String[] args){
        carro09 meucarro = new carro09();
        meucarro.modelo = "PORSCHE";
        meucarro.cor = "SHARK-BLUE";
        meucarro.ano = 2024;


        carro09 meucarro02 = new carro();
        meucarro02.modelo = "FERRARI";


        System.out.printin("Carro criado" + meucarro.modelo + "" + meucarro.cor);



    }
}