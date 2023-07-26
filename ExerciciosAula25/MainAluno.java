package javabasico.aulta25.OOClassesEMetodosSimples.ExerciciosAula25;

import java.util.Locale;
import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args){
        Aluno aluno01 = new Aluno();
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        System.out.println("Por favor, digite o nome do aluno:");
        aluno01.nome = scan.nextLine();
        System.out.println("Digite o número da matrícula do aluno:");
        aluno01.matricula = scan.nextInt();
        System.out.println("Digite o curso que o aluno " + aluno01.nome + " está matriculado:");
        scan.nextLine();
        aluno01.cursoMatriculado = scan.nextLine();

        System.out.println("Digite a nota do aluno " + aluno01.nome + " em matemática:");
        aluno01.notaMatematica = scan.nextDouble();
        System.out.println("Digite a nota do aluno " + aluno01.nome + " em português:");
        aluno01.notaPortugues = scan.nextDouble();
        System.out.println("Digite a nota do aluno " + aluno01.nome + " em biologia:");
        aluno01.notaBiologia = scan.nextDouble();

        aluno01.verificarMatematica();
        aluno01.verificarPortugues();
        aluno01.verificarBiologia();


        System.out.println();
        System.out.println("---------Informações gerais sobre " + aluno01.nome + "-----------");

        System.out.println("Número da matrícula: " + aluno01.matricula);
        System.out.println("Curso no qual o(a) aluno(a) " + aluno01.nome + " está matrículado: " + aluno01.cursoMatriculado);
        System.out.println("Notas do aluno em Matemática: " + aluno01.notaMatematica);
        System.out.println("Notas do aluno em Português: " + aluno01.notaPortugues);
        System.out.println("Notas do aluno em Biologia: " + aluno01.notaBiologia);

    }
}
