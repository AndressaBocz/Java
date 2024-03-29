/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo Ferreira
 */
public class FormConta extends javax.swing.JFrame {
    
    Cliente cliente = new Cliente();
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca cp = new ContaPoupanca();

    /**
     * Creates new form FormConta
     */
    public FormConta() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textNomeBanco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textNumAg = new javax.swing.JTextField();
        botCadastar = new javax.swing.JButton();
        botExibir = new javax.swing.JButton();
        botDepositarCC = new javax.swing.JButton();
        botSacarCC = new javax.swing.JButton();
        botSaldoCC = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textValor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botDepositarCP = new javax.swing.JButton();
        botSacarCP = new javax.swing.JButton();
        botSaldoCP = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        textvalorcp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Formulario Cliente Bancário");

        jLabel2.setText("Nome do cliente");

        jLabel3.setText("Nome do Banco");

        jLabel4.setText("Numero Agencia");

        botCadastar.setText("CADASTRAR");
        botCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCadastarActionPerformed(evt);
            }
        });

        botExibir.setText("EXIBIR");
        botExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExibirActionPerformed(evt);
            }
        });

        botDepositarCC.setText("DEPOSITAR CC");
        botDepositarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botDepositarCCActionPerformed(evt);
            }
        });

        botSacarCC.setText("SACAR CC");
        botSacarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSacarCCActionPerformed(evt);
            }
        });

        botSaldoCC.setText("SALDO CC");
        botSaldoCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSaldoCCActionPerformed(evt);
            }
        });

        jLabel5.setText("Conta Corrente");

        jLabel6.setText("Valor");

        jLabel7.setText("Conta Poupança");

        botDepositarCP.setText("DEPOSITAR CP");
        botDepositarCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botDepositarCPActionPerformed(evt);
            }
        });

        botSacarCP.setText("SACAR CP");
        botSacarCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSacarCPActionPerformed(evt);
            }
        });

        botSaldoCP.setText("SALDO CP");
        botSaldoCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSaldoCPActionPerformed(evt);
            }
        });

        jLabel8.setText("Valor");

        jButton1.setText("SAIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(textNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(textNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(textNumAg, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel5)
                                            .addGap(95, 95, 95))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(botCadastar)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(botSaldoCC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(botSacarCC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(botDepositarCC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(81, 81, 81)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botDepositarCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(11, 11, 11)))
                                    .addComponent(botSacarCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botSaldoCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(textvalorcp, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textNumAg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCadastar)
                    .addComponent(botExibir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botDepositarCC)
                    .addComponent(botDepositarCP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botSacarCP)
                    .addComponent(botSacarCC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botSaldoCC)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(textvalorcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(botSaldoCP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCadastarActionPerformed
        // primeiramente devemos capturar as informações digitadas nos campos de texto,
        // e armazená-las em variáveis
        String nomecli=this.textNomeCliente.getText();
        String nomebanco=this.textNomeBanco.getText();
        int numag=Integer.parseInt(this.textNumAg.getText());
        // agora devemos chamar o método que receberá as variáveis
        // com as informações dos campos de textos
        cliente.Cadastrar(nomecli, nomebanco, numag);
        this.textNomeCliente.setText(" ");
        this.textNomeBanco.setText(" ");
        this.textNumAg.setText(" ");
        
    }//GEN-LAST:event_botCadastarActionPerformed

    private void botExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExibirActionPerformed
        String info=cliente.Exibir();
        String[] valores=info.split(";");
        this.textNomeCliente.setText(valores[0]);
        this.textNomeBanco.setText(valores[1]);
        this.textNumAg.setText(valores[2]);
        
    }//GEN-LAST:event_botExibirActionPerformed

    private void botDepositarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botDepositarCCActionPerformed
        double vl = Double.parseDouble(this.textValor.getText());
        cc.Depositar(vl);
        this.textValor.setText(" ");
        
    }//GEN-LAST:event_botDepositarCCActionPerformed

    private void botSacarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSacarCCActionPerformed
        double vl=Double.parseDouble(this.textValor.getText());
        cc.Sacar(vl);
        this.textValor.setText(" ");;
    }//GEN-LAST:event_botSacarCCActionPerformed

    private void botSaldoCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSaldoCCActionPerformed
       double sd = cc.ConsultaSaldo();
       this.textValor.setText(""+sd);
    }//GEN-LAST:event_botSaldoCCActionPerformed

    private void botDepositarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botDepositarCPActionPerformed
        double vl=Double.parseDouble(this.textvalorcp.getText());
        cp.DepositarCP(vl);
        this.textvalorcp.setText(" ");
    }//GEN-LAST:event_botDepositarCPActionPerformed

    private void botSacarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSacarCPActionPerformed
       double vl = Double.parseDouble(this.textvalorcp.getText());
       cp.SacarCP(vl);
       this.textvalorcp.setText(" ");
    }//GEN-LAST:event_botSacarCPActionPerformed

    private void botSaldoCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSaldoCPActionPerformed
        double sd = cp.SaldoCP();
        this.textvalorcp.setText(""+sd);
    }//GEN-LAST:event_botSaldoCPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCadastar;
    private javax.swing.JButton botDepositarCC;
    private javax.swing.JButton botDepositarCP;
    private javax.swing.JButton botExibir;
    private javax.swing.JButton botSacarCC;
    private javax.swing.JButton botSacarCP;
    private javax.swing.JButton botSaldoCC;
    private javax.swing.JButton botSaldoCP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField textNomeBanco;
    private javax.swing.JTextField textNomeCliente;
    private javax.swing.JTextField textNumAg;
    private javax.swing.JTextField textValor;
    private javax.swing.JTextField textvalorcp;
    // End of variables declaration//GEN-END:variables
}
