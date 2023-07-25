package javabasico.aulta25.OOClassesEMetodosSimples;

public class TesteCarro {
    public static void main(String[] args){
        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
        System.out.println(van.capCombustivel);
        System.out.println(van.consumoCombustivel);

        van.exibirAutonomia();
        System.out.println("O retorno do método autonomia é: " + van.obterAutonomia() + " Km");

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);
        System.out.println("O valor do Km com 10 de combustivel é: " + qtdCombustivel10 + " Km");
        System.out.println("O valor do Km com 15 de combustivel é: " + qtdCombustivel15 + " Km");
    }
}
