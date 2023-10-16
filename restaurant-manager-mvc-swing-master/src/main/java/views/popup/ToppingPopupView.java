package views.popup;

import dao.FoodItemDao;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import models.FoodItem;


public class ToppingPopupView extends javax.swing.JFrame {

    FoodItemDao foodItemDao = new FoodItemDao();

    public ToppingPopupView() {
        initComponents();
        setLocationRelativeTo(null);
//        lbFoodName.setText(foodItem.getName());
//        spnFoodPrice.setValue(foodItem.getUnitPrice());
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public JButton getBtnMinus() {
        return btnMinus;
    }

    public JButton getBtnOK() {
        return btnOK;
    }

    public JButton getBtnPlus() {
        return btnPlus;
    }

    public JComboBox<FoodItem> getCboTopping() {
        return cboTopping;
    }

    public JLabel getLbAmount() {
        return lbAmount;
    }

    public JLabel getLbFoodName() {
        return lbFoodName;
    }

    public JLabel getLbTopping() {
        return lbTopping;
    }

    public JSpinner getSpnFoodPrice() {
        return spnFoodPrice;
    }

    public JSpinner getSpnQuantity() {
        return spnQuantity;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        MidBackground = new javax.swing.JPanel();
        NameFood = new javax.swing.JLabel();
        lbFoodName = new javax.swing.JLabel();
        SumPrice = new javax.swing.JLabel();
        Quantity = new javax.swing.JLabel();
        btnMinus = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        BelowVNĐ = new javax.swing.JLabel();
        PriceFood = new javax.swing.JLabel();
        cboTopping = new javax.swing.JComboBox<>();
        spnQuantity = new javax.swing.JSpinner();
        spnFoodPrice = new javax.swing.JSpinner();
        lbTopping = new javax.swing.JLabel();
        lbAmount = new javax.swing.JLabel();
        AboveVNĐ = new javax.swing.JLabel();
        TopBackground = new javax.swing.JPanel();
        NameBill = new javax.swing.JLabel();
        BotBackground = new javax.swing.JPanel();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        MidBackground.setLayout(new java.awt.GridBagLayout());

        NameFood.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NameFood.setText("Tên món:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 15);
        MidBackground.add(NameFood, gridBagConstraints);

        lbFoodName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbFoodName.setForeground(new java.awt.Color(102, 51, 255));
        lbFoodName.setText("Trà Sữa Trân Châu Đường Đen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(lbFoodName, gridBagConstraints);

        SumPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SumPrice.setText("Tổng Tiền:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 15);
        MidBackground.add(SumPrice, gridBagConstraints);

        Quantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Quantity.setText("Số Lượng:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 15);
        MidBackground.add(Quantity, gridBagConstraints);

        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        MidBackground.add(btnMinus, gridBagConstraints);

        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        MidBackground.add(btnPlus, gridBagConstraints);

        BelowVNĐ.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BelowVNĐ.setText("VNĐ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(BelowVNĐ, gridBagConstraints);

        PriceFood.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PriceFood.setText("Giá Món:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 15);
        MidBackground.add(PriceFood, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        MidBackground.add(cboTopping, gridBagConstraints);

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        MidBackground.add(spnQuantity, gridBagConstraints);

        spnFoodPrice.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1000));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        MidBackground.add(spnFoodPrice, gridBagConstraints);

        lbTopping.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTopping.setText("Topping:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 15);
        MidBackground.add(lbTopping, gridBagConstraints);

        lbAmount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbAmount.setForeground(new java.awt.Color(255, 0, 0));
        lbAmount.setText("234,123,777");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(lbAmount, gridBagConstraints);

        AboveVNĐ.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AboveVNĐ.setText("VNĐ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        MidBackground.add(AboveVNĐ, gridBagConstraints);

        getContentPane().add(MidBackground, java.awt.BorderLayout.CENTER);

        TopBackground.setPreferredSize(new java.awt.Dimension(440, 40));
        TopBackground.setLayout(new java.awt.GridBagLayout());

        NameBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NameBill.setText("Hóa đơn 01 - Thêm món");
        TopBackground.add(NameBill, new java.awt.GridBagConstraints());

        getContentPane().add(TopBackground, java.awt.BorderLayout.PAGE_START);

        BotBackground.setPreferredSize(new java.awt.Dimension(440, 60));
        BotBackground.setLayout(new java.awt.GridBagLayout());

        btnOK.setText("Thêm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.1;
        BotBackground.add(btnOK, gridBagConstraints);

        btnCancel.setText("Hủy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.1;
        BotBackground.add(btnCancel, gridBagConstraints);

        getContentPane().add(BotBackground, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        int quantity = (int) spnQuantity.getValue();
        spnQuantity.setValue(quantity + 1);
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        int quantity = (int) spnQuantity.getValue();
        spnQuantity.setValue(Math.max(0, quantity - 1));
    }//GEN-LAST:event_btnMinusActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboveVNĐ;
    private javax.swing.JLabel BelowVNĐ;
    private javax.swing.JPanel BotBackground;
    private javax.swing.JPanel MidBackground;
    private javax.swing.JLabel NameBill;
    private javax.swing.JLabel NameFood;
    private javax.swing.JLabel PriceFood;
    private javax.swing.JLabel Quantity;
    private javax.swing.JLabel SumPrice;
    private javax.swing.JPanel TopBackground;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnPlus;
    private javax.swing.JComboBox<FoodItem> cboTopping;
    private javax.swing.JLabel lbAmount;
    private javax.swing.JLabel lbFoodName;
    private javax.swing.JLabel lbTopping;
    private javax.swing.JSpinner spnFoodPrice;
    private javax.swing.JSpinner spnQuantity;
    // End of variables declaration//GEN-END:variables

}
