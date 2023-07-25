package javabasico.aulta25.OOClassesEMetodosSimples.ExerciciosAula25;

public class Lampada {
    boolean isOn = false;

    void ligar(){
        this.isOn = true;
        System.out.println("Agora a lâmpada está acesa! Valor de isOn:" + isOn);
    }
    void desligar(){
        this.isOn = false;
        System.out.println("Agora a lâmpada está desligada! Valor de isOn:" + isOn);
    }
}
