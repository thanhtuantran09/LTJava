package views.popup;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import utils.ErrorPopup;


public class TablePopupView extends javax.swing.JFrame implements PopupView {

    public TablePopupView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @Override
    public void showError(String message) {
        ErrorPopup.show(new Exception(message));
    }

    @Override
    public void showError(Exception e) {
        ErrorPopup.show(e);
    }

    @Override
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public JButton getBtnCancel() {
        return btnCancel;
    }

    @Override
    public JButton getBtnOK() {
        return btnOK;
    }

    @Override
    public JLabel getLbTitle() {
        return lbTitle;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        TopBackground = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        BotBackground = new javax.swing.JPanel();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        MidBackground = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        NameTable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TopBackground.setPreferredSize(new java.awt.Dimension(283, 30));
        TopBackground.setLayout(new java.awt.GridBagLayout());

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitle.setText("Thêm bàn mới");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        TopBackground.add(lbTitle, gridBagConstraints);

        getContentPane().add(TopBackground, java.awt.BorderLayout.PAGE_START);

        BotBackground.setPreferredSize(new java.awt.Dimension(283, 50));
        BotBackground.setLayout(new java.awt.GridBagLayout());

        btnOK.setText("Thêm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.1;
        BotBackground.add(btnOK, gridBagConstraints);

        btnCancel.setText("Hủy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.1;
        BotBackground.add(btnCancel, gridBagConstraints);

        getContentPane().add(BotBackground, java.awt.BorderLayout.PAGE_END);

        MidBackground.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10));
        MidBackground.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(txtName, gridBagConstraints);

        NameTable.setText("Tên bàn:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(NameTable, gridBagConstraints);

        getContentPane().add(MidBackground, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotBackground;
    private javax.swing.JPanel MidBackground;
    private javax.swing.JLabel NameTable;
    private javax.swing.JPanel TopBackground;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
