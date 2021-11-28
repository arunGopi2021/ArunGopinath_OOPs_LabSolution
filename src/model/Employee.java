package model;


public class Employee {

    //Instance variables
    String firstName;
    String lastName;
    String department;


    //Constructor
    public Employee(String fn,String ln,String dep){
        this.firstName = fn;
        this.lastName = ln;
        this.department = dep;
    }

    // getter methods
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    public String getDepartment(){
        return this.department;
    }


    // setter methods
    void setFirstName(String fn){
        this.firstName = fn;
    }

    void setlastName(String ln){
        this.lastName = ln;
    }

    void setDepartment(String dep){
        this.department = dep;
    }




}
