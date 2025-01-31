/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sistema.model;

/**
 * Representa um item de venda no sistema, que contém informações sobre a venda,
 * o produto, a quantidade e o subtotal do item.
 * <p>
 * O diagrama a seguir ilustra a estrutura da classe ItensVendas no sistema:
 * </p>
 * <p>
 * <img src="doc-files/Classe%20ItensVendas.png" alt="Diagrama da classe ItensVendas">
 * </p>
 * 
 * @author Cleyton
 */
public class ItensVendas {
    
    /** Identificador único do item de venda */
    private int id;
    
    /** Venda associada ao item de venda (chave secundária no banco de dados) */
    private Vendas vedas;
    
    /** Produto associado ao item de venda (chave secundária no banco de dados) */
    private Produtos produtos;
    
    /** Quantidade do produto no item de venda */
    private int qtd;
    
    /** Subtotal do item de venda (quantidade * preço do produto) */
    private double subtotal;

    /**
     * Obtém o identificador do item de venda.
     * @return Identificador do item de venda.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador do item de venda.
     * @param id Identificador do item de venda.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém a venda associada ao item de venda.
     * @return Venda associada ao item de venda.
     */
    public Vendas getVedas() {
        return vedas;
    }

    /**
     * Define a venda associada ao item de venda.
     * @param vedas Venda a ser associada ao item de venda.
     */
    public void setVedas(Vendas vedas) {
        this.vedas = vedas;
    }

    /**
     * Obtém o produto associado ao item de venda.
     * @return Produto associado ao item de venda.
     */
    public Produtos getProdutos() {
        return produtos;
    }

    /**
     * Define o produto associado ao item de venda.
     * @param produtos Produto a ser associado ao item de venda.
     */
    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    /**
     * Obtém a quantidade do produto no item de venda.
     * @return Quantidade do produto.
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * Define a quantidade do produto no item de venda.
     * @param qtd Quantidade do produto.
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    /**
     * Obtém o subtotal do item de venda.
     * @return Subtotal do item de venda (quantidade * preço do produto).
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Define o subtotal do item de venda.
     * @param subtotal Subtotal do item de venda (quantidade * preço do produto).
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
