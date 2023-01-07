package com.teicm.kerkinibackend.view;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;
import org.apache.poi.ss.usermodel.*;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class ExcelDeigmaThhlastikwnXEidhView extends AbstractXlsxView {

    @Override
    protected void buildExcelDocument(Map<String, Object> map, Workbook workbook, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        try {
            // Changing the name of the file
            httpServletResponse.setHeader("Content-Disposition", "attachment; filename=\"DeigmaThhlastikwnXEidh-download.xlsx\"");

            @SuppressWarnings("unchecked")
            List<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhList = (List<DeigmaThhlastikwnXEidh>) map.get("deigmaThhlastikwnXEidhList");

            // Creating excel sheets
            Sheet sheet = workbook.createSheet("DeigmaThhlastikwnXEidh");
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

            header.createCell(2).setCellValue("Ct είδος");
            header.getCell(2).setCellStyle(styleHeaders);

            header.createCell(3).setCellValue("Σχετική αφθονία");
            header.getCell(3).setCellStyle(styleHeaders);

            header.createCell(4).setCellValue("Παρατηρήσεις");
            header.getCell(4).setCellStyle(styleHeaders);

            header.createCell(5).setCellValue("Ηλικία");
            header.getCell(5).setCellStyle(styleHeaders);

            header.createCell(6).setCellValue("Φύλο");
            header.getCell(6).setCellStyle(styleHeaders);

            header.createCell(7).setCellValue("Πλήθος");
            header.getCell(7).setCellStyle(styleHeaders);

            header.createCell(8).setCellValue("ΕοκΠαρII");
            header.getCell(8).setCellStyle(styleHeaders);

            header.createCell(9).setCellValue("ΕοκΠαρIV");
            header.getCell(9).setCellStyle(styleHeaders);

            header.createCell(10).setCellValue("ΕοκΠαρV");
            header.getCell(10).setCellStyle(styleHeaders);

            int row = 1;
            for (DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh: deigmaThhlastikwnXEidhList) {
                Row deigmaxXEidosRow = sheet.createRow(row++);

                if (deigmaThhlastikwnXEidh.getId() != null){
                    deigmaxXEidosRow.createCell(0).setCellValue(deigmaThhlastikwnXEidh.getId());
                    deigmaxXEidosRow.getCell(0).setCellStyle(styleRows);
                }

                if (deigmaThhlastikwnXEidh.getDeigmaThhlastikwn().getId() != null){
                    deigmaxXEidosRow.createCell(1).setCellValue(deigmaThhlastikwnXEidh.getDeigmaThhlastikwn().getId());
                    deigmaxXEidosRow.getCell(1).setCellStyle(styleRows);
                }

                if (deigmaThhlastikwnXEidh.getCtThhlastikaEidh().getEidos() != null){
                    deigmaxXEidosRow.createCell(2).setCellValue(deigmaThhlastikwnXEidh.getCtThhlastikaEidh().getEidos());
                    deigmaxXEidosRow.getCell(2).setCellStyle(styleRows);
                }

                if (deigmaThhlastikwnXEidh.getSxetikhAfthonia() != null){
                    deigmaxXEidosRow.createCell(3).setCellValue(deigmaThhlastikwnXEidh.getSxetikhAfthonia());
                    deigmaxXEidosRow.getCell(3).setCellStyle(styleRows);
                }

                if (deigmaThhlastikwnXEidh.getParathrhseis() != null){
                    deigmaxXEidosRow.createCell(4).setCellValue(deigmaThhlastikwnXEidh.getParathrhseis());
                    deigmaxXEidosRow.getCell(4).setCellStyle(styleRows);
                }

                if (deigmaThhlastikwnXEidh.getHlikia() != null){
                    deigmaxXEidosRow.createCell(5).setCellValue(deigmaThhlastikwnXEidh.getHlikia());
                    deigmaxXEidosRow.getCell(5).setCellStyle(styleRows);
                }

                if (deigmaThhlastikwnXEidh.getFulo() != null){
                    deigmaxXEidosRow.createCell(6).setCellValue(deigmaThhlastikwnXEidh.getFulo());
                    deigmaxXEidosRow.getCell(6).setCellStyle(styleRows);
                }

                if (deigmaThhlastikwnXEidh.getPlhthos() != null){
                    deigmaxXEidosRow.createCell(7).setCellValue(deigmaThhlastikwnXEidh.getPlhthos());
                    deigmaxXEidosRow.getCell(7).setCellStyle(styleRows);
                }

                if (deigmaThhlastikwnXEidh.getEokParII() != null){
                    deigmaxXEidosRow.createCell(8).setCellValue(deigmaThhlastikwnXEidh.getEokParII());
                    deigmaxXEidosRow.getCell(8).setCellStyle(styleRows);
                }

                if (deigmaThhlastikwnXEidh.getEokParIV() != null){
                    deigmaxXEidosRow.createCell(9).setCellValue(deigmaThhlastikwnXEidh.getEokParIV());
                    deigmaxXEidosRow.getCell(9).setCellStyle(styleRows);
                }

                if (deigmaThhlastikwnXEidh.getEokParV() != null){
                    deigmaxXEidosRow.createCell(10).setCellValue(deigmaThhlastikwnXEidh.getEokParV());
                    deigmaxXEidosRow.getCell(10).setCellStyle(styleRows);
                }

            }

        }catch (Exception e){
            throw e;
        }
    }

}
