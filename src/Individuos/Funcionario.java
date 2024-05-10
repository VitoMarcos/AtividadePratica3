package Individuos;

import Interface.Trabalhavel;

public abstract class Funcionario implements Trabalhavel{
    
protected String nome;
protected int matricula;
protected float salario;

public Funcionario(String nome, int matricula, float salario) {
    this.nome = nome;
    this.matricula = matricula;
    this.salario = salario;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getMatricula() {
    return matricula;
}

public void setMatricula(int matricula) {
    this.matricula = matricula;
}

public float getSalario() {
    return salario;
}

public void setSalario(float salario) {
    this.salario = salario;
}

@Override
public String toString() {
    return "\nNOME: " + nome + "\nMATRÍCULA: " + matricula + "\nSalário: " + salario;
}

public abstract float calcularSalario();





}
