/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sistema.model;

/**
 * Representa um produto no sistema.
 * <p>
 * A classe contém informações sobre o produto, incluindo seu ID, descrição, preço,
 * quantidade em estoque e o fornecedor do produto.
 * </p>
 * <p>
 * O diagrama a seguir ilustra a estrutura da classe Produtos no sistema:
 * </p>
 * <p>
 * <img src="doc-files/Classe%20Produtos.png" alt="Diagrama da classe Produtos">
 * </p>
 * 
 * @author Cleyton
 */
public class Produtos {
    
    /** Identificador único do produto */
    private int id;
    
    /** Descrição do produto */
    private String descricao;
    
    /** Preço do produto */
    private double preco;
    
    /** Quantidade disponível em estoque */
    private int qtd_estoque;
    
    /** Fornecedor do produto */
    private Fornecedores fornecedores;

    /**
     * Obtém o identificador do produto.
     * @return Identificador do produto.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador do produto.
     * @param id Identificador do produto.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém a descrição do produto.
     * @return Descrição do produto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do produto.
     * @param descricao Descrição do produto.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o preço do produto.
     * @return Preço do produto.
     */
    public double getPreco() {        
        return preco;
    }

    /**
     * Define o preço do produto.
     * @param preco Preço do produto.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Obtém a quantidade disponível do produto em estoque.
     * @return Quantidade do produto no estoque.
     */
    public int getQtd_estoque() {
        return qtd_estoque;
    }

    /**
     * Define a quantidade disponível do produto em estoque.
     * @param qtd_estoque Quantidade do produto no estoque.
     */
    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    /**
     * Obtém o fornecedor do produto.
     * @return Fornecedor do produto.
     */
    public Fornecedores getFornecedores() {
        return fornecedores;
    }

    /**
     * Define o fornecedor do produto.
     * @param fornecedores Fornecedor do produto.
     */
    public void setFornecedores(Fornecedores fornecedores) {
        this.fornecedores = fornecedores;
    }
}
