/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author intel
 */
public class ViewClients extends javax.swing.JFrame {

    /**
     * Creates new form ViewClients
     */
    public ViewClients() {
        initComponents();
        setLocationRelativeTo(null);
        d.setSelectableDateRange(new java.util.Date("01/01/1950"), new java.util.Date());
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
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        t = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        rTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        l3 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        l4 = new javax.swing.JCheckBox();
        g1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        g2 = new javax.swing.JRadioButton();
        g3 = new javax.swing.JRadioButton();
        c = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        a = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        l1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        l2 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        cid = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ClientSol[ViewClients]");

        jLabel1.setText("Name:");

        t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tActionPerformed(evt);
            }
        });
        t.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tKeyReleased(evt);
            }
        });

        rTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CID", "Name", "Gender", "Dob", "Country", "Address", "Language"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rTable);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("Address:");

        l3.setText("Spanish");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setText("Language:");

        l4.setText("French");

        buttonGroup1.add(g1);
        g1.setSelected(true);
        g1.setText("Male");

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(g2);
        g2.setText("Female");

        buttonGroup1.add(g3);
        g3.setText("Other");

        c.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "India", "USA", "England", "Nepal", "China", "Japan", "SriLanka" }));

        a.setColumns(20);
        a.setRows(5);
        jScrollPane2.setViewportView(a);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Name:");

        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("Gender:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("DOB:");

        l1.setText("Hindi");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Country:");

        l2.setText("English");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("Client ID:");

        cid.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        cid.setText("0");

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(t)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(n))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(g1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(g2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(g3))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(c, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(l4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(l1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(l2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(l3)
                                        .addGap(0, 131, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g1)
                    .addComponent(g2)
                    .addComponent(g3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1)
                    .addComponent(l2)
                    .addComponent(l3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tKeyReleased
        try{
            javax.swing.table.DefaultTableModel dtm=
                    (javax.swing.table.DefaultTableModel)rTable.getModel();
            int rc=dtm.getRowCount();
            while(rc--!=0){
                dtm.removeRow(0);
            }
            String n=t.getText();
            db.DbConnect.getClient.setString(1,"%"+n+"%");
            ResultSet rs=db.DbConnect.getClient.executeQuery();
            while(rs.next()){
                java.util.Vector r=new java.util.Vector();
                r.add(rs.getInt("cid"));
                r.add(rs.getString("name"));
                r.add(rs.getString("gender"));
                r.add(rs.getDate("dob"));
                r.add(rs.getString("country"));
                r.add(rs.getString("address"));
                r.add(rs.getString("language"));
                dtm.addRow(r);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_tKeyReleased

    private void rTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rTableMouseClicked
        int ri=rTable.getSelectedRow();
        if(ri!=-1){
            int id=(Integer)rTable.getValueAt(ri,0);
            String name=(String)rTable.getValueAt(ri, 1);
            String gender=(String)rTable.getValueAt(ri, 2);
            java.util.Date dob=(java.util.Date)rTable.getValueAt(ri, 3);
            String country=(String)rTable.getValueAt(ri, 4);
            String address=(String)rTable.getValueAt(ri, 5);
            String language=(String)rTable.getValueAt(ri, 6);
            cid.setText(id+"");
            n.setText(name);
            if(gender.equals("Male"))
                g1.setSelected(true);
            else if(gender.equals("Female"))
                g2.setSelected(true);
            else
                g3.setSelected(true);
            d.setDate(dob);
            c.setSelectedItem(country);
            a.setText(address);
            l1.setSelected(false);
            l2.setSelected(false);
            l3.setSelected(false);
            l4.setSelected(false);
            if( !language.equals("") ){
                java.util.StringTokenizer st=
                        new java.util.StringTokenizer(language,",");
                while(st.hasMoreTokens()){
                    String s=st.nextToken();
                    if(s.equals("Hindi"))
                        l1.setSelected(true);
                    else if(s.equals("English"))
                        l2.setSelected(true);
                    else if(s.equals("Spanish"))
                        l3.setSelected(true);
                    else if(s.equals("French"))
                        l4.setSelected(true);
                }
            }
        }
    }//GEN-LAST:event_rTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Update Button
        try{
        String name=n.getText();
        String gender;
        if(g1.isSelected())
            gender=g1.getText();
        else if(g2.isSelected())
            gender=g2.getText();
        else
            gender=g3.getText();
        java.util.Date dt=d.getDate();
        String country=(String)c.getSelectedItem();
        String address=a.getText();
        String language="";
        if(l1.isSelected())
            language += l1.getText()+",";
        if(l2.isSelected())
            language += l2.getText()+",";
        if(l3.isSelected())
            language += l3.getText()+",";
        if(l4.isSelected())
            language += l4.getText()+",";
        if( ! language.equals("") ){
            language=language.substring(0, language.length()-1);
        }
        if(dt!=null && !name.equals("") && !address.equals("")){
            java.sql.Date dob=new java.sql.Date(dt.getTime());
            int id=Integer.parseInt(cid.getText());
            db.DbConnect.updateClient.setString(1, name);
            db.DbConnect.updateClient.setString(2, gender);
            db.DbConnect.updateClient.setDate(3, dob);
            db.DbConnect.updateClient.setString(4, country);
            db.DbConnect.updateClient.setString(5, address);
            db.DbConnect.updateClient.setString(6, language);
            db.DbConnect.updateClient.setInt(7, id);
            db.DbConnect.updateClient.executeUpdate();
            tKeyReleased(null);
            JOptionPane.showMessageDialog(null, "Client Updated Successfully !");
        }else{
            JOptionPane.showMessageDialog(null, "Plz Fill the Complete Form!");
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Delete Button
        int r=JOptionPane.showConfirmDialog(null,"Do u really wanna delete ?",
                    "Deletion Confirmation", JOptionPane.YES_NO_OPTION);
        if(r==JOptionPane.YES_OPTION){
            try{
                int id=Integer.parseInt(cid.getText());
                db.DbConnect.st.executeUpdate("delete from client_info where cid="+id);
                tKeyReleased(null);
                JOptionPane.showMessageDialog(null, "Client Deleted Successfully !");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox c;
    private javax.swing.JLabel cid;
    private javax.swing.JRadioButton g1;
    private javax.swing.JRadioButton g2;
    private javax.swing.JRadioButton g3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox l1;
    private javax.swing.JCheckBox l2;
    private javax.swing.JCheckBox l3;
    private javax.swing.JCheckBox l4;
    private javax.swing.JTextField n;
    private javax.swing.JTable rTable;
    private javax.swing.JTextField t;
    // End of variables declaration//GEN-END:variables
}
