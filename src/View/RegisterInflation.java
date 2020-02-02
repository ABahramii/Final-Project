package View;

import Controller.AppControl;
import Controller.EmptyFieldException;
import Controller.InvalidPriceException;
import Controller.LongPriceException;
import Model.Entity.Changes;
import Model.Repsitory.Prices;
import Model.Repsitory.Select;


import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

public class RegisterInflation extends javax.swing.JFrame {

    private Prices price = Prices.getPrices();
    public static String present_year;
    public static String past_year;

    public RegisterInflation() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        yearCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        meatPriceB = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        breadSubB = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        vegetablesSubB = new javax.swing.JLabel();
        dairySubB = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pastYear = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        dairyPriceB = new javax.swing.JTextField();
        meatSubB = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        riceSubB = new javax.swing.JLabel();
        breadPriceB = new javax.swing.JTextField();
        vegetablesPriceB = new javax.swing.JTextField();
        ricePriceB = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        meatPriceA = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        breadSubA = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        vegetablesSubA = new javax.swing.JLabel();
        dairySubA = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        presentYear = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        dairyPriceA = new javax.swing.JTextField();
        meatSubA = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        riceSubA = new javax.swing.JLabel();
        breadPriceA = new javax.swing.JTextField();
        vegetablesPriceA = new javax.swing.JTextField();
        ricePriceA = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        submitYear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        yearCombo.setBackground(new java.awt.Color(0, 153, 153));
        yearCombo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        yearCombo.setForeground(new java.awt.Color(11, 58, 66));
        yearCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Year");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        meatPriceB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        meatPriceB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                meatPriceBKeyReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Rice");

        breadSubB.setBackground(new java.awt.Color(0, 0, 0));
        breadSubB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        breadSubB.setForeground(new java.awt.Color(255, 255, 255));
        breadSubB.setText(".");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Bread");

        vegetablesSubB.setBackground(new java.awt.Color(0, 0, 0));
        vegetablesSubB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vegetablesSubB.setForeground(new java.awt.Color(255, 255, 255));
        vegetablesSubB.setText(".");

        dairySubB.setBackground(new java.awt.Color(0, 0, 0));
        dairySubB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dairySubB.setForeground(new java.awt.Color(255, 255, 255));
        dairySubB.setText(".");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Vegetables");

        pastYear.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        pastYear.setForeground(new java.awt.Color(255, 255, 255));
        pastYear.setText("2010");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Dairy");

        dairyPriceB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dairyPriceB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dairyPriceBKeyReleased(evt);
            }
        });

        meatSubB.setBackground(new java.awt.Color(0, 0, 0));
        meatSubB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        meatSubB.setForeground(new java.awt.Color(255, 255, 255));
        meatSubB.setText(".");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Meat");

        riceSubB.setBackground(new java.awt.Color(0, 0, 0));
        riceSubB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        riceSubB.setForeground(new java.awt.Color(255, 255, 255));
        riceSubB.setText(".");

        breadPriceB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        breadPriceB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                breadPriceBKeyReleased(evt);
            }
        });

        vegetablesPriceB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        vegetablesPriceB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vegetablesPriceBKeyReleased(evt);
            }
        });

        ricePriceB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ricePriceB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ricePriceBKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(vegetablesSubB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(vegetablesPriceB)
                                                                        .addComponent(dairySubB, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(22, 22, 22)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(meatSubB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(meatPriceB)
                                                                        .addComponent(riceSubB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(dairyPriceB)
                                                                        .addComponent(ricePriceB)
                                                                        .addComponent(breadSubB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(breadPriceB, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(172, 172, 172)
                                                .addComponent(pastYear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pastYear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(breadPriceB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(breadSubB)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(ricePriceB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(riceSubB)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(meatPriceB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(meatSubB)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dairyPriceB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dairySubB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vegetablesPriceB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vegetablesSubB)
                                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        meatPriceA.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        meatPriceA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                meatPriceAKeyReleased(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Rice");

        breadSubA.setBackground(new java.awt.Color(0, 0, 0));
        breadSubA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        breadSubA.setForeground(new java.awt.Color(255, 255, 255));
        breadSubA.setText(".");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Bread");

        vegetablesSubA.setBackground(new java.awt.Color(0, 0, 0));
        vegetablesSubA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vegetablesSubA.setForeground(new java.awt.Color(255, 255, 255));
        vegetablesSubA.setText(".");

        dairySubA.setBackground(new java.awt.Color(0, 0, 0));
        dairySubA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dairySubA.setForeground(new java.awt.Color(255, 255, 255));
        dairySubA.setText(".");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Vegetables");

        presentYear.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        presentYear.setForeground(new java.awt.Color(255, 255, 255));
        presentYear.setText("2016");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("Dairy");

        dairyPriceA.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dairyPriceA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dairyPriceAKeyReleased(evt);
            }
        });

        meatSubA.setBackground(new java.awt.Color(0, 0, 0));
        meatSubA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        meatSubA.setForeground(new java.awt.Color(255, 255, 255));
        meatSubA.setText(".");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Meat");

        riceSubA.setBackground(new java.awt.Color(0, 0, 0));
        riceSubA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        riceSubA.setForeground(new java.awt.Color(255, 255, 255));
        riceSubA.setText(".");

        breadPriceA.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        breadPriceA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                breadPriceAKeyReleased(evt);
            }
        });

        vegetablesPriceA.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        vegetablesPriceA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vegetablesPriceAKeyReleased(evt);
            }
        });

        ricePriceA.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ricePriceA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ricePriceAKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(vegetablesSubA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(vegetablesPriceA)
                                                                        .addComponent(dairySubA, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(22, 22, 22)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(meatSubA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(meatPriceA)
                                                                        .addComponent(riceSubA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(dairyPriceA)
                                                                        .addComponent(ricePriceA)
                                                                        .addComponent(breadSubA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(breadPriceA, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(180, 180, 180)
                                                .addComponent(presentYear, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(presentYear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(breadPriceA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(breadSubA)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ricePriceA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(riceSubA)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(meatPriceA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(meatSubA)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dairyPriceA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dairySubA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vegetablesPriceA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vegetablesSubA)
                                .addContainerGap())
        );

        btn1.setBackground(new java.awt.Color(0, 153, 153));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Submit");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setIcon(new javax.swing.ImageIcon("src\\view\\icon\\1.png")); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        submitYear.setBackground(new java.awt.Color(255, 255, 255));
        submitYear.setIcon(new javax.swing.ImageIcon("src\\view\\icon\\4.png")); // NOI18N
        submitYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitYearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Register Prices");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(330, 330, 330))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(submitYear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(228, 228, 228)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(submitYear, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(yearCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
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

    private void submitYearActionPerformed(java.awt.event.ActionEvent evt) {
        this.present_year = (String) yearCombo.getSelectedItem();
        int past = Integer.parseInt(present_year) - 1;
        this.past_year = String.valueOf(past);
        try {
            if (Select.checkPresentYear(present_year))
                JOptionPane.showMessageDialog(null, "Price of this year exist.\nPlease go to edit for change","Alert",JOptionPane.WARNING_MESSAGE);
            else {
                pastYear.setForeground(new java.awt.Color(255, 187, 1));
                pastYear.setText(past_year);
                presentYear.setForeground(new java.awt.Color(255, 187, 1));
                presentYear.setText(present_year);

                if (Select.checkPastYear(past_year)) {
                    breadPriceB.setText(price.getBread());
                    breadPriceB.setEditable(false);
                    ricePriceB.setText(price.getRice());
                    ricePriceB.setEditable(false);
                    meatPriceB.setText(price.getMeat());
                    meatPriceB.setEditable(false);
                    dairyPriceB.setText(price.getDairy());
                    dairyPriceB.setEditable(false);
                    vegetablesPriceB.setText(price.getVegetables());
                    vegetablesPriceB.setEditable(false);
                }
                else {
                    breadPriceB.setText("");
                    breadPriceB.setEditable(true);
                    ricePriceB.setText("");
                    ricePriceB.setEditable(true);
                    meatPriceB.setText("");
                    meatPriceB.setEditable(true);
                    dairyPriceB.setText("");
                    dairyPriceB.setEditable(true);
                    vegetablesPriceB.setText("");
                    vegetablesPriceB.setEditable(true);
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //past

    private void breadPriceBKeyReleased(java.awt.event.KeyEvent evt) {
        switch (AppControl.checkPrice(breadPriceB.getText())) {
            case 's':
                breadSubB.setForeground(new java.awt.Color(204, 0, 0));
                breadSubB.setText("Price is invalid");
                break;

            case 'e':
                breadSubB.setForeground(new java.awt.Color(204, 0, 0));
                breadSubB.setText("Field may not be empty");
                break;

            case 'l':
                breadSubB.setForeground(new java.awt.Color(204, 0, 0));
                breadSubB.setText("Too long");
                break;

            default:
                breadSubB.setForeground(new java.awt.Color(255, 255, 255));
                breadSubB.setText(".");
                break;
        }
    }

    private void ricePriceBKeyReleased(java.awt.event.KeyEvent evt) {
        switch (AppControl.checkPrice(ricePriceB.getText())) {
            case 's':
                riceSubB.setForeground(new java.awt.Color(204, 0, 0));
                riceSubB.setText("Price is invalid");
                break;

            case 'e':
                riceSubB.setForeground(new java.awt.Color(204, 0, 0));
                riceSubB.setText("Field may not be empty");
                break;

            case 'l':
                riceSubB.setForeground(new java.awt.Color(204, 0, 0));
                riceSubB.setText("Too long");
                break;

            default:
                riceSubB.setForeground(new java.awt.Color(255, 255, 255));
                riceSubB.setText(".");
                break;
        }
    }

    private void meatPriceBKeyReleased(java.awt.event.KeyEvent evt) {
        switch (AppControl.checkPrice(meatPriceB.getText())) {
            case 's':
                meatSubB.setForeground(new java.awt.Color(204, 0, 0));
                meatSubB.setText("Price is invalid");
                break;

            case 'e':
                meatSubB.setForeground(new java.awt.Color(204, 0, 0));
                meatSubB.setText("Field may not be empty");
                break;

            case 'l':
                meatSubB.setForeground(new java.awt.Color(204, 0, 0));
                meatSubB.setText("Too long");
                break;

            default:
                meatSubB.setForeground(new java.awt.Color(255, 255, 255));
                meatSubB.setText(".");
                break;
        }
    }

    private void dairyPriceBKeyReleased(java.awt.event.KeyEvent evt) {
        switch (AppControl.checkPrice(dairyPriceB.getText())) {
            case 's':
                dairySubB.setForeground(new java.awt.Color(204, 0, 0));
                dairySubB.setText("Price is invalid");
                break;

            case 'e':
                dairySubB.setForeground(new java.awt.Color(204, 0, 0));
                dairySubB.setText("Field may not be empty");
                break;

            case 'l':
                dairySubB.setForeground(new java.awt.Color(204, 0, 0));
                dairySubB.setText("Too long");
                break;

            default:
                dairySubB.setForeground(new java.awt.Color(255, 255, 255));
                dairySubB.setText(".");
                break;
        }
    }

    private void vegetablesPriceBKeyReleased(java.awt.event.KeyEvent evt) {
        switch (AppControl.checkPrice(vegetablesPriceB.getText())) {
            case 's':
                vegetablesSubB.setForeground(new java.awt.Color(204, 0, 0));
                vegetablesSubB.setText("Price is invalid");
                break;

            case 'e':
                vegetablesSubB.setForeground(new java.awt.Color(204, 0, 0));
                vegetablesSubB.setText("Field may not be empty");
                break;

            case 'l':
                vegetablesSubB.setForeground(new java.awt.Color(204, 0, 0));
                vegetablesSubB.setText("Too long");
                break;

            default:
                vegetablesSubB.setForeground(new java.awt.Color(255, 255, 255));
                vegetablesSubB.setText(".");
                break;
        }


    }

    //present

    private void breadPriceAKeyReleased(java.awt.event.KeyEvent evt) {
        switch (AppControl.checkPrice(breadPriceA.getText())) {
            case 's':
                breadSubA.setForeground(new java.awt.Color(204, 0, 0));
                breadSubA.setText("Price is invalid");
                break;

            case 'e':
                breadSubA.setForeground(new java.awt.Color(204, 0, 0));
                breadSubA.setText("Field may not be empty");
                break;

            case 'l':
                breadSubA.setForeground(new java.awt.Color(204, 0, 0));
                breadSubA.setText("Too long");
                break;

            default:
                breadSubA.setForeground(new java.awt.Color(255, 255, 255));
                breadSubA.setText(".");
                break;
        }
    }

    private void ricePriceAKeyReleased(java.awt.event.KeyEvent evt) {
        switch (AppControl.checkPrice(ricePriceA.getText())) {
            case 's':
                riceSubA.setForeground(new java.awt.Color(204, 0, 0));
                riceSubA.setText("Price is invalid");
                break;

            case 'e':
                riceSubA.setForeground(new java.awt.Color(204, 0, 0));
                riceSubA.setText("Field may not be empty");
                break;

            case 'l':
                riceSubA.setForeground(new java.awt.Color(204, 0, 0));
                riceSubA.setText("Too long");
                break;

            default:
                riceSubA.setForeground(new java.awt.Color(255, 255, 255));
                riceSubA.setText(".");
                break;
        }
    }

    private void meatPriceAKeyReleased(java.awt.event.KeyEvent evt) {
        switch (AppControl.checkPrice(meatPriceA.getText())) {
            case 's':
                meatSubA.setForeground(new java.awt.Color(204, 0, 0));
                meatSubA.setText("Price is invalid");
                break;

            case 'e':
                meatSubA.setForeground(new java.awt.Color(204, 0, 0));
                meatSubA.setText("Field may not be empty");
                break;

            case 'l':
                meatSubA.setForeground(new java.awt.Color(204, 0, 0));
                meatSubA.setText("Too long");
                break;

            default:
                meatSubA.setForeground(new java.awt.Color(255, 255, 255));
                meatSubA.setText(".");
                break;
        }
    }

    private void dairyPriceAKeyReleased(java.awt.event.KeyEvent evt) {
        switch (AppControl.checkPrice(dairyPriceA.getText())) {
            case 's':
                dairySubA.setForeground(new java.awt.Color(204, 0, 0));
                dairySubA.setText("Price is invalid");
                break;

            case 'e':
                dairySubA.setForeground(new java.awt.Color(204, 0, 0));
                dairySubA.setText("Field may not be empty");
                break;

            case 'l':
                dairySubA.setForeground(new java.awt.Color(204, 0, 0));
                dairySubA.setText("Too long");
                break;

            default:
                dairySubA.setForeground(new java.awt.Color(255, 255, 255));
                dairySubA.setText(".");
                break;
        }
    }

    private void vegetablesPriceAKeyReleased(java.awt.event.KeyEvent evt) {
        switch (AppControl.checkPrice(vegetablesPriceA.getText())) {
            case 's':
                vegetablesSubA.setForeground(new java.awt.Color(204, 0, 0));
                vegetablesSubA.setText("Price is invalid");
                break;

            case 'e':
                vegetablesSubA.setForeground(new java.awt.Color(204, 0, 0));
                vegetablesSubA.setText("Field may not be empty");
                break;

            case 'l':
                vegetablesSubA.setForeground(new java.awt.Color(204, 0, 0));
                vegetablesSubA.setText("Too long");
                break;

            default:
                vegetablesSubA.setForeground(new java.awt.Color(255, 255, 255));
                vegetablesSubA.setText(".");
                break;
        }
    }

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {
        //Submit Prices
        if (!price.isExist()) {
            try {
                boolean result1 = AppControl.submitPricesB(past_year, breadPriceB.getText(), ricePriceB.getText(), meatPriceB.getText(), dairyPriceB.getText(), vegetablesPriceB.getText());
                boolean result2 = AppControl.submitPricesA(present_year, breadPriceA.getText(), ricePriceA.getText(), meatPriceA.getText(), dairyPriceA.getText(), vegetablesPriceA.getText());
                if (result1 || result2){
                    JOptionPane.showMessageDialog(null, "inflation successfully calculated");
                    //MainMenu
                }
                else
                    JOptionPane.showMessageDialog(null, "Error","Alert",JOptionPane.WARNING_MESSAGE);

            } catch (InvalidPriceException e) {
                JOptionPane.showMessageDialog(null, "Prices not standard","Alert",JOptionPane.WARNING_MESSAGE);
            } catch (EmptyFieldException e) {
                JOptionPane.showMessageDialog(null, "Field may not be empty","Alert",JOptionPane.WARNING_MESSAGE);
            } catch (LongPriceException e) {
                JOptionPane.showMessageDialog(null, "Too long field","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
        else {
            try {
                boolean result = AppControl.submitPricesA(present_year, breadPriceA.getText(), ricePriceA.getText(), meatPriceA.getText(), dairyPriceA.getText(), vegetablesPriceA.getText());
                if (result) {
                    JOptionPane.showMessageDialog(null, "inflation successfully calculated");
                    dispose();
                    new MainMenu().setVisible(true);
                }
                else
                    JOptionPane.showMessageDialog(null, "Error","Alert",JOptionPane.WARNING_MESSAGE);

            } catch (InvalidPriceException e) {
                JOptionPane.showMessageDialog(null, "Prices not standard","Alert",JOptionPane.WARNING_MESSAGE);
            } catch (EmptyFieldException e) {
                JOptionPane.showMessageDialog(null, "Field may not be empty","Alert",JOptionPane.WARNING_MESSAGE);
            } catch (LongPriceException e) {
                JOptionPane.showMessageDialog(null, "Too long field","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }

    }

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {
        //Back to previous page

//        LoginFrame loginFrame = new LoginFrame();
//        loginFrame.setVisible(true);

        WindowEvent closeMain = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeMain);
    }

    private javax.swing.JTextField breadPriceA;
    private javax.swing.JTextField breadPriceB;
    private javax.swing.JLabel breadSubA;
    private javax.swing.JLabel breadSubB;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JTextField dairyPriceA;
    private javax.swing.JTextField dairyPriceB;
    private javax.swing.JLabel dairySubA;
    private javax.swing.JLabel dairySubB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField meatPriceA;
    private javax.swing.JTextField meatPriceB;
    private javax.swing.JLabel meatSubA;
    private javax.swing.JLabel meatSubB;
    private javax.swing.JLabel pastYear;
    private javax.swing.JLabel presentYear;
    private javax.swing.JTextField ricePriceA;
    private javax.swing.JTextField ricePriceB;
    private javax.swing.JLabel riceSubA;
    private javax.swing.JLabel riceSubB;
    private javax.swing.JButton submitYear;
    private javax.swing.JTextField vegetablesPriceA;
    private javax.swing.JTextField vegetablesPriceB;
    private javax.swing.JLabel vegetablesSubA;
    private javax.swing.JLabel vegetablesSubB;
    private javax.swing.JComboBox<String> yearCombo;
}
