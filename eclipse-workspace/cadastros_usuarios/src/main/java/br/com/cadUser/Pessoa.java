package br.com.cadUser;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Pessoa {
    private String nome;
    private ArrayList<String> nomesDigitados = new ArrayList<>();

    public void adicionarNome() {
        nomesDigitados.add(nome);
        nome = "";
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getNomesDigitados() {
        return nomesDigitados;
    }

    public void setNomesDigitados(ArrayList<String> nomesDigitados) {
        this.nomesDigitados = nomesDigitados;
    }
}
