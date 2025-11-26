package counter.main;
import counter.nightShift.NightShift;

public class Calculator {
    public static void main(String[] args) {
        NightShift calculo = new NightShift();
        double salario = calculo.addNoturno(6.0, 6.14, 20);
        System.out.println("Salário: " + salario);
    }
}