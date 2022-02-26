package SPRA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CadastroAdministrador extends javax.swing.JFrame {

    public CadastroAdministrador() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lableTitle = new javax.swing.JLabel();
        txtMatAdm = new javax.swing.JTextField();
        txtNomeAdm = new javax.swing.JTextField();
        txtEmailAdm = new javax.swing.JTextField();
        passwordAdm = new javax.swing.JPasswordField();
        labelMatAdm = new javax.swing.JLabel();
        labelNomeAdm = new javax.swing.JLabel();
        labelEmailAdm = new javax.swing.JLabel();
        labelSenhaAdm = new javax.swing.JLabel();
        butCadastrarAdm = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        lableTitle.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lableTitle.setText("Sistema para Registro de Autorizações - Cadastro");

        labelMatAdm.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        labelMatAdm.setText("Matrícula");

        labelNomeAdm.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        labelNomeAdm.setText("Nome Completo");

        labelEmailAdm.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        labelEmailAdm.setText("Email");

        labelSenhaAdm.setBackground(new java.awt.Color(0, 0, 0));
        labelSenhaAdm.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        labelSenhaAdm.setText("Senha");

        butCadastrarAdm.setText("Cadastrar");
        butCadastrarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCadastrarAdmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 132, Short.MAX_VALUE)
                .addComponent(lableTitle)
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMatAdm)
                            .addComponent(labelNomeAdm)
                            .addComponent(labelEmailAdm)
                            .addComponent(labelSenhaAdm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmailAdm)
                            .addComponent(txtNomeAdm)
                            .addComponent(txtMatAdm)
                            .addComponent(passwordAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(butCadastrarAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lableTitle)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMatAdm)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMatAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeAdm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmailAdm)
                    .addComponent(txtEmailAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSenhaAdm)
                    .addComponent(passwordAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(butCadastrarAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butCadastrarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCadastrarAdmActionPerformed
        if ((txtMatAdm.getText().length() != 0) && (txtEmailAdm.getText().length() != 0) 
             && (txtNomeAdm.getText().length() != 0) && (passwordAdm.getPassword().length != 0)) {
            //confere se todos os campos estão preenchidos
            
            Connection conn = null;
            //inicializa a vaiável da conexão

            try {
                String cmd = "insert into administrador values('" 
                        + txtMatAdm.getText() + "','" + String.valueOf(passwordAdm.getPassword()) + "','" 
                        + txtEmailAdm.getText() + "'," + "'" + txtNomeAdm.getText() + "')";
                //string concatenada,  com comando insert do myqsl que vai servir para
                //inserir os dados do administrador 

                conn = Conexao.getConnection();
                //inicia a conexão centralizada

                Statement stmt = conn.createStatement();
                //inicializa o statement

                int i = stmt.executeUpdate(cmd);
                //variavel que vai conferir o numero de linhas alteradas

                if (i == 0) {
                    JOptionPane.showMessageDialog(null, "ERRO! Registro não inserido.", "Mensagem", 
                                                  JOptionPane.INFORMATION_MESSAGE);
                    //se nenhuma linha foi alterada, significa que não exevutou o comando
                    //e deu algum erro
                } else {
                    JOptionPane.showMessageDialog(null, "SUCESSO! Você foi cadastrado.", "Mensagem", 
                                                  JOptionPane.INFORMATION_MESSAGE);
                    //mensagem informando que o cadastro deu certo
                    this.setVisible(false);
                    Login in = new Login();
                    in.setVisible(true);
                    //vai para a tela de login
                }
                stmt.close();
                conn.close();
                //fecha a conexão

            } catch (Exception e) {
                e.printStackTrace();
                //trata de exceções
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Mensagem", 
                                          JOptionPane.INFORMATION_MESSAGE);
            //mensagem de erro caso algum campo não for preenchido
        }
    }//GEN-LAST:event_butCadastrarAdmActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCadastrarAdm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEmailAdm;
    private javax.swing.JLabel labelMatAdm;
    private javax.swing.JLabel labelNomeAdm;
    private javax.swing.JLabel labelSenhaAdm;
    private javax.swing.JLabel lableTitle;
    private javax.swing.JPasswordField passwordAdm;
    private javax.swing.JTextField txtEmailAdm;
    private javax.swing.JTextField txtMatAdm;
    private javax.swing.JTextField txtNomeAdm;
    // End of variables declaration//GEN-END:variables
}
