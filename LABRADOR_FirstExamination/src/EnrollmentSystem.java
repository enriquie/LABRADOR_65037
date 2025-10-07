import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Enriquie
 */
public class EnrollmentSystem extends javax.swing.JPanel {

    /**
     * Creates new form EnrollmentSystem
     */
    public EnrollmentSystem() {
        initComponents();
        
        loadRecordsToTable();
        jTable_RECORDS.setAutoCreateRowSorter(true);
        
        javax.swing.Timer timer = new javax.swing.Timer(1000, e -> {
            java.time.LocalDate today = java.time.LocalDate.now();
            java.time.LocalTime now = java.time.LocalTime.now();

            jLabel8_DATE.setText(today.format(java.time.format.DateTimeFormatter.ofPattern("MMMM dd, yyyy")));
            jLabel7_TIME.setText(now.format(java.time.format.DateTimeFormatter.ofPattern("hh:mm:ss a")));
            });
        timer.start();


        
        
        jTable_RECORDS.addMouseListener(new java.awt.event.MouseAdapter(){
        public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = jTable_RECORDS.getSelectedRow();
                TF_FULLNAME.setText(RECORDS.RECORDS.get(row).getNAME());
                TF_ADDRESS.setText(RECORDS.RECORDS.get(row).getADDRESS());
                TF_GRADELEVEL.setText(RECORDS.RECORDS.get(row).getGRADE_LEVEL());
                TF_GENDER.setText(RECORDS.RECORDS.get(row).getGENDER());
                TF_GWA.setText(RECORDS.RECORDS.get(row).getGWA());
                TF_REMARKS.setText(RECORDS.RECORDS.get(row).getREMARKS());
                }
        });
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TF_GRADELEVEL = new javax.swing.JTextField();
        TF_GENDER = new javax.swing.JTextField();
        TF_GWA = new javax.swing.JTextField();
        TF_REMARKS = new javax.swing.JTextField();
        TF_ADDRESS = new javax.swing.JTextField();
        TF_FULLNAME = new javax.swing.JTextField();
        BTN_CREATE = new javax.swing.JButton();
        BTN_UPDATE = new javax.swing.JButton();
        BTN_REMOVE = new javax.swing.JButton();
        BTN_SAVE = new javax.swing.JButton();
        BTN_EXIT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_RECORDS = new javax.swing.JTable();
        BTN_REFRESH = new javax.swing.JButton();
        jLabel7_TIME = new javax.swing.JLabel();
        jLabel8_DATE = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Enrollment System v1.0", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 12))); // NOI18N
        setForeground(new java.awt.Color(0, 51, 51));

        jLabel1.setText("FULL NAME :");

        jLabel2.setText("ADDRESS :");

        jLabel3.setText("GRADE LEVEL :");

        jLabel4.setText("GENDER :");

        jLabel5.setText("GWA :");

        jLabel6.setText("REMARKS :");

        TF_FULLNAME.setToolTipText("LAST NAME, FIRST NAME, MIDDLE NAME");

        BTN_CREATE.setText("CREATE");
        BTN_CREATE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTN_CREATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CREATEActionPerformed(evt);
            }
        });

        BTN_UPDATE.setText("APPLY");
        BTN_UPDATE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTN_UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_UPDATEActionPerformed(evt);
            }
        });

        BTN_REMOVE.setText("REMOVE");
        BTN_REMOVE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTN_REMOVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_REMOVEActionPerformed(evt);
            }
        });

        BTN_SAVE.setText("SAVE");
        BTN_SAVE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTN_SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SAVEActionPerformed(evt);
            }
        });

        BTN_EXIT.setText("EXIT");
        BTN_EXIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTN_EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EXITActionPerformed(evt);
            }
        });

        jTable_RECORDS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable_RECORDS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "ADDRESS", "GRADE LEVEL", "GENDER", "GWA", "REMARKS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_RECORDS.setShowGrid(true);
        jScrollPane1.setViewportView(jTable_RECORDS);

        BTN_REFRESH.setText("REFRESH");
        BTN_REFRESH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTN_REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_REFRESHActionPerformed(evt);
            }
        });

        jLabel7_TIME.setText("TIME 00:00:00");

        jLabel8_DATE.setText("DATE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7_TIME, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(TF_GRADELEVEL, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                                    .addComponent(TF_ADDRESS, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                                    .addComponent(TF_FULLNAME)
                                    .addComponent(TF_REMARKS, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                                    .addComponent(TF_GWA, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                                    .addComponent(TF_GENDER, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(BTN_CREATE, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addComponent(BTN_UPDATE)
                                        .addComponent(BTN_REMOVE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BTN_SAVE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BTN_EXIT))
                                    .addComponent(BTN_REFRESH, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8_DATE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BTN_CREATE, BTN_EXIT, BTN_REMOVE, BTN_SAVE, BTN_UPDATE});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TF_FULLNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_CREATE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TF_ADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TF_GRADELEVEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TF_GENDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TF_GWA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_UPDATE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_REMOVE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_SAVE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_REFRESH)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TF_REMARKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_EXIT))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7_TIME)
                    .addComponent(jLabel8_DATE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BTN_CREATE, BTN_EXIT, BTN_REFRESH, BTN_REMOVE, BTN_SAVE, BTN_UPDATE});

    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void BTN_CREATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CREATEActionPerformed
        try {
            String NAME = TF_FULLNAME.getText();
            String ADDRESS = TF_ADDRESS.getText();
            String GRADE_LEVEL = TF_GRADELEVEL.getText();
            String GENDER = TF_GENDER.getText();
            String GWA = TF_GWA.getText();
            String REMARKS = TF_REMARKS.getText();
            
            RECORDS.RECORDS.add(new RECORDS(NAME, ADDRESS, GRADE_LEVEL, GENDER, GWA, REMARKS));
            DefaultTableModel model = (DefaultTableModel)jTable_RECORDS.getModel();
            model.addRow(new Object[]{NAME, ADDRESS, GRADE_LEVEL, GENDER, GWA, REMARKS});  
            clearSelections();
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please Fill all Fields with proper values");
        }
    }//GEN-LAST:event_BTN_CREATEActionPerformed

    private void BTN_REFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_REFRESHActionPerformed
        loadRecordsToTable();
        javax.swing.JOptionPane.showMessageDialog(this, "Data loaded succesfully!");
    }//GEN-LAST:event_BTN_REFRESHActionPerformed

    private void loadRecordsToTable() {
    try {

        RECORDS.RECORDS = FileHandler.loadFromFile("Records.dat");

        DefaultTableModel model = (DefaultTableModel) jTable_RECORDS.getModel();
        model.setRowCount(0); // clear old rows before loading

        for (RECORDS r : RECORDS.RECORDS) {
            model.addRow(new Object[]{
                r.getNAME(),
                r.getADDRESS(),
                r.getGRADE_LEVEL(),
                r.getGENDER(),
                r.getGWA(),
                r.getREMARKS()
            });
        }

        System.out.println("Records loaded successfully from Records.dat");

    } catch (Exception e) {
        System.out.println("Error loading records: " + e.getMessage());
    }
}

    
    private void BTN_REMOVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_REMOVEActionPerformed
         try {
            int row  = jTable_RECORDS.getSelectedRow();
            if(row<0){
                JOptionPane.showMessageDialog(this, "Please select a row to remove");
                return;
            }
        RECORDS.RECORDS.remove(row);
        DefaultTableModel model = (DefaultTableModel)jTable_RECORDS.getModel();
        model.removeRow(row);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select a row to remove");
        }
    }//GEN-LAST:event_BTN_REMOVEActionPerformed

    private void BTN_UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_UPDATEActionPerformed
        try {
            int row = jTable_RECORDS.getSelectedRow();
            if(row<0){
                JOptionPane.showMessageDialog(this, "Please select a row to update");
                return;
            }
            String NAME = TF_FULLNAME.getText();
            String ADDRESS = TF_ADDRESS.getText();
            String GRADE_LEVEL = TF_GRADELEVEL.getText();
            String GENDER = TF_GENDER.getText();
            String GWA = TF_GWA.getText();
            String REMARKS = TF_REMARKS.getText();
            
            RECORDS updated = new RECORDS(NAME, ADDRESS, GRADE_LEVEL, GENDER, GWA, REMARKS);
            RECORDS.RECORDS.set(row, updated);
            
            DefaultTableModel model = (DefaultTableModel) jTable_RECORDS.getModel();
            model.setValueAt(NAME, row, 0);
            model.setValueAt(ADDRESS, row, 1);
            model.setValueAt(GRADE_LEVEL, row, 2);
            model.setValueAt(GENDER, row, 3);
            model.setValueAt(GWA, row, 4);
            model.setValueAt(REMARKS, row, 5);
            
            clearSelections();
            
        } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please Fill all Fields with proper values");
        }
    }//GEN-LAST:event_BTN_UPDATEActionPerformed

    private void BTN_EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EXITActionPerformed
        try {
            FileHandler.saveToFile(RECORDS.RECORDS, "Records.dat");
            System.out.println("Saved Successfully to Workers.dat");
        } 
        catch (Exception e) {
            System.out.println("Error Saving from Workers.dat");
        }
        System.exit(0);
    }//GEN-LAST:event_BTN_EXITActionPerformed

    private void BTN_SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SAVEActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this, "Data saved Succesfully!");
        try {
            FileHandler.saveToFile(RECORDS.RECORDS, "Records.dat");
            System.out.println("DATA UPDATED.");
        } 
        catch (Exception e) {
            System.out.println("Error Saving from Workers.dat");
        }
    }//GEN-LAST:event_BTN_SAVEActionPerformed
    
    public void clearSelections(){
            TF_FULLNAME.setText("");
            TF_ADDRESS.setText("");
            TF_GRADELEVEL.setText("");
            TF_GENDER.setText("");
            TF_GWA.setText("");
            TF_REMARKS.setText("");
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_CREATE;
    private javax.swing.JButton BTN_EXIT;
    private javax.swing.JButton BTN_REFRESH;
    private javax.swing.JButton BTN_REMOVE;
    private javax.swing.JButton BTN_SAVE;
    private javax.swing.JButton BTN_UPDATE;
    private javax.swing.JTextField TF_ADDRESS;
    private javax.swing.JTextField TF_FULLNAME;
    private javax.swing.JTextField TF_GENDER;
    private javax.swing.JTextField TF_GRADELEVEL;
    private javax.swing.JTextField TF_GWA;
    private javax.swing.JTextField TF_REMARKS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7_TIME;
    private javax.swing.JLabel jLabel8_DATE;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_RECORDS;
    // End of variables declaration//GEN-END:variables
}
