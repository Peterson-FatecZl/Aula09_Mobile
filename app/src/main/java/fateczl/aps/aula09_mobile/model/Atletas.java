package fateczl.aps.aula09_mobile.model;

import androidx.annotation.NonNull;

public abstract class Atletas {
    protected String nome;
    protected String dataNascimento;
    protected String bairro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @NonNull
    @Override
    public String toString() {
        return "Nome: " + nome + "\nData Nascimento: " + dataNascimento + "\nBairro: " + bairro;
    }
}
