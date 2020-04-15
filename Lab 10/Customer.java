
/**
 * Contains information about the customer.
 *
 * @author Kyle Jacobson
 * @version 3/22/18
 */
public class Customer
{
    private String firstName;
    
    private String lastName;
    
    private String userEmail;
    
    public Customer(String first, String last, String email)
    {
        firstName = first;
        lastName = last;
        userEmail = email;
    }
    
    public String getfirstName()
    {
        return firstName;
    }
    
    public String getlastName()
    {
        return lastName;
    }
    
    public String getuserEmail()
    {
        return userEmail;
    }
    
    public void setfirstName(String first)
    {
        firstName = first;
    }
    
    public void setlastName(String last)
    {
        lastName = last;
    }
    
    public void setuseremail(String email)
    {
        userEmail = email;
    }
    
    public String toString()
    {
        return firstName + " " + lastName + ": " + userEmail;
    }
    
    public static void main(String[]args)
    {
        Customer c = new Customer("Ryan", "Smith", "rsmith0@sogou.com");
        System.out.println(c.getfirstName() + " " + c.getlastName() + ": " + c.getuserEmail());
    }
}
