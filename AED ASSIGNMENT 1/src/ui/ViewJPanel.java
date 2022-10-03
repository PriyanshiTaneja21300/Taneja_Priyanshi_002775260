
package ui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.EmployeeDirectory;




public class ViewJPanel extends javax.swing.JPanel {

    
    Employee employee;
    EmployeeDirectory directory; 
    String photo;
    
    public ViewJPanel(Employee employee, EmployeeDirectory directory) {
        initComponents();
        this.employee = employee;
        this.directory = directory;
        
        populateTable();
    }

    void displayPhoto() {
        ImageIcon n =new ImageIcon(this.photo);
        
        Image a =n.getImage();
        Image b=a.getScaledInstance(300,300,java.awt.Image.SCALE_SMOOTH);
        n = new ImageIcon(b);
        lblPhoto_Display.setIcon(n);
        
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblEmployee_ID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtEmployee_ID = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblStart_date = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        txtStart_date = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblTeam_info = new javax.swing.JLabel();
        lblPosition_title = new javax.swing.JLabel();
        txtTeam_info = new javax.swing.JTextField();
        lblContact_Info = new javax.swing.JLabel();
        txtPosition_title = new javax.swing.JTextField();
        lblCell_phone_number = new javax.swing.JLabel();
        txtCell_phone_number = new javax.swing.JTextField();
        lblemail_address = new javax.swing.JLabel();
        txtemail_address = new javax.swing.JTextField();
        btnSaveChange = new javax.swing.JButton();
        lblPhoto_Display = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(889, 817));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        lblTitle.setText("VIEW EMPLOYEE DETAILS");

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Cell Phone No.", "Email Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblEmployee_ID.setText("Employee ID");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblAge.setText("Age ");

        lblGender.setText("Gender");

        lblStart_date.setText("Start Date");

        lblLevel.setText("Level ");

        lblName.setText("Name");

        lblTeam_info.setText("Team Info ");

        lblPosition_title.setText("Position Title ");

        lblContact_Info.setText(" Contact Info");

        lblCell_phone_number.setText("Cellphone Number");

        lblemail_address.setText("Email Address ");

        btnSaveChange.setText("SAVE CHANGES");
        btnSaveChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmployee_ID)
                            .addComponent(lblName)
                            .addComponent(lblAge)
                            .addComponent(lblGender)
                            .addComponent(lblStart_date)
                            .addComponent(lblLevel))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmployee_ID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGender, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtStart_date, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLevel)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblPhoto_Display, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTeam_info)
                            .addComponent(lblPosition_title)
                            .addComponent(lblContact_Info)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCell_phone_number)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(lblemail_address))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaveChange)))
                .addGap(6, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTeam_info, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPosition_title, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtemail_address, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCell_phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnView)
                                .addGap(33, 33, 33)
                                .addComponent(btnUpdate)
                                .addGap(35, 35, 35)
                                .addComponent(btnDelete)
                                .addGap(23, 23, 23))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnView});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblTitle)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnView)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTeam_info)
                            .addComponent(txtTeam_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosition_title)
                            .addComponent(txtPosition_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(lblContact_Info)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCell_phone_number)
                            .addComponent(txtCell_phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblemail_address)
                            .addComponent(txtemail_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmployee_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmployee_ID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStart_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStart_date))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLevel))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btnSaveChange)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPhoto_Display, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnView});

    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        
        int selectedRowIndex =tblEmployees.getSelectedRow();
        
        if(selectedRowIndex<0) {
            
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        Employee selectedEmployees =(Employee) model.getValueAt(selectedRowIndex, 0);
        
        directory.deleteEmployees(selectedEmployees);
        
                    JOptionPane.showMessageDialog(this, "Employee details deleted successfully!.");
                    populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
       
        int selectedRowIndex =tblEmployees.getSelectedRow();
        
        if(selectedRowIndex<0) {
            
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        
        Employee selectedEmployees = null;
        
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        String selectedEmployeeid =model.getValueAt(selectedRowIndex, 1).toString();
        
        for(Employee e : directory.getDirectory()){
            if(e.getEmployee_ID().equals(selectedEmployeeid)){
                selectedEmployees = e;
        txtName.setText(selectedEmployees.getName());
        txtEmployee_ID.setText(String.valueOf(selectedEmployees.getEmployee_ID()));
        txtAge.setText(String.valueOf(selectedEmployees.getAge()));
        txtGender.setText(selectedEmployees.getGender());
        txtStart_date.setText(selectedEmployees.getStart_date());
        txtLevel.setText(selectedEmployees.getLevel());
        txtTeam_info.setText(selectedEmployees.getTeam_info());
        txtPosition_title.setText(selectedEmployees.getPosition_title());
        txtCell_phone_number.setText(String.valueOf(selectedEmployees.getCell_phone_number()));
        txtemail_address.setText(selectedEmployees.getEmail_address());
        this.photo=e.getPhoto();
        }}
        displayPhoto();
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
          
        int selectedRowIndex = tblEmployees.getSelectedRow();
         if(selectedRowIndex  < 0) {
           JOptionPane.showMessageDialog(this, "Please select a row to update the Employee details");
           return;
        }
         
       DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
       Employee selectedEmployeeDetails = (Employee) model.getValueAt(selectedRowIndex, 0);
       txtName.setText(selectedEmployeeDetails.getName());
       txtEmployee_ID.setText(String.valueOf(selectedEmployeeDetails.getEmployee_ID()));
       txtAge.setText(String.valueOf(selectedEmployeeDetails.getAge()));
       txtGender.setText(selectedEmployeeDetails.getGender());
       txtStart_date.setText(String.valueOf(selectedEmployeeDetails.getStart_date()));
       txtLevel.setText(selectedEmployeeDetails.getLevel());
       txtTeam_info.setText(String.valueOf(selectedEmployeeDetails.getTeam_info()));
       txtPosition_title.setText(selectedEmployeeDetails.getPosition_title());
       txtCell_phone_number.setText(String.valueOf(selectedEmployeeDetails.getCell_phone_number()));
       txtemail_address.setText(selectedEmployeeDetails.getEmail_address());
       
       btnSaveChange.setEnabled(true);
        txtName.setEnabled(true);
        txtEmployee_ID.setEnabled(true);
        txtAge.setEnabled(true);
        txtGender.setEnabled(true);
        txtStart_date.setEnabled(true);
        txtLevel.setEnabled(true);
        txtTeam_info.setEnabled(true);
        txtPosition_title.setEnabled(true);
        txtCell_phone_number.setEnabled(true);
        txtemail_address.setEnabled(true);
        
        
        

        
        
        
        
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangeActionPerformed
        // TODO add your handling code here:
        employee.setName(txtName.getText());
        employee.setEmployee_ID(txtEmployee_ID.getText());
        employee.setAge(Integer.parseInt(txtAge.getText()));
        employee.setGender(txtGender.getText());
        employee.setStart_date(txtStart_date.getText());
        employee.setLevel(txtLevel.getText());
        employee.setTeam_info(txtTeam_info.getText());
        employee.setPosition_title(txtPosition_title.getText());
        employee.setCell_phone_number(Integer.parseInt(txtCell_phone_number.getText()));
        employee.setEmail_address(txtemail_address.getText());
        
       
       
       Employee emp = directory.addNewEmployees();
       
       String name =txtName.getText();
       String employee_id =(txtEmployee_ID.getText());
       int age =Integer.parseInt(txtAge.getText());
       String gender =txtGender.getText();
       String start_date =txtStart_date.getText();
       String level =txtLevel.getText();
       String team_info =txtTeam_info.getText();
       String position_title =txtPosition_title.getText();
       int cell_phone_number =Integer.parseInt(txtCell_phone_number.getText());
       String emailaddress =txtemail_address.getText();
       
       emp.setName(name);
       emp.setEmployee_ID(employee_id);
       emp.setAge(age);
       emp.setGender(gender);
       emp.setStart_date(start_date);
       emp.setLevel(level);
       emp.setTeam_info(team_info);
       emp.setPosition_title(position_title);
       emp.setCell_phone_number(cell_phone_number);
       emp.setEmail_address(emailaddress);
       
       int i=tblEmployees.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel)tblEmployees.getModel();
       if(i >= 0)
       {
           model.setValueAt(txtName.getText(),i,0);
           model.setValueAt(txtEmployee_ID.getText(),i,1);
           model.setValueAt(txtAge.getText(),i,2);
           model.setValueAt(txtGender.getText(),i,3);
           model.setValueAt(txtStart_date.getText(),i,4);
           model.setValueAt(txtLevel.getText(),i,5);
           model.setValueAt(txtTeam_info.getText(),i,6);
           model.setValueAt(txtPosition_title.getText(),i,7);
           model.setValueAt(txtCell_phone_number.getText(),i,8);
           model.setValueAt(txtemail_address.getText(),i,9);
           
       }
       
       JOptionPane.showMessageDialog(this, "CHANGES ARE SAVED!");
       
       
        
        
    }//GEN-LAST:event_btnSaveChangeActionPerformed

    private void tblEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeesMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblEmployees.getSelectedRow();
        DefaultTableModel model =(DefaultTableModel)tblEmployees.getModel();
        txtName.setText(model.getValueAt(selectedRow,0).toString());
        txtEmployee_ID.setText(model.getValueAt(selectedRow,1).toString());
        txtAge.setText(model.getValueAt(selectedRow,2).toString());
        txtGender.setText(model.getValueAt(selectedRow,3).toString());
        txtStart_date.setText(model.getValueAt(selectedRow,4).toString());
        txtLevel.setText(model.getValueAt(selectedRow,5).toString());
        txtTeam_info.setText(model.getValueAt(selectedRow,6).toString());
        txtPosition_title.setText(model.getValueAt(selectedRow,7).toString());
        txtCell_phone_number.setText(model.getValueAt(selectedRow,8).toString());
        txtemail_address.setText(model.getValueAt(selectedRow,9).toString());
        
               
    }//GEN-LAST:event_tblEmployeesMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSaveChange;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCell_phone_number;
    private javax.swing.JLabel lblContact_Info;
    private javax.swing.JLabel lblEmployee_ID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto_Display;
    private javax.swing.JLabel lblPosition_title;
    private javax.swing.JLabel lblStart_date;
    private javax.swing.JLabel lblTeam_info;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblemail_address;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCell_phone_number;
    private javax.swing.JTextField txtEmployee_ID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosition_title;
    private javax.swing.JTextField txtStart_date;
    private javax.swing.JTextField txtTeam_info;
    private javax.swing.JTextField txtemail_address;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        
     DefaultTableModel model = (DefaultTableModel)tblEmployees.getModel();
     model.setRowCount(0);
     
     for (Employee emp : directory.getDirectory()){
         
         Object[]row=new Object[10];
         row[0]=emp;
         row[1]=emp.getEmployee_ID();
         row[2]=emp.getAge();
         row[3]=emp.getGender();
         row[4]=emp.getStart_date();
         row[5]=emp.getLevel();
         row[6]=emp.getTeam_info();
         row[7]=emp.getPosition_title();
         row[8]=emp.getCell_phone_number();
         row[9]=emp.getEmail_address();
         
         model.addRow(row);
         
         
     } 
    }

     
    
}
