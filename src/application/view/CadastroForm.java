package application.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class CadastroForm extends JFrame {

    protected JPanel pnlFormCadastro;

    protected JLabel lblCadastro;
    protected JLabel lblUsuarioCadastrar;
    protected JTextField txtUsuarioCadastrar;
    protected JLabel lblEmailCadastrar;
    protected JTextField txtEmailCadastrar;
    protected JLabel lblSenhaCadastrar;
    protected JPasswordField txtSenhaCadastrar;

    protected JButton btnConcluirCadastro;
    protected JButton btnVoltarLogin;

    public CadastroForm() {
        this.inicializarCadastro();
        this.eventosCadastro();
    }

    public void inicializarCadastro() {
        this.setTitle("Cadastrar");
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.setResizable(false);

        this.getContentPane().add(getPnlFormCadastro(), BorderLayout.CENTER);
    }

    protected abstract void btnConcluirCadastroClick(ActionEvent ev);
    protected abstract void btnVoltarLoginClick(ActionEvent ev);

    private void eventosCadastro() {
        btnConcluirCadastro.addActionListener(this::btnConcluirCadastroClick);
        btnVoltarLogin.addActionListener(this::btnVoltarLoginClick);
    }

    public JPanel getPnlFormCadastro() {
        if (pnlFormCadastro == null) {
            pnlFormCadastro = new JPanel(new GridLayout(9, 1));

            lblCadastro = new JLabel("Cadastro");

            lblUsuarioCadastrar = new JLabel("Usuario:");
            txtUsuarioCadastrar = new JTextField("Username");

            lblEmailCadastrar = new JLabel("Email:");
            txtEmailCadastrar = new JTextField("Email");

            lblSenhaCadastrar = new JLabel("Senha:");
            txtSenhaCadastrar = new JPasswordField("Senha");
            btnConcluirCadastro = new JButton("Concluir Cadastro");
            btnVoltarLogin = new JButton("Voltar");

            pnlFormCadastro.add(lblCadastro);
            pnlFormCadastro.add(lblUsuarioCadastrar);
            pnlFormCadastro.add(txtUsuarioCadastrar);
            pnlFormCadastro.add(lblEmailCadastrar);
            pnlFormCadastro.add(txtEmailCadastrar);
            pnlFormCadastro.add(lblSenhaCadastrar);
            pnlFormCadastro.add(txtSenhaCadastrar);

            pnlFormCadastro.add(btnConcluirCadastro);
            pnlFormCadastro.add(btnVoltarLogin);

            return pnlFormCadastro;
        }
        return getPnlFormCadastro();
    }
}

