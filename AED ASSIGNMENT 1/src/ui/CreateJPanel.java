
package ui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Employee;
import model.EmployeeDirectory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CreateJPanel extends javax.swing.JPanel {

    static String getPhoto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    Employee employee;
    EmployeeDirectory directory;
 
    String photo;
    
    
    public CreateJPanel(Employee employee,EmployeeDirectory directory) {
        initComponents();
        this.employee = employee;
        this.directory = directory;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmployee_ID = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblStart_date = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeam_info = new javax.swing.JLabel();
        lblPosition_title = new javax.swing.JLabel();
        lblContact_Info = new javax.swing.JLabel();
        lblCell_phone_number = new javax.swing.JLabel();
        lblemail_address = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployee_ID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStart_date = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeam_info = new javax.swing.JTextField();
        txtPosition_title = new javax.swing.JTextField();
        txtCell_phone_number = new javax.swing.JTextField();
        txtemail_address = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbl_Name_Error = new javax.swing.JLabel();
        lbl_Employee_ID_Error = new javax.swing.JLabel();
        lbl_Age_Error = new javax.swing.JLabel();
        lbl_Phone_Number_Error = new javax.swing.JLabel();

        lblTitle.setText("CREATE EMPLOYEE DETAILS");

        lblName.setText("Name");

        lblEmployee_ID.setText("Employee ID");

        lblAge.setText("Age ");

        lblGender.setText("Gender[M/F/T/O]");

        lblStart_date.setText("Start Date [MM/DD/YYYY]");

        lblLevel.setText("Level ");

        lblTeam_info.setText("Team Info ");

        lblPosition_title.setText("Position Title ");

        lblContact_Info.setText(" Contact Info");

        lblCell_phone_number.setText("Cellphone Number");

        lblemail_address.setText("Email Address ");

        lblPhoto.setText("Photo");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jButton1.setText("ATTACH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmployee_ID)
                            .addComponent(lblName)
                            .addComponent(lblAge)
                            .addComponent(lblGender)
                            .addComponent(lblStart_date)
                            .addComponent(lblLevel)
                            .addComponent(lblTeam_info)
                            .addComponent(lblPosition_title)
                            .addComponent(lblContact_Info)
                            .addComponent(lblPhoto))
                        .addGap(289, 463, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTeam_info, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmployee_ID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtGender, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtStart_date, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(txtName)))
                            .addComponent(txtPosition_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCell_phone_number)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCell_phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblemail_address)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtemail_address, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(lblTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(332, 332, 332)
                                .addComponent(btnSave)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Employee_ID_Error)
                    .addComponent(lbl_Name_Error)
                    .addComponent(lbl_Age_Error)
                    .addComponent(lbl_Phone_Number_Error))
                .addGap(58, 58, 58))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtCell_phone_number, txtEmployee_ID, txtGender, txtLevel, txtName, txtPosition_title, txtStart_date, txtTeam_info, txtemail_address});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(lbl_Name_Error))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployee_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployee_ID)
                    .addComponent(lbl_Employee_ID_Error))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge)
                    .addComponent(lbl_Age_Error))
                .addGap(39, 39, 39)
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
                    .addComponent(lblLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTeam_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTeam_info))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPosition_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPosition_title))
                .addGap(18, 18, 18)
                .addComponent(lblContact_Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCell_phone_number)
                    .addComponent(txtCell_phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Phone_Number_Error))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemail_address)
                    .addComponent(txtemail_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoto)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addGap(66, 66, 66))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAge, txtCell_phone_number, txtEmployee_ID, txtGender, txtLevel, txtName, txtPosition_title, txtStart_date, txtTeam_info, txtemail_address});

    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
       
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        
        //VALIDATING THE DATA
        
        String Text_Field_Pattern = "^[a-zA-z]+";
        Pattern exp_Text_Field = Pattern.compile(Text_Field_Pattern);
        
        String Employee_Id_Pattern = "^[0-9]{5}+";
        Pattern exp_Employee_Id = Pattern.compile(Employee_Id_Pattern);
        
        String Age_Pattern = "^[0-9]+";
        Pattern exp_Age = Pattern.compile(Age_Pattern);
        
        String Phone_Number_Pattern = "^[0-9]{10}+";
        Pattern exp_Phone_Number = Pattern.compile(Phone_Number_Pattern);
        
        String Email_Address_Pattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern exp_Email_Address = Pattern.compile(Email_Address_Pattern);
        
        String Alpha_Number_Pattern = "^[a-zA-Z0-9]+";
        Pattern exp_Aplha_Number = Pattern.compile(Alpha_Number_Pattern);
        
        
        
        if(txtName.getText().isEmpty()|| txtEmployee_ID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Employee Name and Employee Id are mandatory!");
        }
        else{ 
                Matcher matchEmpName = exp_Text_Field.matcher(txtName.getText());
                if(!matchEmpName.matches()){
                    lbl_Name_Error.setText("Enter Valid Employee Name!");
                }else{
                    lbl_Name_Error.setText(" ");
                    Matcher matchEmpId = exp_Employee_Id.matcher(txtEmployee_ID.getText());
                    if(!matchEmpId.matches()){
                        lbl_Employee_ID_Error.setText("Enter 5-digit Employee ID please! ");
                    }else{
                        lbl_Employee_ID_Error.setText(" ");
                        Matcher matchAge = exp_Age.matcher(txtAge.getText());
                        if(!matchAge.matches()){
                            lbl_Age_Error.setText("Enter Age in Digits!");
                        }else{
                            lbl_Age_Error.setText(" ");
                         Matcher matchPhnNum = exp_Phone_Number.matcher(txtCell_phone_number.getText());  
                            if(!matchPhnNum.matches()){
                        lbl_Phone_Number_Error.setText("Enter a 10-digit Number,Please! ");
                    }else{
                        lbl_Phone_Number_Error.setText(" ");
                        
                        employee.setEmployee_ID(txtEmployee_ID.getText());
        employee.setAge(Integer.parseInt(txtAge.getText()));
        employee.setGender(txtGender.getText());
        employee.setStart_date(txtStart_date.getText());
        employee.setLevel(txtLevel.getText());
        employee.setTeam_info(txtTeam_info.getText());
        employee.setPosition_title(txtPosition_title.getText());
        employee.setCell_phone_number(Integer.parseInt(txtCell_phone_number.getText()));
        employee.setEmail_address(txtemail_address.getText());
        
        employee.setPhoto(photo);
        
        Employee emp= directory.addNewEmployees();
        
                            String name=txtName.getText();
                            String employee_id=txtEmployee_ID.getText();
                            int age= Integer.parseInt(txtAge.getText());
                            String gender=txtGender.getText();
                            String start_date=txtStart_date.getText();
                            String level=txtLevel.getText();
                            String team_info=txtTeam_info.getText();
                            String position_title=txtPosition_title.getText();
                            int cell_phone_number=Integer.parseInt(txtCell_phone_number.getText());
                            String emailaddress=txtemail_address.getText();
                            String photo=this.photo;
        
                            
        
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
        emp.setPhoto(photo);
        
        
        JOptionPane.showMessageDialog(this, "Employee details are Saved!");
                            
        txtName.setText("");
         txtEmployee_ID.setText("");
         txtAge.setText("");
         txtGender.setText("");
         txtStart_date.setText("");
         txtLevel.setText("");
         txtTeam_info.setText("");
         txtPosition_title.setText("");
         txtCell_phone_number.setText("");
         txtemail_address.setText("");}
        
        
        
        
       
                        
                        }
                    }
                }}
         
       
       
            
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser choosethefile = new JFileChooser();
        choosethefile.setCurrentDirectory (new File (System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","jpg","gif","png","jpeg");
        choosethefile.addChoosableFileFilter(filter);
        int result =choosethefile.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File v = choosethefile.getSelectedFile();
            String s =v.getAbsolutePath();
            this.photo =s;
        }
        else if (result == JFileChooser.CANCEL_OPTION){
            System.out.println("CHOOSE A FILE");
        }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCell_phone_number;
    private javax.swing.JLabel lblContact_Info;
    private javax.swing.JLabel lblEmployee_ID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPosition_title;
    private javax.swing.JLabel lblStart_date;
    private javax.swing.JLabel lblTeam_info;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbl_Age_Error;
    private javax.swing.JLabel lbl_Employee_ID_Error;
    private javax.swing.JLabel lbl_Name_Error;
    private javax.swing.JLabel lbl_Phone_Number_Error;
    private javax.swing.JLabel lblemail_address;
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
}
