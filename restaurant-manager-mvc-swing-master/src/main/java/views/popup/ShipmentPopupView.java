/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.popup;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import utils.ErrorPopup;


public class ShipmentPopupView extends javax.swing.JFrame {

    public ShipmentPopupView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        TopBackground = new javax.swing.JPanel();
        In4 = new javax.swing.JLabel();
        BotBackground = new javax.swing.JPanel();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        MidBackground = new javax.swing.JPanel();
        Namebrand = new javax.swing.JLabel();
        SđtSp = new javax.swing.JLabel();
        ShipPrice = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        NameCs = new javax.swing.JLabel();
        lbCustomerName = new javax.swing.JLabel();
        txtShipperName = new javax.swing.JTextField();
        txtShipperPhoneNumber = new javax.swing.JTextField();
        spnShipCost = new javax.swing.JSpinner();
        cboStatus = new javax.swing.JComboBox<>();
        btnSelectCustomer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TopBackground.setPreferredSize(new java.awt.Dimension(400, 50));
        TopBackground.setLayout(new java.awt.GridBagLayout());

        In4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        In4.setText("Thông tin giao hàng");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        TopBackground.add(In4, gridBagConstraints);

        getContentPane().add(TopBackground, java.awt.BorderLayout.PAGE_START);

        BotBackground.setPreferredSize(new java.awt.Dimension(100, 50));
        BotBackground.setLayout(new java.awt.GridBagLayout());

        btnOK.setText("OK");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.1;
        BotBackground.add(btnOK, gridBagConstraints);

        btnCancel.setText("Hủy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.1;
        BotBackground.add(btnCancel, gridBagConstraints);

        getContentPane().add(BotBackground, java.awt.BorderLayout.PAGE_END);

        MidBackground.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        MidBackground.setLayout(new java.awt.GridBagLayout());

        Namebrand.setText("Tên Shipper:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(Namebrand, gridBagConstraints);

        SđtSp.setText("SĐT Shipper:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(SđtSp, gridBagConstraints);

        ShipPrice.setText("Giá Ship:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(ShipPrice, gridBagConstraints);

        Status.setText("Trạng Thái:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(Status, gridBagConstraints);

        NameCs.setText("Khách Hàng:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(NameCs, gridBagConstraints);

        lbCustomerName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCustomerName.setForeground(new java.awt.Color(255, 51, 51));
        lbCustomerName.setText("Chưa rõ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(lbCustomerName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(txtShipperName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(txtShipperPhoneNumber, gridBagConstraints);

        spnShipCost.setModel(new javax.swing.SpinnerNumberModel(0, null, null, 1000));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(spnShipCost, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(cboStatus, gridBagConstraints);

        btnSelectCustomer.setText("Chọn");
        MidBackground.add(btnSelectCustomer, new java.awt.GridBagConstraints());

        getContentPane().add(MidBackground, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void showError(String message) {
        ErrorPopup.show(new Exception(message));
    }

    public void showError(Exception e) {
        ErrorPopup.show(e);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public JButton getBtnOK() {
        return btnOK;
    }

    public JButton getBtnSelectCustomer() {
        return btnSelectCustomer;
    }

    public JComboBox<String> getCboStatus() {
        return cboStatus;
    }

    public JSpinner getSpnShipCost() {
        return spnShipCost;
    }

    public JTextField getTxtShipperName() {
        return txtShipperName;
    }

    public JTextField getTxtShipperPhoneNumber() {
        return txtShipperPhoneNumber;
    }

    public JLabel getLbCustomerName() {
        return lbCustomerName;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotBackground;
    private javax.swing.JLabel In4;
    private javax.swing.JPanel MidBackground;
    private javax.swing.JLabel NameCs;
    private javax.swing.JLabel Namebrand;
    private javax.swing.JLabel ShipPrice;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel SđtSp;
    private javax.swing.JPanel TopBackground;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnSelectCustomer;
    private javax.swing.JComboBox<String> cboStatus;
    private javax.swing.JLabel lbCustomerName;
    private javax.swing.JSpinner spnShipCost;
    private javax.swing.JTextField txtShipperName;
    private javax.swing.JTextField txtShipperPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
