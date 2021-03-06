/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_6;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
   
/**
 *
 * @author jjjjjjjjjjjjjjjjjjjj
 */
public class FromDataBaru extends javax.swing.JFrame {

    private Connection con = koneksi.getConnection();
    private Statement stt;
    private ResultSet rss;
    private Object cn;
    /**
     * Creates new form FromDataBaru
     */
    public FromDataBaru() {
        initComponents();
    }
   private DefaultTableModel model;
    public void InitTable(){
    model = new DefaultTableModel();
    model.addColumn("ID BUKU");
    model.addColumn("JUDUL");
    model.addColumn("PENULIS");
    model.addColumn("HARGA");
    jTable2.setModel(model);
    }
    private void TampilData(){
        try{
            String sql = "SELECT * FROM buku";
            stt = con.createStatement();
            rss = stt.executeQuery(sql);
            while(rss.next()){
                Object[] o = new Object[4];
                o[0] = rss.getString("id");
                o[1] = rss.getString("judul");
                o[2] = rss.getString("penulis");
                o[3] = rss.getInt("harga");
                model.addRow(o);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    private void TambahData(String id,String judul, String penulis, String harga ){
     try{
         String sql = "INSERT INTO buku VALUES('"+id+"','"+judul+"','"+penulis+"',"+harga+")";
         stt = con.createStatement();
         stt.executeUpdate(sql);
         //model.addRow(new Object[]{id,judul,penulis,harga});
     }   
     catch(SQLException e){
         System.out.println(e.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Judul = new javax.swing.JTextField();
        Harga = new javax.swing.JTextField();
        Penulis = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        IdB = new javax.swing.JTextField();
        Simpan = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Cari = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Judul");

        jLabel3.setText("Penulis");

        Judul.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                JudulCaretUpdate(evt);
            }
        });
        Judul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JudulKeyTyped(evt);
            }
        });

        Harga.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                HargaCaretUpdate(evt);
            }
        });
        Harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HargaKeyTyped(evt);
            }
        });

        Penulis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tere Liye", "W.S Rendra", "Felix Slauw", "Asma Nadia", "Dewi Lestari" }));
        Penulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenulisActionPerformed(evt);
            }
        });

        jLabel4.setText("Harga");

        IdB.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                IdBCaretUpdate(evt);
            }
        });
        IdB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdBActionPerformed(evt);
            }
        });
        IdB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdBKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(IdB, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Harga))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Judul))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        jButton2.setText("Ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("keluar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "JUDUL", "Penulis", "Harga"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariActionPerformed(evt);
            }
        });

        jButton5.setText("search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setText("by");

        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "id", "Judul", "Penulis" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Simpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Simpan)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        InitTable();
        TampilData();
    }//GEN-LAST:event_formComponentShown

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
        String id = IdB.getText();
        String judul = Judul.getText();
        String penulis = Penulis.getSelectedItem().toString();
        String harga = Harga.getText();
        TambahData (id,judul, penulis, harga);
        InitTable();
        TampilData();
    }//GEN-LAST:event_SimpanActionPerformed

    private void PenulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenulisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PenulisActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed
//String id;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         
// int ok = JOptionPane.showConfirmDialog(null,"Apakah Yakin Mendelete record ini???", "Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
//       if (ok==0)
//       {
//        try
//         {
//            String sql="delete from buku where id='"+IdB.getText()+"'";
//            PreparedStatement st=con.prepareStatement(sql);
//            st.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Delete Data Sukses");
//         }
//        catch (Exception e)
//        {
//            JOptionPane.showMessageDialog(null, "Delete Data Gagal");
//        }
//       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
if(combo.getSelectedItem().equals("id")){       
    try
        {
            Statement st = con.createStatement();
            String id = Cari.getText();
            ResultSet rs = st.executeQuery("SELECT * FROM buku WHERE id like '%"+id+"%' ");
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();

            dtm.setRowCount(0);
            String [] data = new String[6];
            int i = 1;

            while(rs.next())
            {
                data[0] = rs.getString("id");
                data[1] = rs.getString("judul");
                data[2] = rs.getString("penulis");
                data[3] = rs.getString("harga");
                dtm.addRow(data);
                i++;
            }
            rs.close();
           // Cari.setText("");
        }
        catch(Exception e)  {
            JOptionPane.showMessageDialog(null,"Data yang Anda cari Tidak dapat Ditemukan","kesalahan",JOptionPane.WARNING_MESSAGE);
//            System.err.println("error (search) : " +ex);
        }
}
else if(combo.getSelectedItem().equals("Judul")){
    try
        {
            Statement st = con.createStatement();
            String judul = Cari.getText();
            ResultSet rs = st.executeQuery("SELECT * FROM buku WHERE judul like '%"+judul+"%'");
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();

            dtm.setRowCount(0);
            String [] data = new String[6];
            int i = 1;

            while(rs.next())
            {
                data[0] = rs.getString("id");
                data[1] = rs.getString("judul");
                data[2] = rs.getString("penulis");
                data[3] = rs.getString("harga");
                dtm.addRow(data);
                i++;
            }
            rs.close();
           // Cari.setText("");
        }
        catch(SQLException e)  {
            JOptionPane.showMessageDialog(null,"Data yang Anda cari Tidak dapat Ditemukan","kesalahan",JOptionPane.WARNING_MESSAGE);
            System.err.println("error (search) : " +e);
        }
}
else if(combo.getSelectedItem().equals("Penulis")){
    try
        {
            Statement st = con.createStatement();
            String penulis = Cari.getText();
            ResultSet rs = st.executeQuery("SELECT * FROM buku WHERE penulis like '%"+penulis+"%'");
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();

            dtm.setRowCount(0);
            String [] data = new String[6];
            int i = 1;

            while(rs.next())
            {
                data[0] = rs.getString("id");
                data[1] = rs.getString("judul");
                data[2] = rs.getString("penulis");
                data[3] = rs.getString("harga");
                dtm.addRow(data);
                i++;
            }
            rs.close();
           // Cari.setText("");
        }
        catch(Exception e)  {
            JOptionPane.showMessageDialog(null,"Data yang Anda cari Tidak dapat Ditemukan","kesalahan",JOptionPane.WARNING_MESSAGE);
//            System.err.println("error (search) : " +ex);
        }
}
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_CariActionPerformed
    private void EditData(String id,String judul, String penulis, String harga){
//        try {
//            String sql = "update buku set id='"+id+"',judul='"+judul+"',penulis='"+penulis+"',harga="+harga+" where judul='"+IdB.getText()+"'";//penulisan query edit berupa update
//            /*pembentukan stetmen dan juga eksekusi query*/
//            stt = con.createStatement();
//            stt.executeUpdate(sql);
//            /*mengosongkan form dan field pada frame*/
//            IdB.setText("");
//            Judul.setText("");
//            Penulis.setSelectedIndex(0);
//            Harga.setText("");
//            
//            
//        } catch (SQLException ex) {
//             System.out.println(ex.getMessage());
//        }
        }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        String id = IdB.getText();
//        String judul = Judul.getText();
//        String penulis = Penulis.getSelectedItem().toString();
//        String harga = Harga.getText();
//        
//        int ok=JOptionPane.showConfirmDialog(this,"Apakah Yakin Untuk Update Record ini???","Confirmation",JOptionPane.YES_NO_OPTION);
//         try
//            {
//                if(ok==0)
//                {
//                try
//                    {
//                        EditData(id,judul,penulis,harga); //menjalankan fungsi EditData tadi dengan parameter yang ada
//                        InitTable(); //untuk membuat atau meload ulang model yang ada sehingga akan update ketika ada perubahan setelah dilakukan EditData di database
//                        TampilData();//untuk menampilkan model baru yang telah di load
//                        Simpan.setEnabled(true);//menimbulkan saat bedit di klik
//                        JOptionPane.showMessageDialog(this,"Update Data Sukses");
//                    }
//                catch (Exception e)
//                    {
//                        JOptionPane.showMessageDialog(this, "Update Data Gagal");
//                    }
//                }
//                
//           }catch (Exception e){}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void IdBCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_IdBCaretUpdate
        // TODO add your handling code here:
        if(IdB.getText().length() !=0 && Judul.getText().length() !=0 && Harga.getText().length() !=0){
            Simpan.setEnabled(true);
        }
        else{
            Simpan.setEnabled(false);
        }
    }//GEN-LAST:event_IdBCaretUpdate

    private void JudulCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_JudulCaretUpdate
        // TODO add your handling code here:
        
        if(IdB.getText().length() !=0 && Judul.getText().length() !=0 && Harga.getText().length() !=0){
            Simpan.setEnabled(true);
        }
        else{
            Simpan.setEnabled(false);
        }
    }//GEN-LAST:event_JudulCaretUpdate

    private void HargaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_HargaCaretUpdate
        // TODO add your handling code here:
        
        if(IdB.getText().length() !=0 && Judul.getText().length() !=0 && Harga.getText().length() !=0){
            Simpan.setEnabled(true);
        }
        else{
            Simpan.setEnabled(false);
        }
    }//GEN-LAST:event_HargaCaretUpdate
void filterhuruf(KeyEvent a){
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null,"Pada Kolom Nomor Telpon Hanya Bisa Memasukan Karakter Angka","kesalahan",JOptionPane.WARNING_MESSAGE);
        }
    }
    private void IdBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdBKeyTyped
        // TODO add your handling code here:
        filterhuruf(evt);
    }//GEN-LAST:event_IdBKeyTyped

    private void HargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HargaKeyTyped
        // TODO add your handling code here:
        filterhuruf(evt);
    }//GEN-LAST:event_HargaKeyTyped
void filterangka(KeyEvent b){
if(Character.isDigit(b.getKeyChar())){
            b.consume();
            JOptionPane.showMessageDialog(null,"Pada Kolom Nama Hanya Bisa Memasukan Karakter Huruf","kesalahan",JOptionPane.WARNING_MESSAGE);
        }    
}
    private void JudulKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JudulKeyTyped
        // TODO add your handling code here:
        filterangka(evt);
    }//GEN-LAST:event_JudulKeyTyped

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void IdBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdBActionPerformed

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
            java.util.logging.Logger.getLogger(FromDataBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromDataBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromDataBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromDataBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromDataBaru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cari;
    private javax.swing.JTextField Harga;
    private javax.swing.JTextField IdB;
    private javax.swing.JTextField Judul;
    private javax.swing.JComboBox Penulis;
    private javax.swing.JButton Simpan;
    private javax.swing.JComboBox combo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
