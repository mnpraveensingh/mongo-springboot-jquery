package com.mind;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mind.model.LocationInfo;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		String directoryName = "D:\\sts_work\\DPIA_Integration\\src\\main\\resources\\ForAccountBatch.xlsx";
		FileInputStream fileInputStream = null;
		File theFile = new File(directoryName);
		if (!theFile.exists()) {
			theFile.mkdirs();// will create
		}
		final File fileToDownload = new File(directoryName);
		fileInputStream = new FileInputStream(fileToDownload);

		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = sheet.iterator();
		List<LocationInfo> locationInfoList = new ArrayList<>();

		while (iterator.hasNext()) {
			Row row = iterator.next();
			if (row != null && row.getRowNum() >= 1) {
				LocationInfo locationInfo = new LocationInfo();
				locationInfo.setAccountName(String.valueOf(row.getCell(0)));
				locationInfo.setEmail(String.valueOf(row.getCell(1)));
				locationInfo.setClientType(String.valueOf(row.getCell(2)));
				locationInfo.setAccountState(String.valueOf(row.getCell(3)));
				locationInfo.setAccountRegion(String.valueOf(row.getCell(4)));
				locationInfoList.add(locationInfo);
			}
		}
		if(workbook!=null) {
			workbook.close();
		}
		locationInfoList.forEach(action->{
			System.out.println(action);
		});

	}

}
