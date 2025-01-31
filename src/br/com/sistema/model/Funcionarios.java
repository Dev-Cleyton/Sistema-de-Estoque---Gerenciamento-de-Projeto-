/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sistema.model;

/**
 * Representa um funcionário do sistema, estendendo as informações básicas de um cliente
 * e adicionando atributos específicos, como senha, cargo e nível de acesso.
 * <p>
 * O diagrama a seguir ilustra a relação entre as classes do sistema:
 * </p>
 * <p>
 * <img src="doc-files/Classe%20Funcionarios.png" alt="Diagrama da classe Funcionarios">
 * </p>
 * 
 * @author Cleyton
 */
public class Funcionarios extends Clientes {
    
    /** Senha do funcionário para acesso ao sistema */
    private String senha;
    
    /** Cargo do funcionário dentro da empresa */
    private String cargo;
    
    /** Nível de acesso do funcionário ao sistema */
    private String nivel_acesso;

    /**
     * Obtém a senha do funcionário.
     * @return Senha do funcionário.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha do funcionário.
     * @param senha Nova senha do funcionário.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Obtém o cargo do funcionário.
     * @return Cargo do funcionário.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define o cargo do funcionário.
     * @param cargo Novo cargo do funcionário.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Obtém o nível de acesso do funcionário.
     * @return Nível de acesso do funcionário.
     */
    public String getNivel_acesso() {
        return nivel_acesso;
    }

    /**
     * Define o nível de acesso do funcionário.
     * @param nivel_acesso Novo nível de acesso do funcionário.
     */
    public void setNivel_acesso(String nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }
}
