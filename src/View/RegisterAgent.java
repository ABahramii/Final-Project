package View;

import Controller.Employee;
import Controller.InputContorollers;
import Model.Entity.Employee2;
import Model.Repsitory.SaveEmployeInDB;

import javax.swing.*;
import java.sql.SQLException;

public class RegisterAgent extends javax.swing.JFrame {

    public RegisterAgent() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lastnameTXT = new javax.swing.JTextField();
        firstnameTXT = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        passwordSub = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        idTXT = new javax.swing.JTextField();
        firstnameSub = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        idSub = new javax.swing.JLabel();
        passwordTXT = new javax.swing.JTextField();
        lastnameSub = new javax.swing.JLabel();
        registerBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Agent", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 22), new java.awt.Color(0, 153, 153))); // NOI18N

        lastnameTXT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lastnameTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastnameTXTKeyReleased(evt);
            }
        });

        firstnameTXT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        firstnameTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstnameTXTKeyReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("First Name");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Employee ID");

        passwordSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordSub.setForeground(new java.awt.Color(255, 255, 255));
        passwordSub.setText(".");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Last Name");

        idTXT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        idTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                try {
                    idTXTKeyReleased(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        firstnameSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstnameSub.setForeground(new java.awt.Color(255, 255, 255));
        firstnameSub.setText(".");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Password");

        idSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idSub.setForeground(new java.awt.Color(255, 255, 255));
        idSub.setText(".");

        passwordTXT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        passwordTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordTXTKeyReleased(evt);
            }
        });

        lastnameSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastnameSub.setForeground(new java.awt.Color(255, 255, 255));
        lastnameSub.setText(".");

        registerBTN.setBackground(new java.awt.Color(0, 153, 153));
        registerBTN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registerBTN.setForeground(new java.awt.Color(255, 255, 255));
        registerBTN.setText("Register");
        registerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    registerBTNActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lastnameSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(firstnameTXT)
                                                .addComponent(passwordTXT)
                                                .addComponent(firstnameSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lastnameTXT)
                                                .addComponent(passwordSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(idTXT)
                                                .addComponent(idSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(registerBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstnameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstnameSub)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastnameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastnameSub)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idSub)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordSub)
                                .addGap(40, 40, 40)
                                .addComponent(registerBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        backBTN.setBackground(new java.awt.Color(255, 255, 255));
        backBTN.setIcon(new javax.swing.ImageIcon("src\\view\\icon\\1.png")); // NOI18N
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(315, 315, 315)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void firstnameTXTKeyReleased(java.awt.event.KeyEvent evt) {
        switch (InputContorollers.checkName(firstnameTXT.getText())) {

            case 'l':
                firstnameSub.setForeground(new java.awt.Color(204, 0, 0));
                firstnameSub.setText("first name must include only letters");
                break;

            case 'e':
                firstnameSub.setForeground(new java.awt.Color(204, 0, 0));
                firstnameSub.setText("empty field");
                break;

            case 'o':
                firstnameSub.setForeground(new java.awt.Color(204, 0, 0));
                firstnameSub.setText("more than 40 characters");
                break;

            default:
                firstnameSub.setForeground(new java.awt.Color(0, 201, 0));
                firstnameSub.setText("standard");
                break;
        }
    }

    private void lastnameTXTKeyReleased(java.awt.event.KeyEvent evt) {
        switch (InputContorollers.checkName(lastnameTXT.getText())) {
            case 'l':
                lastnameSub.setForeground(new java.awt.Color(204, 0, 0));
                lastnameSub.setText("first name must include only letters");
                break;

            case 'e':
                lastnameSub.setForeground(new java.awt.Color(204, 0, 0));
                lastnameSub.setText("empty field");
                break;

            case 'o':
                lastnameSub.setForeground(new java.awt.Color(204, 0, 0));
                lastnameSub.setText("more than 40 characters");
                break;

            default:
                lastnameSub.setForeground(new java.awt.Color(0, 201, 0));
                lastnameSub.setText("standard");
                break;
        }

    }

    private void idTXTKeyReleased(java.awt.event.KeyEvent evt) throws SQLException {
        switch (InputContorollers.checkNation2(idTXT.getText())) {

            case 'l':
                idSub.setForeground(new java.awt.Color(204, 0, 0));
                idSub.setText("10 digits only");
                break;

            case 's':
                idSub.setForeground(new java.awt.Color(204, 0, 0));
                idSub.setText("only number!!");
                break;

            case 'm':
                idSub.setForeground(new java.awt.Color(204, 0, 0));
                idSub.setText("this id number already exist ");
                break;

            default:
                idSub.setForeground(new java.awt.Color(0, 201, 0));
                idSub.setText("standard");
                break;


        }
    }

    private void passwordTXTKeyReleased(java.awt.event.KeyEvent evt) {

        if(passwordTXT.getText().isEmpty()){
            passwordSub.setForeground(new java.awt.Color(204, 0, 0));
            passwordSub.setText("empty");
        }
        else {
            passwordSub.setForeground(new java.awt.Color(0, 201, 0));
            passwordSub.setText("standard");
        }
    }

    private void registerBTNActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {

        Boolean b=InputContorollers.checkAgentSubmit2(firstnameTXT.getText(),lastnameTXT.getText(),passwordTXT.getText(),idTXT.getText());
        int rowNumber=InputContorollers.getRowNUmbers("EMPOLYEE");
        if(b){
            Employee2 employee2 = new Employee2(firstnameTXT.getText(),lastnameTXT.getText(),passwordTXT.getText(),idTXT.getText(),rowNumber);
            SaveEmployeInDB saveEmployeInDB = new SaveEmployeInDB(employee2);
            saveEmployeInDB.save();
            JOptionPane.showMessageDialog(null,"succesfully saved");
            dispose();
            new AgentFrame().setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "empty field or incorrect information", "Alert", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new AgentFrame().setVisible(true);
    }

    private javax.swing.JButton backBTN;
    private javax.swing.JLabel firstnameSub;
    private javax.swing.JTextField firstnameTXT;
    private javax.swing.JLabel idSub;
    private javax.swing.JTextField idTXT;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lastnameSub;
    private javax.swing.JTextField lastnameTXT;
    private javax.swing.JLabel passwordSub;
    private javax.swing.JTextField passwordTXT;
    private javax.swing.JButton registerBTN;
}
