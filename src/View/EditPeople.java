package View;


import Controller.Employee;
import Controller.InputContorollers;
import Controller.SubmitException;
import Model.Entity.Changes;
import Model.Entity.Family;
import Model.Entity.Person;
import Model.Repsitory.SaveChangesInDB;
import Model.Repsitory.SaveFamilyInDB;
import Model.Repsitory.SavePersonInDB;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EditPeople extends javax.swing.JFrame {

    String id=null;
    int rowNumber;
    String headCode=null;


    public EditPeople() {
        initComponents();
    }


    private void initComponents() {

        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lastnameSub = new javax.swing.JLabel();
        incomeTxt = new javax.swing.JTextField();
        ageSub = new javax.swing.JLabel();
        headCodeSub = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        motherRadio = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        comboJob = new javax.swing.JComboBox<>();
        fatherRadio = new javax.swing.JRadioButton();
        lastnameTxt = new javax.swing.JTextField();
        incomeSub = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        headCodeTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        femaleRadio = new javax.swing.JRadioButton();
        childRadio = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        codeTxt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        firstnameSub = new javax.swing.JLabel();
        codeSub = new javax.swing.JLabel();
        maleRadio = new javax.swing.JRadioButton();
        firstnameTxt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTxt = new javax.swing.JTextArea();
        addressSub = new javax.swing.JLabel();
        updateBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        searchTXT = new javax.swing.JTextField();
        searchBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        backBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "People", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 22), new java.awt.Color(0, 153, 153))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("First Name");

        lastnameSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastnameSub.setForeground(new java.awt.Color(255, 255, 255));
        lastnameSub.setText(".");

        incomeTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        incomeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                incomeTxtKeyReleased(evt);
            }
        });

        ageSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ageSub.setForeground(new java.awt.Color(255, 255, 255));
        ageSub.setText(".");

        headCodeSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        headCodeSub.setForeground(new java.awt.Color(255, 255, 255));
        headCodeSub.setText(".");

        ageTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ageTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageTxtKeyReleased(evt);
            }
        });

        buttonGroup1.add(motherRadio);
        motherRadio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        motherRadio.setText("Mother");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Role");

        comboJob.setBackground(new java.awt.Color(229, 236, 247));
        comboJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Labor", "Doctor", "Teacher", "Student", "Housewife", "Freelancer", "Other" }));

        buttonGroup1.add(fatherRadio);
        fatherRadio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fatherRadio.setText("Father");

        lastnameTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lastnameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastnameTxtKeyReleased(evt);
            }
        });

        incomeSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        incomeSub.setForeground(new java.awt.Color(255, 255, 255));
        incomeSub.setText(".");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Last Name");

        headCodeTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        headCodeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                try {
                    headCodeTxtKeyReleased(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Gender");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Age");

        buttonGroup3.add(femaleRadio);
        femaleRadio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        femaleRadio.setText("Female");

        buttonGroup1.add(childRadio);
        childRadio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        childRadio.setText("Child");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("ID Code");

        codeTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        codeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                try {
                    codeTxtKeyReleased(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Job");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Head ID Code");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Income");

        firstnameSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstnameSub.setForeground(new java.awt.Color(255, 255, 255));
        firstnameSub.setText(".");

        codeSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codeSub.setForeground(new java.awt.Color(255, 255, 255));
        codeSub.setText(".");

        buttonGroup3.add(maleRadio);
        maleRadio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maleRadio.setText("Male");

        firstnameTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        firstnameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstnameTxtKeyReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Address");

        addressTxt.setColumns(20);
        addressTxt.setRows(5);
        addressTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addressTxtKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(addressTxt);

        addressSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressSub.setForeground(new java.awt.Color(255, 255, 255));
        addressSub.setText("yyurutyu");

        updateBTN.setBackground(new java.awt.Color(0, 153, 153));
        updateBTN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateBTN.setForeground(new java.awt.Color(255, 255, 255));
        updateBTN.setText("Update");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    updateBTNActionPerformed(evt);
                } catch (SQLException | SubmitException e) {
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(codeSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(codeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                                                        .addComponent(ageTxt)
                                                                        .addComponent(headCodeTxt)
                                                                        .addComponent(incomeTxt)
                                                                        .addComponent(lastnameTxt)
                                                                        .addComponent(comboJob, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(fatherRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(maleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(femaleRadio)
                                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                                .addComponent(motherRadio)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(childRadio))))
                                                                        .addComponent(lastnameSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(firstnameSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(ageSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(headCodeSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(incomeSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(firstnameTxt)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(47, 47, 47)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(addressSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jScrollPane1)))))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                        .addComponent(firstnameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                                .addGap(4, 4, 4)
                                .addComponent(firstnameSub)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lastnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addComponent(lastnameSub)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(codeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addComponent(codeSub)
                                .addGap(13, 13, 13)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ageSub, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(femaleRadio)
                                        .addComponent(maleRadio))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(motherRadio)
                                        .addComponent(fatherRadio)
                                        .addComponent(childRadio))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboJob, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(headCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(headCodeSub)
                                .addGap(16, 16, 16)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(incomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(incomeSub)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addressSub))
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Search by");

        combo.setBackground(new java.awt.Color(0, 153, 153));
        combo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        combo.setForeground(new java.awt.Color(255, 255, 255));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Name", "Last Name", "ID code",  "Head ID Cod","Gender","Role","Job","Age"}));

        searchTXT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        searchTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTXTKeyReleased(evt);
            }

            private void searchTXTKeyReleased(KeyEvent evt) {
            }
        });

        searchBTN.setBackground(new java.awt.Color(255, 255, 255));
        searchBTN.setIcon(new javax.swing.ImageIcon("src\\view\\icon\\3.png")); // NOI18N
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    searchBTNActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
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
        jScrollPane2.setViewportView(tbl);

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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(searchTXT))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchTXT))
                                .addGap(109, 109, 109)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void showTable() throws SQLException {
        String word=searchTXT.getText();
        String field=null;
        int n=combo.getSelectedIndex();
        switch (n){
            case 0:
                field="FNAME";
                break;
            case 1:
                field="LNAME";
                break;
            case 2:
                field="IDNUMBER";
                break;
            case 3:
                field="FAMILYOWNERID";
                break;

            case 4:
                field="GENDER";
                break;

            case 5:
                field="ROLE";
                break;

            case 6:
                field="JOB";
                break;
            case 7:
                field="AGE";
                break;

        }
        ResultSet rs = InputContorollers.search("PERSON",field,word);
        tbl.setModel(DbUtils.resultSetToTableModel(rs));
    }

    private void setGender(String gender) {
        if (gender.equals("male"))
            buttonGroup3.setSelected(maleRadio.getModel(), true);
        else
            buttonGroup3.setSelected(femaleRadio.getModel(), true);
    }

    private void setRole(String role) {
        switch (role) {
            case "father" :
                buttonGroup1.setSelected(fatherRadio.getModel(), true);
                break;
            case "mother" :
                buttonGroup1.setSelected(motherRadio.getModel(), true);
                break;
            case "child" :
                buttonGroup1.setSelected(childRadio.getModel(), true);
                break;
        }
    }

    private void setJob(String job) {
        switch (job) {
            case "employee" :
                comboJob.setSelectedIndex(0);
                break;
            case "labor" :
                comboJob.setSelectedIndex(1);
                break;
            case "doctor" :
                comboJob.setSelectedIndex(2);
                break;
            case "teacher" :
                comboJob.setSelectedIndex(3);
                break;
            case "student" :
                comboJob.setSelectedIndex(4);
                break;
            case "housewife" :
                comboJob.setSelectedIndex(5);
                break;
            case "freelancer" :
                comboJob.setSelectedIndex(6);
                break;
            case "other" :
                comboJob.setSelectedIndex(7);
                break;
        }
    }

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {

        System.out.println(InputContorollers.getRowNUmbers("PERSON"));
        try {
            showTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {

        int i = tbl.getSelectedRow();

        firstnameTxt.setText(tbl.getValueAt(i, 0).toString());
        lastnameTxt.setText(tbl.getValueAt(i, 1).toString());
        codeTxt.setText(tbl.getValueAt(i, 2).toString());
        ageTxt.setText(tbl.getValueAt(i, 3).toString());

        String gender = tbl.getValueAt(i, 4).toString();
        setGender(gender);

        String role = tbl.getValueAt(i, 5).toString();
        setRole(role);

        String job = tbl.getValueAt(i, 6).toString();
        setJob(job);

        headCodeTxt.setText(tbl.getValueAt(i, 7).toString());
        incomeTxt.setText(tbl.getValueAt(i, 8).toString());
        addressTxt.setText(tbl.getValueAt(i, 9).toString());
        id=tbl.getValueAt(i, 2).toString();
        rowNumber=Integer.parseInt(tbl.getValueAt(i,14).toString());
        headCode=tbl.getValueAt(i, 7).toString();

    }

    private void incomeTxtKeyReleased(java.awt.event.KeyEvent evt) {

        switch (InputContorollers.checkIncome(incomeTxt.getText())) {

            case 's':
                incomeSub.setForeground(new java.awt.Color(204, 0, 0));
                incomeSub.setText("only number -___-");
                break;

            case 'e':
                incomeSub.setForeground(new java.awt.Color(204, 0, 0));
                incomeSub.setText("empty firld");
                break;

            default:
                incomeSub.setForeground(new java.awt.Color(0, 201, 0));
                incomeSub.setText("standard");
                break;

        }
    }

    private void ageTxtKeyReleased(java.awt.event.KeyEvent evt) {
        switch (InputContorollers.checkMemberAge(ageTxt.getText())) {

            case 'l':
                ageSub.setForeground(new java.awt.Color(204, 0, 0));
                ageSub.setText("enter correct!!");
                break;

            case 's':
                ageSub.setForeground(new java.awt.Color(204, 0, 0));
                ageSub.setText("empty field or incorrect ");
                break;

            case 'e':
                ageSub.setForeground(new java.awt.Color(204, 0, 0));
                ageSub.setText("empty field");
                break;

            default:
                ageSub.setForeground(new java.awt.Color(0, 201, 0));
                ageSub.setText("standard");
                break;
        }
    }

    private void lastnameTxtKeyReleased(java.awt.event.KeyEvent evt) {
        switch (InputContorollers.checkName(lastnameTxt.getText())) {
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

    private void headCodeTxtKeyReleased(java.awt.event.KeyEvent evt) throws SQLException {
        switch (InputContorollers.checkFamilyOwnerId(headCodeTxt.getText(), codeTxt.getText())) {

            case 'l':
                headCodeSub.setForeground(new java.awt.Color(204, 0, 0));
                headCodeSub.setText("10 digits only");
                break;

            case 's':
                headCodeSub.setForeground(new java.awt.Color(204, 0, 0));
                headCodeSub.setText("only numbers");
                break;

            case 'm':
                headCodeSub.setForeground(new java.awt.Color(204, 0, 0));
                headCodeSub.setText("this id not found");
                break;


            default:
                headCodeSub.setForeground(new java.awt.Color(0, 201, 0));
                headCodeSub.setText("standard");
                break;
        }

        if (headCodeTxt.getText().equals(codeTxt.getText())) {
            addressTxt.setEditable(true);
        } else {
            addressTxt.setEditable(false);
            addressTxt.setText(InputContorollers.getAddress(headCodeTxt.getText()));
        }
    }

    private void codeTxtKeyReleased(java.awt.event.KeyEvent evt) throws SQLException {
        switch (InputContorollers.checkNation(codeTxt.getText())) {

            case 'l':
                codeSub.setForeground(new java.awt.Color(204, 0, 0));
                codeSub.setText("10 digits only");
                break;

            case 's':
                codeSub.setForeground(new java.awt.Color(204, 0, 0));
                codeSub.setText("only number!!");
                break;

            case 'm':
                if(!codeTxt.getText().equals(id)){
                    codeSub.setForeground(new java.awt.Color(204, 0, 0));
                    codeSub.setText("this id number already exist ");
                    break;
                }
                else{
                    codeSub.setForeground(new java.awt.Color(0, 201, 0));
                    codeSub.setText("standard");
                    break;
                }

            default:
                codeSub.setForeground(new java.awt.Color(0, 201, 0));
                codeSub.setText("standard");
                break;


        }
    }

    private void firstnameTxtKeyReleased(java.awt.event.KeyEvent evt) {
        switch (InputContorollers.checkName(firstnameTxt.getText())) {

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

    private void addressTxtKeyReleased(java.awt.event.KeyEvent evt) {
        switch (InputContorollers.checkAddress(addressTxt.getText())) {

            case 'l':
                addressSub.setForeground(new java.awt.Color(204, 0, 0));
                addressSub.setText("non-standard");
                break;

            case 'e':
                addressSub.setForeground(new java.awt.Color(204, 0, 0));
                addressSub.setText("empty field");
                break;

            case 's':
                addressSub.setForeground(new java.awt.Color(204, 0, 0));
                addressSub.setText("more than standard charechter");
                break;

            default:
                addressSub.setForeground(new java.awt.Color(0, 201, 0));
                addressSub.setText("standard");
                break;
        }
    }


    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new MainMenu().setVisible(true);
    }

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, SubmitException {
        String gender = "null";
        String role = "null";
        String job="null";

        job = InputContorollers.getSelectedJob(comboJob.getSelectedIndex());
        if (fatherRadio.isSelected()) {
            role = "father";
        }
        if (motherRadio.isSelected()) {
            role = "mother";
        }
        if (childRadio.isSelected()) {
            role = "child";
        }
        if (maleRadio.isSelected()) {
            gender = "male";
        }
        if (femaleRadio.isSelected()) {
            gender = "female";
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String time = dtf.format(now);
        Employee employee = Employee.getInstance();
        String empId = employee.getEmpId();
        String employeName=employee.getFname()+" "+employee.getLname();

        boolean b = InputContorollers.checkSubmit2
                (firstnameTxt.getText(), lastnameTxt.getText(), codeTxt.getText(), ageTxt.getText(), gender, role, job, headCodeTxt.getText(), incomeTxt.getText(), addressTxt.getText(),rowNumber);
        if(b){
            Person person =
                    new Person
                            (firstnameTxt.getText(), lastnameTxt.getText(), codeTxt.getText(), gender, role, job,
                                    headCodeTxt.getText(), incomeTxt.getText(), addressTxt.getText(), time, employeName, empId, "update", Integer.parseInt(ageTxt.getText()),rowNumber);
            Changes changes = new Changes(employeName,empId,"edit person",codeTxt.getText(),time);
            SavePersonInDB savePersonInDB = new SavePersonInDB(person);
            SaveChangesInDB saveChangesInDB = new SaveChangesInDB(changes);
            savePersonInDB.update();
            saveChangesInDB.saveChange();
            if(headCodeTxt.getText().equals(codeTxt.getText())){
                if(headCodeTxt.getText().equals(headCode)){
                    int income=InputContorollers.getFamilyIncome(headCode);
                    SaveFamilyInDB saveFamilyInDB = new SaveFamilyInDB();
                    saveFamilyInDB.updateIncome(headCode,String.valueOf(income));
                }
            }
            JOptionPane.showMessageDialog(null, "successfully updated");
            dispose();
            new MainMenu().setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "empty field or incorrect information", "Alert", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private javax.swing.JLabel addressSub;
    private javax.swing.JTextArea addressTxt;
    private javax.swing.JLabel ageSub;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton backBTN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton childRadio;
    private javax.swing.JLabel codeSub;
    private javax.swing.JTextField codeTxt;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JComboBox<String> comboJob;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JRadioButton fatherRadio;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel firstnameSub;
    private javax.swing.JTextField firstnameTxt;
    private javax.swing.JLabel headCodeSub;
    private javax.swing.JTextField headCodeTxt;
    private javax.swing.JLabel incomeSub;
    private javax.swing.JTextField incomeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lastnameSub;
    private javax.swing.JTextField lastnameTxt;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JRadioButton motherRadio;
    private javax.swing.JButton searchBTN;
    private javax.swing.JTextField searchTXT;
    private javax.swing.JTable tbl;
    private javax.swing.JButton updateBTN;
    // End of variables declaration
}
