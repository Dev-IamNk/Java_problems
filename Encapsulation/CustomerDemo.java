package Encapsulation;

public class CustomerDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Customer c1 = new Customer();
        c1.setCid(101);
        c1.setName("Nandha");
        c1.setCity("Pondicherry");
        System.out.println(c1);

        Customer c2 = new Customer();
        c2.setCid(102);
        c2.setName("Kumaran");
        c2.setCity("Chennai");

        System.out.println(c2);
        Customer c3 = new Customer();
        c3.setCid(103);
        c3.setName("Ramesh");
        c3.setCity("Goa");
        System.out.println(c3);

    }

}