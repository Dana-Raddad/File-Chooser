package filechooser;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;


public class file extends javax.swing.JFrame {

    
    public file() {
        initComponents();
        setVisible(true);
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(175, 220, 239));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "chosefile", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 255));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));

        jTextArea1.setBackground(new java.awt.Color(255, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setBackground(new java.awt.Color(204, 102, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("select");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));

        jButton1.setBackground(new java.awt.Color(153, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 102));
        jButton1.setText("exsit");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 0));
        jButton3.setText("clear");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //System.out.println("exsit"); 
        if(evt.getActionCommand() == null ? jButton1.getText() == null : evt.getActionCommand().equals(jButton1.getText()))dispose();   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //System.out.println("select");
       
        
                JFileChooser choose=new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                choose.setDialogTitle(" file and directory selection:");
		choose.setMultiSelectionEnabled(true);
		choose.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
             
                  int returnValue = choose.showOpenDialog(this);
                
		if (returnValue == JFileChooser.APPROVE_OPTION) {
                    
		    returnValue = choose.getFileSelectionMode();
                    
                     String my=choose.getSelectedFile().getPath();
                        java.io.File x=new java.io.File(my);
                        if(x.isDirectory()){ 
                           
                            iamDirectory(x);}
                        if(x.isFile()){ISFile(my);}
                }
                    /*
		    if (returnValue == (1+(JFileChooser.DIRECTORIES_ONLY))) {
                         System.out.print("f");
                        System.out.print(JFileChooser.FILES_ONLY);
                        System.out.print("d");
                        System.out.print(JFileChooser.DIRECTORIES_ONLY);
			String my=choose.getSelectedFile().getPath();
                        java.io.File x=new java.io.File(my);
                           imDirectory(x);
		     }
                    else if(returnValue == (1+JFileChooser.FILES_ONLY))
                    {   System.out.print("f");
                        System.out.print(JFileChooser.FILES_ONLY);
                    String my=choose.getSelectedFile().getPath();
                        java.io.File x=new java.io.File(my);
                            ISFile(my);}
                } */                            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //System.out.println("clear");
        jTextArea1.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed
public void ISFile(String mypath)
    {
        try {
        File x=new File(mypath);
        System.out.println("----------------------"+"\n"+ "1. Iam File "+ "\n");
    jTextArea1.setText("2. the file name is : "+x.getName()+"\n");
    jTextArea1.append("3. the file exists is :"+x.exists()+"\n");
    jTextArea1.append("4. the file length is :"+x.length()+"\n");
    jTextArea1.append("5. the file if is hidden  :"+x.isHidden()+"\n");
    jTextArea1.append("6. the file if is Absolute  :"+x.isAbsolute()+"\n");
    jTextArea1.append("7. the file path is : "+x.getPath()+"\n");
    jTextArea1.append("8. the file parent is :"+x.getParent()+"\n");
    jTextArea1.append("9. if i canRead file : "+x.canRead()+"\n");
    jTextArea1.append("10. if i canWrite file parent is : "+x.canWrite()+"\n");
    jTextArea1.append("11. if i canExecute file parent is : "+x.canExecute()+"\n");
    jTextArea1.append("12. the AbsoluteFile is : "+x.getAbsoluteFile()+"\n");
    jTextArea1.append("13. the CanonicalFile is : "+x.getCanonicalFile()+"\n");   
    jTextArea1.append("14. the FreeSpace File is : "+x.getFreeSpace()+"\n");
    jTextArea1.append("15. the ParentFile is : "+x.getParentFile()+"\n");
    jTextArea1.append("16. the TotalSpace File is : "+x.getTotalSpace()+"\n");
    jTextArea1.append("17. the UsableSpace File is : "+x.getUsableSpace()+"\n");
         } catch ( IOException ex) { 
            System.out.println(" TOexception");
           
        }
    catch ( Exception ex) { 
            System.out.println("exception");
           
        }
    }
   public void iamDirectory(java.io.File mypath) 
    {
        jTextArea1.append("##############################"+"\n");
          jTextArea1.append("----------------------------------"+"\n"+ "1. Iam Directore " + "My name is :"+ mypath.getName()+ "\n");
    jTextArea1.append("2. Directore exists is :"+mypath.exists()+"\n");
    jTextArea1.append("3. Directore length is :"+mypath.length()+"\n");
    jTextArea1.append("4. Directore if is hidden  :"+mypath.isHidden()+"\n");
    jTextArea1.append("5. Directore if is Absolute  :"+mypath.isAbsolute()+"\n");
    jTextArea1.append("6. Directore path is : "+mypath.getPath()+"\n");
    jTextArea1.append("7. Directore parent is :"+mypath.getParent()+"\n");
    jTextArea1.append("8. if i canRead Directore : "+mypath.canRead()+"\n");
    jTextArea1.append("9. if i canWrite Directore parent is : "+mypath.canWrite()+"\n");
    jTextArea1.append("10. if i canExecute Directore parent is : "+mypath.canExecute()+"\n");
    jTextArea1.append("11. the AbsoluteDirectore is : "+mypath.getAbsoluteFile()+"\n");  
    jTextArea1.append("12. the FreeSpace Directore is : "+mypath.getFreeSpace()+"\n");
    jTextArea1.append("13. the ParentDirectore is : "+mypath.getParentFile()+"\n");
    jTextArea1.append("14. the TotalSpace Directore is : "+mypath.getTotalSpace()+"\n");
    jTextArea1.append("15. the UsableSpace Directore is : "+mypath.getUsableSpace()+"\n");
    jTextArea1.append("################################"+"\n");
         java.io.File[]A=mypath.listFiles();
                            for(int i=0;i<A.length;i++)
                            {    
                                if(A[i].isFile())
                            iamFile(A[i].getPath());
                                else if(A[i].isDirectory())
                                 iamDirectory(A[i]) ;  
                            }
    }
    public void iamFile(String mypath)
    {
        java.io.File x=new java.io.File(mypath);
         jTextArea1.append("the file name is : "+x.getName()+"\n");
         
         jTextArea1.append("***************************"+"\n");
    }
 
/*
public void Dir(file s){
         s=new file(); 
        if(s.isDirectory()){
            
            
            File [] N = f.listFiles();
            for(int i=0;i<N.length;i++){
                   jTextArea1.setText("The file name is         :"+N[i].getName()+"\n");
                   jTextArea1.append("The file exists is       :"+N[i].exists()+"\n");
                   jTextArea1.append("The file path is         :"+N[i].getPath()+"\n");
                   jTextArea1.append("The can Read is          :"+N[i].canRead()+"\n");
                   jTextArea1.append("The can Write is         :"+N[i].canWrite()+"\n");
                   jTextArea1.append("The can Execute is       :"+N[i].canExecute()+"\n");}
           for(int i=0;i<N.length;i++){
               File Temp1 = new File (f.getAbsoluteFile()+"\\"+N[i]);
                if (Temp1.isDirectory())
                    Dir(Temp1.getAbsolutePath());
                                                       
                else if (Temp1.isFile())
                    ISFile(Temp1.getAbsolutePath());
           }
        
        }
       else if(f.isFile())
             ISFile(s);
       
     }*/
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
            java.util.logging.Logger.getLogger(file.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(file.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(file.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(file.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        /*/* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new file().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
