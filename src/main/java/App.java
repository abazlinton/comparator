import java.util.*;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        
        Customer c1 = new Customer("Alex", 100);
        Customer c2 = new Customer("Craig", 50);
        Customer c3 = new Customer("Daniel", 200);

        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        FundsComparator fundsAsc = new FundsComparator(SortType.ASC);
        FundsComparator fundsDesc = new FundsComparator(SortType.DESC);
        

        Collections.sort(customers, fundsAsc);

        for (Customer customer : customers){
            System.out.println(customer.getFunds());
        }

        Collections.sort(customers, fundsDesc);
        
        for (Customer customer : customers){
            System.out.println(customer.getFunds());
        }
       
    }
}
