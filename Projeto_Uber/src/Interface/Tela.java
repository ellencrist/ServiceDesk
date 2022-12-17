/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class Tela extends javax.swing.JFrame {
    int linhaSelecionada = 0;
    
    
    public Tela() {
        initComponents();
        setLocationRelativeTo(null);//centralizar tela
        setIcon();
        excluirCadastro.setEnabled(false);//desabilita o botão excluir
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        C_DescricaoUsuario = new javax.swing.JTextPane();
        grupoBotoesSeveridade = new javax.swing.ButtonGroup();
        grupoBotoesFrequencia = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        campoEmailUsuario = new javax.swing.JTextField();
        EmailUsuario = new javax.swing.JLabel();
        NomeUsuario = new javax.swing.JLabel();
        campoNomeUsuario = new javax.swing.JTextField();
        Label_MaxDeCaracteres1 = new javax.swing.JLabel();
        rb_severidade1 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        rb_severidade2 = new javax.swing.JRadioButton();
        rb_severidade3 = new javax.swing.JRadioButton();
        rb_severidade4 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        rb_frequencia1 = new javax.swing.JRadioButton();
        rb_frequencia2 = new javax.swing.JRadioButton();
        rb_frequencia3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        faq = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        campoDescricao = new javax.swing.JTextPane();
        enviarSolicitacao = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        campoCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoMatricula = new javax.swing.JTextField();
        campoNomeFuncionario = new javax.swing.JTextField();
        relatorioFuncionario = new javax.swing.JButton();
        adicionarCadastro = new javax.swing.JButton();
        editarCadastro = new javax.swing.JButton();
        excluirCadastro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();

        jLabel9.setText("Selecione um item da lista");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Não exibir motorista mesmo tendo na região", "O GPS parou de funcionar", "Erros na localização de carros" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel10.setText("OU");

        jScrollPane2.setViewportView(C_DescricaoUsuario);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        campoEmailUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailUsuarioActionPerformed(evt);
            }
        });

        EmailUsuario.setText("Email");

        NomeUsuario.setText("Nome");

        campoNomeUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campoNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeUsuarioActionPerformed(evt);
            }
        });

        Label_MaxDeCaracteres1.setBackground(new java.awt.Color(255, 255, 255));
        Label_MaxDeCaracteres1.setForeground(new java.awt.Color(102, 102, 102));
        Label_MaxDeCaracteres1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_MaxDeCaracteres1.setText("(no máx 3000 caracteres)");

        grupoBotoesSeveridade.add(rb_severidade1);
        rb_severidade1.setText("1");
        rb_severidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_severidade1ActionPerformed(evt);
            }
        });

        jLabel13.setText("O quão severo é o bug reportado?");

        grupoBotoesSeveridade.add(rb_severidade2);
        rb_severidade2.setText("2");
        rb_severidade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_severidade2ActionPerformed(evt);
            }
        });

        grupoBotoesSeveridade.add(rb_severidade3);
        rb_severidade3.setText("3");
        rb_severidade3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_severidade3ActionPerformed(evt);
            }
        });

        grupoBotoesSeveridade.add(rb_severidade4);
        rb_severidade4.setText("4");
        rb_severidade4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_severidade4ActionPerformed(evt);
            }
        });

        jLabel14.setText("Com que frequência ocorre?");

        grupoBotoesFrequencia.add(rb_frequencia1);
        rb_frequencia1.setText("Uma vez");
        rb_frequencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_frequencia1ActionPerformed(evt);
            }
        });

        grupoBotoesFrequencia.add(rb_frequencia2);
        rb_frequencia2.setText("As vezes");

        grupoBotoesFrequencia.add(rb_frequencia3);
        rb_frequencia3.setText("O tempo todo");
        rb_frequencia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_frequencia3ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("(seleção obrigatória)");

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("(seleção obrigatória)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(NomeUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EmailUsuario)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(campoEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(Label_MaxDeCaracteres1)
                                .addGap(241, 241, 241))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(rb_frequencia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_frequencia2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_frequencia3))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(rb_severidade1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_severidade2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_severidade3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_severidade4))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(109, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EmailUsuario)
                        .addComponent(NomeUsuario)
                        .addComponent(campoNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_severidade1)
                    .addComponent(rb_severidade2)
                    .addComponent(rb_severidade3)
                    .addComponent(rb_severidade4))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_frequencia1)
                    .addComponent(rb_frequencia2)
                    .addComponent(rb_frequencia3))
                .addGap(3934, 3934, 3934)
                .addComponent(Label_MaxDeCaracteres1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Descreva seu problema"));

        jLabel11.setText("Selecione um item da lista");

        faq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Não exibir motorista na região", "O GPS parou de funcionar", "Erros na localização de carros" }));
        faq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faqActionPerformed(evt);
            }
        });

        jLabel12.setText("OU");

        jScrollPane3.setViewportView(campoDescricao);

        enviarSolicitacao.setText("Enviar");
        enviarSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarSolicitacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enviarSolicitacao))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(faq, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(faq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(enviarSolicitacao)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Usuário", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastro"));

        campoCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodActionPerformed(evt);
            }
        });

        jLabel1.setText("Matrícula:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Cod Ocorrência:");

        relatorioFuncionario.setText("Relatório");
        relatorioFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(relatorioFuncionario))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(relatorioFuncionario)
                .addContainerGap())
        );

        adicionarCadastro.setText("Adicionar");
        adicionarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarCadastroActionPerformed(evt);
            }
        });

        editarCadastro.setText("Editar");
        editarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCadastroActionPerformed(evt);
            }
        });

        excluirCadastro.setText("Excluir");
        excluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirCadastroActionPerformed(evt);
            }
        });

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Matrícula", "Cód. Ocorrência"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFuncionario);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adicionarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(editarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(excluirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarCadastro)
                    .addComponent(excluirCadastro)
                    .addComponent(adicionarCadastro))
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Funcionários", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void enviarSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarSolicitacaoActionPerformed
        escolhas();
    }//GEN-LAST:event_enviarSolicitacaoActionPerformed

    private void faqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faqActionPerformed

    private void rb_frequencia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_frequencia3ActionPerformed

    }//GEN-LAST:event_rb_frequencia3ActionPerformed

    private void rb_frequencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_frequencia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_frequencia1ActionPerformed

    private void rb_severidade4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_severidade4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_severidade4ActionPerformed

    private void rb_severidade3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_severidade3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_severidade3ActionPerformed

    private void rb_severidade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_severidade2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_severidade2ActionPerformed

    private void rb_severidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_severidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_severidade1ActionPerformed

    private void campoNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeUsuarioActionPerformed

    }//GEN-LAST:event_campoNomeUsuarioActionPerformed

    private void campoEmailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailUsuarioActionPerformed

    }//GEN-LAST:event_campoEmailUsuarioActionPerformed

    private void tabelaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFuncionarioMouseClicked
        //pegar linha selecionada
        linhaSelecionada = tabelaFuncionario.getSelectedRow();
        //habilitar o botão excluir quando a linha for selecionad
        excluirCadastro.setEnabled(true);
        campoNomeFuncionario.setText((String) tabelaFuncionario.getValueAt(linhaSelecionada, 0));
        campoMatricula.setText((String) tabelaFuncionario.getValueAt(linhaSelecionada, 1));
        campoCod.setText((String) tabelaFuncionario.getValueAt(linhaSelecionada, 2));
    }//GEN-LAST:event_tabelaFuncionarioMouseClicked

    private void excluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirCadastroActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Quer mesmo excluir a linha selecionada?", "Atenção",JOptionPane.YES_NO_OPTION);
        if(p==JOptionPane.YES_OPTION){
            //excluir linha selecionada
            ((DefaultTableModel) tabelaFuncionario.getModel()).removeRow(tabelaFuncionario.getSelectedRow());
            //limpar campos de texto
            campoNomeFuncionario.setText("");
            campoMatricula.setText("");
            campoCod.setText("");
            JOptionPane.showMessageDialog(null, "Item excluído com sucesso!","Operação bem sucedida",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Item não excluído","Operação cancelada", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_excluirCadastroActionPerformed

    private void editarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCadastroActionPerformed

        if(tabelaFuncionario.getSelectedRow() !=-1){
            tabelaFuncionario.setValueAt(campoNomeFuncionario.getText(), tabelaFuncionario.getSelectedRow(), 0);
            tabelaFuncionario.setValueAt(campoMatricula.getText(), tabelaFuncionario.getSelectedRow(), 1);
            tabelaFuncionario.setValueAt(campoCod.getText(), tabelaFuncionario.getSelectedRow(), 2);
        }else{
            JOptionPane.showMessageDialog(null, "Para editar, basta selecionar um item da lista, fazer a alteração nos campos e clicar em 'Editar' para salvar a alteração");

        }
    }//GEN-LAST:event_editarCadastroActionPerformed

    private void adicionarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarCadastroActionPerformed
        //coleta informacoes do usuario e guarda em variaveis
        String nomeF = campoNomeFuncionario.getText().trim();
        String matriculaF = campoMatricula.getText().trim();
        String codF = campoCod.getText().trim();

        DefaultTableModel valor = (DefaultTableModel) tabelaFuncionario.getModel();
        //adicionar linhas
        valor.addRow(new String[]{nomeF, matriculaF, codF});
        //limpar campos de texto
        campoNomeFuncionario.setText("");
        campoMatricula.setText("");
        campoCod.setText("");
        //foco do mouse no primeiro campo
        campoNomeFuncionario.requestFocus();
    }//GEN-LAST:event_adicionarCadastroActionPerformed

    private void relatorioFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioFuncionarioActionPerformed
        relatorioescolhas();
    }//GEN-LAST:event_relatorioFuncionarioActionPerformed

    private void campoCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodActionPerformed

    }//GEN-LAST:event_campoCodActionPerformed
    private void escolhas(){    
        String cod = "";
        String nomeU = campoNomeUsuario.getText().trim();
        String msgescolhas = "Erro ao enviar solicitação, digite seu nome e selecione os graus de severidade e frequência";
        
        //primeira combinação, severidade nº1 com frequencias(Uma vez, As vezes, O tempo todo)
        if(rb_severidade1.isSelected() && rb_frequencia1.isSelected()){
            cod= "1U";
            msgescolhas = "Obrigado pela mensagem " + nomeU +" .Seu código de ocorrência é: ";
        }if(rb_severidade1.isSelected() && rb_frequencia2.isSelected()){
            cod= "1A";
            msgescolhas = "Obrigado pela mensagem " + nomeU +" .Seu código de ocorrência é: ";
        }if(rb_severidade1.isSelected() && rb_frequencia3.isSelected()){
            cod= "1O";
            msgescolhas = "Obrigado pela mensagem " + nomeU +" .Seu código de ocorrência é: ";
        }
        
        //Segunda combinação, severidade com frequencias(Uma vez, As vezes, O tempo todo)
        if(rb_severidade2.isSelected() && rb_frequencia1.isSelected()){
            cod="2U";
            msgescolhas = "Obrigado pela mensagem " + nomeU +".Seu código de ocorrência é: ";
        }if(rb_severidade2.isSelected() && rb_frequencia2.isSelected()){
            cod="2A";
            msgescolhas = "Obrigado pela mensagem " + nomeU +" .Seu código de ocorrência é: ";
        }if(rb_severidade2.isSelected() && rb_frequencia3.isSelected()){
            cod="2O";
            msgescolhas = "Obrigado pela mensagem " + nomeU +" .Seu código de ocorrência é: ";
        }
   
        //Terceira combinação, severidade com frequencias(Uma vez, As vezes, O tempo todo)
        if(rb_severidade3.isSelected() && rb_frequencia1.isSelected()){
            cod="3U";
            msgescolhas = "Obrigado pela mensagem " + nomeU +" .Seu código de ocorrência é: ";
        }if(rb_severidade3.isSelected() && rb_frequencia2.isSelected()){
            cod="3A";
            msgescolhas = "Obrigado pela mensagem " + nomeU +" .Seu código de ocorrência é: ";
        }if(rb_severidade3.isSelected() && rb_frequencia3.isSelected()){
            cod="3O";
            msgescolhas = "Obrigado pela mensagem " + nomeU +" .Seu código de ocorrência é: ";
        }
        
        //Quarta combinação, severidade com frequencias(Uma vez, As vezes, O tempo todo)
        if(rb_severidade4.isSelected() && rb_frequencia1.isSelected()){
            cod="4U";
            msgescolhas = "Obrigado pela mensagem " + nomeU +" .Seu código de ocorrência é: ";
        }if(rb_severidade4.isSelected() && rb_frequencia2.isSelected()){
            cod="4A";
            msgescolhas = "Obrigado pela mensagem " + nomeU +" .Seu código de ocorrência é: ";
        }if(rb_severidade4.isSelected() && rb_frequencia3.isSelected()){
            cod="4O";
            msgescolhas = "Obrigado pela mensagem " + nomeU +" .Seu código de ocorrência é: ";
        }
        
        //exibir caixa de dialogo
        JOptionPane.showMessageDialog(null,msgescolhas+cod);
        
}    
    
    private void relatorioescolhas(){
        //declaração de variaveis
        String nomeFuncionario = campoNomeFuncionario.getText().trim();
        String relatorio = "";
        String varcampoCod = campoCod.getText().trim();
        String mensagem = " Nada foi encontrado, digite o nome do funcionário e o código da ocorrência (corretamente)";
        //pegando informação do campo de texto simulação 1
        if(varcampoCod.equalsIgnoreCase("1U")){
           relatorio = "foi parcialmente resolvido";
           mensagem =" O bug sob responsabilidade do funcionário "; 
        }if(varcampoCod.equalsIgnoreCase("1A")){
            relatorio = "foi analisado, te daremos uma resposta em breve"; 
            mensagem =" O bug sob responsabilidade do funcionário "; 
        }if(varcampoCod.equalsIgnoreCase("1O")){
            relatorio = "foi solucionado"; 
            mensagem =" O bug sob responsabilidade do funcionário "; 
        }
         
        //simulação de código 2
        if(varcampoCod.equalsIgnoreCase("2U")){
            relatorio = "foi parcialmente resolvido";
            mensagem =" O bug sob responsabilidade do funcionário "; 
        }if(varcampoCod.equalsIgnoreCase("2A")){
            relatorio = "foi analisado, ainda em andamento";
            mensagem =" O bug sob responsabilidade do funcionário "; 
        }if(varcampoCod.equalsIgnoreCase("2O")){
            relatorio = "foi resolvido";
            mensagem =" O bug sob responsabilidade do funcionário "; 
        }
        //simulação de código 3
        if(varcampoCod.equalsIgnoreCase("3U")){
            relatorio = "foi parcialmente resolvido";
            mensagem =" O bug sob responsabilidade do funcionário "; 
        }if(varcampoCod.equalsIgnoreCase("3A")){
            relatorio = "foi solucionado";
            mensagem =" O bug sob responsabilidade do funcionário "; 
        }if(varcampoCod.equalsIgnoreCase("3O")){
            relatorio = "não foi resolvido, ainda em análise";
            mensagem =" O bug sob responsabilidade do funcionário "; 
        }
        
        //simulação de código 4
        if(varcampoCod.equalsIgnoreCase("4U")){
            relatorio = "foi analisado, ainda em andamento";
            mensagem =" O bug sob responsabilidade do funcionário "; 
        }if(varcampoCod.equalsIgnoreCase("4A")){
            relatorio = "não foi solucionado";
            mensagem =" O bug sob responsabilidade do funcionário "; 
        }if(varcampoCod.equalsIgnoreCase("4O")){
            relatorio = "não foi analisado, ainda em processo de validação"; 
            mensagem =" O bug sob responsabilidade do funcionário "; 
        }
        
        JOptionPane.showMessageDialog(null,"Relatório:"+mensagem+nomeFuncionario+" "+ relatorio);
    }
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane C_DescricaoUsuario;
    private javax.swing.JLabel EmailUsuario;
    private javax.swing.JLabel Label_MaxDeCaracteres1;
    private javax.swing.JLabel NomeUsuario;
    private javax.swing.JButton adicionarCadastro;
    public javax.swing.JTextField campoCod;
    private javax.swing.JTextPane campoDescricao;
    private javax.swing.JTextField campoEmailUsuario;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JTextField campoNomeFuncionario;
    private javax.swing.JTextField campoNomeUsuario;
    private javax.swing.JButton editarCadastro;
    private javax.swing.JButton enviarSolicitacao;
    private javax.swing.JButton excluirCadastro;
    private javax.swing.JComboBox<String> faq;
    private javax.swing.ButtonGroup grupoBotoesFrequencia;
    private javax.swing.ButtonGroup grupoBotoesSeveridade;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rb_frequencia1;
    private javax.swing.JRadioButton rb_frequencia2;
    private javax.swing.JRadioButton rb_frequencia3;
    private javax.swing.JRadioButton rb_severidade1;
    private javax.swing.JRadioButton rb_severidade2;
    private javax.swing.JRadioButton rb_severidade3;
    private javax.swing.JRadioButton rb_severidade4;
    private javax.swing.JButton relatorioFuncionario;
    private javax.swing.JTable tabelaFuncionario;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("uber.jpeg")));//adicionando icone ao jframe
    }
}
