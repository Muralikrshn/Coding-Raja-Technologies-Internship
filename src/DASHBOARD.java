import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author murha
 */
public class DASHBOARD extends javax.swing.JFrame {

    /**
     * Creates new form DASHBOARD
     */
    public DASHBOARD() {
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

        Dashboard = new javax.swing.JLabel();
        booksavailable = new javax.swing.JButton();
        removebooks = new javax.swing.JButton();
        staffdetails = new javax.swing.JButton();
        addbooks = new javax.swing.JButton();
        AddStaff = new javax.swing.JButton();
        removestaff = new javax.swing.JButton();
        editadmin = new javax.swing.JButton();
        bookstatistics = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N

        Dashboard.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dashboard.setText("DASHBOARD");

        booksavailable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        booksavailable.setText("BOOKS AVAILABLE");
        booksavailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksavailableActionPerformed(evt);
            }
        });

        removebooks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        removebooks.setText("REMOVE BOOKS");
        removebooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebooksActionPerformed(evt);
            }
        });

        staffdetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        staffdetails.setText("STAFF DETAILS");
        staffdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffdetailsActionPerformed(evt);
            }
        });

        addbooks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addbooks.setText("ADD BOOKS");
        addbooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbooksActionPerformed(evt);
            }
        });

        AddStaff.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddStaff.setText("ADD STAFF");
        AddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStaffActionPerformed(evt);
            }
        });

        removestaff.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        removestaff.setText("REMOVE STAFF");
        removestaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removestaffActionPerformed(evt);
            }
        });

        editadmin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editadmin.setText("EDIT ADMIN");
        editadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editadminActionPerformed(evt);
            }
        });

        bookstatistics.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bookstatistics.setText("BOKK STATISTICS");
        bookstatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookstatisticsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(booksavailable, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removebooks, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(staffdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removestaff, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookstatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(booksavailable, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removestaff, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removebooks, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookstatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbooksActionPerformed
        // TODO add your handling code here:
        AddBooks ab = new AddBooks();
        ab.setVisible(true);
        
    }//GEN-LAST:event_addbooksActionPerformed

    private void booksavailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksavailableActionPerformed
        // TODO add your handling code here:
        BooksAvailable books = new BooksAvailable();
        books.setVisible(true);
    }//GEN-LAST:event_booksavailableActionPerformed

    private void AddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStaffActionPerformed
        // TODO add your handling code here:
        AddStaff as = new AddStaff();
        as.setVisible(true);
    }//GEN-LAST:event_AddStaffActionPerformed

    private void removebooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebooksActionPerformed
        // TODO add your handling code here:
        RemoveBooks rb = new RemoveBooks();
        rb.setVisible(true);
        
    }//GEN-LAST:event_removebooksActionPerformed

    private void staffdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffdetailsActionPerformed
        // TODO add your handling code here:
        StaffDetails sd = new StaffDetails();
        sd.setVisible(true);
    }//GEN-LAST:event_staffdetailsActionPerformed

    private void removestaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removestaffActionPerformed
        // TODO add your handling code here:
        RemoveStaff rs = new RemoveStaff();
        rs.setVisible(true);
    }//GEN-LAST:event_removestaffActionPerformed

    private void editadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editadminActionPerformed
        // TODO add your handling code here:
        EditAdmin ea = new EditAdmin();
        ea.setVisible(true);
    }//GEN-LAST:event_editadminActionPerformed

    private void bookstatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookstatisticsActionPerformed
        // TODO add your handling code here:
        bookstatistics bs = new bookstatistics();
        bs.setVisible(true);
    }//GEN-LAST:event_bookstatisticsActionPerformed

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
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DASHBOARD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStaff;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JButton addbooks;
    private javax.swing.JButton booksavailable;
    private javax.swing.JButton bookstatistics;
    private javax.swing.JButton editadmin;
    private javax.swing.JButton removebooks;
    private javax.swing.JButton removestaff;
    private javax.swing.JButton staffdetails;
    // End of variables declaration//GEN-END:variables
}
