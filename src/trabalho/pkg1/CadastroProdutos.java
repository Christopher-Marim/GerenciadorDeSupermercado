/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pkg1;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class CadastroProdutos extends javax.swing.JFrame {

    ArrayList<Produtos> lista = new ArrayList<>();
    
    
    
    public CadastroProdutos() {
        initComponents();
        
    }
    public CadastroProdutos(ArrayList list) {
        initComponents();
        this.lista = list;
        preencheLista();
        
    }
    
        //Preencher a combo box com os produtos
        public void preencheLista(){
            for(int i=0; i<this.lista.size();i++){
                
                this.cb_produtos.addItem(this.lista.get(i).getDescricao());
            }
        }
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_imprimir3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cb_produtos = new javax.swing.JComboBox<>();
        jb_cadastrar = new javax.swing.JButton();
        jb_imprimir = new javax.swing.JButton();
        jb_editar = new javax.swing.JButton();
        jb_del = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        bt_imprimir3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_imprimir3.setText("Imprimir");
        bt_imprimir3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_imprimir3MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Produtos ");

        jb_cadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_cadastrar.setText("Cadastrar");
        jb_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cadastrarMouseClicked(evt);
            }
        });

        jb_imprimir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_imprimir.setText("Imprimir");
        jb_imprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_imprimirMouseClicked(evt);
            }
        });
        jb_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_imprimirActionPerformed(evt);
            }
        });

        jb_editar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_editar.setText("Editar");
        jb_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_editarMouseClicked(evt);
            }
        });

        jb_del.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_del.setText("Excluir");
        jb_del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_delMouseClicked(evt);
            }
        });

        jMenu2.setText("Deslogar");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cb_produtos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_imprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_editar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_del, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(167, 167, 167))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cb_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cadastrar)
                    .addComponent(jb_imprimir)
                    .addComponent(jb_editar)
                    .addComponent(jb_del))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cadastrarMouseClicked
        //Abrir outra tela para cadastrar um produto
        
        CadastrarProdutos cadastrar = new CadastrarProdutos(lista);
        cadastrar.setDefaultCloseOperation(HIDE_ON_CLOSE);
        cadastrar.setVisible(true);
        setVisible(false);
        
        
    }//GEN-LAST:event_jb_cadastrarMouseClicked

    private void jb_imprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_imprimirMouseClicked
        // imprimir o produto selecionado na combo box.
        
        for(int i=0; i<lista.size(); i++){
            if(this.cb_produtos.getSelectedItem().toString() == this.lista.get(i).getDescricao()){
                lista.get(i).mostrarInformacoes();
            }
        }
    }//GEN-LAST:event_jb_imprimirMouseClicked

    private void jb_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_editarMouseClicked
        // Abrir outra tela para alterar
        for(int i=0; i<lista.size(); i++){
            if(this.cb_produtos.getSelectedItem().toString() == this.lista.get(i).getDescricao()){
                Edit e = new Edit(lista.get(i), lista);
                e.setVisible(true);
                setVisible(false);
                
            }
        }
        
    }//GEN-LAST:event_jb_editarMouseClicked

    private void bt_imprimir3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_imprimir3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_imprimir3MouseClicked

    private void jb_delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_delMouseClicked
        // Deletar o produto
        
        switch(JOptionPane.showConfirmDialog(this, "Tem certeza em deletar esse produto?")){
            case 0: //Sim.
                //Percorre a lista de produtos procurando por aquele que está selecionado no combo box,ao encontrar deletar tanto na lista quanto na combobox
                for(int i=0; i<lista.size(); i++){
                    if(this.cb_produtos.getSelectedItem().toString() == this.lista.get(i).getDescricao()){
                        this.cb_produtos.removeItem(this.lista.get(i).getDescricao());
                        this.lista.remove(i);
                    }
                }
                break;
            case 1: 
                break;
            case 2: 
                break;
        }
        
        
    }//GEN-LAST:event_jb_delMouseClicked

    private void jb_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_imprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_imprimirActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_imprimir3;
    private javax.swing.JComboBox<String> cb_produtos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_cadastrar;
    private javax.swing.JButton jb_del;
    private javax.swing.JButton jb_editar;
    private javax.swing.JButton jb_imprimir;
    // End of variables declaration//GEN-END:variables
}
