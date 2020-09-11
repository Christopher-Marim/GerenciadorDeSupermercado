
package trabalho.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class UsuarioAdmin extends Usuario implements Admin{
    
    public UsuarioAdmin(){}
    
    public UsuarioAdmin(String nome, String cpf){
    super(nome, cpf);
    
    }
    
    @Override
    public void boasVindas(){
        JOptionPane.showMessageDialog(null, "Boas vindas administrdor " + this.nome);
    }
    
   
}
