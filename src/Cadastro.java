import java.util.ArrayList;

import Individuos.Funcionario;

public class Cadastro {
    
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void Cadastrar(Funcionario f){
        funcionarios.add(f);
    }
    
    public static void Listar(){

        if (funcionarios.isEmpty()) {
            System.out.println("Ainda não há funcionários cadastrados...");
            return;
        }
            for (Funcionario fTemp : funcionarios) {
                System.out.println(fTemp.toString());
            }
        return;
    }

    public static void excluir(int matricula){
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);

            if (f.getMatricula() == matricula) {
                funcionarios.remove(i);
                System.out.println("\n" + f.toString() + "foi removido com sucesso");
                return;
            }
        }
        System.out.println(matricula + " não encontrada.");
    }

    public static void buscar(int matricula){
        
        
        for (Funcionario fTemporario : funcionarios){
            
            
            if (fTemporario.getMatricula() == matricula) {
                System.out.println("Funcionário encontrado!\n");
                System.out.println(fTemporario.toString());
                return;
            }
        }
        
        System.out.println("\n" + matricula + " não encontrada"); 
        return;
    }



}
