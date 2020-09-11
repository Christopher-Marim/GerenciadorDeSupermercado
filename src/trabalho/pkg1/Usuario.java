
package trabalho.pkg1;

/**
 *
 * @author chris
 */
public class Usuario {
    protected String nome, cpf;
    
    public Usuario(){};
    
    public Usuario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
