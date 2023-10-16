/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.popup;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import models.Customer;
import utils.ErrorPopup;
import views.CustomerRenderJList;


public class SelectCustomerPopupView extends javax.swing.JFrame {

    DefaultListModel<Customer> customerListModel = new DefaultListModel<>();

    public SelectCustomerPopupView() {
        initComponents();
        listCustomer.setModel(customerListModel);
        listCustomer.setCellRenderer(new CustomerRenderJList());
        setPreferredSize(new Dimension(400, 500));
        getRootPane().setDefaultButton(btnSearch);
        setLocationRelativeTo(null);
    }

    public DefaultListModel<Customer> getCustomerListModel() {
        return customerListModel;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public JButton getBtnOK() {
        return btnOK;
    }

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public JTextField getTxtCustomerName() {
        return txtCustomerName;
    }

    public JList<Customer> getListCustomer() {
        return listCustomer;
    }

    public void setListCustomer(JList<Customer> listCustomer) {
        this.listCustomer = listCustomer;
    }

    public void renderCustomer(ArrayList<Customer> customers) {
        customerListModel.removeAllElements();
        for (Customer customer : customers) {
            customerListModel.addElement(customer);
        }
    }

    public void showError(String message) {
        ErrorPopup.show(new Exception(message));
    }

    public void showError(Exception message) {
        ErrorPopup.show(message);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        TopBackGround = new javax.swing.JPanel();
        NameCs = new javax.swing.JLabel();
        BotBackground = new javax.swing.JPanel();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        MidMBackground = new javax.swing.JPanel();
        MidBackground = new javax.swing.JPanel();
        txtCustomerName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCustomer = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TopBackGround.setPreferredSize(new java.awt.Dimension(429, 40));
        TopBackGround.setLayout(new java.awt.GridBagLayout());

        NameCs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NameCs.setText("Chọn khách hàng");
        TopBackGround.add(NameCs, new java.awt.GridBagConstraints());

        getContentPane().add(TopBackGround, java.awt.BorderLayout.PAGE_START);

        BotBackground.setPreferredSize(new java.awt.Dimension(429, 50));
        BotBackground.setLayout(new java.awt.GridBagLayout());

        btnOK.setText("OK");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.1;
        BotBackground.add(btnOK, gridBagConstraints);

        btnCancel.setText("Cancel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.1;
        BotBackground.add(btnCancel, gridBagConstraints);

        getContentPane().add(BotBackground, java.awt.BorderLayout.PAGE_END);

        MidMBackground.setLayout(new java.awt.BorderLayout());

        MidBackground.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10));
        MidBackground.setPreferredSize(new java.awt.Dimension(400, 60));
        MidBackground.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        MidBackground.add(txtCustomerName, gridBagConstraints);

        btnSearch.setText("Tìm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        MidBackground.add(btnSearch, gridBagConstraints);

        MidMBackground.add(MidBackground, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(400, 350));

        listCustomer.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listCustomer);

        MidMBackground.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(MidMBackground, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotBackground;
    private javax.swing.JPanel MidBackground;
    private javax.swing.JPanel MidMBackground;
    private javax.swing.JLabel NameCs;
    private javax.swing.JPanel TopBackGround;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Customer> listCustomer;
    private javax.swing.JTextField txtCustomerName;
    // End of variables declaration//GEN-END:variables
}
