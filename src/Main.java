import com.workintech.entity.DeluxeBurger;
import com.workintech.entity.Hamburger;
import com.workintech.entity.HealthyBurger;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Ham1" ,"Normal" , 100, "bread" );

        hamburger.addHamburgerAddition1("Lettuce" , 1.1);
        hamburger.addHamburgerAddition2("Pepsi" , 1.2);
        hamburger.addHamburgerAddition3("Cheese" , 1.3);
        hamburger.addHamburgerAddition4("Potato" , 1.4);

        System.out.println("Total price is: " + hamburger.itemizeHamburger());

        System.out.println("---------------------");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Cheese" , 1.1);
        System.out.println("Total price : " + deluxeBurger.itemizeHamburger());

        System.out.println("---------------------");

        HealthyBurger healthyBurger = new HealthyBurger("Tofu" ,5.50);
        healthyBurger.addHealthyAddition1("Egg" , 2.2);
        healthyBurger.addHamburgerAddition1("Lentils",3.55);
        System.out.println("Total price " + healthyBurger.itemizeHamburger());


    }
}