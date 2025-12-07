package com.mycompany.computer_science_ia;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Map extends javax.swing.JFrame {

    public Map() {
        initComponents();
        setImages();
    }
    
    private void setImages(){
            String imagePath1 = "/Users/antonportell/NetBeansProjects/Computer_Science_IA/src/main/resources/Campus Map/Campus Map-1.png";
            ImageIcon imageIcon1 = new ImageIcon(imagePath1);
                Image image1 = imageIcon1.getImage().getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            jLabel2.setIcon(new ImageIcon(image1));
            
            
            String imagePath2 = "/Users/antonportell/NetBeansProjects/Computer_Science_IA/src/main/resources/Campus Map/Campus Map-2.png";
            ImageIcon imageIcon2 = new ImageIcon(imagePath2);
                Image image2 = imageIcon2.getImage().getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            jLabel3.setIcon(new ImageIcon(image2));
            
            String imagePath3 = "/Users/antonportell/NetBeansProjects/Computer_Science_IA/src/main/resources/Campus Map/Campus Map-3.png";
            ImageIcon imageIcon3 = new ImageIcon(imagePath3);
                Image image3 = imageIcon3.getImage().getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            jLabel4.setIcon(new ImageIcon(image3));
            
            String imagePath4 = "/Users/antonportell/NetBeansProjects/Computer_Science_IA/src/main/resources/Campus Map/Campus Map-4.png";
            ImageIcon imageIcon4 = new ImageIcon(imagePath4);
                Image image4 = imageIcon4.getImage().getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            jLabel5.setIcon(new ImageIcon(image4));
            
            String imagePath5 = "/Users/antonportell/NetBeansProjects/Computer_Science_IA/src/main/resources/Campus Map/Campus Map-5.png";
            ImageIcon imageIcon5 = new ImageIcon(imagePath5);
                Image image5 = imageIcon5.getImage().getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            jLabel6.setIcon(new ImageIcon(image5));
            
            String imagePath6 = "/Users/antonportell/NetBeansProjects/Computer_Science_IA/src/main/resources/Campus Map/Campus Map-6.png";
            ImageIcon imageIcon6 = new ImageIcon(imagePath6);
                Image image6 = imageIcon6.getImage().getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            jLabel7.setIcon(new ImageIcon(image6));
            
            String imagePath7 = "/Users/antonportell/NetBeansProjects/Computer_Science_IA/src/main/resources/Campus Map/Campus Map-7.png";
            ImageIcon imageIcon7 = new ImageIcon(imagePath7);
                Image image7 = imageIcon7.getImage().getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            jLabel8.setIcon(new ImageIcon(image7));
            
            String imagePath8 = "/Users/antonportell/NetBeansProjects/Computer_Science_IA/src/main/resources/Campus Map/Campus Map-8.png";
            ImageIcon imageIcon8 = new ImageIcon(imagePath8);
                Image image8 = imageIcon8.getImage().getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            jLabel9.setIcon(new ImageIcon(image8));
            
            String imagePath9 = "/Users/antonportell/NetBeansProjects/Computer_Science_IA/src/main/resources/Campus Map/Campus Map-9.png";
            ImageIcon imageIcon9 = new ImageIcon(imagePath9);
                Image image9 = imageIcon9.getImage().getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            jLabel10.setIcon(new ImageIcon(image9));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Map");
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(92, 1208, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Map().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
