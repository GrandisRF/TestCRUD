
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkomm
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtKelas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdLaki = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        rdPerempuan = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        rdmenikah = new javax.swing.JRadioButton();
        rdblmmenikah = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtumur = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txthobi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("NIS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 140, 130, 30);

        txtNIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNISActionPerformed(evt);
            }
        });
        getContentPane().add(txtNIS);
        txtNIS.setBounds(10, 160, 220, 30);

        jLabel3.setText("Jenis Kelamin");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 240, 90, 20);

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama);
        txtNama.setBounds(10, 210, 220, 30);

        txtKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKelasActionPerformed(evt);
            }
        });
        getContentPane().add(txtKelas);
        txtKelas.setBounds(10, 310, 220, 30);

        jLabel4.setText("Kelas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 290, 130, 30);

        jLabel6.setText("Nama");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 190, 130, 30);

        buttonGroup1.add(rdLaki);
        rdLaki.setText("Laki - Laki");
        rdLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdLakiActionPerformed(evt);
            }
        });
        getContentPane().add(rdLaki);
        rdLaki.setBounds(10, 270, 100, 23);

        jLabel7.setText("Email");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 340, 130, 30);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        jLabel2.setText("ISIAN DATA SISWA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 0, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 80, 250, 40);

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.setForeground(new java.awt.Color(51, 204, 255));
        jPanel3.setLayout(null);

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel3.add(btnEdit);
        btnEdit.setBounds(480, 10, 73, 20);

        btnAdd.setText("Save");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdd);
        btnAdd.setBounds(120, 10, 73, 20);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);
        btnDelete.setBounds(210, 10, 73, 20);

        Reset.setText("Clear");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel3.add(Reset);
        Reset.setBounds(300, 10, 73, 20);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel3.add(btnRefresh);
        btnRefresh.setBounds(390, 10, 73, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(260, 80, 730, 40);

        jPanel4.setBackground(new java.awt.Color(51, 204, 255));
        jPanel4.setForeground(new java.awt.Color(51, 204, 255));
        jPanel4.setLayout(null);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NamaSiswa", "JenisKelamin", "Kelas", "Email", "Alamat", "Umur", "Status", "Hobi"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 720, 90);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(260, 130, 730, 530);

        buttonGroup1.add(rdPerempuan);
        rdPerempuan.setText("Perempuan");
        rdPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPerempuanActionPerformed(evt);
            }
        });
        getContentPane().add(rdPerempuan);
        rdPerempuan.setBounds(120, 270, 100, 23);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setForeground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 170, 0, 400);

        jPanel5.setBackground(new java.awt.Color(102, 255, 0));
        jPanel5.setLayout(null);

        jLabel8.setBackground(new java.awt.Color(255, 0, 51));
        jLabel8.setFont(new java.awt.Font("Rod", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("TELKOM SCHOOL MALANG");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(290, 0, 400, 70);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 990, 70);

        jLabel10.setText("Alamat");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 390, 130, 30);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(10, 360, 220, 30);

        jPanel7.setBackground(new java.awt.Color(51, 204, 255));
        jPanel7.setForeground(new java.awt.Color(51, 204, 255));
        jPanel7.setLayout(null);

        buttonGroup2.add(rdmenikah);
        rdmenikah.setText("Menikah");
        jPanel7.add(rdmenikah);
        rdmenikah.setBounds(10, 450, 90, 23);

        buttonGroup2.add(rdblmmenikah);
        rdblmmenikah.setText("Belum Menikah");
        jPanel7.add(rdblmmenikah);
        rdblmmenikah.setBounds(120, 450, 110, 23);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane3.setViewportView(txtAlamat);

        jPanel7.add(jScrollPane3);
        jScrollPane3.setBounds(10, 280, 220, 96);

        jLabel9.setText("Umur");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(10, 380, 130, 30);

        txtumur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtumurActionPerformed(evt);
            }
        });
        jPanel7.add(txtumur);
        txtumur.setBounds(10, 400, 220, 30);

        jLabel11.setText("Status");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(10, 430, 130, 30);

        txthobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthobiActionPerformed(evt);
            }
        });
        jPanel7.add(txthobi);
        txthobi.setBounds(10, 490, 220, 30);

        jLabel5.setText("Hobi");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(10, 470, 130, 30);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 130, 250, 530);

        setBounds(0, 0, 1000, 701);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNISActionPerformed

    private void txtKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKelasActionPerformed

    private void txthobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthobiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthobiActionPerformed

    private void rdLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdLakiActionPerformed

    private void rdPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPerempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdPerempuanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
    if ("".equals(txtNIS.getText()) || "".equals(txtAlamat.getText()) || "".equals(txtKelas.getText())
                || "".equals(txtNama.getText()) || "".equals(txthobi.getText())){
        JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
    } else {
            String JK = "";
                if (rdLaki.isSelected())
            {
                JK = "L";
            } else {
                JK = "P";
            } 
                
            String Stt = "";
                if (rdmenikah.isSelected())
                {
                    Stt = "M";
                } else {
                    Stt = "BM";
                }
                
        String SQL = "UPDATE t_siswa SET "
                + "WHERE NamaSiswa='"+txtNama.getText()+"',"
                + "WHERE JenisKelamin='"+JK+"',"
                + "WHERE Kelas='"+txtKelas.getText()+"',"
                + "WHERE Email='"+txtEmail.getText()+"'"
                + "WHERE Alamat='"+txtAlamat.getText()+"'"
                + "WHERE NIS='"+txtNIS.getText()+"'"
                + "WHERE Umur='"+txtumur.getText()+"'"
                + "WHERE Status='"+Stt+"'"
                + "WHERE Hobi='"+txthobi.getText()+"'";
        int status = KoneksiDB.execute(SQL);
        if (status == 0)
        {
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            selectData();
        } else {
            JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
            }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if ("".equals(txtNIS.getText()) || "".equals(txtAlamat.getText()) || "".equals(txtKelas.getText())
                || "".equals(txtNama.getText()) || "".equals(txtEmail.getText())){
        JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
    } else {
            String JK = "";
                if (rdLaki.isSelected())
            {
                JK = "L";
            } else {
                JK = "P";
            }
                String Stt = "";
                if (rdmenikah.isSelected())
                {
                    Stt = "M";
                } else {
                    Stt = "BM";
                }
        String SQL = "INSERT INTO t_siswa (NIS, NamaSiswa, JenisKelamin, Kelas, Email, Alamat, Umur, Status, Hobi)"
                + "VALUES ('"+txtNIS.getText()+"','"+txtNama.getText()+"','"+JK+"',"
                + "'"+txtKelas.getText()+"','"+txtEmail.getText()+"','"+txtAlamat.getText()+"',"
                + "'"+txtumur.getText()+"','"+Stt+"',"+txthobi.getText()+"')";
        int status = KoneksiDB.execute(SQL);
        if (status == 1)
        {
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            selectData();
        } else {
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
            int baris = tblData.getSelectedRow();
            if (baris != -1) {
                String NIS = tblData.getValueAt(baris, 0).toString();
                String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
                int status = KoneksiDB.execute(SQL);
                if (status==1) {
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
            }
                    
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
         txtNama.setText("");
         txtNIS.setText("");
         txtKelas.setText("");
         buttonGroup1.clearSelection();
         txthobi.setText("");
         txtAlamat.setText("");
         txtumur.setText("");
         buttonGroup2.clearSelection();
         txthobi.setText("");
                 
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        selectData();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            txtNIS.setText(tblData.getValueAt(baris, 0).toString());
            txtNama.setText(tblData.getValueAt(baris,1).toString());
            if ("Laki-Laki".equals(tblData.getValueAt(baris, 2).toString())) {
                rdLaki.setSelected(true);
            }
            else {
                rdPerempuan.setSelected(true);
            }
            txtKelas.setText(tblData.getValueAt(baris, 3).toString());
            txtEmail.setText(tblData.getValueAt(baris, 4).toString());
            txtAlamat.setText(tblData.getValueAt(baris, 5).toString());
            txtumur.setText(tblData.getValueAt(baris, 6).toString());
            if ("Menikah".equals(tblData.getValueAt(baris, 7).toString())) {
                rdmenikah.setSelected(true);
            }
            else {
                rdblmmenikah.setSelected(true);
            }
            
            txthobi.setText(tblData.getValueAt(baris, 8).toString());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDataMouseClicked

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtumurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtumurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtumurActionPerformed
        public void selectData()
        {
            String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","Email","Alamat"};
            DefaultTableModel dtm = new DefaultTableModel(null, kolom);
            String SQL = "SELECT * FROM t_siswa";
            ResultSet rs = KoneksiDB.executeQuery(SQL);
            try {
                while(rs.next()) {
                    String NIS = rs.getString(1);
                    String NamaSiswa = rs.getString(2);
                    String JenisKelamin = "";
                    if("L".equals(rs.getString(3))){
                        JenisKelamin = "Laki-Laki";
                    } else {
                        JenisKelamin = "Perempuan";
                    }
                    
                    String Kelas = rs.getString(4);
                    String Email = rs.getString(5);
                    String Alamat = rs.getString(6);
                    String Umur = rs.getString(7);
                    String Status = "";
                    if("M".equals(rs.getString(8))){
                        Status = "Menikah";
                    } else {
                        Status = "Belum Menikah";
                    }
                    String Hobi = rs.getString(9);
                    
                    String data[] = {NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat,Umur,Status,Hobi};
                    dtm.addRow(data);
                }
                       
                } catch (SQLException ex){
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                }
             tblData.setModel(dtm);
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdLaki;
    private javax.swing.JRadioButton rdPerempuan;
    private javax.swing.JRadioButton rdblmmenikah;
    private javax.swing.JRadioButton rdmenikah;
    private javax.swing.JTable tblData;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txthobi;
    private javax.swing.JTextField txtumur;
    // End of variables declaration//GEN-END:variables

}
