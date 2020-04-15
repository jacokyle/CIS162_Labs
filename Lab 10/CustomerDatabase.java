import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerDatabase {
    private ArrayList<Customer> info;

    public CustomerDatabase() {
        info = new ArrayList<Customer>();
    }

    public Customer findCustomer(String firstName, String lastName) {
        // one Customer whose firstName and lastName match the input parameters, or 
        // return a null value if it is not found. 
        for(Customer name : info)
        {
            if(name.getfirstName().equalsIgnoreCase(firstName) && name.getlastName().equalsIgnoreCase(lastName))
            {
                return name;
            }
        }

        return null;
    }

    public ArrayList<Customer> findCustomersWithSameEmailDomain(String domain) {
        // have the same domain.  For example, if domain is @google, you should return an
        // ArrayList of all the Customers that contain @google in the email
        ArrayList<Customer> temp = new ArrayList<Customer>();
        
        for(Customer email : info)
        {
            if(email.getuserEmail().contains(domain))
            {
                temp.add(email);
            }
        }
        
        return temp;
    }

    public ArrayList<Customer> getDB() {
        // ONE line of code
        return info;
    }

    public int getNumberCustomers () {

        // ArrayList - ONE line of code
        return info.size();
    }

    public void readCustomerData(String filename)  {
        // Read the full set of data from a text file
        try{ 

            // open the text file and use a Scanner to read the text
            FileInputStream fileByteStream = new FileInputStream(filename);
            Scanner scnr = new Scanner(fileByteStream);
            scnr.useDelimiter("[,\r\n]+");

            // keep reading as long as there is more data
            while(scnr.hasNext()) {  
                String firstName = scnr.next();
                String lastName = scnr.next();
                String userEmail = scnr.next();

                // discarding the data found in the file after the email - IT is not needed
                scnr.nextLine();

                // FIX ME: instantiate a Customer object and add it to the ArrayList
                // You could do this with one or two lines of code.
                Customer person = new Customer(firstName, lastName, userEmail);
                info.add(person);
            }
            fileByteStream.close();
        }
        catch(IOException e) {
            System.out.println("Failed to read the data file: " + filename);
        }
    }

    public static void main(String[] args) {
        CustomerDatabase customers = new CustomerDatabase();
        customers.readCustomerData("Customerrecords.txt");

        System.out.println("\nSearching for Jack King..." + 
            "\n============================");
        Customer jack = customers.findCustomer("Jack", "King");

        if(jack != null) {
            System.out.println("Found record: " + jack);
        } else {
            System.out.println("Could not find Jack King");
        }

        System.out.println("\nSearching for Bill Gates..." + 
            "\n============================");
        Customer bill = customers.findCustomer("Bill", "Gates");

        if(bill != null) {
            System.out.println("Found record: " + bill);
        } else {
            System.out.println("Could not find Bill Gates");
        }

        System.out.println("\nFinding all customers who have a google email account" + 
            "\n=======================================================");
        ArrayList<Customer> domainCustomers = 
            customers.findCustomersWithSameEmailDomain("@google") ;
        System.out.println("Found " + domainCustomers.size() + " records total:");

        for(Customer c : domainCustomers) {
            System.out.println(c);
        }

    }

}
