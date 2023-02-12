package application.controller;

import application.view.CadastroForm;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Cadastro extends CadastroForm {

    @Override
    protected void btnConcluirCadastroClick(ActionEvent ev) {
        boolean validar = true;
        if (validar) {
            encerrarTelaCadastro();
        }

        Principal principal = new Principal();
        SwingUtilities.invokeLater(() -> principal.setVisible(true));
    }

    @Override
    protected void btnVoltarLoginClick(ActionEvent ev) {
        boolean validar = true;
        if (validar) {
            encerrarTelaCadastro();
        }
        Login logar = new Login();
        SwingUtilities.invokeLater(() -> logar.setVisible(true));
    }

    public void encerrarTelaCadastro() {
        setVisible(false);
    }

    public void encerrarTelaLogin() {
        Login logar = new Login();
        logar.setVisible(false);
    }
}
