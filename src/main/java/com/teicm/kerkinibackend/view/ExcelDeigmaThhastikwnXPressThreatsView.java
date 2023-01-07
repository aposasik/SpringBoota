package com.teicm.kerkinibackend.view;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;
import org.apache.poi.ss.usermodel.*;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class ExcelDeigmaThhastikwnXPressThreatsView extends AbstractXlsxView {

    @Override
    protected void buildExcelDocument(Map<String, Object> map, Workbook workbook, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        try {
            // Changing the name of the file
            httpServletResponse.setHeader("Content-Disposition", "attachment; filename=\"DeigmaThhlastikwnXPressThreats-download.xlsx\"");

            @SuppressWarnings("unchecked")
            List<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsList = (List<DeigmaThhlastikwnXPressThreats>) map.get("deigmaThhlastikwnXPressThreatsList");

            // Creating excel sheets
            Sheet sheet = workbook.createSheet("DeigmaThhlastikwnXPressThreats");
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

            header.createCell(1).setCellValue("Id δείγμα θηλαστικών");
            header.getCell(1).setCellStyle(styleHeaders);

            header.createCell(2).setCellValue("Ct Κωδικός πίεσης ή απειλής");
            header.getCell(2).setCellStyle(styleHeaders);

            header.createCell(3).setCellValue("Κωδικός είδους");
            header.getCell(3).setCellStyle(styleHeaders);

            header.createCell(4).setCellValue("Τύπος είδους");
            header.getCell(4).setCellStyle(styleHeaders);

            header.createCell(5).setCellValue("Σημασία");
            header.getCell(5).setCellStyle(styleHeaders);


            int row = 1;
            for (DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats: deigmaThhlastikwnXPressThreatsList) {
                Row deigmaxXEidosRow = sheet.createRow(row++);

                if (deigmaThhlastikwnXPressThreats.getId() != null){
                    deigmaxXEidosRow.createCell(0).setCellValue(deigmaThhlastikwnXPressThreats.getId());
                    deigmaxXEidosRow.getCell(0).setCellStyle(styleRows);
                }

                if (deigmaThhlastikwnXPressThreats.getDeigmaThhlastikwn().getId() != null){
                    deigmaxXEidosRow.createCell(1).setCellValue(deigmaThhlastikwnXPressThreats.getDeigmaThhlastikwn().getId());
                    deigmaxXEidosRow.getCell(1).setCellStyle(styleRows);
                }

                if (deigmaThhlastikwnXPressThreats.getCtThhlastikaPressThreats().getActCode() != null){
                    deigmaxXEidosRow.createCell(2).setCellValue(deigmaThhlastikwnXPressThreats.getCtThhlastikaPressThreats().getActCode());
                    deigmaxXEidosRow.getCell(2).setCellStyle(styleRows);
                }

                if (deigmaThhlastikwnXPressThreats.getKwdikosEidous() != null){
                    deigmaxXEidosRow.createCell(3).setCellValue(deigmaThhlastikwnXPressThreats.getKwdikosEidous());
                    deigmaxXEidosRow.getCell(3).setCellStyle(styleRows);
                }

                if (deigmaThhlastikwnXPressThreats.getPressThreat() != null){
                    deigmaxXEidosRow.createCell(4).setCellValue(deigmaThhlastikwnXPressThreats.getPressThreat());
                    deigmaxXEidosRow.getCell(4).setCellStyle(styleRows);
                }

                if (deigmaThhlastikwnXPressThreats.getImportance() != null){
                    deigmaxXEidosRow.createCell(5).setCellValue(deigmaThhlastikwnXPressThreats.getImportance());
                    deigmaxXEidosRow.getCell(5).setCellStyle(styleRows);
                }
            }

        }catch (Exception e){
            throw e;
        }
    }

}
