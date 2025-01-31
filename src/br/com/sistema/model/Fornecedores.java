/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sistema.model;

/**
 * Representa um fornecedor no sistema, estendendo as informações básicas de um cliente
 * e adicionando o atributo CNPJ.
 * <p>
 * O diagrama a seguir ilustra a relação entre as classes do sistema:
 * </p>
 * <p>
 * <img src="doc-files/Classe%20Fornecedores.png" alt="Diagrama da classe Fornecedores">
 * </p>
 * 
 * @author Cleyton
 */
public class Fornecedores extends Clientes {
    
    /** Cadastro Nacional da Pessoa Jurídica (CNPJ) do fornecedor */
    private String cnpj;

    /**
     * Obtém o CNPJ do fornecedor.
     * @return CNPJ do fornecedor.
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o CNPJ do fornecedor.
     * @param cnpj CNPJ do fornecedor.
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    /**
     * Retorna uma representação textual do fornecedor, exibindo apenas seu nome.
     * @return Nome do fornecedor.
     */
    @Override
    public String toString() {
        return this.getNome();
    }
}
