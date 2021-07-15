package com.bridgelabz;

import java.time.LocalDate;

public class EmployeePayrollData {

    public int id;
    public String name;
    public double basic_pay;
    public LocalDate startDate;

    public EmployeePayrollData(Integer id, String name, Double basic_pay) {
        this.id = id;
        this.name = name;
        this.basic_pay = basic_pay;
    }

    public EmployeePayrollData(int id, String name, double basic_pay, LocalDate startDate){
        this(id, name, basic_pay);
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", basic_pay=" + basic_pay +
                ", startDate=" + startDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeePayrollData that = (EmployeePayrollData) o;
        return id == that.id &&
                     Double.compare(that.basic_pay,basic_pay) == 0 &&
                     name.equals(that.name);
    }
}
