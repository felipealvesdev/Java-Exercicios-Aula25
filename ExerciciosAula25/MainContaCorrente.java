package javabasico.aulta25.OOClassesEMetodosSimples.ExerciciosAula25;

public class MainContaCorrente {
    public static void main(String[] args){

        ContaCorrente conta = new ContaCorrente();

        conta.id = 1;
        conta.limite = 3000;
        conta.saldo = 2500;
        conta.chequeEspecial = false;


        conta.depositar(500);
        conta.mostrarExtrato();
        conta.depositar(1000);
        conta.saque(300);
        conta.mostrarExtrato();
        conta.depositar(100);
        conta.mostrarExtrato();
    }
}
