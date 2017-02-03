package com.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileToArray {

	public static void main(String[] args) {
		System.out.println(getFileToArray());
		System.out.println(getFileToArrayForLevel());
		System.out.println(getFileToArrayForMapping());
	}

	public static List<String> getFileToArray() {
		int startingValue = 1;
		int endigValue = 192;
		int valumeDivideByAmt = 1;

		int[] irows = new int[(endigValue - startingValue) + 1];
		int neededrow = 0;
		for (int i = startingValue; i <= endigValue; i++) {

			irows[neededrow] = i;
			neededrow++;
		}
		int[] icols = { 1 };
		FileInputStream excellFile1 = null;
		try {
			excellFile1 = new FileInputStream(new File("D:\\demo\\data.xlsx"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Create Workbook instance holding reference to .xlsx file
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(excellFile1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Get first/desired sheet from the workbook
		XSSFSheet sheet = workbook.getSheetAt(0);
		int i = 0;
		List<String> listProducts = new ArrayList<>();
		// get rows with given row numbers
		for (int rowNum : irows) {
			if (rowNum >= sheet.getFirstRowNum() && rowNum <= sheet.getLastRowNum()) {

				// create new row

				XSSFRow row = sheet.getRow(rowNum);
				int j = 0;

				// get columns with given column numbers
				for (int colNum : icols) {
					if (colNum >= sheet.getRow(0).getFirstCellNum() && colNum <= sheet.getRow(0).getLastCellNum()) {

						// create new column

						XSSFCell cell = row.getCell(colNum);

						switch (cell.getCellType()) {
						case HSSFCell.CELL_TYPE_FORMULA:

							break;
						case HSSFCell.CELL_TYPE_NUMERIC:

							break;
						case HSSFCell.CELL_TYPE_STRING:

							listProducts.add(cell.getStringCellValue());
							break;
						case HSSFCell.CELL_TYPE_BLANK:

							break;
						case HSSFCell.CELL_TYPE_BOOLEAN:

							break;
						case HSSFCell.CELL_TYPE_ERROR:

							break;
						default:

							break;
						}

					}

				}
			}
			i++;
		}

		System.out.println(listProducts + "" + listProducts.size());
		return listProducts;

	}
	
	public static List<ProLevel> getFileToArrayForLevel() {
		int startingValue = 1;
		int endigValue = 29;
		int valumeDivideByAmt = 1;

		int[] irows = new int[(endigValue - startingValue) + 1];
		int neededrow = 0;
		for (int i = startingValue; i <= endigValue; i++) {

			irows[neededrow] = i;
			neededrow++;
		}
		int[] icols = { 1,2 };
		FileInputStream excellFile1 = null;
		try {
			excellFile1 = new FileInputStream(new File("D:\\demo\\data.xlsx"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Create Workbook instance holding reference to .xlsx file
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(excellFile1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Get first/desired sheet from the workbook
		XSSFSheet sheet = workbook.getSheetAt(1);
		int i = 0;
		List<ProLevel> listProducts = new ArrayList<>();
		// get rows with given row numbers
		for (int rowNum : irows) {
			if (rowNum >= sheet.getFirstRowNum() && rowNum <= sheet.getLastRowNum()) {

				// create new row
				ProLevel proLevel=new ProLevel();

				XSSFRow row = sheet.getRow(rowNum);
				int j = 0;

				// get columns with given column numbers
				for (int colNum : icols) {
					if (colNum >= sheet.getRow(0).getFirstCellNum() && colNum <= sheet.getRow(0).getLastCellNum()) {

						// create new column

						XSSFCell cell = row.getCell(colNum);

						switch (cell.getCellType()) {
						case HSSFCell.CELL_TYPE_FORMULA:

							break;
						case HSSFCell.CELL_TYPE_NUMERIC:
							
							proLevel.setLevel((int) cell.getNumericCellValue());
							break;
						case HSSFCell.CELL_TYPE_STRING:
                          
                        	  proLevel.setName(cell.getStringCellValue());
							break;
						case HSSFCell.CELL_TYPE_BLANK:

							break;
						case HSSFCell.CELL_TYPE_BOOLEAN:

							break;
						case HSSFCell.CELL_TYPE_ERROR:

							break;
						default:

							break;
							
							
						}
						

					}

				}
				listProducts.add(proLevel);
			}
			i++;
		}

		System.out.println(listProducts + "" + listProducts.size());
		return listProducts;

	}

	public static List<Mapping> getFileToArrayForMapping() {
		int startingValue = 1;
		int endigValue = 192;
		int valumeDivideByAmt = 1;

		int[] irows = new int[(endigValue - startingValue) + 1];
		int neededrow = 0;
		for (int i = startingValue; i <= endigValue; i++) {

			irows[neededrow] = i;
			neededrow++;
		}
		int[] icols = { 1,2 };
		FileInputStream excellFile1 = null;
		try {
			excellFile1 = new FileInputStream(new File("D:\\demo\\data.xlsx"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Create Workbook instance holding reference to .xlsx file
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(excellFile1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Get first/desired sheet from the workbook
		XSSFSheet sheet = workbook.getSheetAt(0);
		int i = 0;
		List<Mapping> listMapping = new ArrayList<>();
		// get rows with given row numbers
		for (int rowNum : irows) {
			if (rowNum >= sheet.getFirstRowNum() && rowNum <= sheet.getLastRowNum()) {

				// create new row
				Mapping mapping=new Mapping();

				XSSFRow row = sheet.getRow(rowNum);
				int j = 0;

				// get columns with given column numbers
				for (int colNum : icols) {
					if (colNum >= sheet.getRow(0).getFirstCellNum() && colNum <= sheet.getRow(0).getLastCellNum()) {

						// create new column

						XSSFCell cell = row.getCell(colNum);

						switch (cell.getCellType()) {
						case HSSFCell.CELL_TYPE_FORMULA:

							break;
						case HSSFCell.CELL_TYPE_NUMERIC:
							
						//	proLevel.setLevel((int) cell.getNumericCellValue());
							break;
						case HSSFCell.CELL_TYPE_STRING:
                          if(colNum==1)
                        	  mapping.setName(cell.getStringCellValue());
                         
                          else
                        	  {String mapp=cell.getStringCellValue();
                        	 
                        	 mapping.setMapping(mapp.split("/"));
                        	
                        	  }
							break;
						case HSSFCell.CELL_TYPE_BLANK:

							break;
						case HSSFCell.CELL_TYPE_BOOLEAN:

							break;
						case HSSFCell.CELL_TYPE_ERROR:

							break;
						default:

							break;
							
							
						}
						

					}

				}
				listMapping.add(mapping);
			}
			i++;
		}

		System.out.println(listMapping + "" + listMapping.size());
		return listMapping;

	}
}
