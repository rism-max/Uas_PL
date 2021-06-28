package UASPL;


import javax.swing.*;

public class runApp {
    public static void main(String[] args) {


        JFrame jFrame = new JFrame("Program Antrian Loket");
        jFrame.setContentPane(new AppLoket().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppLoket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppLoket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppLoket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppLoket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
