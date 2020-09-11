/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pkg1;



public class Produtos {
   protected int codigo;
   protected String descricao;
   protected double preco;
   
   public Produtos(int codigo, String descricao, double preco){
       this.codigo = codigo;
       this.descricao = descricao;
       this.preco = preco;
   }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
   
    public void mostrarInformacoes(){
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("preço: " + this.preco);
    }
    
    
    
}
