public class Xyz {
    public Ticket booking(Customer customer,Passport passport) {

        Ticket t1 = new Ticket(1, 34);
        System.out.println(customer);
        System.out.println(passport);
        return t1;
    }
    public static void main(String[] args) {
        Xyz x1=new Xyz();
        //Xyz tic=x1.booking(new Customer1("bindu",23),new Passport(1,23));
        System.out.println(x1.booking(new Customer("bindu",23),new Passport(1,23)));
    }
}

