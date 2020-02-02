package View;

import Controller.InputContorollers;
import Model.Entity.Employee2;
import Model.Repsitory.SaveEmployeInDB;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EditAgent extends javax.swing.JFrame {

    String id;
    int row;
    public EditAgent() {
        initComponents();
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        searchTXT = new javax.swing.JTextField();
        searchBTN = new javax.swing.JButton();
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
        updateBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Search by");

        combo.setBackground(new java.awt.Color(0, 153, 153));
        combo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        combo.setForeground(new java.awt.Color(255, 255, 255));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Name", "Last Name", "Employee ID" }));

        searchTXT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        searchBTN.setBackground(new java.awt.Color(255, 255, 255));
        searchBTN.setIcon(new javax.swing.ImageIcon("src\\view\\icon\\3.png")); // NOI18N
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

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

        updateBTN.setBackground(new java.awt.Color(0, 153, 153));
        updateBTN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateBTN.setForeground(new java.awt.Color(255, 255, 255));
        updateBTN.setText("Update");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    updateBTNActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        deleteBTN.setBackground(new java.awt.Color(0, 153, 153));
        deleteBTN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteBTN.setForeground(new java.awt.Color(255, 255, 255));
        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                                .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(lastnameSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(firstnameTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                                                .addComponent(passwordTXT)
                                                                .addComponent(firstnameSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lastnameTXT)
                                                                .addComponent(passwordSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(idTXT)
                                                                .addComponent(idSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        backBTN.setBackground(new java.awt.Color(255, 255, 255));
        backBTN.setIcon(new javax.swing.ImageIcon("src\\view\\icon\\1.png")); // NOI18N
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        tbl.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {},
                        {},
                        {},
                        {},
                        {},
                        {},
                        {},
                        {},
                        {},
                        {}
                },
                new String [] {

                }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(searchTXT)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(49, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchTXT))
                                .addGap(52, 52, 52)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void showTable() throws SQLException {

        String word = searchTXT.getText();
        String field = null;
        int n = combo.getSelectedIndex();
        switch (n) {
            case 0:
                field = "FNAME";
                break;
            case 1:
                field = "LNAME";
                break;
            case 2:
                field = "EMPID";
                break;
        }


        ResultSet rs = InputContorollers.search("EMPLOYEE", field, word);
        tbl.setModel(DbUtils.resultSetToTableModel(rs));
    }

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {
        int i = tbl.getSelectedRow();

        firstnameTXT.setText(tbl.getValueAt(i, 0).toString());
        lastnameTXT.setText(tbl.getValueAt(i, 3).toString());
        idTXT.setText(tbl.getValueAt(i, 1).toString());
        passwordTXT.setText(tbl.getValueAt(i, 2).toString());
        id=tbl.getValueAt(i, 1).toString();
        String row2=tbl.getValueAt(i,4).toString();
        row=Integer.parseInt(row2);
    }

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            showTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void firstnameTXTKeyReleased(java.awt.event.KeyEvent evt) {

    }

    private void lastnameTXTKeyReleased(java.awt.event.KeyEvent evt) {

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
                if(!id.equals(idTXT.getText())) {
                    idSub.setForeground(new java.awt.Color(204, 0, 0));
                    idSub.setText("this id number already exist ");
                    break;
                }
                else {
                    idSub.setForeground(new java.awt.Color(0, 201, 0));
                    idSub.setText("standard");
                    break;
                }

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

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        Boolean b=InputContorollers.checkAgentSubmit(firstnameTXT.getText(),lastnameTXT.getText(),passwordTXT.getText(),idTXT.getText(),row);
        if(b){
            Employee2 employee2 = new Employee2(firstnameTXT.getText(),lastnameTXT.getText(),passwordTXT.getText(),idTXT.getText(),row);
            SaveEmployeInDB saveEmployeInDB = new SaveEmployeInDB(employee2);
            saveEmployeInDB.update();
            JOptionPane.showMessageDialog(null,"succesfully sdited");
            dispose();
            new AgentFrame().setVisible(true);
        }
    }

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new AgentFrame().setVisible(true);
    }

    private javax.swing.JButton backBTN;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JLabel firstnameSub;
    private javax.swing.JTextField firstnameTXT;
    private javax.swing.JLabel idSub;
    private javax.swing.JTextField idTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastnameSub;
    private javax.swing.JTextField lastnameTXT;
    private javax.swing.JLabel passwordSub;
    private javax.swing.JTextField passwordTXT;
    private javax.swing.JButton searchBTN;
    private javax.swing.JTextField searchTXT;
    private javax.swing.JTable tbl;
    private javax.swing.JButton updateBTN;
}
