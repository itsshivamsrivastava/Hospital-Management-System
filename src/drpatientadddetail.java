
import java.awt.MenuComponent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class drpatientadddetail extends javax.swing.JFrame {

    public drpatientadddetail() {
        initComponents();
        combo();
        medicine();
        details.setLineWrap(true);
        details.setWrapStyleWord(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        patientid = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        secondname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox();
        date = new javax.swing.JTextField();
        aadhaar = new javax.swing.JTextField();
        patienttype = new javax.swing.JComboBox();
        phoneno = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        disease = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        dailydose = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        refno = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        dose = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        company = new javax.swing.JTextField();
        medicine = new javax.swing.JComboBox();
        bedno = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        sideeffects = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        details = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Patients");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,100));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("UPDATE PATIENTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 380, 70));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 130, 35));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 33)); // NOI18N
        jLabel4.setText("Patient ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 170, 40));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel5.setText("Marital Status");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 170, 30));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setText("Age");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 60, 30));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setText("Phone No.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 310, 110, 30));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setText("Aadhaar No.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 140, 30));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 170, 100, 30));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel11.setText("Bed No.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 100, 30));

        jLabel12.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel12.setText("Surname");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, 120, 35));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel13.setText("Address");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 240, 110, 30));

        jLabel14.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel14.setText("Patient Type");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 140, 30));

        patientid.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        getContentPane().add(patientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 370, 40));

        address.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        address.setEnabled(false);
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, 270, 40));

        firstname.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        firstname.setEnabled(false);
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 280, 40));

        secondname.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        secondname.setEnabled(false);
        getContentPane().add(secondname, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 130, 270, 40));

        age.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        age.setEnabled(false);
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 280, 40));

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female", "Other" }));
        gender.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        gender.setEnabled(false);
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 200, 270, 40));

        jLabel15.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel15.setText("Date");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 90, 30));

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Maritial Status", "Single", "Married", "Engaged" }));
        status.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        status.setEnabled(false);
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 280, 40));

        date.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        date.setEnabled(false);
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 270, 40));

        aadhaar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        aadhaar.setEnabled(false);
        aadhaar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhaarActionPerformed(evt);
            }
        });
        getContentPane().add(aadhaar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 280, 40));

        patienttype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Patient Type", "Indoor Patient", "Outdoor Patient" }));
        patienttype.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        patienttype.setEnabled(false);
        patienttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patienttypeActionPerformed(evt);
            }
        });
        getContentPane().add(patienttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 280, 40));

        phoneno.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        phoneno.setEnabled(false);
        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });
        getContentPane().add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 340, 270, 40));

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        search.setForeground(new java.awt.Color(0, 102, 204));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N
        search.setBorder(null);
        search.setBorderPainted(false);
        search.setContentAreaFilled(false);
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-small.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, -1, 60));

        update.setBackground(new java.awt.Color(0, 51, 255));
        update.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update-med-btn.png"))); // NOI18N
        update.setBorder(null);
        update.setBorderPainted(false);
        update.setContentAreaFilled(false);
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update-med-btn-small.png"))); // NOI18N
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 150, 60));

        jLabel16.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel16.setText("Disease");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 380, 100, 30));

        disease.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        disease.setEnabled(false);
        disease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseaseActionPerformed(evt);
            }
        });
        getContentPane().add(disease, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 410, 270, 40));

        jLabel18.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel18.setText("Discription & Details");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 450, 230, 30));

        jLabel10.setBackground(new java.awt.Color(0, 51, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText(" MEDICINE PRESCRIPTION");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.blue));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 320, 50));

        jLabel17.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel17.setText("Name Of Tablet");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 180, 35));

        jLabel19.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel19.setText("Ref#");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 80, 30));

        dailydose.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        dailydose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailydoseActionPerformed(evt);
            }
        });
        getContentPane().add(dailydose, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 200, 40));

        jLabel20.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel20.setText("Daily Dose");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 140, 30));

        refno.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        refno.setEnabled(false);
        refno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refnoActionPerformed(evt);
            }
        });
        getContentPane().add(refno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 200, 40));

        jLabel21.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel21.setText("Dose(mg)");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 130, 30));

        dose.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        dose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doseActionPerformed(evt);
            }
        });
        getContentPane().add(dose, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 200, 40));

        jLabel22.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel22.setText("Company");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 120, 35));

        company.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        company.setEnabled(false);
        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });
        getContentPane().add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 200, 40));

        medicine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Medicine" }));
        medicine.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        medicine.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                medicinePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(medicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 200, 42));

        bedno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Bed" }));
        bedno.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        bedno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bedno.setEnabled(false);
        bedno.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                bednoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(bedno, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 280, 40));

        jLabel23.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel23.setText("Possible SideEffects");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 210, 35));

        sideeffects.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        sideeffects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideeffectsActionPerformed(evt);
            }
        });
        getContentPane().add(sideeffects, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 200, 40));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        details.setColumns(20);
        details.setFont(new java.awt.Font("Serif", 0, 13)); // NOI18N
        details.setRows(5);
        details.setBorder(null);
        jScrollPane1.setViewportView(details);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 480, 280, 110));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home (1).png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Small-Home (1).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 20, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/patientbackground1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DRPATIENTDETAILS DD = new DRPATIENTDETAILS();
        DD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void aadhaarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhaarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhaarActionPerformed

    private void patienttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patienttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patienttypeActionPerformed

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("select *from patient where P_id=?");
            pst.setString(1, patientid.getText());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String fname = rs.getString("FirstName");
                firstname.setText(fname);
                String sname = rs.getString("SecondName");
                secondname.setText(sname);
                String age1 = rs.getString("Age");
                age.setText(age1);
                String mstatus = rs.getString("MaritialStatus");
                status.setSelectedItem(mstatus);
                String gen = rs.getString("Gender");
                gender.setSelectedItem(gen);
                String add = rs.getString("Address");
                address.setText(add);
                String Aadhaar = rs.getString("Aadhaar");
                aadhaar.setText(Aadhaar);
                String ptype = rs.getString("PatientType");
                patienttype.setSelectedItem(ptype);
                String datey = rs.getString("Date");
                date.setText(datey);
                String pno = rs.getString("Phoneno");
                phoneno.setText(pno);
                String bed = rs.getString("BedNo");
                bedno.setSelectedItem(bed);
                String des = rs.getString("disease");
                disease.setText(des);
                String dis = rs.getString("detail");
                details.setText(dis);
                String tablet = rs.getString("tabletname");
                medicine.setSelectedItem(tablet);
                String dd = rs.getString("dailydose");
                dailydose.setText(dd);
                String medDose = rs.getString("dose");
                dose.setText(medDose);
                String effects = rs.getString("sideEffects");
                sideeffects.setText(effects);
                
            } else {
                JOptionPane.showMessageDialog(null, "No Specific Id Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchActionPerformed
    private void combo() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");

            PreparedStatement pst = conn.prepareStatement("SELECT * FROM hospitalmanagementsystem.bed");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                bedno.addItem(rs.getString("bid"));
            }

            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    private void medicine() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");

            PreparedStatement pst = conn.prepareStatement("SELECT * FROM hospitalmanagementsystem.medicine");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                medicine.addItem(rs.getString("name"));

            }

            pst.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
//            PreparedStatement pst = conn.prepareStatement("UPDATE patient SET FirstName=?,SecondName=?,Age=?,MaritialStatus=?,Gender=?,Address=?,Aadhaar=?,PatientType=?,Date=?,PhoneNo=?,BedNo=?,disease=?,detail=?,tabletname=?,dailydose=?,company=? WHERE P_id=?");
            PreparedStatement pst = conn.prepareStatement("UPDATE patient SET disease=?,detail=?,tabletname=?,dailydose=?,company=?,dose=?,sideEffects=? WHERE P_id=?");
//            pst.setString(1, firstname.getText());
//            pst.setString(2, secondname.getText());
//            pst.setString(3, age.getText());
//            pst.setString(4, (String) status.getSelectedItem());
//            pst.setString(5, (String) gender.getSelectedItem());
//            pst.setString(6, address.getText());
//            pst.setString(7, aadhaar.getText());
//            pst.setString(8, (String) patienttype.getSelectedItem());
//            pst.setString(9, date.getText());
//            pst.setString(10, phoneno.getText());
//            pst.setString(11, bedno.getSelectedItem().toString());
            
            pst.setString(1, disease.getText());
            pst.setString(2, details.getText());
            pst.setString(3, (String) medicine.getSelectedItem());
            pst.setString(4, dailydose.getText());
            pst.setString(5, company.getText());
            pst.setString(6, dose.getText());
            pst.setString(7, sideeffects.getText());
            pst.setString(8, patientid.getText());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Record Updated Sucessfully");

            patientid.setText(null);

            firstname.setText(null);
            secondname.setText(null);
            age.setText(null);
            address.setText(null);
            aadhaar.setText(null);
            date.setText(null);
            phoneno.setText(null);
            gender.setSelectedIndex(0);
            status.setSelectedIndex(0);
            patienttype.setSelectedIndex(0);
            disease.setText(null);
            details.setText(null);
            medicine.setSelectedIndex(0);
            bedno.setSelectedIndex(0);
            dailydose.setText(null);
            refno.setText(null);
            dose.setText(null);
            sideeffects.setText(null);
            company.setText(null);
            dose.setText(null);
            sideeffects.setText(null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
//            PreparedStatement pst = conn.prepareStatement("insert into patient" + "(disease,detail,tabletname,dailydose,company)" + " values(?,?,?,?,?)");
//            pst.setString(1, disease.getText());
//            pst.setString(2, details.getText());
//            pst.setString(3, (String) medicine.getSelectedItem());
//            pst.setString(4, dailydose.getText());
//            pst.setString(5, company.getText());
//            Object o = bedno.getSelectedItem();
//            bedno.removeItem(o);
//            if (bedno.getSelectedIndex() == -1) {
//                JOptionPane.showMessageDialog(this, "BEDS FULL");
//            }
//            pst.executeUpdate();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, e.getMessage());
//        }
//
    }//GEN-LAST:event_updateActionPerformed

    private void diseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diseaseActionPerformed

    private void dailydoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailydoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dailydoseActionPerformed

    private void refnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refnoActionPerformed

    private void doseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doseActionPerformed

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyActionPerformed

    private void medicinePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_medicinePopupMenuWillBecomeInvisible
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("select *from medicine where name=?");
            pst.setString(1, medicine.getSelectedItem().toString());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String ref = rs.getString("refno");
                refno.setText(ref);
                String daily = rs.getString("dailydose");
                dailydose.setText(daily);
                String dose1 = rs.getString("dose");
                dose.setText(dose1);
                String ss = rs.getString("sideeffects");
                sideeffects.setText(ss);
                String com = rs.getString("componyname");
                company.setText(com);

            } else {
                JOptionPane.showMessageDialog(null, "No Specific Id Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_medicinePopupMenuWillBecomeInvisible

    private void bednoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_bednoPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_bednoPopupMenuWillBecomeInvisible

    private void sideeffectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideeffectsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sideeffectsActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(drpatientadddetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(drpatientadddetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(drpatientadddetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(drpatientadddetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new drpatientadddetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhaar;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox bedno;
    private javax.swing.JTextField company;
    private javax.swing.JTextField dailydose;
    private javax.swing.JTextField date;
    private javax.swing.JTextArea details;
    private javax.swing.JTextField disease;
    private javax.swing.JTextField dose;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox gender;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox medicine;
    private javax.swing.JTextField patientid;
    private javax.swing.JComboBox patienttype;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField refno;
    private javax.swing.JButton search;
    private javax.swing.JTextField secondname;
    private javax.swing.JTextField sideeffects;
    private javax.swing.JComboBox status;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}