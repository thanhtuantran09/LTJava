package controllers;

import dao.OrderDao;
import dao.OrderItemDao;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.sql.Date;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import models.FoodItem;
import models.Order;
import models.OrderItem;
import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.BreakType;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblLayoutType;

public class PrintOrderController {

   XWPFDocument document;
File orderFile;
String fileName;
SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
DecimalFormat formatter = new DecimalFormat("###,###,###");

public PrintOrderController() {
    document = new XWPFDocument();
}

public void print(int id) throws Exception {
    OrderDao orderDao = new OrderDao();
    OrderItemDao orderItemDao = new OrderItemDao();
    Order order = orderDao.get(id);
    ArrayList<OrderItem> orderItems = orderItemDao.getByIdOrder(id);
    
    // Tạo một số duy nhất dựa trên thời gian hiện tại
    long currentTimeMillis = System.currentTimeMillis();
    
    // Sử dụng số duy nhất để tạo tên file mới
    String uniqueFileName = "D:\\Java\\Inhoadon\\order-" + currentTimeMillis + ".docx";
    orderFile = new File(uniqueFileName);
    
    print(order, orderItems);
}
 
    public File getOrderFile() {
        return orderFile;
    }

    public void setOrderFile(File orderFile) {
        this.orderFile = orderFile;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void createHeader() {
        XWPFParagraph paragraph;
        XWPFRun run;
        paragraph = document.createParagraph();
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        
        run = paragraph.createRun();
        run.setText("TT&P TEA HOUSE");
        run.setBold(true);
        run.setColor("FF0000");
        run.setFontSize(32);
        run.addBreak();
        
        run = paragraph.createRun();
        run.setText("Hóa Đơn Thanh Toán");
        run.setBold(true);
        run.setColor("FF0000");
        run.setFontSize(24);
        run.addBreak();
        
        run = paragraph.createRun();
        run.setText("828 Sư Vạn Hạnh, P13, Q10, TPHCM");
        run.setBold(false);
        run.setColor("FF0000");
        run.setFontSize(18);
         run.addBreak();
        
        run = paragraph.createRun();
        run.setText("HOTLINE: 0932796517");
        run.setBold(true);
        run.setColor("FF0000");
        run.setFontSize(18);
         
        
       
    }

    public void createHeaderInfo(Order order) {
        XWPFParagraph paragraph;
        XWPFRun run;
        int fontSize = 16;
        
        
        paragraph = document.createParagraph();
//        paragraph.setBorderBottom(Borders.BASIC_WIDE_MIDLINE);
//        paragraph.setBorderTop(Borders.BASIC_WIDE_MIDLINE);
//        paragraph.setBorderLeft(Borders.BASIC_WIDE_MIDLINE);
//        paragraph.setBorderRight(Borders.BASIC_WIDE_MIDLINE);
        paragraph.setAlignment(ParagraphAlignment.LEFT);

        run = paragraph.createRun();
        run.setText("Tên nhân viên: ");
        run.setFontSize(fontSize);
        run = paragraph.createRun();
        run.setBold(true);
        run.setText(order.getEmployee().getName());
        run.setFontSize(fontSize);
        run.setColor("FF0000");
        run.addBreak();

        run = paragraph.createRun();
        run.setText("Thời gian: ");
        run.setFontSize(fontSize);
        run = paragraph.createRun();
        run.setBold(true);
        run.setText(dateFormat.format(new Date(order.getOrderDate().getTime())));
        run.setFontSize(fontSize);
        run.setColor("FF0000");
        run.addBreak();
        
      

    }

    public void createOrderInfo(ArrayList<OrderItem> orderItems) {
    XWPFTable table = document.createTable(orderItems.size() + 1, 5); // Create a table with 5 columns

    // Set the width of the table columns
    table.setWidth("100%");
    CTTbl ttbl = table.getCTTbl();
    CTTblPr tblPr = ttbl.addNewTblPr();
    tblPr.addNewTblW().setW(BigInteger.valueOf(9500)); // Adjust the table width as needed

    // Define the table headers
    XWPFTableRow headerRow = table.getRow(0);
    for (int i = 0; i < 5; i++) {
        XWPFTableCell cell = headerRow.getCell(i);
        XWPFParagraph paragraph = cell.getParagraphArray(0);
        XWPFRun run = paragraph.createRun();
        run.setText(i == 0 ? "Tên Món" : i == 1 ? "Tên Topping" : i == 2 ? "Số lượng" : i == 3 ? "Loại" : "Giá");
        run.setFontSize(14);
    }

    // Populate the table with order item data
    for (int i = 0; i < orderItems.size(); i++) {
        OrderItem orderItem = orderItems.get(i);
        FoodItem food = orderItem.getFoodItem();
        FoodItem topping = orderItem.getToppingItem();

        XWPFTableRow row = table.getRow(i + 1);
        for (int j = 0; j < 5; j++) {
            XWPFTableCell cell = row.getCell(j);
            XWPFParagraph paragraph = cell.getParagraphArray(0);
            XWPFRun run = paragraph.createRun();
            run.setText(j == 0 ? food.getName() : j == 1 ? topping.getName() : j == 2 ? String.valueOf(orderItem.getQuantity()) : j == 3 ? food.getUnitName() : String.valueOf(orderItem.getAmount()));
            run.setFontSize(14);
            
        }
    }
     // Add a line break after the table
    XWPFParagraph paragraph = document.createParagraph();
    XWPFRun run = paragraph.createRun();
    run.addBreak();
}




    public void createPaidInfo(Order order) {
        int fontSize = 16;
        XWPFParagraph paragraph;
        XWPFRun run;
        paragraph = document.createParagraph();
//        paragraph.setBorderBottom(Borders.BALLOONS_3_COLORS);
        paragraph.setAlignment(ParagraphAlignment.LEFT);

        run = paragraph.createRun();
        run.setText("Tổng tiển: ");
        run.setFontSize(fontSize);
        run = paragraph.createRun();
        run.setText(formatter.format(order.getTotalAmount()));
        run.setFontSize(fontSize);
        run.setColor("FF0000");
        run.addBreak();

        run = paragraph.createRun();
        run.setText("Giảm giá: ");
        run.setFontSize(fontSize);
        run = paragraph.createRun();
        run.setText(order.getDiscount() + "%");
        run.setFontSize(fontSize);
        run.setColor("FF0000");
        run.addBreak();

        run = paragraph.createRun();
        run.setText("Phải thanh toán: ");
        run.setFontSize(fontSize);
        run = paragraph.createRun();
        run.setText(formatter.format(order.getFinalAmount()));
        run.setFontSize(fontSize);
        run.setColor("FF0000");
        run.addBreak();

        run = paragraph.createRun();
        run.setText("Đã thanh toán: ");
        run.setFontSize(fontSize);
        run = paragraph.createRun();
        run.setText(formatter.format(order.getPaidAmount()));
        run.setFontSize(fontSize);
        run.setColor("FF0000");
        run.addBreak();

        run = paragraph.createRun();
        run.setText("Tiền thừa: ");
        run.setFontSize(fontSize);
        run = paragraph.createRun();
        run.setText(formatter.format((order.getFinalAmount() - order.getPaidAmount())*-1));
        run.setFontSize(fontSize);
        run.setColor("FF0000");
        run.addBreak();

        run = paragraph.createRun();
        run.setText("Ngày thanh toán ");
        run.setFontSize(fontSize);
        run = paragraph.createRun();
        run.setText(dateFormat.format(new Date(order.getPayDate().getTime())));
        run.setFontSize(fontSize);
        run.setColor("FF0000");
    }

    public void createFooter() {
        XWPFParagraph paragraph;
        XWPFRun run;
        paragraph = document.createParagraph();
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        run = paragraph.createRun();
        run.setText("Cảm ơn quý khách!Hẹn gặp lại!");
        run.setItalic(true);
        run.setFontSize(14);
    }
    public void createPageBreak() {
    XWPFParagraph paragraph = document.createParagraph();
    XWPFRun run = paragraph.createRun();
    run.addBreak(BreakType.PAGE);
}


    public void print(Order order, ArrayList<OrderItem> orderItems) throws Exception {
        FileOutputStream out = new FileOutputStream(orderFile, false);
        createHeader();
        createHeaderInfo(order);
        createOrderInfo(orderItems);
        createPaidInfo(order);
        createFooter();
        createPageBreak();
        document.write(out);
        out.close();
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().open(orderFile);
        }
    }

}
