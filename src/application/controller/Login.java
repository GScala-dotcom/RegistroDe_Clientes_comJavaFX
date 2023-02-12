package application.controller;

import application.model.UsuarioDTO;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Login extends UsuarioDTO {

    String usuarioLogado = null;

    @Override
    protected void btnLogarClick(ActionEvent ev) {
        if (!isCadastrado()) {
            System.out.println("Usuario nao cadastrado");
        } else {
            Principal principal = new Principal();
            Login logar = new Login();

            SwingUtilities.invokeLater(() -> principal.setVisible(true));
            logar.setVisible(false);
        }
    }

    public boolean isCadastrado() {
        this.usuarioLogado = usuarioLogado;
        String usuario = getNome();

        if (!usuario.equals(usuarioLogado)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    protected void btnCadastrarClick(ActionEvent ev) {
        boolean validar = true;
        if (validar) {
            encerrarTelaLogin();
        }
        Cadastro cadastrar = new Cadastro();
        SwingUtilities.invokeLater(() -> cadastrar.setVisible(true));
    }

    public void encerrarTelaLogin() {
        setVisible(false);
    }
}
