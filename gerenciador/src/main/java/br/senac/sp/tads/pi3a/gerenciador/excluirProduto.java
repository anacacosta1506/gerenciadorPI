/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.tads.pi3a.gerenciador;

/**
 *
 * @author Kelly
 */
public class excluirProduto extends javax.swing.JPanel {

    /**
     * Creates new form excluirProduto
     */
    public excluirProduto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelExcluirProduto = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelDesc = new javax.swing.JLabel();
        labelPc = new javax.swing.JLabel();
        labelPv = new javax.swing.JLabel();
        labelQntdd = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textDesc = new javax.swing.JTextField();
        textPc = new javax.swing.JTextField();
        textPv = new javax.swing.JTextField();
        textQntdd = new javax.swing.JTextField();
        labelCodProd = new javax.swing.JLabel();
        textCodProd = new javax.swing.JTextField();
        buttonConsultarCodProd = new javax.swing.JButton();
        buttonExcluirProduto = new javax.swing.JButton();

        labelExcluirProduto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelExcluirProduto.setText("Excluir Produto");

        labelNome.setText("Nome:");

        labelDesc.setText("Descrição:");

        labelPc.setText("Preço de compra:");

        labelPv.setText("Preço de venda:");

        labelQntdd.setText("Quantidade:");

        textPv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPvActionPerformed(evt);
            }
        });

        labelCodProd.setText("Código do Produto:");

        buttonConsultarCodProd.setText("Consultar");
        buttonConsultarCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarCodProdActionPerformed(evt);
            }
        });

        buttonExcluirProduto.setText("Excluir");
        buttonExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(labelDesc))
                            .addComponent(labelNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCodProd, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textCodProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(labelExcluirProduto)
                                    .addComponent(textNome, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(buttonConsultarCodProd))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPc)
                            .addComponent(labelPv)
                            .addComponent(labelQntdd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPv, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textQntdd, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonExcluirProduto)))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCodProd)
                            .addComponent(textCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonConsultarCodProd))
                        .addGap(43, 43, 43)
                        .addComponent(labelNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelExcluirProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDesc)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(textDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPc)
                    .addComponent(textPc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textQntdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelQntdd))
                .addGap(18, 18, 18)
                .addComponent(buttonExcluirProduto)
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textPvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPvActionPerformed

    private void buttonConsultarCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarCodProdActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_buttonConsultarCodProdActionPerformed

    private void buttonExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExcluirProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConsultarCodProd;
    private javax.swing.JButton buttonExcluirProduto;
    private javax.swing.JLabel labelCodProd;
    private javax.swing.JLabel labelDesc;
    private javax.swing.JLabel labelExcluirProduto;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPc;
    private javax.swing.JLabel labelPv;
    private javax.swing.JLabel labelQntdd;
    private javax.swing.JTextField textCodProd;
    private javax.swing.JTextField textDesc;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textPc;
    private javax.swing.JTextField textPv;
    private javax.swing.JTextField textQntdd;
    // End of variables declaration//GEN-END:variables
}
