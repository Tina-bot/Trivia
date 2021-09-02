package IGU;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class Vista extends javax.swing.JFrame {

    String[] questions = {"What's the biggest animal in the world?",
        "What is the capital of Iceland?",
        "Who painted the Mona Lisa?",
        "How many elements are there in the periodic table?",
        " 1 + 1"};
    String[][] options = {{"African Elephant", "Brown Bear", "Blue whale", " Giraffe", " "},
        {"Luanda ", "New Delhi ", "Netherlands ", "Seoul ", " "},
        {"Miguel Ángel", "Rembrandt", "Leonardo Da Vinci", "Vincent van Gogh", " "},
        {"124 elements", "127 elements", "118 elements", "117 elements", " "},
        {" 22", " 1", " 2", "21 ", " "}};

    int index = 0, correct = 0;
    ButtonGroup bg = new ButtonGroup();

    public Vista() {
        initComponents();
        bg.add(RadioBttnA);
        bg.add(RadioBttnB);
        bg.add(RadioBttnC);
        bg.add(RadioBttnD);
        bttnNextActionPerformed(null);
    }

    public void getSelectedOption(JRadioButton rbtn) {
        System.out.println(rbtn.getText());
        System.out.println(options[index][2]);

        if (rbtn.getText().equals(options[index][2])) {

            correct++;

        }

        index++;
        enableButtons(false);

    }

    public void enableButtons(boolean yesOrNo) {

        RadioBttnA.setEnabled(yesOrNo);
        RadioBttnB.setEnabled(yesOrNo);
        RadioBttnC.setEnabled(yesOrNo);
        RadioBttnD.setEnabled(yesOrNo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioBttnD = new javax.swing.JRadioButton();
        jPanel = new javax.swing.JPanel();
        Panel = new javax.swing.JLabel();
        RadioBttnB = new javax.swing.JRadioButton();
        RadioBttnA = new javax.swing.JRadioButton();
        RadioBttnC = new javax.swing.JRadioButton();
        bttnNext = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RadioBttnD.setBackground(new java.awt.Color(153, 153, 255));
        RadioBttnD.setForeground(new java.awt.Color(51, 255, 255));
        RadioBttnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBttnDActionPerformed(evt);
            }
        });
        getContentPane().add(RadioBttnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 140, 40));

        jPanel.setBackground(new java.awt.Color(204, 204, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "♥            Panel            ♥", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 12), new java.awt.Color(102, 51, 255))); // NOI18N

        Panel.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        Panel.setForeground(new java.awt.Color(153, 153, 255));
        Panel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Panel.setText("Questions! ");
        Panel.setToolTipText("");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 580, 190));

        RadioBttnB.setBackground(new java.awt.Color(153, 153, 255));
        RadioBttnB.setForeground(new java.awt.Color(51, 255, 255));
        RadioBttnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBttnBActionPerformed(evt);
            }
        });
        getContentPane().add(RadioBttnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 140, 40));

        RadioBttnA.setBackground(new java.awt.Color(153, 153, 255));
        RadioBttnA.setForeground(new java.awt.Color(51, 255, 255));
        RadioBttnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBttnAActionPerformed(evt);
            }
        });
        getContentPane().add(RadioBttnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 140, 40));

        RadioBttnC.setBackground(new java.awt.Color(153, 153, 255));
        RadioBttnC.setForeground(new java.awt.Color(51, 255, 255));
        RadioBttnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBttnCActionPerformed(evt);
            }
        });
        getContentPane().add(RadioBttnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 140, 40));

        bttnNext.setBackground(new java.awt.Color(204, 204, 255));
        bttnNext.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bttnNext.setForeground(new java.awt.Color(153, 153, 255));
        bttnNext.setText("Next");
        bttnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnNextActionPerformed(evt);
            }
        });
        getContentPane().add(bttnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IGU/Img/EufTT-_UcAUxfVu.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnNextActionPerformed
        if (bttnNext.getText().equals("Restat")) {
            //reseteo
            bttnNext.setText("Next");
            Panel.setBackground(new Color(153, 153, 255));
            index = 0;
            correct = 0;
        }

        if (index == questions.length) {
            //mostrar score
            Panel.setText("Your Score: " + correct + "/" + questions.length);

            bttnNext.setText("Restat");

        } else {

            enableButtons(true);

            //mostrar preguntas
            Panel.setText(questions[index]);
            RadioBttnA.setText(options[index][0]);
            RadioBttnB.setText(options[index][1]);
            RadioBttnC.setText(options[index][2]);
            RadioBttnD.setText(options[index][3]);

            if (index == questions.length - 1) {
                bttnNext.setText("Finish");

            }

        }
        bg.clearSelection();
    }//GEN-LAST:event_bttnNextActionPerformed

    private void RadioBttnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBttnAActionPerformed
        getSelectedOption(RadioBttnA);


    }//GEN-LAST:event_RadioBttnAActionPerformed

    private void RadioBttnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBttnCActionPerformed
        getSelectedOption(RadioBttnC);

    }//GEN-LAST:event_RadioBttnCActionPerformed

    private void RadioBttnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBttnBActionPerformed
        getSelectedOption(RadioBttnB);

    }//GEN-LAST:event_RadioBttnBActionPerformed

    private void RadioBttnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBttnDActionPerformed
        getSelectedOption(RadioBttnD);

    }//GEN-LAST:event_RadioBttnDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Panel;
    private javax.swing.JRadioButton RadioBttnA;
    private javax.swing.JRadioButton RadioBttnB;
    private javax.swing.JRadioButton RadioBttnC;
    private javax.swing.JRadioButton RadioBttnD;
    private javax.swing.JButton bttnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
}
