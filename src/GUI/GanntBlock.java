/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

/**
 *
 * @author RSSH
 */
public class GanntBlock extends javax.swing.JPanel {

    /**
     * Creates new form GanntBlock
     */
    public GanntBlock() {
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

        Chart_ID = new javax.swing.JLabel();
        Chart_ST = new javax.swing.JLabel();
        Chart_ET = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 255, 255));

        Chart_ID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Chart_ID.setText("ID");

        Chart_ST.setText("ST");

        Chart_ET.setText("ET");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Chart_ST)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Chart_ET))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Chart_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Chart_ST)
                .addGap(13, 13, 13)
                .addComponent(Chart_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(Chart_ET))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Chart_ET;
    public javax.swing.JLabel Chart_ID;
    public javax.swing.JLabel Chart_ST;
    // End of variables declaration//GEN-END:variables
}
