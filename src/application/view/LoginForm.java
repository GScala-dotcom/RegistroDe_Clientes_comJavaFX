package application.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class LoginForm extends JFrame {

    protected JPanel pnlForm;

    protected JLabel lblLogin;
    protected JLabel lblUsuario;
    protected JTextField txtUsuario;
    protected JLabel lblSenha;
    protected JPasswordField txtSenha;

    protected JButton btnLogin;
    protected JButton btnCadastrar;

    public LoginForm() {
        this.inicializar();
        this.eventos();
    }

    public void inicializar() {
        this.setTitle("Login");
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.setResizable(false);

        this.getContentPane().add(getPnlForm(), BorderLayout.CENTER);
    }

    protected abstract void btnLogarClick(ActionEvent ev);
    protected abstract void btnCadastrarClick(ActionEvent ev);

    private void eventos() {
        btnLogin.addActionListener(this::btnLogarClick);
        btnCadastrar.addActionListener(this::btnCadastrarClick);
    }

    public JPanel getPnlForm() {
        if (pnlForm == null) {
            pnlForm = new JPanel(new GridLayout(7, 1));

            lblLogin = new JLabel("Login");

            lblUsuario = new JLabel("Usuario:");
            txtUsuario = new JTextField("Username");

            lblSenha = new JLabel("Senha:");
            txtSenha = new JPasswordField("Senha");
            btnLogin = new JButton("Login");
            btnCadastrar = new JButton("Cadastrar");

            pnlForm.add(lblLogin);
            pnlForm.add(lblUsuario);
            pnlForm.add(txtUsuario);
            pnlForm.add(lblSenha);
            pnlForm.add(txtSenha);

            pnlForm.add(btnLogin);
            pnlForm.add(btnCadastrar);

            return pnlForm;
        }

        return getPnlForm();
    }

}

