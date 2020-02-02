package View;

import Controller.Employee;
import Controller.InputContorollers;
import Model.Entity.Changes;
import Model.Entity.Company;
import Model.Repsitory.SaveChangesInDB;
import Model.Repsitory.SaveCompanyInDB;
import com.sun.org.apache.bcel.internal.generic.Select;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class EditFactory extends javax.swing.JFrame {
    int rowNumber;
    String id, name;

    public EditFactory() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        searchTXT = new javax.swing.JTextField();
        searchBTN = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        companyID = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        companyMembers = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        companyAddress = new javax.swing.JTextArea();
        membersSub = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        companyIncome = new javax.swing.JTextField();
        IdSub = new javax.swing.JLabel();
        incomeSub = new javax.swing.JLabel();
        addressSub = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ownerSub = new javax.swing.JLabel();
        updateBTN = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        companyOwner = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        companyName = new javax.swing.JTextField();
        NameSub = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        companyDate = new com.toedter.calendar.JDateChooser();
        dateSub = new javax.swing.JLabel();
        deleteBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
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
                new String[]{

                }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    tblMouseClicked(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
        jScrollPane1.setViewportView(tbl);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Search by");

        combo.setBackground(new java.awt.Color(0, 153, 153));
        combo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        combo.setForeground(new java.awt.Color(255, 255, 255));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Name", "Owner name", "ID"}));

        searchTXT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        searchBTN.setBackground(new java.awt.Color(255, 255, 255));
        searchBTN.setIcon(new javax.swing.ImageIcon("src\\view\\icon\\3.png")); // NOI18N
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Factory", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 22), new java.awt.Color(0, 153, 153))); // NOI18N

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

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("members");

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
        jScrollPane3.setViewportView(companyAddress);

        membersSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        membersSub.setForeground(new java.awt.Color(255, 255, 255));
        membersSub.setText(".");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Income");

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Owner Name");

        ownerSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ownerSub.setForeground(new java.awt.Color(255, 255, 255));
        ownerSub.setText(".");

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

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Company ID");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Address");

        companyOwner.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        companyOwner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                companyOwnerKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Establish Date");

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Name");

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

        deleteBTN.setBackground(new java.awt.Color(0, 153, 153));
        deleteBTN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteBTN.setForeground(new java.awt.Color(255, 255, 255));
        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    deleteBTNActionPerformed(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(NameSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(companyName)))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(companyOwner, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(ownerSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(addressSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                                        .addComponent(companyIncome)
                                                        .addComponent(IdSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(companyID)
                                                        .addComponent(membersSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(incomeSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(companyMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(companyDate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(dateSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19)))
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(companyName, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NameSub)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                        .addComponent(companyDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateSub)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(companyOwner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ownerSub)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(companyID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IdSub)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(companyMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(membersSub)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(companyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(incomeSub)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressSub)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        backBTN.setBackground(new java.awt.Color(255, 255, 255));
        backBTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amir\\Documents\\Java\\Amar\\src\\view\\icon\\1.png")); // NOI18N
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(66, 66, 66))
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
                                                                .addContainerGap()
                                                                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(519, 519, 519)))
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(83, 83, 83))
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
                                        .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(searchTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                                .addGap(77, 77, 77)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void showTable() throws SQLException {
        String word = searchTXT.getText();
        String field = null;
        int n = combo.getSelectedIndex();
        switch (n) {
            case 0:
                field = "NAME";
                break;
            case 1:
                field = "OWNERNAME";
                break;
            case 2:
                field = "COMPANYID";
                break;
        }


        ResultSet rs = InputContorollers.search("COMPANY", field, word);
        tbl.setModel(DbUtils.resultSetToTableModel(rs));
    }

    private void tblMouseClicked(java.awt.event.MouseEvent evt) throws SQLException {

        int i = tbl.getSelectedRow();

        companyName.setText(tbl.getValueAt(i, 0).toString());

        String data12 = tbl.getValueAt(i, 1).toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            companyDate.setDate(sdf.parse(data12));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        companyOwner.setText(tbl.getValueAt(i, 2).toString());
        companyID.setText(tbl.getValueAt(i, 3).toString());
        companyMembers.setText(tbl.getValueAt(i, 4).toString());
        companyIncome.setText(tbl.getValueAt(i, 5).toString());
        companyAddress.setText(tbl.getValueAt(i, 6).toString());
        String m = tbl.getValueAt(i, 10).toString();
        rowNumber = Integer.parseInt(m);
        id = InputContorollers.getCompanyId(rowNumber, "COMPANYID");
        name = InputContorollers.getCompanyId(rowNumber, "NAME");
    }

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            showTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void companyNameKeyReleased(java.awt.event.KeyEvent evt) throws SQLException {
        switch (InputContorollers.checkCompanyName(companyName.getText())) {

            case 'm':
                if (!companyName.getText().equals(name)) {
                    NameSub.setForeground(new java.awt.Color(204, 0, 0));
                    NameSub.setText("this name already exist");
                    break;
                } else {
                    NameSub.setForeground(new java.awt.Color(0, 201, 0));
                    NameSub.setText("standard");
                    break;
                }


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
                break;
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
                if (!companyID.getText().equals(id)) {
                    IdSub.setForeground(new java.awt.Color(204, 0, 0));
                    IdSub.setText("this id already exist");
                    break;
                } else {
                    IdSub.setForeground(new java.awt.Color(0, 201, 0));
                    IdSub.setText("standard");
                    break;
                }

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


    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        //after update query
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

        boolean b = InputContorollers.checkCompanySubmit2(companyName.getText(), establishTime, companyOwner.getText(), companyID.getText(), companyMembers.getText(), companyIncome.getText(), companyAddress.getText(), rowNumber);
        if (b) {
            Company company =
                    new Company(companyName.getText(), establishTime, companyOwner.getText(), companyID.getText(), companyMembers.getText(), companyIncome.getText(), companyAddress.getText(), employeName, employee.getEmpId(), time, rowNumber);

            Changes changes =
                    new Changes(employeName, employee.getEmpId(), "update company", companyID.getText(), time);

            SaveCompanyInDB saveCompanyInDB = new SaveCompanyInDB(company);
            saveCompanyInDB.update();

            SaveChangesInDB saveChangesInDB = new SaveChangesInDB(changes);
            saveChangesInDB.saveChange();
            JOptionPane.showMessageDialog(null, "successfully updated");
            dispose();
            new MainMenu().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "empty field or incorrect information", "Alert", JOptionPane.WARNING_MESSAGE);
        }

        System.out.println(rowNumber);
        try {
            showTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {

        //after delete query
        InputContorollers.deleteCompany(rowNumber);
        JOptionPane.showMessageDialog(null, "successfully deleted");
        dispose();
        new MainMenu().setVisible(true);
        try {
            showTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new MainMenu().setVisible(true);
    }

    private javax.swing.JLabel IdSub;
    private javax.swing.JLabel NameSub;
    private javax.swing.JLabel addressSub;
    private javax.swing.JButton backBTN;
    private javax.swing.JButton btn1;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextArea companyAddress;
    private com.toedter.calendar.JDateChooser companyDate;
    private javax.swing.JTextField companyID;
    private javax.swing.JTextField companyIncome;
    private javax.swing.JTextField companyMembers;
    private javax.swing.JTextField companyName;
    private javax.swing.JTextField companyOwner;
    private javax.swing.JLabel dateSub;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JLabel incomeSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel membersSub;
    private javax.swing.JLabel ownerSub;
    private javax.swing.JButton searchBTN;
    private javax.swing.JTextField searchTXT;
    private javax.swing.JTable tbl;
    private javax.swing.JButton updateBTN;
}

