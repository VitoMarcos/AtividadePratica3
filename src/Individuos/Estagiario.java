package Individuos;
public class Estagiario extends Funcionario{
    
private int horas;
private String supervisor;

public Estagiario(String nome, int matricula, float salario, int horas, String supervisor) {
    super(nome, matricula, salario);
    this.horas = horas;
    this.supervisor = supervisor;
}

public int getHoras() {
    return horas;
}

public void setHoras(int horas) {
    this.horas = horas;
}

public String getSupervisor() {
    return supervisor;
}

public void setSupervisor(String supervisor) {
    this.supervisor = supervisor;
}

@Override
public String toString() {
    
    return "ESTAGIÁRIO: " + super.toString() + "\nHoras trabalhadas: " + horas + "\nSupervisor: " + supervisor;
}

@Override
public float calcularSalario() {
    
    return salario * horas;
}

@Override
public String trabalhar() {
    
    return "O estagiário " + nome + " está trabalhando e aprendendo";
}

@Override
public String relatarProgresso() {
    
    return "O estagiário " + nome + " está evoluindo bem em projetos com seu supervisor " + supervisor + ".";
}

}
