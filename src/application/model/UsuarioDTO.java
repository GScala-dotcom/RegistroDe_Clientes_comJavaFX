package application.model;

import application.view.LoginForm;

public abstract class UsuarioDTO extends LoginForm {

    String nome = txtUsuario.getText();
    String senha = txtSenha.getText();
    protected UsuarioDTO() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
