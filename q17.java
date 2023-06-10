 
class Address {
    String street, city, state;
    Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
}

class Employee {
    int id;
    String name;
    Address address;
    Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.street + ", " + address.city + ", " + address.state);
    }
}

class AggregationDemo {
    public static void main(String[] args) {
        Address addr = new Address("123 Main St", "Anytown", "CA");
        Employee emp = new Employee(101, "John Doe", addr);
        emp.display();
    }
}