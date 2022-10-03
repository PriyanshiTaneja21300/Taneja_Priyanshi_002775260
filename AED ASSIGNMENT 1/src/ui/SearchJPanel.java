
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Employee;
import model.EmployeeDirectory;


public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    
    //Employee employee;
    EmployeeDirectory directory;
    
     public SearchJPanel(EmployeeDirectory directory) {
        initComponents();
        //this.employee = employee;
        this.directory = directory;
        
        populateTable();
    }

  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearchEmployee = new javax.swing.JTable();
        SearchPositionTitle = new javax.swing.JLabel();
        txtSearchTeamInfo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnSearchName = new javax.swing.JButton();
        SearchName = new javax.swing.JLabel();
        SearchEmployee_ID = new javax.swing.JLabel();
        txtSearchEmployeeID = new javax.swing.JTextField();
        SearchAge = new javax.swing.JLabel();
        txtSearchAge = new javax.swing.JTextField();
        SearchGender = new javax.swing.JLabel();
        SearchStartDate = new javax.swing.JLabel();
        txtSearchGender = new javax.swing.JTextField();
        txtSearchName = new javax.swing.JTextField();
        SearchTeamInfo = new javax.swing.JLabel();
        txtSearchStartDate = new javax.swing.JTextField();
        SearchCellPhoneNumber = new javax.swing.JLabel();
        txtSearchPositionTitle = new javax.swing.JTextField();
        txtSearchCellPhoneNo = new javax.swing.JTextField();
        btnSearchAge = new javax.swing.JButton();
        btnSearchGender = new javax.swing.JButton();
        btnSearchStartDate = new javax.swing.JButton();
        btnSearchCellPhoneNo = new javax.swing.JButton();
        btnPositionTitle = new javax.swing.JButton();
        btnSearchEmployeeID = new javax.swing.JButton();
        btnSearchTeamInfo = new javax.swing.JButton();
        SearchLevel = new javax.swing.JLabel();
        txtSearchLevel = new javax.swing.JTextField();
        btnSearchLevel = new javax.swing.JButton();
        SearchEmailAddress = new javax.swing.JLabel();
        txtSearchEmailAddress = new javax.swing.JTextField();
        btnSearchEmailAddress = new javax.swing.JButton();
        SearchPositionTitle1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        tblSearchEmployee.setBackground(new java.awt.Color(204, 204, 204));
        tblSearchEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        tblSearchEmployee.setPreferredSize(new java.awt.Dimension(1000, 800));
        jScrollPane1.setViewportView(tblSearchEmployee);

        SearchPositionTitle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        SearchPositionTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SearchPositionTitle.setText("Search Position Title :");

        txtSearchTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchTeamInfoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Display All Records");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSearchName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSearchName.setText("Search");
        btnSearchName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNameActionPerformed(evt);
            }
        });

        SearchName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        SearchName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SearchName.setText("Search Name :");

        SearchEmployee_ID.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        SearchEmployee_ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SearchEmployee_ID.setText("Search Employee ID :");

        SearchAge.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        SearchAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SearchAge.setText("Search Age :");

        SearchGender.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        SearchGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SearchGender.setText("Search Gender :");

        SearchStartDate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        SearchStartDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SearchStartDate.setText("Search Start Date:");

        txtSearchGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchGenderKeyPressed(evt);
            }
        });

        txtSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchNameActionPerformed(evt);
            }
        });

        SearchTeamInfo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        SearchTeamInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SearchTeamInfo.setText("Search Team Info :");

        txtSearchStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchStartDateActionPerformed(evt);
            }
        });

        SearchCellPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        SearchCellPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SearchCellPhoneNumber.setText("Search Cell Phone No. :");

        btnSearchAge.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSearchAge.setText("Search");
        btnSearchAge.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearchAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAgeActionPerformed(evt);
            }
        });

        btnSearchGender.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSearchGender.setText("Search");
        btnSearchGender.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearchGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchGenderActionPerformed(evt);
            }
        });

        btnSearchStartDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSearchStartDate.setText("Search");
        btnSearchStartDate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearchStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStartDateActionPerformed(evt);
            }
        });

        btnSearchCellPhoneNo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSearchCellPhoneNo.setText("Search");
        btnSearchCellPhoneNo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearchCellPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCellPhoneNoActionPerformed(evt);
            }
        });

        btnPositionTitle.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnPositionTitle.setText("Search");
        btnPositionTitle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPositionTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPositionTitleActionPerformed(evt);
            }
        });

        btnSearchEmployeeID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSearchEmployeeID.setText("Search");
        btnSearchEmployeeID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearchEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEmployeeIDActionPerformed(evt);
            }
        });

        btnSearchTeamInfo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSearchTeamInfo.setText("Search");
        btnSearchTeamInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearchTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTeamInfoActionPerformed(evt);
            }
        });

        SearchLevel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        SearchLevel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SearchLevel.setText("Search Level:");

        btnSearchLevel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSearchLevel.setText("Search");
        btnSearchLevel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearchLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchLevelActionPerformed(evt);
            }
        });

        SearchEmailAddress.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        SearchEmailAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SearchEmailAddress.setText("Search Email Address:");

        btnSearchEmailAddress.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSearchEmailAddress.setText("Search");
        btnSearchEmailAddress.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearchEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEmailAddressActionPerformed(evt);
            }
        });

        SearchPositionTitle1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        SearchPositionTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SearchPositionTitle1.setText("Contact Info :");

        lblTitle.setText("VIEW EMPLOYEE DETAILS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGap(433, 433, 433)
                .addComponent(lblTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchEmployee_ID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchStartDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchTeamInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchPositionTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchPositionTitle1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SearchCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SearchEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearchEmployeeID)
                            .addComponent(txtSearchAge)
                            .addComponent(txtSearchGender)
                            .addComponent(txtSearchName)
                            .addComponent(txtSearchStartDate)
                            .addComponent(txtSearchLevel)
                            .addComponent(txtSearchTeamInfo)
                            .addComponent(txtSearchPositionTitle)
                            .addComponent(txtSearchCellPhoneNo)
                            .addComponent(txtSearchEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearchEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchAge, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchGender, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchCellPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {SearchAge, SearchCellPhoneNumber, SearchEmailAddress, SearchEmployee_ID, SearchGender, SearchLevel, SearchName, SearchPositionTitle, SearchStartDate, SearchTeamInfo});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtSearchAge, txtSearchCellPhoneNo, txtSearchEmailAddress, txtSearchEmployeeID, txtSearchGender, txtSearchLevel, txtSearchName, txtSearchPositionTitle, txtSearchStartDate, txtSearchTeamInfo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(txtSearchEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchAge, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(txtSearchStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearchPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchAge, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchGender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchEmployee_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(273, 273, 273))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchAge, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchGender, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(SearchStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SearchLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SearchTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchPositionTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearchCellPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearchCellPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {SearchAge, SearchCellPhoneNumber, SearchEmailAddress, SearchEmployee_ID, SearchGender, SearchLevel, SearchName, SearchPositionTitle, SearchStartDate, SearchTeamInfo});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNameActionPerformed
        // TODO add your handling code here:
        
        String name = txtSearchName.getText();
       
        DefaultTableModel model = (DefaultTableModel) tblSearchEmployee.getModel();
        model.setRowCount(0);
        int count =0;
        for(Employee employee : directory.getDirectory()){

         if(employee.getName().equals(name)){
             count++;
             Object[] row = new Object[10];
             row[0]= employee;
             row[1]= employee.getEmployee_ID();
             row[2]= employee.getAge();
             row[3]= employee.getGender();
             row[4]= employee.getStart_date();
             row[5]= employee.getLevel();
             row[6]= employee.getTeam_info();
             row[7]= employee.getPosition_title();
             row[8]= employee.getCell_phone_number();
             row[9]= employee.getEmail_address();

             model.addRow(row);
         }
        }
    }//GEN-LAST:event_btnSearchNameActionPerformed

    private void txtSearchGenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchGenderKeyPressed
        // TODO add your handling code here 
    }//GEN-LAST:event_txtSearchGenderKeyPressed

    private void txtSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchNameActionPerformed

    private void btnSearchAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAgeActionPerformed
        // TODO add your handling code here:
        
        int age = Integer.parseInt(txtSearchAge.getText());
       
       DefaultTableModel model = (DefaultTableModel) tblSearchEmployee.getModel();
       model.setRowCount(0);
       int count =0;
       for(Employee employee : directory.getDirectory()){

        if(employee.getAge()==(age)){
            count++;
            Object[] row = new Object[10];
             row[0]= employee;
             row[1]= employee.getEmployee_ID();
             row[2]= employee.getAge();
             row[3]= employee.getGender();
             row[4]= employee.getStart_date();
             row[5]= employee.getLevel();
             row[6]= employee.getTeam_info();
             row[7]= employee.getPosition_title();
             row[8]= employee.getCell_phone_number();
             row[9]= employee.getEmail_address();
          
            model.addRow(row);
         }
        }
    }//GEN-LAST:event_btnSearchAgeActionPerformed

    private void btnSearchGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchGenderActionPerformed
        // TODO add your handling code here:
        
        String gender = txtSearchGender.getText();
       
        DefaultTableModel model = (DefaultTableModel) tblSearchEmployee.getModel();
        model.setRowCount(0);
        int count =0;
        for(Employee employee : directory.getDirectory()){

         if(employee.getGender().equals(gender)){
             count++;
             Object[] row = new Object[10];
             row[0]= employee;
             row[1]= employee.getEmployee_ID();
             row[2]= employee.getAge();
             row[3]= employee.getGender();
             row[4]= employee.getStart_date();
             row[5]= employee.getLevel();
             row[6]= employee.getTeam_info();
             row[7]= employee.getPosition_title();
             row[8]= employee.getCell_phone_number();
             row[9]= employee.getEmail_address();

             model.addRow(row);
         }
        }
    }//GEN-LAST:event_btnSearchGenderActionPerformed

    private void btnSearchStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStartDateActionPerformed
        // TODO add your handling code here:
        
        String start_date = txtSearchStartDate.getText();
       
        DefaultTableModel model = (DefaultTableModel) tblSearchEmployee.getModel();
        model.setRowCount(0);
        int count =0;
        for(Employee employee : directory.getDirectory()){

         if(employee.getStart_date().equals(start_date)){
             count++;
             Object[] row = new Object[10];
             row[0]= employee;
             row[1]= employee.getEmployee_ID();
             row[2]= employee.getAge();
             row[3]= employee.getGender();
             row[4]= employee.getStart_date();
             row[5]= employee.getLevel();
             row[6]= employee.getTeam_info();
             row[7]= employee.getPosition_title();
             row[8]= employee.getCell_phone_number();
             row[9]= employee.getEmail_address();

             model.addRow(row);
         }
       }
    }//GEN-LAST:event_btnSearchStartDateActionPerformed

    private void btnSearchCellPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCellPhoneNoActionPerformed
        // TODO add your handling code here:
       int cell_phone_number = Integer.parseInt(txtSearchCellPhoneNo.getText());
       
       DefaultTableModel model = (DefaultTableModel) tblSearchEmployee.getModel();
       model.setRowCount(0);
       int count =0;
       for(Employee employee : directory.getDirectory()){

        if(employee.getCell_phone_number()==(cell_phone_number)){
            count++;
            Object[] row = new Object[10];
             row[0]= employee;
             row[1]= employee.getEmployee_ID();
             row[2]= employee.getAge();
             row[3]= employee.getGender();
             row[4]= employee.getStart_date();
             row[5]= employee.getLevel();
             row[6]= employee.getTeam_info();
             row[7]= employee.getPosition_title();
             row[8]= employee.getCell_phone_number();
             row[9]= employee.getEmail_address();
          
            model.addRow(row);
         }
        }
        
    }//GEN-LAST:event_btnSearchCellPhoneNoActionPerformed

    private void btnPositionTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPositionTitleActionPerformed
        // TODO add your handling code here:
        
       String position_title = txtSearchPositionTitle.getText();
       
        DefaultTableModel model = (DefaultTableModel) tblSearchEmployee.getModel();
        model.setRowCount(0);
        int count =0;
        for(Employee employee : directory.getDirectory()){

         if(employee.getPosition_title().equals(position_title)){
             count++;
             Object[] row = new Object[10];
             row[0]= employee;
             row[1]= employee.getEmployee_ID();
             row[2]= employee.getAge();
             row[3]= employee.getGender();
             row[4]= employee.getStart_date();
             row[5]= employee.getLevel();
             row[6]= employee.getTeam_info();
             row[7]= employee.getPosition_title();
             row[8]= employee.getCell_phone_number();
             row[9]= employee.getEmail_address();

             model.addRow(row);
           }
        }  
    }//GEN-LAST:event_btnPositionTitleActionPerformed

    private void btnSearchEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEmployeeIDActionPerformed
        // TODO add your handling code here:
       int employee_id = Integer.parseInt(txtSearchEmployeeID.getText());
       
       DefaultTableModel model = (DefaultTableModel) tblSearchEmployee.getModel();
       model.setRowCount(0);
       int count =0;
       for(Employee employee : directory.getDirectory()){

        if(employee.getEmployee_ID().equals(employee_id)){
            count++;
            Object[] row = new Object[10];
             row[0]= employee;
             row[1]= employee.getEmployee_ID();
             row[2]= employee.getAge();
             row[3]= employee.getGender();
             row[4]= employee.getStart_date();
             row[5]= employee.getLevel();
             row[6]= employee.getTeam_info();
             row[7]= employee.getPosition_title();
             row[8]= employee.getCell_phone_number();
             row[9]= employee.getEmail_address();
          
            model.addRow(row);
           }
        }  
    }//GEN-LAST:event_btnSearchEmployeeIDActionPerformed

    private void btnSearchLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchLevelActionPerformed
        // TODO add your handling code here:
       String level = txtSearchLevel.getText();
       
        DefaultTableModel model = (DefaultTableModel) tblSearchEmployee.getModel();
        model.setRowCount(0);
        int count =0;
        for(Employee employee : directory.getDirectory()){

         if(employee.getLevel().equals(level)){
             count++;
             Object[] row = new Object[10];
             row[0]= employee;
             row[1]= employee.getEmployee_ID();
             row[2]= employee.getAge();
             row[3]= employee.getGender();
             row[4]= employee.getStart_date();
             row[5]= employee.getLevel();
             row[6]= employee.getTeam_info();
             row[7]= employee.getPosition_title();
             row[8]= employee.getCell_phone_number();
             row[9]= employee.getEmail_address();

             model.addRow(row);
           }
        }  
    }//GEN-LAST:event_btnSearchLevelActionPerformed

    private void txtSearchTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchTeamInfoActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_txtSearchTeamInfoActionPerformed

    private void btnSearchTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTeamInfoActionPerformed
        // TODO add your handling code here:
       String team_info = txtSearchTeamInfo.getText();
       
        DefaultTableModel model = (DefaultTableModel) tblSearchEmployee.getModel();
        model.setRowCount(0);
        int count =0;
        for(Employee employee : directory.getDirectory()){

         if(employee.getTeam_info().equals(team_info)){
             count++;
             Object[] row = new Object[10];
             row[0]= employee;
             row[1]= employee.getEmployee_ID();
             row[2]= employee.getAge();
             row[3]= employee.getGender();
             row[4]= employee.getStart_date();
             row[5]= employee.getLevel();
             row[6]= employee.getTeam_info();
             row[7]= employee.getPosition_title();
             row[8]= employee.getCell_phone_number();
             row[9]= employee.getEmail_address();

             model.addRow(row);
           }
        }  
    }//GEN-LAST:event_btnSearchTeamInfoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEmailAddressActionPerformed
        // TODO add your handling code here:
        String email_address = txtSearchEmailAddress.getText();
       
        DefaultTableModel model = (DefaultTableModel) tblSearchEmployee.getModel();
        model.setRowCount(0);
        int count =0;
        for(Employee employee : directory.getDirectory()){

         if(employee.getEmail_address().equals(email_address)){
             count++;
             Object[] row = new Object[10];
             row[0]= employee;
             row[1]= employee.getEmployee_ID();
             row[2]= employee.getAge();
             row[3]= employee.getGender();
             row[4]= employee.getStart_date();
             row[5]= employee.getLevel();
             row[6]= employee.getTeam_info();
             row[7]= employee.getPosition_title();
             row[8]= employee.getCell_phone_number();
             row[9]= employee.getEmail_address();

             model.addRow(row);
         }
        }
        
    }//GEN-LAST:event_btnSearchEmailAddressActionPerformed

    private void txtSearchStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchStartDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SearchAge;
    private javax.swing.JLabel SearchCellPhoneNumber;
    private javax.swing.JLabel SearchEmailAddress;
    private javax.swing.JLabel SearchEmployee_ID;
    private javax.swing.JLabel SearchGender;
    private javax.swing.JLabel SearchLevel;
    private javax.swing.JLabel SearchName;
    private javax.swing.JLabel SearchPositionTitle;
    private javax.swing.JLabel SearchPositionTitle1;
    private javax.swing.JLabel SearchStartDate;
    private javax.swing.JLabel SearchTeamInfo;
    private javax.swing.JButton btnPositionTitle;
    private javax.swing.JButton btnSearchAge;
    private javax.swing.JButton btnSearchCellPhoneNo;
    private javax.swing.JButton btnSearchEmailAddress;
    private javax.swing.JButton btnSearchEmployeeID;
    private javax.swing.JButton btnSearchGender;
    private javax.swing.JButton btnSearchLevel;
    private javax.swing.JButton btnSearchName;
    private javax.swing.JButton btnSearchStartDate;
    private javax.swing.JButton btnSearchTeamInfo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblSearchEmployee;
    private javax.swing.JTextField txtSearchAge;
    private javax.swing.JTextField txtSearchCellPhoneNo;
    private javax.swing.JTextField txtSearchEmailAddress;
    private javax.swing.JTextField txtSearchEmployeeID;
    private javax.swing.JTextField txtSearchGender;
    private javax.swing.JTextField txtSearchLevel;
    private javax.swing.JTextField txtSearchName;
    private javax.swing.JTextField txtSearchPositionTitle;
    private javax.swing.JTextField txtSearchStartDate;
    private javax.swing.JTextField txtSearchTeamInfo;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblSearchEmployee.getModel();
        model.setRowCount(0);
        
        for (Employee employee : directory.getDirectory()){
            
            
            Object[] row = new Object[10];
             row[0]= employee;
             row[1]= employee.getEmployee_ID();
             row[2]= employee.getAge();
             row[3]= employee.getGender();
             row[4]= employee.getStart_date();
             row[5]= employee.getLevel();
             row[6]= employee.getTeam_info();
             row[7]= employee.getPosition_title();
             row[8]= employee.getCell_phone_number();
             row[9]= employee.getEmail_address();
          
            model.addRow(row);
            
        }
    }
}
