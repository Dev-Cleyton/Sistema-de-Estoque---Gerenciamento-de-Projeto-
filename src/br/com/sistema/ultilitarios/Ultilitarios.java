/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sistema.ultilitarios;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author cleyton
 */
public class Ultilitarios {
 /**
 * Limpa todos os campos de texto em um painel (JPanel) especificado.
 *
 * Este método percorre todos os componentes do painel fornecido e, se o componente for um {@link JTextField}, o método define seu texto como vazio, efetivamente limpando o campo de texto.
 * 
 * @param conteiner O painel ({@link JPanel}) que contém os componentes a serem limpos. Este painel deve conter componentes do tipo {@link JTextField} que serão limpos pelo método.
 */
    public void LimparTela(JPanel conteiner){
        // Obtém todos os componentes do painel fornecido
        Component conponents[] = conteiner.getComponents();
        // Itera sobre todos os componentes
        for(Component component : conponents){
             // Verifica se o componente é uma instância de JTextField
            if(component instanceof JTextField jTextField){
                 // Limpa o texto do JTextField
                jTextField.setText(null);
            }
        }
    }
}
