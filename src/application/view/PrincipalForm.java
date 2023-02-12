package application.view;

import javax.swing.*;
import java.awt.*;

public abstract class PrincipalForm extends JFrame {

    protected JPanel pnlFormPrincipal;

    public PrincipalForm() {
        this.inicializarPrincipal();
    }

    public void inicializarPrincipal() {
        this.setTitle("Busca de clientes");
        this.setSize(1000, 650);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.setResizable(false);

        this.getContentPane().add(getPnlFormPrincipal(), BorderLayout.CENTER);
    }

    public JPanel getPnlFormPrincipal() {
        if (pnlFormPrincipal == null) {
            pnlFormPrincipal = new JPanel(new GridLayout(7, 1));


            return pnlFormPrincipal;
        }
        return getPnlFormPrincipal();
    }
}

