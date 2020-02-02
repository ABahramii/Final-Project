package View;

import Controller.AppControl;
import Controller.EmptyFieldException;
import Controller.LongPriceException;
import Controller.RegisterException;
import View.MainMenu;
import Controller.AppControl;
import Controller.EmptyFieldException;
import Controller.LongPriceException;
import Controller.RegisterException;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RegisterDocument extends javax.swing.JFrame {

    private JFileChooser chooser = new JFileChooser();
    public static String path;

    public RegisterDocument() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backBTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ownerName3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        nameSub = new javax.swing.JLabel();
        ownerID = new javax.swing.JTextField();
        ownerName = new javax.swing.JLabel();
        registerBTN = new javax.swing.JButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        chooseBTN = new javax.swing.JButton();
        ownerName2 = new javax.swing.JLabel();
        ownerName1 = new javax.swing.JLabel();
        idSub = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        backBTN.setBackground(new java.awt.Color(255, 255, 255));
        backBTN.setIcon(new javax.swing.ImageIcon("src\\view\\icon\\1.png")); // NOI18N
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Documents", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 22), new java.awt.Color(0, 153, 153))); // NOI18N

        ownerName3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ownerName3.setText("Owner Name");

        name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });

        nameSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameSub.setForeground(new java.awt.Color(255, 255, 255));
        nameSub.setText(".");

        ownerID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ownerID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ownerIDKeyReleased(evt);
            }
        });

        ownerName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ownerName.setText("Owner ID");

        registerBTN.setBackground(new java.awt.Color(0, 153, 153));
        registerBTN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registerBTN.setForeground(new java.awt.Color(255, 255, 255));
        registerBTN.setText("Register");
        registerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBTNActionPerformed(evt);
            }
        });

        jDateChooser.setDateFormatString("yyyy-MM-dd");
        jDateChooser.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        chooseBTN.setBackground(new java.awt.Color(255, 187, 1));
        chooseBTN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        chooseBTN.setText("Choose");
        chooseBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseBTNActionPerformed(evt);
            }
        });

        ownerName2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ownerName2.setText("Register Date");

        ownerName1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ownerName1.setText("Document Picture");

        idSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idSub.setForeground(new java.awt.Color(255, 255, 255));
        idSub.setText(".");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ownerName2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(ownerName3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(nameSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ownerID)
                                                .addComponent(ownerName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(name)
                                                .addComponent(idSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(ownerName1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                                        .addComponent(chooseBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(registerBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(ownerName3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameSub)
                                .addGap(37, 37, 37)
                                .addComponent(ownerName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ownerID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idSub)
                                .addGap(26, 26, 26)
                                .addComponent(ownerName2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ownerName1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chooseBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addComponent(registerBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(302, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(33, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
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
        setLocationRelativeTo(null);
    }

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {
        switch (AppControl.checkName(name.getText())){
            case 'l':
                nameSub.setForeground(new java.awt.Color(204, 0, 0));
                nameSub.setText("first name must include only letters");
                break;

            case 'e':
                nameSub.setForeground(new java.awt.Color(204, 0, 0));
                nameSub.setText("empty field");
                break;

            case 'o':
                nameSub.setForeground(new java.awt.Color(204, 0, 0));
                nameSub.setText("more than 40 characters");
                break;

            default:
                nameSub.setForeground(new java.awt.Color(0, 201, 0));
                nameSub.setText("standard");
                break;
        }
    }

    private void ownerIDKeyReleased(java.awt.event.KeyEvent evt) {
        switch (AppControl.checkID(ownerID.getText())){
            case 'l':
                idSub.setForeground(new java.awt.Color(204, 0, 0));
                idSub.setText("nation code must be 10 number");
                break;

            case 's':
                idSub.setForeground(new java.awt.Color(204, 0, 0));
                idSub.setText("not standard");
                break;

            default:
                idSub.setForeground(new java.awt.Color(0, 201, 0));
                idSub.setText("standard");
                break;
        }
    }

    private void chooseBTNActionPerformed(java.awt.event.ActionEvent evt) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Pictures", "png", "jpg");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filePath = f.getAbsolutePath();
        path = filePath;

    }

    private void registerBTNActionPerformed(java.awt.event.ActionEvent evt) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        df.format(jDateChooser.getDate());
        String date = df.format(jDateChooser.getDate());

        try {
            boolean result = AppControl.checkRegister(name.getText(), ownerID.getText(), date, path);
            if (result) {
                JOptionPane.showMessageDialog(null, "Document successfully uploaded");
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);

                WindowEvent closeMain = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
                Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeMain);
            }
        } catch (EmptyFieldException e) {
            JOptionPane.showMessageDialog(null, "Field may not be empty","Alert",JOptionPane.WARNING_MESSAGE);
        } catch (LongPriceException e) {
            JOptionPane.showMessageDialog(null, "Too long field","Alert",JOptionPane.WARNING_MESSAGE);
        } catch (RegisterException e) {
            JOptionPane.showMessageDialog(null, "Register Error","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);

        WindowEvent closeMain = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeMain);
    }

    private javax.swing.JButton backBTN;
    private javax.swing.JButton chooseBTN;
    private javax.swing.JLabel idSub;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameSub;
    private javax.swing.JTextField ownerID;
    private javax.swing.JLabel ownerName;
    private javax.swing.JLabel ownerName1;
    private javax.swing.JLabel ownerName2;
    private javax.swing.JLabel ownerName3;
    private javax.swing.JButton registerBTN;
}
