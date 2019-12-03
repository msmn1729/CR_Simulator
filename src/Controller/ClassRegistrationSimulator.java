package Controller;

import Model.ClassManager;

import javax.swing.*;
import java.awt.*;

public class ClassRegistrationSimulator {
    JFrame frame;

    public static void main(String[] arg) {
        ClassManager.getInstance().getMain();
    }

    public ClassRegistrationSimulator() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // look and fill
                createAndShowUI();
            }
        });
    }

    private void createAndShowUI() {
        frame = new JFrame("Class Registration Simulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MainMenuController mainMenuController = ClassManager.getInstance().getMainMenuController();
        frame.getContentPane().add(mainMenuController.getMainMenuView());

        frame.pack();
        frame.setVisible(true);
    }

    public void changePanel(JPanel view) {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(view);
        frame.pack();
        frame.repaint();
    }
}
