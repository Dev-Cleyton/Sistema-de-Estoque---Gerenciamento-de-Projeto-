/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sistema.model;

/**
 * Representa um cliente no sistema, armazenando suas informações pessoais e de contato.
 * <p>
 * O diagrama a seguir ilustra o fluxo do sistema para o gerenciamento de clientes:
 * </p>
 * <p>
 * <img src="doc-files/Class%20Clientes.png" alt="Diagrama do sistema">
 * </p>
 * 
 * @author Cleyton
 */
public class Clientes {
    private int id;               // Identificador único do cliente
    private String nome;          // Nome completo do cliente
    private String rg;            // Registro Geral (documento de identidade)
    private String cpf;           // Cadastro de Pessoa Física
    private String email;         // Endereço de e-mail do cliente
    private String telefone;      // Telefone fixo para contato
    private String celular;       // Telefone celular para contato
    private String cep;           // Código de Endereçamento Postal (CEP)
    private String endereco;      // Logradouro do cliente
    private int numero;           // Número do imóvel
    private String complemento;   // Complemento do endereço (ex: apartamento, bloco)
    private String bairro;        // Bairro do cliente
    private String cidade;        // Cidade onde o cliente reside
    private String estado;        // Estado (UF) onde o cliente reside

    /**
     * Obtém o identificador único do cliente.
     * @return ID do cliente.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador único do cliente.
     * @param id ID do cliente.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome do cliente.
     * @return Nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do cliente.
     * @param nome Nome do cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o RG do cliente.
     * @return RG do cliente.
     */
    public String getRg() {
        return rg;
    }

    /**
     * Define o RG do cliente.
     * @param rg RG do cliente.
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * Obtém o CPF do cliente.
     * @return CPF do cliente.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do cliente.
     * @param cpf CPF do cliente.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o e-mail do cliente.
     * @return E-mail do cliente.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o e-mail do cliente.
     * @param email E-mail do cliente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtém o telefone fixo do cliente.
     * @return Telefone fixo do cliente.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone fixo do cliente.
     * @param telefone Telefone fixo do cliente.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o celular do cliente.
     * @return Celular do cliente.
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Define o celular do cliente.
     * @param celular Celular do cliente.
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Obtém o CEP do cliente.
     * @return CEP do cliente.
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o CEP do cliente.
     * @param cep CEP do cliente.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Obtém o endereço do cliente.
     * @return Endereço do cliente.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do cliente.
     * @param endereco Endereço do cliente.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o número do imóvel do cliente.
     * @return Número do imóvel.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o número do imóvel do cliente.
     * @param numero Número do imóvel.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtém o complemento do endereço do cliente.
     * @return Complemento do endereço.
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Define o complemento do endereço do cliente.
     * @param complemento Complemento do endereço.
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * Obtém o bairro do cliente.
     * @return Bairro do cliente.
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o bairro do cliente.
     * @param bairro Bairro do cliente.
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * Obtém a cidade do cliente.
     * @return Cidade do cliente.
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define a cidade do cliente.
     * @param cidade Cidade do cliente.
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Obtém o estado do cliente.
     * @return Estado do cliente.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define o estado do cliente.
     * @param estado Estado do cliente.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
