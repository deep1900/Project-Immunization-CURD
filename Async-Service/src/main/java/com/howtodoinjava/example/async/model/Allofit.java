package com.howtodoinjava.example.async.model;

import java.util.List;

public class Allofit
{
    public List<EmployeeAddress> employeeAddressList;
    public List<EmployeeName> employeeNameList;
    public List<EmployeePhone> employeePhones;

    public Allofit() {

    }

    public Allofit(List<EmployeeAddress> employeeAddressList, List<EmployeeName> employeeNameList, List<EmployeePhone> employeePhones) {
        this.employeeAddressList = employeeAddressList;
        this.employeeNameList = employeeNameList;
        this.employeePhones = employeePhones;
    }

    public List<EmployeeAddress> getEmployeeAddressList() {
        return employeeAddressList;
    }

    public void setEmployeeAddressList(List<EmployeeAddress> employeeAddressList) {
        this.employeeAddressList = employeeAddressList;
    }

    public List<EmployeeName> getEmployeeNameList() {
        return employeeNameList;
    }

    public void setEmployeeNameList(List<EmployeeName> employeeNameList) {
        this.employeeNameList = employeeNameList;
    }

    public List<EmployeePhone> getEmployeePhones() {
        return employeePhones;
    }

    public void setEmployeePhones(List<EmployeePhone> employeePhones) {
        this.employeePhones = employeePhones;
    }

    @Override
    public String toString() {
        return "Allofit{" +
                "employeeAddressList=" + employeeAddressList +
                ", employeeNameList=" + employeeNameList +
                ", employeePhones=" + employeePhones +
                '}';
    }
}
