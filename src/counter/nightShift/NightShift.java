package counter.nightShift;

public class NightShift {
    private String diasTrabalhados;
    private double salario;

    public NightShift() {}

    public NightShift(String diasTrabalhados, double salario) {
        this.diasTrabalhados = diasTrabalhados;
        this.salario = 0;
    }

    public String getDiasTrabalhados() {
        return diasTrabalhados;
    }
    public void setDiasTrabalhados(String diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public double addNoturno(double horasTrabalhadas, double addNot) {
        return horasTrabalhadas * addNot;
    }
}