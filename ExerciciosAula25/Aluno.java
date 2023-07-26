package javabasico.aulta25.OOClassesEMetodosSimples.ExerciciosAula25;

public class Aluno {
    String nome;
    int matricula;
    String cursoMatriculado;
    double notaMatematica;
    double notaPortugues;
    double notaBiologia;

    void verificarMatematica(){
        if(notaMatematica>=7){
            System.out.println("Aluno " + this.nome + " está aprovado em matemática com "+ this.notaMatematica);
        }else{
            System.out.println("Aluno " + this.nome + " está reprovado em matemática com "+ this.notaMatematica);
        }
    }
    void verificarPortugues(){
        if(notaPortugues>=7){
            System.out.println("Aluno " + this.nome + " está aprovado em português com "+ this.notaPortugues);
        }else{
            System.out.println("Aluno " + this.nome + " está reprovado em português com "+ this.notaPortugues);
        }
    }
    void verificarBiologia(){
        if(notaBiologia>=7){
            System.out.println("Aluno " + this.nome + " está aprovado em biologia com "+ this.notaBiologia);
        }else{
            System.out.println("Aluno " + this.nome + " está reprovado em biologia com "+ this.notaBiologia);
        }
    }




}
