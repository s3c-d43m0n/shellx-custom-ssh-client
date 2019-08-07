/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ritvik;

import com.trilead.ssh2.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
;

/**
 *
 * @author Ritvik Singh Chauhan (contact.ritvik@gmail.com)
 */
public class Launcher extends javax.swing.JFrame {

    /**
     * Creates new form Launcher
     */
    boolean shell_mode=false;
    boolean clear_mode=false;
    boolean scroll_mode=true;
    boolean[] flags={true,true};
    Session s;
    Connection c;
    public Launcher() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        vUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        vPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        vServer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        vCmd = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        vOutput = new javax.swing.JTextArea();
        vExec = new javax.swing.JButton();
        vAbort = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        vErrCode = new javax.swing.JTextField();
        vRegex = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        vNumLog = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        vZM = new javax.swing.JButton();
        vZP = new javax.swing.JButton();
        vClear = new javax.swing.JButton();
        vShellMode = new javax.swing.JCheckBox();
        vClearLog = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shell-X - SSH Client - Developed by Ritvik");
        setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("USERNAME:");

        vUser.setToolTipText("Enter Username for SSH SERVER");
        vUser.setNextFocusableComponent(vPass);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Password:");

        vPass.setToolTipText("Enter Password for SSH SERVER");
        vPass.setNextFocusableComponent(vServer);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("SERVER:");
        jLabel3.setToolTipText("");

        vServer.setToolTipText("Enter SSH Server Name");
        vServer.setNextFocusableComponent(vExec);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Commands Line by Line", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        vCmd.setColumns(20);
        vCmd.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        vCmd.setRows(5);
        vCmd.setTabSize(4);
        vCmd.setText("#Enter Commands Here Line by Line in This Text Area\n");
        vCmd.setWrapStyleWord(true);
        vCmd.setCaretColor(new java.awt.Color(255, 0, 0));
        vCmd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(vCmd);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Console Output", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        vOutput.setColumns(20);
        vOutput.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        vOutput.setRows(5);
        vOutput.setWrapStyleWord(true);
        vOutput.setCaretColor(new java.awt.Color(255, 0, 0));
        jScrollPane2.setViewportView(vOutput);

        vExec.setText("Execute Commands");
        vExec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vExecActionPerformed(evt);
            }
        });

        vAbort.setText("Abort");
        vAbort.setToolTipText("Abort Current Execution");
        vAbort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vAbortActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "For RPX Only", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        vErrCode.setText("203 800, 900");
        vErrCode.setToolTipText("RPX ERROR CODE LAST 20 RESULTS");
        vErrCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vErrCodeActionPerformed(evt);
            }
        });

        vRegex.setText(":SDP");
        vRegex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vRegexActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Error Code:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("    REGEX: ");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "How Many Logs?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        vNumLog.setText("20");
        vNumLog.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vNumLogFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vNumLog, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(vNumLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vRegex, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vErrCode, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vErrCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vRegex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Text", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        vZM.setText("-");
        vZM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vZMActionPerformed(evt);
            }
        });

        vZP.setText("+");
        vZP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vZPActionPerformed(evt);
            }
        });

        vClear.setText("Clear");
        vClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(vZP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vZM))
                    .addComponent(vClear, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(vClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vZP)
                    .addComponent(vZM)))
        );

        vShellMode.setText("SHELL MODE");
        vShellMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vShellModeActionPerformed(evt);
            }
        });

        vClearLog.setText("AUTO CLEAR");
        vClearLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vClearLogActionPerformed(evt);
            }
        });

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("AUTO SCROLL");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scripts", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jButton1.setText("Log Script");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vUser, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vPass, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vServer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vExec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vAbort))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vShellMode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1))
                    .addComponent(vClearLog))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(vUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(vPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vExec)
                    .addComponent(vAbort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vShellMode)
                            .addComponent(jCheckBox1))
                        .addGap(2, 2, 2)
                        .addComponent(vClearLog))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vExecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vExecActionPerformed
        new Thread(() -> {
            vExec.setEnabled(false);
            try {              
                String user=vUser.getText().trim();
                String pass=String.valueOf(vPass.getPassword()).trim();
                String server=vServer.getText().trim();
                String[] cmd=vCmd.getText().split("\n");

                if(clear_mode) vOutput.setText("");

                c = new Connection(server,22);
                c.connect();

                if(c.authenticateWithPassword(user, pass)){

                    s = c.openSession();
                    if(shell_mode) s.requestDumbPTY();
                    s.startShell();

                    BufferedReader o = new BufferedReader(new InputStreamReader(s.getStdout()));
                    BufferedReader e = new BufferedReader(new InputStreamReader(s.getStderr()));
                    BufferedWriter i = new BufferedWriter(new OutputStreamWriter(s.getStdin()));
                    
                    new Thread(() -> {
                        String line=null;
                        do{
                            try {
                                line=o.readLine();
                                if(null!=line) consoleOutput(line+"\n");
                            } catch (IOException ex) {
                                consoleOutput("*** Exception : "+ex.getMessage()+"\n");
                            }
                        }while(line!=null && flags[0]);
                        flags[0]=false;
                    }).start();

                    new Thread(() -> {
                        String line=null;
                        do{
                            try {
                                line=e.readLine();
                                if(null!=line) System.out.println("*** ERROR : "+line+"\n");
                            } catch (IOException ex) {
                                consoleOutput("*** Exception : "+ex.getMessage()+"\n");
                            }
                        }while(line!=null && flags[1]);
                        flags[1]=false;
                    }).start();
                    
                    try {
                        for(String cl : cmd){
                            i.write(cl+"\n");
                        }
                        i.write("exit\n");
                        i.flush();
                    } catch (IOException ex) {
                        consoleOutput("*** Exception : "+ex.getMessage()+"\n");
                    }
                    
                    flags[0]=true;
                    flags[1]=true;                    

                    while(flags[1]||flags[0]){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            consoleOutput("*** Exception : "+ex.getMessage()+"\n");
                        }
                    }
                    
                    i.close();
                    o.close();
                    e.close();

                    s.close();
                    c.close();

                }
                else{
                    System.err.println("AUTHENTICATION PROBLEM");
                }
            } catch (IOException ex) {
                consoleOutput("*** Exception : "+ex.getMessage()+"\n");
            }
            vExec.setEnabled(true);
            consoleOutput("\n - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - \n");
        }).start();
    }//GEN-LAST:event_vExecActionPerformed

    private void vAbortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vAbortActionPerformed
        // TODO add your handling code here:
        flags[0]=false;
        flags[1]=false;
        s.close();
        c.close();
        consoleOutput("*** Session Aborted.\n");
    }//GEN-LAST:event_vAbortActionPerformed

    private void vClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vClearActionPerformed
        // TODO add your handling code here:
        vOutput.setText("");
    }//GEN-LAST:event_vClearActionPerformed

    private void vZPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vZPActionPerformed
        // TODO add your handling code here:
        Font ff = vOutput.getFont();
        vOutput.setFont(new Font(ff.getName(), Font.PLAIN, ff.getSize()+1));        
    }//GEN-LAST:event_vZPActionPerformed

    private void vZMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vZMActionPerformed
        // TODO add your handling code here:
        Font ff = vOutput.getFont();
        vOutput.setFont(new Font(ff.getName(), Font.PLAIN, ff.getSize()-1));
    }//GEN-LAST:event_vZMActionPerformed

    private void vErrCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vErrCodeActionPerformed
        // TODO add your handling code here:
        new Thread(() -> {
            String temp = vCmd.getText();
            String error = vErrCode.getText().replaceAll("\\D", " ").trim().replaceAll(" +", "|").toString();
            vErrCode.setText(error);
            vCmd.setText("egrep \"Error Code\\:("+error+")\" /app/rpx/oracle/domains/prpolaris/servers/`hostname`/logs/rpx.log | tail -"+vNumLog.getText());
            vExecActionPerformed(evt);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
            vCmd.setText(temp);
            JPanel l; 
        }).start();
    }//GEN-LAST:event_vErrCodeActionPerformed

    private void vRegexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vRegexActionPerformed
        // TODO add your handling code here:
        new Thread(() -> {
            String temp = vCmd.getText();
            String regex = vRegex.getText();
            vCmd.setText("egrep \""+regex+"\" /app/rpx/oracle/domains/prpolaris/servers/`hostname`/logs/rpx.log | tail -"+vNumLog.getText());
            vExecActionPerformed(evt);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
            vCmd.setText(temp);
        }).start();
    }//GEN-LAST:event_vRegexActionPerformed

    private void vNumLogFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vNumLogFocusLost
        // TODO add your handling code here:
        try{
            int i = Integer.parseInt(vNumLog.getText().trim());
            if(i<=0) throw new NumberFormatException("Can't Be ZERO or Negative...");
            vNumLog.setText(i+"");
        }
        catch(NumberFormatException e){
            vNumLog.setText("20");
        }
    }//GEN-LAST:event_vNumLogFocusLost

    private void vShellModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vShellModeActionPerformed
        // TODO add your handling code here:
        shell_mode=!(shell_mode);
    }//GEN-LAST:event_vShellModeActionPerformed

    private void vClearLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vClearLogActionPerformed
        // TODO add your handling code here:
        clear_mode= !(clear_mode);
    }//GEN-LAST:event_vClearLogActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        scroll_mode= !(scroll_mode);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        vCmd.setText("for x in {200..229}\ndo\nif [ $x -eq 203 ]\nthen\ncontinue\nfi\nSERVER_PRD_VAR=\"prdrpxx$x\"\nssh -oStrictHostKeyChecking=no rpxadm@$SERVER_PRD_VAR \"\necho\necho\necho $SERVER_PRD_VAR LOGS\necho ---------------------------------------------------------------------------\negrep \\\"Error Code:(203|800)\\\" /app/rpx/oracle/domains/prpolaris/servers/$SERVER_PRD_VAR/logs/rpx.log | tail -20\n\"\ndone");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Launcher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton vAbort;
    private javax.swing.JButton vClear;
    private javax.swing.JCheckBox vClearLog;
    private javax.swing.JTextArea vCmd;
    private javax.swing.JTextField vErrCode;
    private javax.swing.JButton vExec;
    private javax.swing.JTextField vNumLog;
    private javax.swing.JTextArea vOutput;
    private javax.swing.JPasswordField vPass;
    private javax.swing.JTextField vRegex;
    private javax.swing.JTextField vServer;
    private javax.swing.JCheckBox vShellMode;
    private javax.swing.JTextField vUser;
    private javax.swing.JButton vZM;
    private javax.swing.JButton vZP;
    // End of variables declaration//GEN-END:variables

    private void consoleOutput(String output) {
        vOutput.append(output);
        if(scroll_mode) vOutput.setCaretPosition(vOutput.getText().length());
    }
}
