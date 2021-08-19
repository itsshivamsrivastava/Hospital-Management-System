
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PatientDetails extends javax.swing.JFrame {

    String s;

    public PatientDetails() {
        initComponents();
        combo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
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
        martialstatus = new javax.swing.JComboBox();
        date = new javax.swing.JTextField();
        aadhaar = new javax.swing.JTextField();
        patienttype = new javax.swing.JComboBox();
        phoneno = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bedno = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        searchpatient = new javax.swing.JMenuBar();
        addpatient = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        updatepatient = new javax.swing.JMenu();
        deletepatient = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        spatient = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        viewpatient = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Patient");
        setPreferredSize(new java.awt.Dimension(1280, 760));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 30, 60, 60));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGOUT (1) 50x52.png"))); // NOI18N
        logout.setActionCommand("logout");
        logout.setBorder(null);
        logout.setBorderPainted(false);
        logout.setContentAreaFilled(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGOUT (1) 40x42.png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, -1, 60));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit-btn.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit-btn-small.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 30, -1, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 120));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("ADD PATIENTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 310, 60));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 55, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 105, 30));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 55, 255));
        jLabel4.setText("Patient ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, 30));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 55, 255));
        jLabel5.setText("Maritial Status");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, 30));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 55, 255));
        jLabel6.setText("Age");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 50, 30));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 55, 255));
        jLabel7.setText("Phone No.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 105, 30));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 55, 255));
        jLabel8.setText("Aadhaar No.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 140, 30));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 55, 255));
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, -1, 30));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 55, 255));
        jLabel11.setText("Bed No.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 105, 30));

        jLabel12.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 55, 255));
        jLabel12.setText("Surname");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, -1, 30));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 55, 255));
        jLabel13.setText("Address");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 105, 30));

        jLabel14.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 55, 255));
        jLabel14.setText("Patient Type");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 150, 30));

        patientid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(patientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 230, 32));

        address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 280, 230, 32));

        firstname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 230, 32));

        secondname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(secondname, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 230, 32));

        age.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 230, 32));

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female", "Other" }));
        gender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 230, 230, 33));

        jLabel15.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 55, 255));
        jLabel15.setText("Date");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 48, 30));

        martialstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Maritial Status", "Single", "Married", "Engaged" }));
        martialstatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(martialstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 230, 33));

        date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 230, 32));

        aadhaar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        aadhaar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhaarActionPerformed(evt);
            }
        });
        getContentPane().add(aadhaar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 230, 32));

        patienttype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Patient Type", "Indoor Patient", "Outdoor Patient" }));
        patienttype.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        patienttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patienttypeActionPerformed(evt);
            }
        });
        getContentPane().add(patienttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 230, 30));

        phoneno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });
        getContentPane().add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, 230, 32));

        jButton2.setBackground(new java.awt.Color(0, 55, 255));
        jButton2.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add (5).png"))); // NOI18N
        jButton2.setText("  Add Patient");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.blue));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(true);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adduser.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 180, 60));

        jButton4.setBackground(new java.awt.Color(0, 55, 255));
        jButton4.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear-btn.png"))); // NOI18N
        jButton4.setText("  Clear");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.blue));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setOpaque(true);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear-btn-small.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 140, 60));

        bedno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Bed" }));
        bedno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(bedno, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/patientbackground1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 600));

        addpatient.setBorder(null);
        addpatient.setForeground(new java.awt.Color(0, 55, 255));
        addpatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adduser.png"))); // NOI18N
        addpatient.setText("Add Patient");
        addpatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addpatient.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        addpatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addpatientMouseClicked(evt);
            }
        });
        addpatient.add(jSeparator1);

        searchpatient.add(addpatient);

        updatepatient.setBorder(null);
        updatepatient.setForeground(new java.awt.Color(0, 55, 255));
        updatepatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UPDATESMALL.png"))); // NOI18N
        updatepatient.setText("Update Patient");
        updatepatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatepatient.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        updatepatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatepatientMouseClicked(evt);
            }
        });
        searchpatient.add(updatepatient);

        deletepatient.setBorder(null);
        deletepatient.setForeground(new java.awt.Color(0, 55, 255));
        deletepatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DELETESMALL.png"))); // NOI18N
        deletepatient.setText("Delete Patient");
        deletepatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletepatient.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        deletepatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletepatientMouseClicked(evt);
            }
        });
        deletepatient.add(jSeparator3);

        searchpatient.add(deletepatient);

        spatient.setBorder(null);
        spatient.setForeground(new java.awt.Color(0, 55, 255));
        spatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-patient.png"))); // NOI18N
        spatient.setText("Search Patient");
        spatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spatient.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        spatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spatientMouseClicked(evt);
            }
        });
        spatient.add(jSeparator2);

        searchpatient.add(spatient);

        viewpatient.setBorder(null);
        viewpatient.setForeground(new java.awt.Color(0, 55, 255));
        viewpatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewuser-small.png"))); // NOI18N
        viewpatient.setText("View Patient");
        viewpatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewpatient.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        viewpatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewpatientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewpatientMouseEntered(evt);
            }
        });
        searchpatient.add(viewpatient);

        setJMenuBar(searchpatient);

        setSize(new java.awt.Dimension(1296, 669));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addpatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpatientMouseClicked
        PatientDetails pd = new PatientDetails();
        pd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addpatientMouseClicked

    private void deletepatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletepatientMouseClicked
        DeletePatient dp = new DeletePatient();
        dp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deletepatientMouseClicked

    private void spatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spatientMouseClicked
        SearchPatient sp = new SearchPatient();
        sp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_spatientMouseClicked

    private void updatepatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatepatientMouseClicked
        UpdatePatient up = new UpdatePatient();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updatepatientMouseClicked

    private void viewpatientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewpatientMouseEntered

    }//GEN-LAST:event_viewpatientMouseEntered

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void aadhaarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhaarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhaarActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed
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
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    private void patienttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patienttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patienttypeActionPerformed

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed

    private void viewpatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewpatientMouseClicked
        ViewPatient vp = new ViewPatient();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewpatientMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false", "root", "");
            PreparedStatement pst = conn.prepareStatement("insert into patient" + "(P_id,FirstName,SecondName,Age,MaritialStatus,Gender,Address,Aadhaar,PatientType,Date,PhoneNo,BedNo)" + " values(?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, patientid.getText());
            pst.setString(2, firstname.getText());
            pst.setString(3, secondname.getText());
            pst.setString(4, age.getText());
            pst.setString(5, (String) martialstatus.getSelectedItem());
            pst.setString(6, (String) gender.getSelectedItem());
            pst.setString(7, address.getText());
            pst.setString(8, aadhaar.getText());
            pst.setString(9, (String) patienttype.getSelectedItem());
            pst.setString(10, date.getText());
            pst.setString(11, phoneno.getText());
            pst.setString(12, bedno.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Inserted Sucessfully");
            patientid.setText(null);
            firstname.setText(null);
            secondname.setText(null);
            age.setText(null);
            address.setText(null);
            aadhaar.setText(null);
            date.setText(null);
            phoneno.setText(null);
            bedno.setSelectedIndex(0);
            gender.setSelectedIndex(0);
            martialstatus.setSelectedIndex(0);
            patienttype.setSelectedIndex(0);
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Please filled all necessary fields!");
            System.out.println(e);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        patientid.setText(null);
        firstname.setText(null);
        secondname.setText(null);
        age.setText(null);
        address.setText(null);
        aadhaar.setText(null);
        date.setText(null);
        phoneno.setText(null);
        bedno.setSelectedIndex(0);
        gender.setSelectedIndex(0);
        martialstatus.setSelectedIndex(0);
        patienttype.setSelectedIndex(0);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        adminpanel ap = new adminpanel();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
private JFrame frame;
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        frame = new JFrame();
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Logout", "Logout",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            Adminlogin al = new Adminlogin();
            this.dispose();
            al.setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        frame = new JFrame();
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", "Exit",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new PatientDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhaar;
    private javax.swing.JMenu addpatient;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox bedno;
    private javax.swing.JTextField date;
    private javax.swing.JMenu deletepatient;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox gender;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JButton logout;
    private javax.swing.JComboBox martialstatus;
    private javax.swing.JTextField patientid;
    private javax.swing.JComboBox patienttype;
    private javax.swing.JTextField phoneno;
    private javax.swing.JMenuBar searchpatient;
    private javax.swing.JTextField secondname;
    private javax.swing.JMenu spatient;
    private javax.swing.JMenu updatepatient;
    private javax.swing.JMenu viewpatient;
    // End of variables declaration//GEN-END:variables

}
