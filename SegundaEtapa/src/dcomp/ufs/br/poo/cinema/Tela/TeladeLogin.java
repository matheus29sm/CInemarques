package dcomp.ufs.br.poo.cinema.Tela;

import dcomp.ufs.br.poo.cinema.Arquivos.LeituradeArquivo;


public class TeladeLogin extends javax.swing.JFrame {


    public TeladeLogin() {
        setTitle("Tela do Login");
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Senha = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        msge = new javax.swing.JLabel();
        saida = new javax.swing.JButton();
        acessar = new javax.swing.JButton();
        cinemanome = new javax.swing.JLabel();
        slogan = new javax.swing.JLabel();
        cmpusuario = new javax.swing.JTextField();
        cmpsenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("teladelogin"); // NOI18N

        Senha.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Senha.setText("Senha:");

        Usuario.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Usuario.setText("Usuario:");

        msge.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        msge.setForeground(new java.awt.Color(255, 51, 51));

        saida.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        saida.setText("Sair");
        saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saidaActionPerformed(evt);
            }
        });

        acessar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        acessar.setText("Acessar");
        acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessarActionPerformed(evt);
            }
        });

        cinemanome.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        cinemanome.setForeground(new java.awt.Color(255, 0, 0));
        cinemanome.setText("CINEMARQUE");

        slogan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        slogan.setText("Mais que um cinema, sao dois cinemas");

        cmpusuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cmpsenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(slogan))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(345, 345, 345)
                            .addComponent(cinemanome))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Usuario)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmpusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Senha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(msge)
                                            .addComponent(cmpsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(339, 339, 339)
                                .addComponent(acessar)
                                .addGap(79, 79, 79)
                                .addComponent(saida)))))
                .addGap(386, 386, 386))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cinemanome)
                .addGap(26, 26, 26)
                .addComponent(slogan)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario)
                    .addComponent(cmpusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Senha)
                    .addComponent(cmpsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(msge)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acessar)
                    .addComponent(saida))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1018, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void acessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessarActionPerformed

        LeituradeArquivo ler = new LeituradeArquivo();
        String[] args = null;
        String palavra[] = ler.lerArquivoChar("Login.txt");
        if(palavra[0].contains(cmpusuario.getText()) && palavra[1].contains(cmpsenha.getText())){
            if((!cmpusuario.getText().contentEquals("") && (!cmpsenha.getText().contentEquals("")))){
                    TeladoGerente telag = new TeladoGerente();
                    telag.setVisible(true);
                    dispose();
                }
            else{
                msge.setText("Usuario ou Senha invalido");
            } 
        }
        for(int i = 2 ; i < palavra.length ; i++){
           if (palavra[i].contains(cmpusuario.getText()) && palavra[i+1].contains(cmpsenha.getText())){
               i++;
               if((!cmpusuario.getText().contentEquals("") && (!cmpsenha.getText().contentEquals("")))){
                    TeladoCaixa tela = new TeladoCaixa();
                    tela.setVisible(true);  
                    dispose();
                }
            }
            else{
                msge.setText("Usuario ou Senha invalido");
            }             
 
        } 
    }//GEN-LAST:event_acessarActionPerformed

    private void saidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saidaActionPerformed

        System.exit(0);
    }//GEN-LAST:event_saidaActionPerformed

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeladeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeladeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeladeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeladeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeladeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton acessar;
    private javax.swing.JLabel cinemanome;
    private javax.swing.JPasswordField cmpsenha;
    private javax.swing.JTextField cmpusuario;
    private javax.swing.JLabel msge;
    private javax.swing.JButton saida;
    private javax.swing.JLabel slogan;
    // End of variables declaration//GEN-END:variables
}
