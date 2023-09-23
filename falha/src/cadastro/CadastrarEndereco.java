package cadastro;

import modelo.Endereco;
import util.Input;

public class CadastrarEndereco {
    
    protected static void cadastrarEndereco(Endereco e) {
        System.out.println("Cidade: ");
        e.setCidade(Input.nextLine());
        System.out.println("Rua: ");
        e.setRua(Input.nextLine());
        System.out.println("Numero: ");
        e.setNumero(Input.nextLine());
    }
    
}
