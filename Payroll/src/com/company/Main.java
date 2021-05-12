package com.company;

import java.util.Scanner;

class Employee{
    private String emp_name;
    private String emp_no;
    private String dept;
    private float salary;

    //default constructor
    Employee(){}
    //parameterized constructor
    public Employee(String emp_name,String emp_no,String dept,float salary){
        this.emp_name=emp_name;
        this.emp_no=emp_no;
        this.dept=dept;
        this.salary=salary;
    }


    //getters
    public String getEmp_name(){
        return emp_name;
    }
    public String getDept(){
        return dept;
    }
    public String getEmp_no(){
        return emp_no;
    }
    public float getSalary(){
        return salary;
    }

    //setters
    public void setEmp_name(String emp_name){
        this.emp_name=emp_name;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public void setEmp_no(String emp_no){
        this.emp_no=emp_no;
    }
    public void setSalary(float salary){
        this.salary=salary;
    }

    public String toString(){
        return "Employee name: "+this.emp_name+"\n"+"Employee no: "+this.emp_no+"\n"+"Department: "+this.dept;
    }

}
class PermanentEmployee extends Employee{
    private float basicSalary;
    private float overTimeHours;
    private float overRate =250;
    private float monthlySalary;

    //getters
    public float getBasicSalary(){
        return this.basicSalary;
    }
    public float getOverTimeHours(){
        return this.overTimeHours;
    }
    public float getMonthlySalary(){
       return this.monthlySalary;
    }

    //setters
    public void setBasicSalary(float basicSalary){
        this.basicSalary=basicSalary;
    }
    public void setOverTimeHours(float overTimeHours){
        this.overTimeHours=overTimeHours;
    }
    public void setMonthlySalary(float monthlySalary){
        this.monthlySalary=monthlySalary;
    }

    //default constructor
    PermanentEmployee(){}
    //parameterized constructor
    PermanentEmployee(String emp_name,String emp_no,String dept,float basicSalary,float overTimeHours){
        super.setEmp_name(emp_name);
        super.setDept(dept);
        super.setEmp_no(emp_no);
        this.basicSalary=basicSalary;
        this.overTimeHours=overTimeHours;

    }

    public float calMonSalary(float basicSalary,float overTimeHours){
        monthlySalary = basicSalary +(overTimeHours*overRate);
        return  monthlySalary;
    }

    public String toString(){
        return "Employee name: "+super.getEmp_name()+"\n"+"Employee no: "+super.getEmp_no()+"\n"+"Department: "+super.getDept()+"\n"+"Employee type: Permanent";
    }



}

class TemporaryEmployee extends Employee{

    int numOfDayWorked;
    float dallyRate=2000;
    float monthlySalary;

    //getter
    public int getNumOfDayWorked(){
        return this.numOfDayWorked;
    }
    public float getMonthlySalary(){
        return this.monthlySalary;
    }

    //setter
    public void setNumOfDayWorked(int numOfDayWorked){
        this.numOfDayWorked=numOfDayWorked;
    }
    public void setMonthlySalary(float monthlySalary){
        this.monthlySalary=monthlySalary;
    }

    TemporaryEmployee(){}

    TemporaryEmployee(String emp_name,String emp_no,String dept,int numOfDayWorked){
        super.setEmp_name(emp_name);
        super.setDept(dept);
        super.setEmp_no(emp_no);
        this.numOfDayWorked=numOfDayWorked;
    }

    public float calMonSalary(int numOfDayWorked,float dallyRate){
        if(numOfDayWorked>20){
            return monthlySalary= (float) (1.1*(numOfDayWorked*dallyRate));
        }else{
            return monthlySalary=numOfDayWorked*dallyRate;
        }
    }

    public String toString(){
        return "Employee name: "+super.getEmp_name()+"\n"+"Employee no: "+super.getEmp_no()+"\n"+"Department: "+super.getDept()+"\n"+"Employee type: Temporary";
    }

}


public class Main {

    public static void main(String[] args) {
	String name,empNo,dep;
	char type;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name: ");
        name=myObj.nextLine();
        System.out.println("Enter employee number: ");
        empNo=myObj.nextLine();
        System.out.println("Enter department: ");
        dep=myObj.nextLine();
        System.out.println("Enter employee type, permanent('P') or temporary('T'): ");
        type=myObj.next().charAt(0);

        if(type=='P'){
            PermanentEmployee e1=new PermanentEmployee();
            System.out.println("Enter basic salary: ");
            e1.setBasicSalary(myObj.nextFloat());
            System.out.println("Enter number of overtime: ");
            e1.setOverTimeHours(myObj.nextFloat());
            e1.setDept(dep);
            e1.setEmp_name(name);
            e1.setEmp_no(empNo);
            e1.calMonSalary(e1.getBasicSalary(), e1.getOverTimeHours());
            System.out.println("Play slip");
            System.out.println("------------");
            System.out.println(e1.toString());
            System.out.println("------------");
            System.out.println("basic salary: "+e1.getBasicSalary());
            System.out.println("overtime hours: "+e1.getOverTimeHours());
            System.out.println("Monthly salary:Rs. "+e1.getMonthlySalary());
        }else{
            TemporaryEmployee e2=new TemporaryEmployee();
            System.out.println("Enter number of days worked: ");
            e2.setNumOfDayWorked(myObj.nextInt());
            e2.setDept(dep);
            e2.setEmp_name(name);
            e2.setEmp_no(empNo);
            e2.calMonSalary(e2.getNumOfDayWorked(),e2.dallyRate);
            System.out.println("Play slip");
            System.out.println("------------");
            System.out.println(e2.toString());
            System.out.println("------------");
            System.out.println("working days="+e2.getNumOfDayWorked());
            System.out.println("Monthly salary:"+e2.getMonthlySalary());

        }
    }
}
