
package UI;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author PRIYANSHI TANEJA
 */
public class Left_Side_Patient extends javax.swing.JPanel {

    public JSplitPane jSplitMainPane;
    public JPanel jPanelMainLeft;
    public JPanel jPanelMainRight;

    /**
     * Creates new form AdminLeftSection
     *
     * @param jSplitPane
     */
    public Left_Side_Patient(JSplitPane jSplitPane, JPanel leftPanel, JPanel rightPanel) {
        initComponents();
        this.jSplitMainPane = jSplitPane;
        this.jPanelMainLeft = leftPanel;
        this.jPanelMainRight = rightPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Heading = new javax.swing.JLabel();
        jButton_PATIENT_DIRECTORY = new javax.swing.JButton();
        jButton_UPDATE_CITY = new javax.swing.JButton();
        jButton_EDIT_PERSON_DIRECTORY = new javax.swing.JButton();
        jButton_PERSON_DIRECTORY1 = new javax.swing.JButton();
        jButton_ADD_DOCTOR = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15));

        jLabel_Heading.setFont(new java.awt.Font("Noto Sans Oriya", 2, 14)); // NOI18N
        jLabel_Heading.setText("Patient Tools");

        jButton_PATIENT_DIRECTORY.setBackground(new java.awt.Color(242, 242, 242));
        jButton_PATIENT_DIRECTORY.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton_PATIENT_DIRECTORY.setText("View Encounter With Doctor");
        jButton_PATIENT_DIRECTORY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PATIENT_DIRECTORYActionPerformed(evt);
            }
        });

        jButton_UPDATE_CITY.setBackground(new java.awt.Color(242, 242, 242));
        jButton_UPDATE_CITY.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton_UPDATE_CITY.setText("Edit City & Community");
        jButton_UPDATE_CITY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATE_CITYActionPerformed(evt);
            }
        });

        jButton_EDIT_PERSON_DIRECTORY.setBackground(new java.awt.Color(242, 242, 242));
        jButton_EDIT_PERSON_DIRECTORY.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton_EDIT_PERSON_DIRECTORY.setText("Edit Personal Details");
        jButton_EDIT_PERSON_DIRECTORY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EDIT_PERSON_DIRECTORYActionPerformed(evt);
            }
        });

        jButton_PERSON_DIRECTORY1.setBackground(new java.awt.Color(242, 242, 242));
        jButton_PERSON_DIRECTORY1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton_PERSON_DIRECTORY1.setText("Doctor Directory");
        jButton_PERSON_DIRECTORY1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PERSON_DIRECTORY1ActionPerformed(evt);
            }
        });

        jButton_ADD_DOCTOR.setBackground(new java.awt.Color(242, 242, 242));
        jButton_ADD_DOCTOR.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton_ADD_DOCTOR.setText("Add Doctor");
        jButton_ADD_DOCTOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ADD_DOCTORActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton_ADD_DOCTOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_UPDATE_CITY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_EDIT_PERSON_DIRECTORY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_PATIENT_DIRECTORY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_PERSON_DIRECTORY1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Heading)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel_Heading)
                .addGap(49, 49, 49)
                .addComponent(jButton_PATIENT_DIRECTORY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_EDIT_PERSON_DIRECTORY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_UPDATE_CITY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_ADD_DOCTOR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_PERSON_DIRECTORY1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_PATIENT_DIRECTORYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PATIENT_DIRECTORYActionPerformed
     PATIENT_DIRECTORY patientViewEditDashbaord = new PATIENT_DIRECTORY();
        this.jSplitMainPane.setRightComponent(patientViewEditDashbaord);
    }//GEN-LAST:event_jButton_PATIENT_DIRECTORYActionPerformed

    private void jButton_UPDATE_CITYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATE_CITYActionPerformed
     EDIT_COMMUNITY udpdateCityCommunityDashbaord = new EDIT_COMMUNITY(jSplitMainPane);
        this.jSplitMainPane.setRightComponent(udpdateCityCommunityDashbaord);
    }//GEN-LAST:event_jButton_UPDATE_CITYActionPerformed

    private void jButton_EDIT_PERSON_DIRECTORYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EDIT_PERSON_DIRECTORYActionPerformed
        EDIT_PERSON_DIRECTORY adminViewEditDashbaord = new EDIT_PERSON_DIRECTORY();
        this.jSplitMainPane.setRightComponent(adminViewEditDashbaord);
    }//GEN-LAST:event_jButton_EDIT_PERSON_DIRECTORYActionPerformed

    private void jButton_PERSON_DIRECTORY1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PERSON_DIRECTORY1ActionPerformed
          DOCTOR_VIEW doctorDirectoryDashbaord = new DOCTOR_VIEW();
        this.jSplitMainPane.setRightComponent(doctorDirectoryDashbaord);
    }//GEN-LAST:event_jButton_PERSON_DIRECTORY1ActionPerformed

    private void jButton_ADD_DOCTORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ADD_DOCTORActionPerformed
  ADD_DOCTOR newDoctor = new ADD_DOCTOR();
        this.jSplitMainPane.setRightComponent(newDoctor);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton_ADD_DOCTORActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ADD_DOCTOR;
    private javax.swing.JButton jButton_EDIT_PERSON_DIRECTORY;
    private javax.swing.JButton jButton_PATIENT_DIRECTORY;
    private javax.swing.JButton jButton_PERSON_DIRECTORY1;
    private javax.swing.JButton jButton_UPDATE_CITY;
    private javax.swing.JLabel jLabel_Heading;
    // End of variables declaration//GEN-END:variables
}