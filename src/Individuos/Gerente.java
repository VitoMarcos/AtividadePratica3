package Individuos;
public class Gerente extends Funcionario{
    
private float bonusAtual;
private String equipe;

public Gerente(String nome, int matricula, float salario, float bonusAtual, String equipe) {
    super(nome, matricula, salario);
    this.bonusAtual = bonusAtual;
    this.equipe = equipe;
}

public float getBonusAtual() {
    return bonusAtual;
}

public void setBonusAtual(float bonusAtual) {
    this.bonusAtual = bonusAtual;
}

public String getEquipe() {
    return equipe;
}

public void setEquipe(String equipe) {
    this.equipe = equipe;
}

@Override
public String toString() {
    return "GERENTE: " + super.toString() + "\nBônus anual: " + bonusAtual + "\nEquipe que gere: " + equipe + ".";
}

@Override
public float calcularSalario() {
   
    return salario + bonusAtual;
}

@Override
public String trabalhar() {
    
    return "O gerente " + nome + "está trabalhando em projetos.";
}

@Override
public String relatarProgresso() {
    
    return "O gerente " + nome + " está lidereando o projeto da equipe " + equipe + " de maneira eficaz!";
}

}
