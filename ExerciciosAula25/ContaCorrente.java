package javabasico.aulta25.OOClassesEMetodosSimples.ExerciciosAula25;

public class ContaCorrente {
    int id;
    double saldo;
    boolean chequeEspecial;
    double limite;

    void saque(double valor){
        if(valor<this.saldo){
            this.saldo = saldo - valor;
        }else{
            System.out.println("Saldo insuficiente! Por favor, deposite dinheiro na sua conta para que possa sacar um valor dentro de seu saldo.");
        }

    }
    void depositar(double valor){
        if(this.saldo<limite){
            this.saldo = saldo + valor;
        }else{
            System.out.println("Não foi possível realizar a transação. Saldo atual da conta: " + this.saldo + " é superior / igual ao limite desta conta limite: " + this.limite);
        }
    }
    void checarEspecial(){
        if(chequeEspecial){
            System.out.println("Esta conta está no cheque especial.");
        }else{
            System.out.println("Esta conta não está no cheque especial");
        }
    }
    void mostrarExtrato(){
        System.out.println("Id: " + this.id);
        System.out.println("O saldo desta conta é: " + this.saldo);
        System.out.println("O limite desta conta é: " + this.limite);
        System.out.println("A conta está no cheque especial? " + this.chequeEspecial);
    }
}
