package Individuos;
public class Desenvolvedor extends Funcionario{
    
private String linguagens;


public Desenvolvedor(String nome, int matricula, float salario, String linguagens) {
    super(nome, matricula, salario);
    this.linguagens = linguagens;
    
}

public String getLinguagens() {
    return linguagens;
}

public void setLinguagens(String linguagens) {
    this.linguagens = linguagens;
}



@Override
public String toString() {
    
    return "DESENVOLVEDOR: " + super.toString() + "\nLinguagens dominantes: " + linguagens;
}

@Override
public float calcularSalario() {
    
    return salario;
}

@Override
public String trabalhar() {
    
    return "O desenvolvedor " + nome + " está programando.";
}

@Override
public String relatarProgresso() {
    
    return "O desenvolvedor " + nome + " está trabalhando em projetos utilizando linguagem " + linguagens + ".";
}





}
