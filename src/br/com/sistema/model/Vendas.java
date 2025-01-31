/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sistema.model;

/**
 * Representa uma venda realizada no sistema.
 * <p>
 * A classe contém informações sobre a venda, como o identificador da venda, 
 * o cliente associado, a data da venda, o total da venda e as observações relacionadas.
 * </p>
 * <p>
 * O diagrama a seguir ilustra a estrutura da classe Vendas no sistema:
 * </p>
 * <p>
 * <img src="doc-files/Classe%20Vendas.png" alt="Diagrama da classe Vendas">
 * </p>
 * 
 * @author Cleyton
 */
public class Vendas {
    
    /** Identificador único da venda */
    private int id;
    
    /** Cliente associado à venda */
    private Clientes id_Cliente;
    
    /** Data da realização da venda */
    private String dataVenda;
    
    /** Valor total da venda */
    private double total_venda;
    
    /** Observações adicionais sobre a venda */
    private String observacoes;

    /**
     * Obtém o identificador da venda.
     * @return Identificador da venda.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador da venda.
     * @param id Identificador da venda.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o cliente associado à venda.
     * @return Cliente da venda.
     */
    public Clientes getId_Cliente() {
        return id_Cliente;
    }

    /**
     * Define o cliente associado à venda.
     * @param id_Cliente Cliente da venda.
     */
    public void setId_Cliente(Clientes id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    /**
     * Obtém a data da venda.
     * @return Data da venda.
     */
    public String getDataVenda() {
        return dataVenda;
    }

    /**
     * Define a data da venda.
     * @param dataVenda Data da venda.
     */
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * Obtém o valor total da venda.
     * @return Valor total da venda.
     */
    public double getTotal_venda() {
        return total_venda;
    }

    /**
     * Define o valor total da venda.
     * @param total_venda Valor total da venda.
     */
    public void setTotal_venda(double total_venda) {
        this.total_venda = total_venda;
    }

    /**
     * Obtém as observações sobre a venda.
     * @return Observações sobre a venda.
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * Define as observações sobre a venda.
     * @param observacoes Observações sobre a venda.
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
