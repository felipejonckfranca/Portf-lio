package petshop;

import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class CadastroCachorro extends javax.swing.JFrame {
    ArrayList<Cachorro> cachorro= new ArrayList<Cachorro>();

    public CadastroCachorro() {
        
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        camponome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campocor = new javax.swing.JTextField();
        campogenero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campopeso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        Remover = new javax.swing.JButton();
        Listar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        camporabo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CaixaCastrado = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        CaixaFocinheira = new javax.swing.JCheckBox();
        campomatricula = new javax.swing.JTextField();

        jLabel6.setText("Genero:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Cães");

        jLabel2.setText("Nome:");

        camponome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Matricula: ");

        jLabel4.setText("Cor da pelagem: ");

        jLabel5.setText("Genero:");

        jLabel7.setText("Idade:");

        jLabel8.setText("Peso:");

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Remover.setText("Remover");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });

        Listar.setText("Listar");
        Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarActionPerformed(evt);
            }
        });

        jLabel9.setText("Estilo do rabo:");

        camporabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camporaboActionPerformed(evt);
            }
        });

        jLabel10.setText("Castrado?");

        CaixaCastrado.setText("Sim");

        jLabel11.setText("Usa Focinheira?");

        CaixaFocinheira.setText("Sim");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSeparator2)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Cadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(Remover)
                        .addGap(18, 18, 18)
                        .addComponent(Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(camponome, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(campocor, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(campoidade)
                                    .addComponent(camporabo))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10)))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campopeso)
                            .addComponent(campogenero)
                            .addComponent(CaixaCastrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CaixaFocinheira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campomatricula))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(campomatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campocor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(campogenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(campopeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camporabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(CaixaCastrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaixaFocinheira)
                    .addComponent(jLabel11))
                .addGap(29, 29, 29)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar)
                    .addComponent(Remover)
                    .addComponent(Listar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void camponomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponomeActionPerformed

    }//GEN-LAST:event_camponomeActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        if(verificaInfos()){
            String nome = camponome.getText();
            String genero = campogenero.getText();
            int matricula = Integer.parseInt(campomatricula.getText());
            int idade = Integer.parseInt(campoidade.getText());
            
            if(VerificaMatricula(matricula)){
                
                JOptionPane.showMessageDialog(this, "Essa matricula já está cadastrada!");
                
            }else{
                
            Cachorro c = new Cachorro();
            c.setNome(camponome.getText());
            c.setMatricula(Integer.parseInt(campomatricula.getText()));
            c.setIdade(Integer.parseInt(campoidade.getText()));        
            c.setCor_pelagem(campocor.getText());
            c.setGenero(campogenero.getText());
            c.setPeso(Integer.parseInt(campopeso.getText()));
            c.setEstilo_rabo(camporabo.getText());
            
            if(CaixaCastrado.isSelected()){
                c.setCastrado(true);
            }else{
                c.setCastrado(false);
            }
            
            if(CaixaFocinheira.isSelected()){
                c.setFocinheira(true);
            }else{
                c.setFocinheira(false);
            }
            
            cachorro.add(c);
            camponome.setText(null);
            campoidade.setText(null);
            campogenero.setText(null);
            campopeso.setText(null);
            campocor.setText(null);
            campomatricula.setText(null);
            camporabo.setText(null);
            CaixaFocinheira.setSelected(false);
            CaixaCastrado.setSelected(false);

            
            JOptionPane.showMessageDialog(this, "Cadastrado com sucesso");
            
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Ocorreu um erro, tente novamente");

        }
        
    
    }//GEN-LAST:event_CadastrarActionPerformed
    public boolean verificaInfos() {
        if (camponome.getText().equals("") || campomatricula.getText().equals("") || campogenero.getText().equals("") || campoidade.getText().equals("") || campopeso.getText().equals("") || campocor.getText().equals("")) {
            return false;
        }
        try {
            Integer.parseInt(campoidade.getText());
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean VerificaMatricula(int matricula){
        for(Cachorro c : cachorro){
            if(c.getMatricula() == matricula){
                return true;
            }
        }
        return false;
    }
    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed

    }//GEN-LAST:event_RemoverActionPerformed

    private void ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActionPerformed
        String mensagem = "Animais:\n";
        for (Cachorro c : cachorro){
            mensagem += "nome: " + c.getNome() + "\n";
            mensagem += "matricula: " + c.getMatricula() + "\n";
            mensagem += "genero: " + c.getGenero() + "\n";
            mensagem += "idade: " + c.getIdade() + "\n";
            mensagem += "cor da pelagem: " + c.getCor_pelagem() + "\n";
            mensagem += "peso: " + c.getPeso() + "\n";
            mensagem += "estilo rabo: " + c.getEstilo_rabo() + "\n";
            mensagem += "Focinheira: " + c.isFocinheira() + "\n";
            mensagem += "Castrado: " + c.isCastrado() + "\n";
            
            mensagem += "-------------------------------------------\n";
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
    }//GEN-LAST:event_ListarActionPerformed

    private void camporaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camporaboActionPerformed
    }//GEN-LAST:event_camporaboActionPerformed

//------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------

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
            java.util.logging.Logger.getLogger(CadastroCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCachorro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JCheckBox CaixaCastrado;
    private javax.swing.JCheckBox CaixaFocinheira;
    private javax.swing.JButton Listar;
    private javax.swing.JButton Remover;
    private javax.swing.JTextField campocor;
    private javax.swing.JTextField campogenero;
    private javax.swing.JTextField campoidade;
    private javax.swing.JTextField campomatricula;
    private javax.swing.JTextField camponome;
    private javax.swing.JTextField campopeso;
    private javax.swing.JTextField camporabo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
