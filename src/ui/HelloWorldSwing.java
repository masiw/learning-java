package ui;

import javax.swing.*;

public class HelloWorldSwing {

  private static void createAndShowGui() {
    JFrame frame = new JFrame("HelloWorldSwing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel label = new JLabel("Hello World!");
    frame.getContentPane().add(label);
    
    frame.pack();
    frame.setVisible(true);
  }
  
  public static void run() {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      
      @Override
      public void run() {
        createAndShowGui();
      }
    });
  }
}
