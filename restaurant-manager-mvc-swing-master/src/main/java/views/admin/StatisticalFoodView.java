/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.admin;

import com.toedter.calendar.JDateChooser;
import static controllers.TimeCouterController.start;
import dao.StatisticalDao;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import models.Statistical;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import utils.ErrorPopup;

/**
 *
 * @author Admin
 */
public class StatisticalFoodView extends javax.swing.JPanel {

    String[] header = {"Tên Món", "Số lượng đã bán"};
    DefaultTableModel tableModel = new DefaultTableModel(header, 0);
    ArrayList<Statistical.ProductIncome> tableData = new ArrayList<>();
    static StatisticalDao statisticalDao = new StatisticalDao();
    /**
     * Creates new form StatisticalFoodView
     */
    public StatisticalFoodView() {
        initComponents();
        tblData.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tblData.getTableHeader().setOpaque(false);
        tblData.getTableHeader().setBackground(new Color(170, 162, 242));
        tblData.getTableHeader().setForeground(new Color(255, 255, 255));
        ((DefaultTableCellRenderer) tblData.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(JLabel.LEFT);
        tblData.setModel(tableModel);
        
        // Initialize the pie chart in the pnlPie panel
        createPieChart(tableData);

    }
    
    public void createPieChart(ArrayList list) {
        // Create a dataset for the pie chart
        DefaultPieDataset dataset = new DefaultPieDataset();
        ArrayList<Statistical.ProductIncome> products = tableData;
        for (Statistical.ProductIncome product : products) {
            dataset.setValue(product.name, product.quantity);
        }

        // Create the pie chart based on the dataset
        JFreeChart chart = ChartFactory.createPieChart(
                "Thống kê sản phẩm theo danh mục",  // Chart title
                dataset,         // Dataset
                true,            // Include legend
                true,
                false);

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setBackgroundPaint(Color.WHITE);
        
        // Create a chart panel and add it to the pnlPie panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        pnlPie.setLayout(new BorderLayout());
        pnlPie.setPreferredSize(new Dimension(400, 400));
        
        // Remove any existing components in pnlPie before adding the chart
        pnlPie.removeAll();

        // Add the chart panel to pnlPie
        pnlPie.add(chartPanel);

        // Repaint the panel to reflect the changes
        pnlPie.revalidate();
        pnlPie.repaint();
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public ArrayList<Statistical.ProductIncome> getTableData() {
        return tableData;
    }

    public JComboBox<String> getCbxCategory() {
        return cbxCategory;
    }

    public void showError(String message) {
        ErrorPopup.show(new Exception(message));
    }

    public JButton getBtnEnter() {
        return btnEnter;
    }

    public JDateChooser getEndDate() {
        return endDate;
    }

    public JDateChooser getStartDate() {
        return startDate;
    }

    public JTable getTable() {
        return tblData;
    }

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;

    }

    public void setTableData(ArrayList<Statistical.ProductIncome> tableData) {
        this.tableData = tableData;
        renderData();
    }

    public void renderData() {
        tableModel.setNumRows(0);
        try {
            for (Statistical.ProductIncome item : tableData) {
                tableModel.addRow(new Object[]{
                    
                    item.name,
                    item.quantity
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
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
        tblData = new javax.swing.JTable();
        startDate = new com.toedter.calendar.JDateChooser();
        endDate = new com.toedter.calendar.JDateChooser();
        btnEnter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxCategory = new javax.swing.JComboBox<>();
        pnlPie = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 228, 225));
        setPreferredSize(new java.awt.Dimension(1008, 680));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tên món", "Đã bán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblData.setRowHeight(25);
        jScrollPane1.setViewportView(tblData);

        startDate.setDateFormatString("dd/MM/yyyy");
        startDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        endDate.setDateFormatString("dd/MM/yyyy");
        endDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnEnter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEnter.setText("Truy xuất");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ngày bắt đầu");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ngày kết thúc");

        cbxCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pnlPie.setBackground(new java.awt.Color(255, 228, 225));

        javax.swing.GroupLayout pnlPieLayout = new javax.swing.GroupLayout(pnlPie);
        pnlPie.setLayout(pnlPieLayout);
        pnlPieLayout.setHorizontalGroup(
            pnlPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlPieLayout.setVerticalGroup(
            pnlPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                    .addComponent(pnlPie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(startDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(endDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(cbxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnEnter)
                        .addGap(0, 324, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlPie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JComboBox<String> cbxCategory;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlPie;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables
}
