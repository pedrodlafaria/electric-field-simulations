import org.opensourcephysics.display.*;
import org.opensourcephysics.displayejs.*;
public class EFieldGUI extends javax.swing.JFrame {
    
    private InteractivePanel panel2D = new InteractivePanel();    
    private double q[][] = {{3,3,-1}}; //,{-2,6,-1}};   
    private EField2D ExampleEField2D = new EField2D(q);
    
   
    public EFieldGUI() {
        initComponents();        
        jPanel1.add(panel2D);      
        pack();
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        getContentPane().setLayout(new java.awt.GridLayout());

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel2.setLayout(new java.awt.BorderLayout());

        getContentPane().add(jPanel2);

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        jPanel3.setLayout(new java.awt.GridLayout(3, 1));

        jButton1.setText("Show Field Lines");
        jPanel3.add(jButton1);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel3.add(jButton2);

        jButton3.setText("jButton3");
        jPanel3.add(jButton3);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout());

        jPanel5.setLayout(new java.awt.GridLayout(4, 0));

        jLabel1.setText("Number of charges");
        jPanel5.add(jLabel1);

        jLabel2.setText("Number of Field Lines");
        jPanel5.add(jLabel2);

        jLabel3.setText("Precision");
        jPanel5.add(jLabel3);

        jLabel4.setText("jLabel4");
        jPanel5.add(jLabel4);

        jPanel4.add(jPanel5);

        jPanel4.add(jPanel7);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1);

        pack();
    }//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new EFieldGUI().show();
    }
    
    /*public void handleMouseAction(InteractivePanel panel2D, java.awt.event.MouseEvent evt) 
    {
        int action = panel2D.getMouseAction();        
        if(action == panel2D.MOUSE_DRAGGED)
        {
            ExampleEField2D.updateChargePosition(panel2D.getMouseX(), panel2D.getMouseY(), panel2D);
            ExampleEField2D.createEFieldVectors2D(jTextField1, panel2D);
        }
    */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
    
}
