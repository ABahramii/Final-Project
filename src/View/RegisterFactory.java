package View;

import Controller.Employee;
import Controller.InputContorollers;
import Model.Entity.Changes;
import Model.Entity.Company;
import Model.Repsitory.SaveChangesInDB;
import Model.Repsitory.SaveCompanyInDB;


import javax.swing.*;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegisterFactory extends javax.swing.JFrame {

    public RegisterFactory() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        companyID = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        companyMembers = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        companyAddress = new javax.swing.JTextArea();
        membersSub = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        companyIncome = new javax.swing.JTextField();
        IdSub = new javax.swing.JLabel();
        incomeSub = new javax.swing.JLabel();
        addressSub = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ownerSub = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        companyOwner = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        companyName = new javax.swing.JTextField();
        NameSub = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        companyDate = new com.toedter.calendar.JDateChooser();
        dateSub = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Factory", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 22), new java.awt.Color(0, 153, 153))); // NOI18N

        companyID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        companyID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                try {
                    companyIDKeyReleased(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("members");

        companyMembers.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        companyMembers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                companyMembersKeyReleased(evt);
            }
        });

        companyAddress.setColumns(20);
        companyAddress.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        companyAddress.setRows(5);
        companyAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                companyAddressKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(companyAddress);

        membersSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        membersSub.setForeground(new java.awt.Color(255, 255, 255));
        membersSub.setText(".");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Income");

        companyIncome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        companyIncome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                companyIncomeKeyReleased(evt);
            }
        });

        IdSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IdSub.setForeground(new java.awt.Color(255, 255, 255));
        IdSub.setText(".");

        incomeSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        incomeSub.setForeground(new java.awt.Color(255, 255, 255));
        incomeSub.setText(".");

        addressSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressSub.setForeground(new java.awt.Color(255, 255, 255));
        addressSub.setText("ثقصقصثق");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Owner Name");

        ownerSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ownerSub.setForeground(new java.awt.Color(255, 255, 255));
        ownerSub.setText(".");

        btn1.setBackground(new java.awt.Color(0, 153, 153));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Register");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btn1ActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Company ID");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Address");

        companyOwner.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        companyOwner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                companyOwnerKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Establish Date");

        companyName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        companyName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                try {
                    companyNameKeyReleased(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        NameSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameSub.setForeground(new java.awt.Color(255, 255, 255));
        NameSub.setText(".");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        companyDate.setDateFormatString("yyyy-MM-dd");
        companyDate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        companyDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                companyDateKeyReleased(evt);
            }
        });

        dateSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateSub.setForeground(new java.awt.Color(255, 255, 255));
        dateSub.setText(".");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(NameSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(companyName)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(companyOwner, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(ownerSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(addressSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                                        .addComponent(companyIncome)
                                                        .addComponent(IdSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(companyID)
                                                        .addComponent(membersSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(incomeSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(companyMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(companyDate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(dateSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(companyName, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NameSub)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                        .addComponent(companyDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateSub)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(companyOwner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ownerSub)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(companyID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IdSub)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(companyMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(membersSub)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(companyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(incomeSub)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressSub)
                                .addGap(20, 20, 20)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setIcon(new javax.swing.ImageIcon("src\\view\\icon\\1.png")); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(215, 215, 215))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void companyNameKeyReleased(java.awt.event.KeyEvent evt) throws SQLException {
        switch (InputContorollers.checkCompanyName(companyName.getText())) {

            case 'm':
                NameSub.setForeground(new java.awt.Color(204, 0, 0));
                NameSub.setText("this name already exist");
                break;

            case 'l':
                NameSub.setForeground(new java.awt.Color(204, 0, 0));
                NameSub.setText("invalid character ");
                break;

            case 'e':
                NameSub.setForeground(new java.awt.Color(204, 0, 0));
                NameSub.setText("empty");
                break;

            default:
                NameSub.setForeground(new java.awt.Color(0, 201, 0));
                NameSub.setText("standard");
        }
    }

    private void companyDateKeyReleased(java.awt.event.KeyEvent evt) {

    }

    private void companyOwnerKeyReleased(java.awt.event.KeyEvent evt) {

        switch (InputContorollers.checkName(companyOwner.getText())) {

            case 'e':
                ownerSub.setForeground(new java.awt.Color(204, 0, 0));
                ownerSub.setText("empty");
                break;

            case 'l':
                ownerSub.setForeground(new java.awt.Color(204, 0, 0));
                ownerSub.setText("invalid characters");
                break;

            default:
                ownerSub.setForeground(new java.awt.Color(0, 201, 0));
                ownerSub.setText("standard");
                break;

        }
    }

    private void companyIDKeyReleased(java.awt.event.KeyEvent evt) throws SQLException {

        switch (InputContorollers.checkCompanyId(companyID.getText())) {

            case 'm':
                IdSub.setForeground(new java.awt.Color(204, 0, 0));
                IdSub.setText("this id already exist");
                break;

            case 'l':
                IdSub.setForeground(new java.awt.Color(204, 0, 0));
                IdSub.setText("10 digits only");
                break;

            case 's':
                IdSub.setForeground(new java.awt.Color(204, 0, 0));
                IdSub.setText("invalid characters");
                break;

            default:
                IdSub.setForeground(new java.awt.Color(0, 201, 0));
                IdSub.setText("standard");
                break;

        }
    }

    private void companyMembersKeyReleased(java.awt.event.KeyEvent evt) {

        switch (InputContorollers.checkMember(companyMembers.getText())) {

            case 's':
                membersSub.setForeground(new java.awt.Color(204, 0, 0));
                membersSub.setText("invalid characters");
                break;

            case 'e':
                membersSub.setForeground(new java.awt.Color(204, 0, 0));
                membersSub.setText("empty");
                break;

            default:
                membersSub.setForeground(new java.awt.Color(0, 201, 0));
                membersSub.setText("standard");
                break;
        }
    }

    private void companyIncomeKeyReleased(java.awt.event.KeyEvent evt) {
        switch (InputContorollers.checkIncome(companyIncome.getText())) {

            case 's':
                incomeSub.setForeground(new java.awt.Color(204, 0, 0));
                incomeSub.setText("invalid characters");
                break;

            case 'e':
                incomeSub.setForeground(new java.awt.Color(204, 0, 0));
                incomeSub.setText("empty");
                break;

            default:
                incomeSub.setForeground(new java.awt.Color(0, 201, 0));
                incomeSub.setText("standard");

        }
    }

    private void companyAddressKeyReleased(java.awt.event.KeyEvent evt) {

        switch (InputContorollers.checkAddress(companyAddress.getText())) {

            case 's':
                addressSub.setForeground(new java.awt.Color(204, 0, 0));
                addressSub.setText("invalid characters");
                break;

            case 'e':
                addressSub.setForeground(new java.awt.Color(204, 0, 0));
                addressSub.setText("empty field");
                break;

            default:
                addressSub.setForeground(new java.awt.Color(0, 201, 0));
                addressSub.setText("standard");
                break;

        }
    }

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        String establishTime = "null";
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            establishTime = dateFormat.format(companyDate.getDate());
        } catch (Exception e) {

        }
        Employee employee = Employee.getInstance();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String time = dtf.format(now);
        String employeName=employee.getFname()+" "+employee.getLname();
        int rowNumber=InputContorollers.getRowNUmbers("COMPANY");
        try {
            boolean b = InputContorollers.checkCompanySubmit(companyName.getText(), establishTime, companyOwner.getText(), companyID.getText(), companyMembers.getText(), companyIncome.getText(), companyAddress.getText());
            if (b) {
                Company company =
                        new Company(companyName.getText(), establishTime, companyOwner.getText(), companyID.getText(), companyMembers.getText(), companyIncome.getText(), companyAddress.getText(), employeName, employee.getEmpId(), time,rowNumber);

                Changes changes =
                        new Changes(employeName, employee.getEmpId(), "add company", companyID.getText(), time);

                SaveChangesInDB saveChangesInDB = new SaveChangesInDB(changes);
                SaveCompanyInDB saveCompanyInDB = new SaveCompanyInDB(company);
                saveChangesInDB.saveChange();
                saveCompanyInDB.save();
                JOptionPane.showMessageDialog(null, "successfully added");
                dispose();
                new MainMenu().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "empty field or incorrect information", "Alert", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new MainMenu().setVisible(true);
    }

    private javax.swing.JLabel IdSub;
    private javax.swing.JLabel NameSub;
    private javax.swing.JLabel addressSub;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JTextArea companyAddress;
    private com.toedter.calendar.JDateChooser companyDate;
    private javax.swing.JTextField companyID;
    private javax.swing.JTextField companyIncome;
    private javax.swing.JTextField companyMembers;
    private javax.swing.JTextField companyName;
    private javax.swing.JTextField companyOwner;
    private javax.swing.JLabel dateSub;
    private javax.swing.JLabel incomeSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel membersSub;
    private javax.swing.JLabel ownerSub;
}
