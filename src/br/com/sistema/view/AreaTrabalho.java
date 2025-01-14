/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.sistema.view;

import br.com.sistema.ultilitarios.Ultilitarios;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author cleyton
 */
public class AreaTrabalho extends javax.swing.JFrame {

    /**
     * Creates new form AreaTrabalho
     */
    public String usuarioLogado;
    public AreaTrabalho() {
        Ultilitarios u = new Ultilitarios();
        u.InserirIcone(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imgFundo/slogaCentralizado.png"));
        Image image = icon.getImage();
        PanelDesktop = new javax.swing.JDesktopPane(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_funcionario = new javax.swing.JMenuItem();
        menu_fornecedores = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        menu_estoque = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Area de Trabalho");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout PanelDesktopLayout = new javax.swing.GroupLayout(PanelDesktop);
        PanelDesktop.setLayout(PanelDesktopLayout);
        PanelDesktopLayout.setHorizontalGroup(
            PanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );
        PanelDesktopLayout.setVerticalGroup(
            PanelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Logado por:"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("Nome:");

        lblLogado.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblLogado.setForeground(new java.awt.Color(0, 0, 204));
        lblLogado.setText("João da Silva");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLogado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblLogado))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-user-group-skin-type-7-38.png"))); // NOI18N
        jMenu1.setText("Clientes");
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setIconTextGap(10);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-convidado-masculino-20.png"))); // NOI18N
        jMenuItem2.setText("Formulario de Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-management-38.png"))); // NOI18N
        jMenu2.setText("Funcionários");
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setIconTextGap(10);

        menu_funcionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        menu_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-administrador-masculino-20.png"))); // NOI18N
        menu_funcionario.setText("Formulario de Funcionários");
        menu_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_funcionarioActionPerformed(evt);
            }
        });
        jMenu2.add(menu_funcionario);

        jMenuBar1.add(jMenu2);

        menu_fornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-supplier-38.png"))); // NOI18N
        menu_fornecedores.setText("Fornecedores");
        menu_fornecedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_fornecedores.setIconTextGap(10);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-assistente-20.png"))); // NOI18N
        jMenuItem4.setText("Formulario de Fornecedores");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menu_fornecedores.add(jMenuItem4);

        jMenuBar1.add(menu_fornecedores);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-add-shopping-cart-38.png"))); // NOI18N
        jMenu4.setText("Produtos");
        jMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu4.setIconTextGap(10);

        jMenu18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-mover-por-carrinho-20.png"))); // NOI18N
        jMenu18.setText("Meus Produtos");

        menu_estoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menu_estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-macbook-de-desempenho-20.png"))); // NOI18N
        menu_estoque.setText("Controle de Estoque");
        menu_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_estoqueActionPerformed(evt);
            }
        });
        jMenu18.add(menu_estoque);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-métricas-de-laptop-20.png"))); // NOI18N
        jMenuItem5.setText("Consulta de produtos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu18.add(jMenuItem5);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-teste-passado-20.png"))); // NOI18N
        jMenuItem1.setText("Formulari de Produtos");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu18.add(jMenuItem1);

        jMenu4.add(jMenu18);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-sales-38.png"))); // NOI18N
        jMenu5.setText("Vendas");
        jMenu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu5.setIconTextGap(10);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-orçamento-20.png"))); // NOI18N
        jMenuItem3.setText("Abrir PDV");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-data-de-pagamento-20.png"))); // NOI18N
        jMenuItem6.setText("Posição do Dia ");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-tarefas-financeiras-20.png"))); // NOI18N
        jMenuItem9.setText("historico de Vendas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-settings-38.png"))); // NOI18N
        jMenu6.setText("Configurações");
        jMenu6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu6.setIconTextGap(10);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-entrar-na-senha-do-formulário-20.png"))); // NOI18N
        jMenuItem7.setText("Troca de Usuário");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-imac-exit-38.png"))); // NOI18N
        jMenu7.setText("sair");
        jMenu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu7.setIconTextGap(10);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFundo/icon/icons8-cancelar-20.png"))); // NOI18N
        jMenuItem8.setText("Sair Do Sistema");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDesktop)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelDesktop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Max Tela
        this.setExtendedState(this.MAXIMIZED_BOTH);
        lblLogado.setText(usuarioLogado);
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormularioProdutos fp = new FormularioProdutos(this,true);
        fp.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FormularioClientes fc = new FormularioClientes(this,true);
        fc.setModal(rootPaneCheckingEnabled);
        fc.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menu_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_funcionarioActionPerformed
        FormularioFuncionarios ff = new FormularioFuncionarios(this,true);
        ff.setModal(rootPaneCheckingEnabled);
        ff.setVisible(true);
    }//GEN-LAST:event_menu_funcionarioActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FormularioFornecedores ff = new FormularioFornecedores(this,true);
         ff.setModal(rootPaneCheckingEnabled);
        ff.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FormularioProdutos consultaProdutos = new FormularioProdutos(this,true);
        consultaProdutos.painel_guias.setSelectedIndex(1);
        consultaProdutos.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void menu_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_estoqueActionPerformed
        FormularioEstoque consultaEstoque = new FormularioEstoque(this,true);
        consultaEstoque.setVisible(true);
    }//GEN-LAST:event_menu_estoqueActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        FormularioLogin login = new FormularioLogin();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        int janela = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do sistema?");
        if(janela == 0){
            System.exit(0);
        }else if(janela == 2){
            JOptionPane.showMessageDialog(null, "Cancelando....");
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FormularioVendas pontoDeVendas = new FormularioVendas();
        pontoDeVendas.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        FormularioTotalDoDia totalDoDia = new FormularioTotalDoDia(this,true);
        totalDoDia.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        FormularioHistorico historicoDeVendas = new FormularioHistorico();
        historicoDeVendas.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {//Nimbus

                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AreaTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new AreaTrabalho().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane PanelDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblLogado;
    public javax.swing.JMenuItem menu_estoque;
    public javax.swing.JMenu menu_fornecedores;
    public javax.swing.JMenuItem menu_funcionario;
    // End of variables declaration//GEN-END:variables
}
