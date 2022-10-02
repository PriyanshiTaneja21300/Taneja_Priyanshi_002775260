
package model;

import java.util.ArrayList;


public class EmployeeDirectory {

    public static Iterable<Employee> getEmployeeDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    private ArrayList<Employee> directory;
    
    public EmployeeDirectory(){
        
        this.directory = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Employee> directory) {
        this.directory = directory;
    }
    
    public Employee addNewEmployees(){
        
        Employee newEmployees = new Employee();
        directory.add(newEmployees);
        return newEmployees;
        
        
        
        
        
        
        
    }
    
    public void deleteEmployees(Employee emp){
        directory.remove(emp);
    }
    
    
}
