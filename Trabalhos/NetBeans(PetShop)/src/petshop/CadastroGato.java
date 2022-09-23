package petshop;

import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class CadastroGato extends javax.swing.JFrame {
    ArrayList<Gato> gato = new ArrayList<Gato>();

    public CadastroGato() {
        
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
        campomatricula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CaixaCastrado = new javax.swing.JCheckBox();
        campoalergia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Slidefofo = new javax.swing.JSlider();

        jLabel6.setText("Genero:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Gatos");

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

        jLabel10.setText("Castrado?");

        CaixaCastrado.setText("Sim");

        jLabel9.setText("Alergias:");

        jLabel11.setText("Nivel de fofura:");

        Slidefofo.setMajorTickSpacing(1);
        Slidefofo.setMaximum(10);
        Slidefofo.setMinimum(1);
        Slidefofo.setMinorTickSpacing(1);
        Slidefofo.setPaintLabels(true);
        Slidefofo.setPaintTicks(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel7)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4)))
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(campocor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(campoidade, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(camponome)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CaixaCastrado)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campopeso)
                                    .addComponent(campogenero)
                                    .addComponent(campomatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(campoalergia)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(Cadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(Remover)
                                .addGap(18, 18, 18)
                                .addComponent(Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Slidefofo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                    .addComponent(jLabel10)
                    .addComponent(CaixaCastrado)
                    .addComponent(campoalergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(Slidefofo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                
                JOptionPane.showMessageDialog(null, "Essa matricula já está cadastrada!");
                
            }else{
                
            Gato g = new Gato();
            g.setNome(camponome.getText());
            g.setMatricula(Integer.parseInt(campomatricula.getText()));
            g.setIdade(Integer.parseInt(campoidade.getText()));        
            g.setCor_pelagem(campocor.getText());
            g.setGenero(campogenero.getText());
            g.setPeso(Integer.parseInt(campopeso.getText()));
            g.setAlergias(campoalergia.getText());                     
            g.setNivelfofo(Slidefofo.getValue());
            
            if(CaixaCastrado.isSelected()){
                g.setCastrado(true);
            }else{
                g.setCastrado(false);
            }
            
            
            
            
            gato.add(g);
            camponome.setText(null);
            campoidade.setText(null);
            campogenero.setText(null);
            campopeso.setText(null);
            campocor.setText(null);
            campomatricula.setText(null);
            CaixaCastrado.setSelected(false);
            campoalergia.setText(null);
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            
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
        for(Gato g : gato){
            if(g.getMatricula() == matricula){
                return true;
            }
        }
        return false;
    }
    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed

    }//GEN-LAST:event_RemoverActionPerformed

    private void ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActionPerformed
        String mensagem = "Animais:\n";
        for (Gato g : gato){
            mensagem += "nome: " + g.getNome() + "\n";
            mensagem += "matricula: " + g.getMatricula() + "\n";
            mensagem += "genero: " + g.getGenero() + "\n";
            mensagem += "idade: " + g.getIdade() + "\n";
            mensagem += "cor da pelagem: " + g.getCor_pelagem() + "\n";
            mensagem += "peso: " + g.getPeso() + "\n";
            mensagem += "nivel de fofura: " + g.getNivelfofo() + "\n";
            mensagem += "alergias: " + g.getAlergias() + "\n";
            mensagem += "Castrado: " + g.isCastrado() + "\n";
            
            mensagem += "-------------------------------------------\n";
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
    }//GEN-LAST:event_ListarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroGato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JCheckBox CaixaCastrado;
    private javax.swing.JButton Listar;
    private javax.swing.JButton Remover;
    private javax.swing.JSlider Slidefofo;
    private javax.swing.JTextField campoalergia;
    private javax.swing.JTextField campocor;
    private javax.swing.JTextField campogenero;
    private javax.swing.JTextField campoidade;
    private javax.swing.JTextField campomatricula;
    private javax.swing.JTextField camponome;
    private javax.swing.JTextField campopeso;
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
