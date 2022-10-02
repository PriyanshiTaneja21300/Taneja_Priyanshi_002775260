
package model;


public class Employee {
    
    private String Name; 
    private int Employee_ID;
    private int  Age;
    private String Gender;
    private String Start_date;
    private String Level;
    private String Team_info;
    private String Position_title;
   // private int Contact_Info;
    private int Cell_phone_number;
    private String email_address;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(int Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getStart_date() {
        return Start_date;
    }

    public void setStart_date(String Start_date) {
        this.Start_date = Start_date;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getTeam_info() {
        return Team_info;
    }

    public void setTeam_info(String Team_info) {
        this.Team_info = Team_info;
    }

    public String getPosition_title() {
        return Position_title;
    }

    public void setPosition_title(String Position_title) {
        this.Position_title = Position_title;
    }

    /*public int getContact_Info() {
        return Contact_Info;
    }

    public void setContact_Info(int Contact_Info) {
        this.Contact_Info = Contact_Info;
    }*/

    public int getCell_phone_number() {
        return Cell_phone_number;
    }

    public void setCell_phone_number(int Cell_phone_number) {
        this.Cell_phone_number = Cell_phone_number;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
    
    @Override
    public String toString(){
        return Name;
    }
    
    
    
    
    
    
    
}
