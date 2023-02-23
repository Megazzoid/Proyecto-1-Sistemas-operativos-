/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JTextField;




/**
 *
 * @author kevin
 */
public class NewJFrame extends javax.swing.JFrame {
    private static NewJFrame newJFrame;
     
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setAjustes();

    }
    
    private void setAjustes(){
        introDisponible.setEditable(false);
        introDisponible.setHorizontalAlignment(JTextField.CENTER); 
        InicioRyM.setEditable(false);
        InicioRyM.setHorizontalAlignment(JTextField.CENTER); 
        CreditosRyM.setEditable(false);
        CreditosRyM.setHorizontalAlignment(JTextField.CENTER); 
        FinalesRyM.setEditable(false);
        FinalesRyM.setHorizontalAlignment(JTextField.CENTER); 
        PlotRyM.setEditable(false);
        PlotRyM.setHorizontalAlignment(JTextField.CENTER);
        CapituloRyM.setEditable(false);
        CapituloRyM.setHorizontalAlignment(JTextField.CENTER);
        CapituloPlotRyM.setEditable(false);
        CapituloPlotRyM.setHorizontalAlignment(JTextField.CENTER);
        DiasFaltantesRyM.setEditable(false);
        DiasFaltantesRyM.setHorizontalAlignment(JTextField.CENTER);
        PjRyM.setEditable(false);
        PjRyM.setHorizontalAlignment(JTextField.CENTER);
    }
    
    public static synchronized NewJFrame getInstance(){
        if (newJFrame ==null){
            newJFrame =  new NewJFrame();
        }
        return newJFrame;
    }
    
   public synchronized void getintroDisponibleRym (String info){
       introDisponible.setText(info);
   }
   
   public synchronized void getinicioDisponibleRym (String info){
       InicioRyM.setText(info);
       
   }
   public synchronized void getCreditoDisponibleRym (String info){
       CreditosRyM.setText(info);
         
   }
   
   public synchronized void getfinalDisponibleRym (String info){
       FinalesRyM.setText(info);
   }
   
   public synchronized void getPlotDisponibleRym (String info){
       PlotRyM.setText(info);
   }
   
   public synchronized void getCapituloRyM (String info){
       CapituloRyM.setText(info);
   }
   
   public synchronized void getCapituloPlotRyM (String info){
       CapituloPlotRyM.setText(info);
   }
   public synchronized void DiaRyM (String info){
       DiasFaltantesRyM.setText(info);
   }
   public synchronized void PjRyM (String info){
       PjRyM.setText(info);
   }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        introDisponible = new javax.swing.JTextField();
        InicioRyM = new javax.swing.JTextField();
        CreditosRyM = new javax.swing.JTextField();
        FinalesRyM = new javax.swing.JTextField();
        PlotRyM = new javax.swing.JTextField();
        CapituloRyM = new javax.swing.JTextField();
        CapituloPlotRyM = new javax.swing.JTextField();
        DiasFaltantesRyM = new javax.swing.JTextField();
        PjRyM = new javax.swing.JTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INTROS DISPONIBLES");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jLabel2.setText("RICKY &  MORTY");

        jLabel3.setText("INICIOS DISPONIBLES");

        jLabel4.setText("CRÉDITOS");

        jLabel5.setText("FINALES PRODUCIDOS ");

        jLabel6.setText("PLOT TWIST PRODUCIDOS");

        jLabel7.setText("CAPÍTULOS PRODUCIDOS");

        jLabel8.setText("CAP. PLOT TWIST PRODUCIDOS");

        jLabel9.setText("DÍAS QUE PARA ENTREGA");

        jLabel10.setText("Que Hace ProjectManager");

        introDisponible.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        introDisponible.setText("0");
        introDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introDisponibleActionPerformed(evt);
            }
        });

        InicioRyM.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        InicioRyM.setText("0");

        CreditosRyM.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        CreditosRyM.setText("0");

        FinalesRyM.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        FinalesRyM.setText("0");
        FinalesRyM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalesRyMActionPerformed(evt);
            }
        });

        PlotRyM.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        PlotRyM.setText("0");
        PlotRyM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlotRyMActionPerformed(evt);
            }
        });

        CapituloRyM.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        CapituloRyM.setText("0");
        CapituloRyM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapituloRyMActionPerformed(evt);
            }
        });

        CapituloPlotRyM.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        CapituloPlotRyM.setText("0");

        DiasFaltantesRyM.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        DiasFaltantesRyM.setText("30");
        DiasFaltantesRyM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiasFaltantesRyMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 628, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(CapituloRyM, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PlotRyM, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CapituloPlotRyM, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(DiasFaltantesRyM, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(PjRyM))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FinalesRyM, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(introDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13))
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(InicioRyM, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CreditosRyM, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel4)))))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreditosRyM, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InicioRyM)
                    .addComponent(introDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FinalesRyM, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlotRyM, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CapituloPlotRyM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CapituloRyM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DiasFaltantesRyM, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PjRyM))
                .addContainerGap(413, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void introDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_introDisponibleActionPerformed

    private void PlotRyMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlotRyMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlotRyMActionPerformed

    private void FinalesRyMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalesRyMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FinalesRyMActionPerformed

    private void CapituloRyMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapituloRyMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CapituloRyMActionPerformed

    private void DiasFaltantesRyMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiasFaltantesRyMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiasFaltantesRyMActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CapituloPlotRyM;
    private javax.swing.JTextField CapituloRyM;
    private javax.swing.JTextField CreditosRyM;
    private javax.swing.JTextField DiasFaltantesRyM;
    private javax.swing.JTextField FinalesRyM;
    private javax.swing.JTextField InicioRyM;
    private javax.swing.JTextField PjRyM;
    private javax.swing.JTextField PlotRyM;
    private javax.swing.JTextField introDisponible;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    /**
     * @param prueba the prueba to set
     */
    
}
