package application;

import application.controller.Login;

import javax.swing.*;

public class Main {

    public static void main(String []args) {
        Login logar = new Login();
        SwingUtilities.invokeLater(() -> logar.setVisible(true));
    }
}
