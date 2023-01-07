package com.teicm.kerkinibackend.view;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import org.apache.poi.ss.usermodel.*;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class ExcelDeigmaThhlastikwnView extends AbstractXlsxView {
    @Override
    protected void buildExcelDocument(Map<String, Object> map, Workbook workbook, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        try {
            // Changing the name of the file

            httpServletResponse.setHeader("Content-Disposition", "attachment; filename=\"DeigmaThhlastikwn-download.xlsx\"");

            @SuppressWarnings("unchecked")
            List<DeigmaThhlastikwn> deigmaThhlastikwnList = (List<DeigmaThhlastikwn>) map.get("deigmaThhlastikwnList");

            // Creating excel sheets
            Sheet sheet = workbook.createSheet("DeigmaThhlastikwn");
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

            header.createCell(1).setCellValue("Κωδικός δειγματοληψίας");
            header.getCell(1).setCellStyle(styleHeaders);

            header.createCell(2).setCellValue("Χρηματοδότηση");
            header.getCell(2).setCellStyle(styleHeaders);

            header.createCell(3).setCellValue("Ερευνητής");
            header.getCell(3).setCellStyle(styleHeaders);

            header.createCell(4).setCellValue("Τοποθεσία");
            header.getCell(4).setCellStyle(styleHeaders);

            header.createCell(5).setCellValue("Ημερομηνία");
            header.getCell(5).setCellStyle(styleHeaders);

            header.createCell(6).setCellValue("Ώρα");
            header.getCell(6).setCellStyle(styleHeaders);

            header.createCell(7).setCellValue("Διάρκεια");
            header.getCell(7).setCellStyle(styleHeaders);

            header.createCell(8).setCellValue("Τύπος βλάστησης");
            header.getCell(8).setCellStyle(styleHeaders);

            header.createCell(9).setCellValue("Τύπος οικοτόπου");
            header.getCell(9).setCellStyle(styleHeaders);

            header.createCell(10).setCellValue("Επιφάνεια δειγματοληψίας");
            header.getCell(10).setCellStyle(styleHeaders);

            header.createCell(11).setCellValue("latitudeEGSA");
            header.getCell(11).setCellStyle(styleHeaders);

            header.createCell(12).setCellValue("longitudeEGSA");
            header.getCell(12).setCellStyle(styleHeaders);

            header.createCell(13).setCellValue("latitudeWGS84");
            header.getCell(13).setCellStyle(styleHeaders);

            header.createCell(14).setCellValue("longitudeWGS84");
            header.getCell(14).setCellStyle(styleHeaders);

            header.createCell(15).setCellValue("GridCell");
            header.getCell(15).setCellStyle(styleHeaders);

            header.createCell(16).setCellValue("Κωδικός Natura");
            header.getCell(16).setCellStyle(styleHeaders);

            header.createCell(17).setCellValue("Μέθοδος δειγματοληψίας");
            header.getCell(17).setCellStyle(styleHeaders);

            header.createCell(18).setCellValue("Παρατηρήσεις");
            header.getCell(18).setCellStyle(styleHeaders);

            header.createCell(19).setCellValue("Νομός");
            header.getCell(19).setCellStyle(styleHeaders);


        int row = 1;
        for (DeigmaThhlastikwn deigmaThhlastikwn: deigmaThhlastikwnList) {
            Row ctRow = sheet.createRow(row++);

            if (deigmaThhlastikwn.getId() != null){
                ctRow.createCell(0).setCellValue(deigmaThhlastikwn.getId());
                ctRow.getCell(0).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getKwdikosDeigmatolhpsias() != null){
                ctRow.createCell(1).setCellValue(deigmaThhlastikwn.getKwdikosDeigmatolhpsias());
                ctRow.getCell(1).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getXrhmatodothsh() != null){
                ctRow.createCell(2).setCellValue(deigmaThhlastikwn.getXrhmatodothsh());
                ctRow.getCell(2).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getEreunhths() != null){
                ctRow.createCell(3).setCellValue(deigmaThhlastikwn.getEreunhths());
                ctRow.getCell(3).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getTopothesia() != null){
                ctRow.createCell(4).setCellValue(deigmaThhlastikwn.getTopothesia());
                ctRow.getCell(4).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getDate() != null){
                ctRow.createCell(5).setCellValue(deigmaThhlastikwn.getDate().toString());
                ctRow.getCell(5).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getTime() != null){
                ctRow.createCell(6).setCellValue(deigmaThhlastikwn.getTime().toString());
                ctRow.getCell(6).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getDiarkeia() != null){
                ctRow.createCell(7).setCellValue(deigmaThhlastikwn.getDiarkeia());
                ctRow.getCell(7).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getTuposVlasthshs() != null){
                ctRow.createCell(8).setCellValue(deigmaThhlastikwn.getTuposVlasthshs());
                ctRow.getCell(8).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getTuposOikotopou() != null){
                ctRow.createCell(9).setCellValue(deigmaThhlastikwn.getTuposOikotopou());
                ctRow.getCell(9).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getEpifaneiaDeigmatolhpsias() != null){
                ctRow.createCell(10).setCellValue(deigmaThhlastikwn.getEpifaneiaDeigmatolhpsias());
                ctRow.getCell(10).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getLatitudeEGSA() != null){
                ctRow.createCell(11).setCellValue(deigmaThhlastikwn.getLatitudeEGSA());
                ctRow.getCell(11).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getLongitudeEGSA() != null){
                ctRow.createCell(12).setCellValue(deigmaThhlastikwn.getLongitudeEGSA());
                ctRow.getCell(12).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getLatitudeWGS84() != null){
                ctRow.createCell(13).setCellValue(deigmaThhlastikwn.getLatitudeWGS84());
                ctRow.getCell(13).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getLongitudeWGS84() != null){
                ctRow.createCell(14).setCellValue(deigmaThhlastikwn.getLongitudeWGS84());
                ctRow.getCell(14).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getGridCell() != null){
                ctRow.createCell(15).setCellValue(deigmaThhlastikwn.getGridCell());
                ctRow.getCell(15).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getKwdikosNatura() != null){
                ctRow.createCell(16).setCellValue(deigmaThhlastikwn.getKwdikosNatura());
                ctRow.getCell(16).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getMethodosDeigmatolhpsias() != null){
                ctRow.createCell(17).setCellValue(deigmaThhlastikwn.getMethodosDeigmatolhpsias());
                ctRow.getCell(17).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getParathrhseis() != null){
                ctRow.createCell(18).setCellValue(deigmaThhlastikwn.getParathrhseis());
                ctRow.getCell(18).setCellStyle(styleRows);
            }

            if (deigmaThhlastikwn.getNomos() != null){
                ctRow.createCell(19).setCellValue(deigmaThhlastikwn.getNomos());
                ctRow.getCell(19).setCellStyle(styleRows);
            }
        }

        } catch (Exception e) {
            throw e;
        }
    }
}
