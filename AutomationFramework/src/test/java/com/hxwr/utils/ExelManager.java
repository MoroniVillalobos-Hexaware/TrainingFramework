package com.hxwr.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExelManager{
    public  void initializeFile() {
        File f = new File("properties.xlsx");
        if (!f.exists()){
            XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("properties");

        Row row=sheet.createRow(0);
                Cell cell= row.createCell(0);
                     cell.setCellValue("PROPERTY_NAME");
                     cell= row.createCell(1);
                     cell.setCellValue("VALUE");
                     row=sheet.createRow(1);
             cell= row.createCell(1);
            cell.setCellValue("URL");
            cell= row.createCell(1);
            cell.setCellValue("https://www.google.com");
            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
        try {
            FileOutputStream out = new FileOutputStream(new File("properties.xlsx"));
            workbook.write(out);
            out.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        }
    }
    public   Map<String,String>   readExelFIle() throws IOException {
        Map<String,String> properties= new HashMap<String,String>();
        String excelFilePath = "properties.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet propertiesSheet=  workbook.getSheet("properties");
        int rowNumber= propertiesSheet.getLastRowNum();
        for (int i=1;i<=rowNumber;i++) {
            Row row=propertiesSheet.getRow(i);
            Cell cell_key=  row.getCell(0);
            Cell cell_value=  row.getCell(1);
            DataFormatter formatter = new DataFormatter();
            String cellKey=formatter.formatCellValue(cell_key);
            String value=formatter.formatCellValue(cell_value);
            properties.put(cellKey,value);
        }
        workbook.close();
        return properties;
    }
    }

