/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Dell
 */
 class calculator extends JFrame implements ActionListener {

    JButton jButton1;
    JButton jButton10;
    JButton jButton11;
    JButton jButton12;
    JButton jButton13;
    JButton jButton14;
    JButton jButton15;
    JButton jButton16;
    JButton jButton17;
    JButton jButton18;
    JButton jButton2;
    JButton jButton20;
    JButton jButton3;
    JButton jButton4;
    JButton jButton5;
    JButton jButton6;
    JButton jButton7;
    JButton jButton8;
    JButton jButton9;
    JTextField jTextField1;
    String s0, s1, s2;

    public calculator() {
        initComponents();
        s0 = s1 = s2 = "";
    }

    private void initComponents() {

        jTextField1 = new JTextField(16);
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jButton10 = new JButton();
        jButton11 = new JButton();
        jButton12 = new JButton();
        jButton13 = new JButton();
        jButton14 = new JButton();
        jButton15 = new JButton();
        jButton16 = new JButton();
        jButton17 = new JButton();
        jButton18 = new JButton();
        jButton20 = new JButton();
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);
        jButton5.addActionListener(this);
        jButton6.addActionListener(this);
        jButton7.addActionListener(this);
        jButton8.addActionListener(this);
        jButton9.addActionListener(this);
        jButton10.addActionListener(this);
        jButton11.addActionListener(this);
        jButton12.addActionListener(this);
        jButton13.addActionListener(this);
        jButton14.addActionListener(this);
        jButton15.addActionListener(this);
        jButton16.addActionListener(this);
        jButton17.addActionListener(this);
        jButton18.addActionListener(this);
        jButton20.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jTextField1.setBackground(new java.awt.Color(178, 185, 183));
        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jTextField1.setEditable(false);

        jButton1.setBackground(new java.awt.Color(30, 144, 255));
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton1.setText("AC");

        jButton2.setBackground(new java.awt.Color(30, 144, 255));
        jButton2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton2.setText("←");

        jButton3.setBackground(new java.awt.Color(30, 144, 255));
        jButton3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton3.setText("+/-");
        jButton3.setEnabled(false);

        jButton4.setBackground(new java.awt.Color(255, 143, 31));
        jButton4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton4.setText("/");

        jButton5.setBackground(new java.awt.Color(33, 124, 126));
        jButton5.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton5.setText("7");

        jButton6.setBackground(new java.awt.Color(33, 124, 126));
        jButton6.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton6.setText("9");

        jButton7.setBackground(new java.awt.Color(33, 124, 126));
        jButton7.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton7.setText("8");

        jButton8.setBackground(new java.awt.Color(255, 143, 31));
        jButton8.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton8.setText("*");

        jButton9.setBackground(new java.awt.Color(33, 124, 126));
        jButton9.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton9.setText("4");

        jButton10.setBackground(new java.awt.Color(255, 143, 31));
        jButton10.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton10.setText("-");

        jButton11.setBackground(new java.awt.Color(33, 124, 126));
        jButton11.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton11.setText("5");

        jButton12.setBackground(new java.awt.Color(33, 124, 126));
        jButton12.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton12.setText("6");

        jButton13.setBackground(new java.awt.Color(33, 124, 126));
        jButton13.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton13.setText("2");

        jButton14.setBackground(new java.awt.Color(33, 124, 126));
        jButton14.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton14.setText("3");

        jButton15.setBackground(new java.awt.Color(255, 143, 31));
        jButton15.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton15.setText("+");

        jButton16.setBackground(new java.awt.Color(33, 124, 126));
        jButton16.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton16.setText("1");

        jButton17.setBackground(new java.awt.Color(33, 124, 126));
        jButton17.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton17.setText(".");

        jButton18.setBackground(new java.awt.Color(33, 124, 126));
        jButton18.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton18.setText("0");

        jButton20.setBackground(new java.awt.Color(255, 143, 31));
        jButton20.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jButton20.setText("=");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField1)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        // if the value is a number
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9')) {
            // if operand is present then add to second no
            if (!s1.equals("")) {
                s2 = s2 + s;
            } else {
                s0 = s0 + s;
            }

            // set the value of text
            jTextField1.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == '.') {
            if (s1 != "") {
                if (!s2.contains(".")) {
                    s2 += s;
                }
            } else {
                if (!s0.contains(".")) {
                    s0 += s;
                }
            }
            jTextField1.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == 'A') {
            // clear the one letter
            s0 = s1 = s2 = "";

            // set the value of text
            jTextField1.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == '←') {

            char x = ' ';
            if (s1 != "") {
                if (s2 != "") {
                    x = s2.charAt(s2.length() - 1);
                    s2 = s2.subSequence(0, s2.length() - 1).toString();
                } else {
                    s1 = "";
                }

            } else {
                if (s0 != "") {
                    if (s0.length() > 0) {
                        x = s0.charAt(s0.length() - 1);
                        s0 = s0.subSequence(0, s0.length() - 1).toString();
                    } else {
                        s0 = s1 = s2 = "";
                        JOptionPane.showMessageDialog(this, "Empty !!!");
                    }
                }
            }

            if (x == '+' || x == '-' || x == '*' || x == '/') {
                s1 = "";
            }

            jTextField1.setText(s0 + s1 + s2);

        } else if (s.charAt(0) == '=') {

            try {
                double te;

                // store the value in 1st
                if (s1.equals("+")) {
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                } else if (s1.equals("-")) {
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                } else if (s1.equals("/")) {
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                } else {
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                }

                // set the value of text
                int x = (int) te;
                if ((te / x) > 1) {
                    s0 = Double.toString(te);
                } else {
                    s0 = Integer.toString(x);
                }

                jTextField1.setText(s0);
                s1 = s2 = "";
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } else {
            // if there was no operand
            if (s1.equals("") || s2.equals("")) {
                s1 = s;
            } // else evaluate
            else {
                double te;

                // store the value in 1st
                if (s1.equals("+")) {
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                } else if (s1.equals("-")) {
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                } else if (s1.equals("/")) {
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                } else {
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                }

                // convert it to string
                int x = (int) te;
                if ((te / x) > 1) {
                    s0 = Double.toString(te);
                } else {
                    s0 = Integer.toString(x);
                }

                // place the operator
                s1 = s;

                // make the operand blank
                s2 = "";
            }

            // set the value of text
            jTextField1.setText(s0 + s1 + s2);
        }
    }

}


public class MyCalculator {
    public static void main(String args[]) {
        new calculator().setVisible(true);
    }
}