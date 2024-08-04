// The Interface Segregation Principle (ISP) is one of the SOLID principles in object-oriented programming. It states that clients should not be forced to depend on interfaces they do not use. In other words, it promotes the idea of having smaller, more focused interfaces rather than large, monolithic ones.

// Let's take a look at an example to understand the ISP better. Suppose we have a class called Printer that needs to interact with different types of devices, such as a scanner and a fax machine. We can define an interface called Machine that includes methods for printing, scanning, and faxing:

interface Machine {
    void print();
    void scan();
    void fax();
}
// However, the problem with this approach is that not all devices support all the operations. For example, a fax machine may not have scanning capabilities. So, if we have a class that only needs to print, it would still have to implement the scan() and fax() methods, even though it doesn't use them. This violates the ISP because clients are forced to depend on interfaces they don't need.

// To adhere to the ISP, we can split the Machine interface into smaller, more specific interfaces. For example, we can have separate interfaces for printing, scanning, and faxing:
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface FaxMachine {
    void fax();
}
public class Interface_segregation_principle {
    
}

// Now, clients can choose to implement only the interfaces they need. For instance, a class that only needs to print can implement the Printer interface, while a class that needs to scan and print can implement both the Scanner and Printer interfaces. This way, we have segregated the interfaces based on their specific functionalities, allowing clients to depend only on the interfaces they require.

// By following the ISP, we achieve better code organization, maintainability, and flexibility. It also helps in avoiding unnecessary dependencies and reduces the impact of changes in one interface on the clients of other interfaces.

// Remember, the ISP encourages us to design interfaces that are cohesive and focused on a single responsibility, rather than trying to include all possible methods in a single interface.