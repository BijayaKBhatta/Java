package barber;

public class Barber {

    public void cutHair() {
        System.out.println("Barber: Cutting Hair --- " + Thread.currentThread().getName());
    }
}


 class Customer {

    public void enter() {
        System.out.println("Customer: Enters the shop --- " + Thread.currentThread().getName());
    }

    public void getHairCut() {
        System.out.println("Customer: Getting Haircut --- " + Thread.currentThread().getName());
    }

    public void leave() {
        System.out.println("Customer: Leaves the shop --- " + Thread.currentThread().getName());
    }
}
