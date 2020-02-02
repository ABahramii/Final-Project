package View;

import java.awt.*;
import java.awt.event.WindowEvent;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backBTN = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        registerPeople = new javax.swing.JMenuItem();
        editPeople = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        registerFactory = new javax.swing.JMenuItem();
        editFactory = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        registerInflation = new javax.swing.JMenuItem();
        editInflation = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        registerUnemployment = new javax.swing.JMenuItem();
        editUnemployment = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        registerDocuments = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(11, 58, 66));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 187, 1));
        jLabel1.setText("Statistical Centre of Iran");

        jLabel2.setIcon(new javax.swing.ImageIcon("src\\view\\icon\\logo.png")); // NOI18N

        backBTN.setBackground(new java.awt.Color(11, 58, 66));
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(194, 194, 194)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(349, 349, 349)
                                                .addComponent(jLabel2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("People");

        registerPeople.setText("Register");
        registerPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPeopleActionPerformed(evt);
            }
        });
        jMenu1.add(registerPeople);

        editPeople.setText("Edit");
        editPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPeopleActionPerformed(evt);
            }
        });
        jMenu1.add(editPeople);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Factory");

        registerFactory.setText("Register");
        registerFactory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerFactoryActionPerformed(evt);
            }
        });
        jMenu2.add(registerFactory);

        editFactory.setText("Edit");
        editFactory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFactoryActionPerformed(evt);
            }
        });
        jMenu2.add(editFactory);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Inflation");

        registerInflation.setText("Register");
        registerInflation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerInflationActionPerformed(evt);
            }
        });
        jMenu3.add(registerInflation);

        editInflation.setText("Edit");
        editInflation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editInflationActionPerformed(evt);
            }
        });
        jMenu3.add(editInflation);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Unemployment");

        registerUnemployment.setText("Register");
        registerUnemployment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUnemploymentActionPerformed(evt);
            }
        });
        jMenu4.add(registerUnemployment);

        editUnemployment.setText("Edit");
        editUnemployment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUnemploymentActionPerformed(evt);
            }
        });
        jMenu4.add(editUnemployment);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Documents");

        registerDocuments.setText("Register");
        registerDocuments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerDocumentsActionPerformed(evt);
            }
        });
        jMenu5.add(registerDocuments);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

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
        setLocationRelativeTo(null);
    }

    private void registerPeopleActionPerformed(java.awt.event.ActionEvent evt) {
        RegisterPeopleFrame rp = new RegisterPeopleFrame();
        rp.setVisible(true);

        WindowEvent closeMain = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeMain);
    }

    private void editPeopleActionPerformed(java.awt.event.ActionEvent evt) {
        EditPeople ep = new EditPeople();
        ep.setVisible(true);

        WindowEvent closeMain = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeMain);
    }

    private void registerFactoryActionPerformed(java.awt.event.ActionEvent evt) {
        RegisterFactory rf = new RegisterFactory();
        rf.setVisible(true);

        WindowEvent closeMain = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeMain);
    }

    private void editFactoryActionPerformed(java.awt.event.ActionEvent evt) {
        EditFactory ef = new EditFactory();
        ef.setVisible(true);

        WindowEvent closeMain = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeMain);
    }

    private void registerInflationActionPerformed(java.awt.event.ActionEvent evt) {
        RegisterInflation ri = new RegisterInflation();
        ri.setVisible(true);

        WindowEvent closeMain = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeMain);
    }

    private void editInflationActionPerformed(java.awt.event.ActionEvent evt) {
        EditInflation ei = new EditInflation();
        ei.setVisible(true);

        WindowEvent closeMain = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeMain);
    }

    private void registerUnemploymentActionPerformed(java.awt.event.ActionEvent evt) {
        RegisterUnemployment ru = new RegisterUnemployment();
        ru.setVisible(true);

        WindowEvent closeMain = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeMain);
    }

    private void editUnemploymentActionPerformed(java.awt.event.ActionEvent evt) {
        EditUnemployment eu = new EditUnemployment();
        eu.setVisible(true);

        WindowEvent closeMain = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeMain);
    }

    private void registerDocumentsActionPerformed(java.awt.event.ActionEvent evt) {
        RegisterDocument rd = new RegisterDocument();
        rd.setVisible(true);

        WindowEvent closeMain = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeMain);
    }

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);

        WindowEvent closeMain = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeMain);
    }

    private javax.swing.JMenuItem editPeople;
    private javax.swing.JButton backBTN;
    private javax.swing.JMenuItem editFactory;
    private javax.swing.JMenuItem editInflation;
    private javax.swing.JMenuItem editUnemployment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem registerDocuments;
    private javax.swing.JMenuItem registerFactory;
    private javax.swing.JMenuItem registerInflation;
    private javax.swing.JMenuItem registerPeople;
    private javax.swing.JMenuItem registerUnemployment;
}
