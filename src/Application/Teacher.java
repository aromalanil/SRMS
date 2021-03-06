
package Application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 * @author Aromal Anil
 */

public class Teacher extends javax.swing.JFrame
{

    int teacherId;
    String teacherName,className,selectedClass,selectedSubject,fileName;
    
    
    public Teacher()
    {
        initComponents();
        
        //Setting Frame to centre of the screen
        this.setLocationRelativeTo(null);
                        
        //Table Customisation
        resultTable.getTableHeader().setBackground(new Color(103,71,206));
        resultTable.getTableHeader().setFont (new Font("Century Gothic", Font.BOLD,18));
        resultTable.getTableHeader().setForeground(new Color(255,255,255));
        
        this.setVisible(true);
        
        //Hiding elements related to the table and the table itself
        exportButton.setVisible(false);
        fileNameTextBox.setVisible(false);
        enterFileNameLabel.setVisible(false);
        seperatorLine.setVisible(false);
        csvLabel.setVisible(false);
        internalButton.setVisible(false);
        editAttendanceButton.setVisible(false);
        markAttendanceButton.setVisible(false);
        doneButton.setVisible(false);
        scrollPanel.setVisible(false);
    }
    
    
    //Method to initialise the details of the logged person
    void initialise()
    {
       try
       {
            //Creating a new Database Connection   
            MyDBConnection databaseConnection = new MyDBConnection();
            databaseConnection.init();
            Connection connection = databaseConnection.getMyConnection();
            Statement connectionStatement = connection.createStatement();
            
            //Getting the teachers name from database
            String query ="select name from teacher where id ="+Integer.toString(teacherId)+"";
        
            ResultSet resultSet;
            resultSet=connectionStatement.executeQuery(query);
            
            //If query gave an output
            if(resultSet.next())
            {
                //Setting the name of teacher
                teacherNameText.setText(resultSet.getString(1));
            }
            
            //Getting all the classes of the teacher
            query ="select class from main where teacher ='"+teacherName+"' group by class";
            resultSet=connectionStatement.executeQuery(query);
            
            //Adding the classes to the Dropdown List
            while(resultSet.next())
            {
                className=resultSet.getString(1);
                classList.addItem(className);
            }
            
            connection.close();
        }
        catch(Exception e)
        {
            System.out.println(e); 
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        classList = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        subjectList = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();
        teacherNameText = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        exportButton = new javax.swing.JButton();
        enterFileNameLabel = new javax.swing.JLabel();
        fileNameTextBox = new javax.swing.JTextField();
        seperatorLine = new javax.swing.JSeparator();
        csvLabel = new javax.swing.JLabel();
        internalButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        markAttendanceButton = new javax.swing.JButton();
        editAttendanceButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(126, 87, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name     :");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Class       :");

        classList.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        classList.setForeground(new java.awt.Color(126, 87, 255));
        classList.setBorder(null);
        classList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        classList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classListActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Subject   :");

        subjectList.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        subjectList.setForeground(new java.awt.Color(126, 87, 255));
        subjectList.setBorder(null);
        subjectList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subjectList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectListActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(255, 255, 255));
        submitButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(126, 87, 255));
        submitButton.setText("SUBMIT");
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButton.setFocusPainted(false);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        teacherNameText.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        teacherNameText.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(subjectList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(teacherNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(classList, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(teacherNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classList, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectList, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(105, 105, 105)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(103, 71, 206));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raw/teacher_icon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Teacher Login");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raw/logout_icon.png"))); // NOI18N
        jLabel8.setText("Logout");
        jLabel8.setToolTipText("");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOut(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanel.setBorder(null);

        resultTable.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        resultTable.setEnabled(false);
        resultTable.setRowHeight(30);
        scrollPanel.setViewportView(resultTable);

        exportButton.setBackground(new java.awt.Color(103, 71, 206));
        exportButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        exportButton.setForeground(new java.awt.Color(255, 255, 255));
        exportButton.setText("Export");
        exportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exportButton.setFocusPainted(false);
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });

        enterFileNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        enterFileNameLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        enterFileNameLabel.setText("Enter File Name :");

        fileNameTextBox.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        fileNameTextBox.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fileNameTextBox.setBorder(null);
        fileNameTextBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fileNameTextBoxKeyPressed(evt);
            }
        });

        csvLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        csvLabel.setText(".csv");

        internalButton.setBackground(new java.awt.Color(103, 71, 206));
        internalButton.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        internalButton.setForeground(new java.awt.Color(255, 255, 255));
        internalButton.setText("Edit Internals");
        internalButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        internalButton.setFocusPainted(false);
        internalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internalButtonActionPerformed(evt);
            }
        });

        doneButton.setBackground(new java.awt.Color(103, 71, 206));
        doneButton.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        doneButton.setForeground(new java.awt.Color(255, 255, 255));
        doneButton.setText("Done");
        doneButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doneButton.setFocusPainted(false);
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        markAttendanceButton.setBackground(new java.awt.Color(103, 71, 206));
        markAttendanceButton.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        markAttendanceButton.setForeground(new java.awt.Color(255, 255, 255));
        markAttendanceButton.setText("Mark Attendance");
        markAttendanceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        markAttendanceButton.setFocusPainted(false);
        markAttendanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markAttendanceButtonActionPerformed(evt);
            }
        });

        editAttendanceButton.setBackground(new java.awt.Color(103, 71, 206));
        editAttendanceButton.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        editAttendanceButton.setForeground(new java.awt.Color(255, 255, 255));
        editAttendanceButton.setText("Edit Attendance");
        editAttendanceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editAttendanceButton.setFocusPainted(false);
        editAttendanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAttendanceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(enterFileNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seperatorLine, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fileNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(csvLabel)
                        .addGap(34, 34, 34)
                        .addComponent(exportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(internalButton)
                        .addGap(18, 18, 18)
                        .addComponent(editAttendanceButton)
                        .addGap(18, 18, 18)
                        .addComponent(markAttendanceButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doneButton)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(internalButton)
                            .addComponent(doneButton)
                            .addComponent(markAttendanceButton)
                            .addComponent(editAttendanceButton))
                        .addGap(30, 30, 30)
                        .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(exportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterFileNameLabel)
                            .addComponent(csvLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fileNameTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(seperatorLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(74, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //Method to export the result as SpreadSheet
    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
             
        fileName=fileNameTextBox.getText();
        if(fileName.isEmpty())
        {
            infoBox("Please Enter a valid Filename", "Error");
        }
        else
        {
            ExcelWriter ex = new ExcelWriter();
            ex.toExcel(resultTable,fileName);
        }
    }//GEN-LAST:event_exportButtonActionPerformed

    
    
    
    //Method to Logout and enter the Login page
    private void logOut(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOut

        this.setVisible(false);
        Login log = new Login();
        
    }//GEN-LAST:event_logOut
    
    //Method to add the selected classes and subjects to variables
    private void subjectListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectListActionPerformed
        
        //Only excectutes when subjectlist is not empty 
        if(subjectList.getItemCount()>0)
        {
            selectedClass=classList.getSelectedItem().toString();
            selectedSubject=subjectList.getSelectedItem().toString();
            System.out.println("Selected Combination : "+selectedClass+" "+selectedSubject);
        }
        
    }//GEN-LAST:event_subjectListActionPerformed

    private void classListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classListActionPerformed

        //The subjects present now may be those of previous class so remove them.
        subjectList.removeAllItems();
        selectedClass=classList.getSelectedItem().toString();
        try
        {
            //Creating a new Database Connection
            MyDBConnection databaseConnection = new MyDBConnection();
            databaseConnection.init();
            Connection connection = databaseConnection.getMyConnection();
            Statement connectionStatement = connection.createStatement();
            
            
            //Getting Subject list of selected Class
            String query ="select subject from main where teacher ='"+teacherName+"' and class='"+selectedClass+"' group by subject";

            ResultSet resultSet;
            resultSet=connectionStatement.executeQuery(query);
            
            //Adding the subjects to drop down
            while(resultSet.next())
            {
                subjectList.addItem(resultSet.getString(1));
            }
            
            connection.close();
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }

    }//GEN-LAST:event_classListActionPerformed

    
    //Methord to export to excel by pressing enter key
    private void fileNameTextBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fileNameTextBoxKeyPressed

        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            exportButton.doClick();
        }
    }//GEN-LAST:event_fileNameTextBoxKeyPressed

    //Updating the database according to the editted student details
    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed

        try
        {
            
            //Creating a new Database Connection   
            MyDBConnection databaseConnection = new MyDBConnection();
            databaseConnection.init();
            Connection connection = databaseConnection.getMyConnection();
             
            TableModel model = resultTable.getModel();
        
            String query = "update main set name=?,internal1=?,internal2=?,attendance=? where (teacher='"+teacherName+"' and class='"+selectedClass+"' and subject='"+selectedSubject+"' and rollno =?)";
            PreparedStatement pst = connection.prepareStatement(query);
        
        for(int i=0; i< model.getRowCount(); i++) 
        {
                
                pst.setString(1, model.getValueAt(i,1).toString());
                pst.setInt(2, Integer.parseInt(model.getValueAt(i,2).toString()));
                pst.setInt(3, Integer.parseInt(model.getValueAt(i,3).toString()));
                pst.setInt(4, Integer.parseInt(model.getValueAt(i,4).toString()));
                pst.setInt(5, Integer.parseInt(model.getValueAt(i,0).toString()));
                pst.addBatch();
                
        }
        pst.executeBatch();
        resultTable.enable(false);
        infoBox("Database is Updated", "Database Updated");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_doneButtonActionPerformed

    //Making the table editable for entering the internal marks
    private void internalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internalButtonActionPerformed

        resultTable.enable(true);
        infoBox("You can now edit the table. Update internals and press DONE button", "Table is now Editable");
        
    }//GEN-LAST:event_internalButtonActionPerformed

    //Method for entering the attendance of each student in the list
    private void markAttendanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markAttendanceButtonActionPerformed
        
        int rollNo;
        int totalClass = 0,attendedClass=0,flg=0;
        float attendance=0;
        String studentName;
        
        try
        {
            //Creating a new Database Connection
            MyDBConnection databaseConnection = new MyDBConnection();
            databaseConnection.init();
            Connection connection = databaseConnection.getMyConnection();
            Statement connectionStatement = connection.createStatement();
            ResultSet resultSet;     
            TableModel model = resultTable.getModel();

        
            String queryOne = "update main set totalclass=?,attendedclass=?,attendance=? where (teacher='"+teacherName+"' and class='"+selectedClass+"' and subject='"+selectedSubject+"' and rollno =?)";
            PreparedStatement pst = connection.prepareStatement(queryOne);
        
        for(int i=0; i< model.getRowCount(); i++) 
        {
            rollNo=Integer.parseInt(model.getValueAt(i,0).toString());
            String queryTwo ="select totalclass,attendedclass from main where(teacher='"+teacherName+"' and class='"+selectedClass+"' and subject='"+selectedSubject+"' and rollno ="+rollNo+")";
            resultSet=connectionStatement.executeQuery(queryTwo);
            if(resultSet.next())
            {
                totalClass=resultSet.getInt(1);
                attendedClass=resultSet.getInt(2);
               
            }
            
            studentName=model.getValueAt(i,1).toString();
            
            
            int input = JOptionPane.showConfirmDialog(null, "Mark attendance of "+studentName+" ?");
            // 0=yes, 1=no, 2=cancel
            
            
            switch (input) 
            {
                case 0:
                        totalClass++;
                        attendedClass++;
                        attendance=(float) ((double)attendedClass/(double)totalClass)*100;
                        System.out.println(totalClass+" "+attendedClass+" "+attendance);
                        break;
                case 1:
                        totalClass++;
                        attendance=(float) ((double)attendedClass/(double)totalClass)*100;
                        System.out.println(totalClass+" "+attendedClass+" "+attendance);
                        break;
                case 2:
                        flg=1;
                        infoBox("Attendance Entry Failed", "No attendance is entered into the database");
                        break;
                default:
                        infoBox("Attendance Entry Failed", "No attendance is entered into the database");
                        flg=1;
                        break;
            }
            if(flg==1)
            {
                break;
            }
            
            pst.setInt(1, totalClass);
            pst.setInt(2, attendedClass);
            pst.setInt(3, (int) attendance);
            pst.setInt(4,Integer.parseInt(model.getValueAt(i,0).toString()));
            System.out.println(pst);
            pst.execute();  
            
        }
        connection.close();
        submitButton.doClick();
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }//GEN-LAST:event_markAttendanceButtonActionPerformed

    //Method to fetch details of selected class and subject and display it in the table
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        try
        {
            //Creating a new Database Connection
            MyDBConnection databaseConnection = new MyDBConnection();
            databaseConnection.init();
            Connection connection = databaseConnection.getMyConnection();
            Statement connectionStatement = connection.createStatement();

            String query ="select RollNo,NAME,INTERNAL1,INTERNAL2,ATTENDANCE from main where teacher='"+teacherName+"' and class='"+selectedClass+"' and subject='"+selectedSubject+"'";
            
            ResultSet resultSet=connectionStatement.executeQuery(query);
            
            //Setting table according to resultset
            resultTable.setModel(DbUtils.resultSetToTableModel(resultSet));
            scrollPanel.setVisible(true);   
            
            //Showing elements for Excel exporting
            internalButton.setVisible(true);
            editAttendanceButton.setVisible(true);
            markAttendanceButton.setVisible(true);
            doneButton.setVisible(true);
            fileNameTextBox.setVisible(true);
            enterFileNameLabel.setVisible(true);
            seperatorLine.setVisible(true);
            csvLabel.setVisible(true);
            exportButton.setVisible(true);

            connection.close();
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void editAttendanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAttendanceButtonActionPerformed
        
        Attendance attendance = new Attendance();
        attendance.selectedClass=selectedClass;
        attendance.selectedSubject=selectedSubject;
        attendance.teacherName=teacherName;
        attendance.initialise();
    }//GEN-LAST:event_editAttendanceButtonActionPerformed

    //Methord for Info box
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
                                          

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
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> classList;
    private javax.swing.JLabel csvLabel;
    private javax.swing.JButton doneButton;
    private javax.swing.JButton editAttendanceButton;
    private javax.swing.JLabel enterFileNameLabel;
    private javax.swing.JButton exportButton;
    private javax.swing.JTextField fileNameTextBox;
    private javax.swing.JButton internalButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton markAttendanceButton;
    public javax.swing.JTable resultTable;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JSeparator seperatorLine;
    private javax.swing.JComboBox<String> subjectList;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel teacherNameText;
    // End of variables declaration//GEN-END:variables

}
