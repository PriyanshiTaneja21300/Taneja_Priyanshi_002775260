/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital_Management;

import java.util.Date;

/**
 *
 * @author PRIYANSHI TANEJA
 */
public class Community extends City {

    public String communityName ;
    public Date createdAt;
    
    public String validateCommunityName(String name) {
        String isValid = "";
        if (name.equals("")) {
            isValid = "Community Name cannot be empty! \n";
        } else if (name.length() < 2 || name.length() > 30) {
            isValid = "Community Name must be atleast 2 characters and maximum 30 characters long! \n";
        } else if (!name.matches("[a-zA-Z ]{2,30}")) {
            isValid = "Invalid Community Name Field! \n";
        }else if (name.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }
    
    public Boolean alreadyExists(String city, String community) {
        Boolean found = false;
        for (int i = 0; i < City.allCities.size(); i++) {
            if (city.equals(City.allCities.get(i).city) && community.equals(City.allCities.get(i).communityName)) {
                found = true;
            }
        }
        return found;
    }
}

