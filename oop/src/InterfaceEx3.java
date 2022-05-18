package Package12;

interface Customer{
    String getOrder();
}

class CafeCustomerA implements Customer{
    public String getOrder() {
        return "a glass of iced americano";
    }
}

class CafeCustomerB implements Customer{
    public String getOrder() {
        return "a glass of strawberry latte";
    }
}

class CafeOwner {
    public void giveItem(Customer customer) {
        System.out.println("Item : " + customer.getOrder());
    }
}


public class InterfaceEx3 {
    public static void main(String[] args) {
        CafeOwner cafeowner = new CafeOwner();
        CafeCustomerA customerA = new CafeCustomerA();  // Customer, CafeCustomerA 둘다 가능한 이유는?
        CafeCustomerB customerB = new CafeCustomerB();

        cafeowner.giveItem(customerA);
        cafeowner.giveItem(customerB);



    }
}
