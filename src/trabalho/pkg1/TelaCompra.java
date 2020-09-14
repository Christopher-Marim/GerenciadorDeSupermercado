
package trabalho.pkg1;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class TelaCompra extends javax.swing.JFrame {
    
    ArrayList<Produtos> lista = new ArrayList<>();
    ArrayList<Produtos> listaCarrinho = new ArrayList<>();
    
    DefaultListModel dlm2 = new DefaultListModel();
    
    Usuario uAux;
    
    public TelaCompra() {
        initComponents();
    }
    public TelaCompra(ArrayList list, Usuario uc) {
        initComponents();
        this.uAux = uc;
        this.lista = list;
        preencheLista();
    }

    public void preencheLista(){
             DefaultListModel dlm = new DefaultListModel();
            for(int i=0; i<this.lista.size();i++){
                dlm.addElement(lista.get(i).getDescricao());
                
            }
            JList_produtos.setModel(dlm);
        }
    private double total = 0;
    // lógica para somar produtos
    public void somarProdutos(){
        
        for (int i = 0; i < listaCarrinho.size(); i++) {
            for(int j = 0; j < lista.size();j++){
                 if(listaCarrinho.get(i).getCodigo() == lista.get(j).getCodigo()){
                 total += listaCarrinho.get(i).getPreco();
           }
            }
        }
        Jb_total.setText(String.valueOf(total));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Jb_total = new javax.swing.JLabel();
        JB_addCar = new javax.swing.JButton();
        JB_Details = new javax.swing.JButton();
        jb_complete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JList_produtos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Compra");

        jLabel2.setText("Produtos");

        jScrollPane1.setViewportView(JList);

        jLabel3.setText("Total:");

        jLabel4.setText("Carrinho");

        JB_addCar.setText("Add. Carrinho");
        JB_addCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_addCarMouseClicked(evt);
            }
        });

        JB_Details.setText("Detalhes");
        JB_Details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_DetailsMouseClicked(evt);
            }
        });

        jb_complete.setText("Finalizar");
        jb_complete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_completeMouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(JList_produtos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JB_addCar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JB_Details)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_complete)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jb_complete))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Jb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_addCar)
                            .addComponent(JB_Details))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_DetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_DetailsMouseClicked
       // imprimir o produto selecionado na combo box.
        
        for(int i=0; i<lista.size(); i++){
            if(this.JList_produtos.getSelectedValue().toString() == this.lista.get(i).getDescricao()){
                lista.get(i).mostrarInformacoes();
            }
        }
    }//GEN-LAST:event_JB_DetailsMouseClicked

        
    private void JB_addCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_addCarMouseClicked
        // imprimir o produto selecionado na combo box.
        
                dlm2.addElement(JList_produtos.getSelectedValue());
                JList.setModel(dlm2);
                for (int i = 0; i < lista.size(); i++) {
            if(JList_produtos.getSelectedValue() == lista.get(i).getDescricao()){
                listaCarrinho.add(lista.get(i));
            }    
        }
                
                somarProdutos();
            
        
    }//GEN-LAST:event_JB_addCarMouseClicked

    private void jb_completeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_completeMouseClicked
        // TODO add your handling code here
        System.out.println("Cliente: "+uAux.getNome());
        System.out.println("\nCpf: "+uAux.getCpf());
        
        for (int i = 0; i < listaCarrinho.size(); i++) {
            System.out.println("\nProduto " + (i+1) + ": "+listaCarrinho.get(i).getDescricao());
        }
        System.out.println("\n\nTotal: R$" + total);
                                                                
        
        
    }//GEN-LAST:event_jb_completeMouseClicked

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
            java.util.logging.Logger.getLogger(TelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Details;
    private javax.swing.JButton JB_addCar;
    private javax.swing.JList<String> JList;
    private javax.swing.JList<String> JList_produtos;
    private javax.swing.JLabel Jb_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_complete;
    // End of variables declaration//GEN-END:variables
}
