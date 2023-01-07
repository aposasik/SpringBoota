package com.teicm.kerkinibackend.view;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import org.apache.poi.ss.usermodel.*;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class ExcelCtThhlastikaPressThreatsView extends AbstractXlsxView {

    @Override
    protected void buildExcelDocument(Map<String, Object> map, Workbook workbook, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        try {
            // Changing the name of the file
            httpServletResponse.setHeader("Content-Disposition", "attachment; filename=\"CtThhlastikaPressThreats-download.xlsx\"");

            @SuppressWarnings("unchecked")
            List<CtThhlastikaPressThreats> ctThhlastikaPressThreatsList = (List<CtThhlastikaPressThreats>) map.get("ctThhlastikaPressThreatsList");

            // Creating excel sheets
            Sheet sheet = workbook.createSheet("CtThhlastikaPressThreats");
            sheet.setDefaultColumnWidth(20);
            sheet.setDefaultRowHeightInPoints(17);

            // Creating style for the headers
            Font font = workbook.createFont();
            font.setFontName("Arial");
            font.setBold(true);
            font.setColor(IndexedColors.WHITE1.getIndex());
            CellStyle styleHeaders = workbook.createCellStyle();
            styleHeaders.setFillForegroundColor(IndexedColors.TEAL.getIndex());
            styleHeaders.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            styleHeaders.setAlignment(HorizontalAlignment.LEFT);
            styleHeaders.setFont(font);

            // Styling for the rows
            Font fontRows1 = workbook.createFont();
            fontRows1.setFontName("Arial");
            fontRows1.setBold(false);
            fontRows1.setColor(IndexedColors.GREY_80_PERCENT.getIndex());
            CellStyle styleRows = workbook.createCellStyle();
            styleRows.setAlignment(HorizontalAlignment.LEFT);
            styleRows.setFont(fontRows1);

            // Creating a header row
            Row header = sheet.createRow(0);

            header.createCell(0).setCellValue("Id");
            header.getCell(0).setCellStyle(styleHeaders);

            header.createCell(1).setCellValue("Κωδικός πίεσης ή απειλής");
            header.getCell(1).setCellStyle(styleHeaders);

            header.createCell(2).setCellValue("Περιγραφή En");
            header.getCell(2).setCellStyle(styleHeaders);

            header.createCell(3).setCellValue("Σημασία");
            header.getCell(3).setCellStyle(styleHeaders);

            int row = 1;
            for (CtThhlastikaPressThreats ct: ctThhlastikaPressThreatsList) {
                Row ctRow = sheet.createRow(row++);

                if (ct.getId() != null){
                    ctRow.createCell(0).setCellValue(ct.getId());
                    ctRow.getCell(0).setCellStyle(styleRows);
                }

                if (ct.getActCode() != null){
                    ctRow.createCell(1).setCellValue(ct.getActCode());
                    ctRow.getCell(1).setCellStyle(styleRows);
                }

                if (ct.getDescriptionEn() != null){
                    ctRow.createCell(2).setCellValue(ct.getDescriptionEn());
                    ctRow.getCell(2).setCellStyle(styleRows);
                }

                if (ct.getRemarks() != null){
                    ctRow.createCell(3).setCellValue(ct.getRemarks());
                    ctRow.getCell(3).setCellStyle(styleRows);
                }

            }

        }catch (Exception e){
            throw e;
        }
    }

}
