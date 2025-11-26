package counter.nightShift;

public class NightShift {
    private String diasTrabalhados;
    private double salario;

    public NightShift() {}

    public NightShift(String diasTrabalhados, double salario) {
        this.diasTrabalhados = diasTrabalhados;
        this.salario = salario;
    }

    public String getDiasTrabalhados() {
        return diasTrabalhados;
    }
    public void setDiasTrabalhados(String diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double addNoturno(double horasTrabalhadas, double addNot) {
        return this.salario += horasTrabalhadas * addNot;
    }
}