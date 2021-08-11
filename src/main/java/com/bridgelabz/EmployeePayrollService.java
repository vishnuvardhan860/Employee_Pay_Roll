package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public long countEntries(IoService fileIo) {
        return 0;
    }


    public enum IoService{CONSOLE_IO,FILE_IO,DB_IO,REST_IO}

    // Declaration of list employeePayrollList
    private List<EmployeePayrollData> employeePayrollList;

    // this is constructor to initialize employeePayrollList List.
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }

    private void writeEmployeePayrollData() {
    }

    // this is method to read employee data form console by using Scanner class
    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.print("Welcome to Employee PayRollService\n");
        System.out.print("Enter Employee ID:\n ");
        int id = consoleInputReader.nextInt();
        System.out.print("Enter the Employee Name:\n ");
        String name = consoleInputReader.next();
        System.out.print("Enter the Employee Salary:\n ");
        Double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    // this is method to write employee data into console.
    private void writeEmployeePayrollData(IoService fileIo) {
        System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
    }
}