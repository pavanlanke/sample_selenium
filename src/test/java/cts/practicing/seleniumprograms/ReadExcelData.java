package cts.practicing.seleniumprograms;

import cts.miniproject.utility.ExcelDataConfig;

public class ReadExcelData {

public static void main(String[] args) {
// TODO Auto-generated method stub
ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\pavan lanke\\eclipse-workspace\\pavan\\src\\test\\resources\\XLSX\\New Microsoft Excel Worksheet.xlsx");
System.out.println(excel.getData(0, 0, 0));
System.out.println(excel.getData(0, 0, 1));
}

}