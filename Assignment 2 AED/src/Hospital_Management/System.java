
package Hospital_Management;


public class System {

    /**
     * @param args the command line arguments
     */
    public int identifier;
    public String type;
    public String name;
    public String email;
    private String password;

    /**
     * @return the uniqueIdentifier
     */
    public int getidentifier() {
        return identifier;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }


    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}