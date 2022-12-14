import ENUMS.Fruits;
import ENUMS.Markets;
import ENUMS.Vegetables;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Serviceimp serviceimp = new Serviceimp();
        System.out.println("~~~~~~~~~~~~~~ONLINE SHOP~~~~~~~~~~~~~~");
        System.out.println("Do you want to  create account (YES/NO)");
        if(scanner.nextLine().toUpperCase().equals("YES")) {
            System.out.println(serviceimp.createadam());
        }else {
            System.out.println("Sorry you  cannot buy without creating account");
            throw new RuntimeException();
        }
        System.out.println(Markets.FRUITSHOP);
        Fruitshop fruitshop = new Fruitshop(Markets.FRUITSHOP, "no", List.of(Fruits.values()), new BigDecimal(5000));
        System.out.println("click 1 see all fruits");
        if(scanner.nextInt()==1) {
            System.out.println(List.of(Fruits.values()));
            System.out.println(serviceimp.bought(List.of(Fruits.values())));
            System.out.println("CUSTOMER : "+serviceimp.person);
            System.out.println("MARKET : "+Markets.FRUITSHOP );
            System.out.println("Products : "+serviceimp.korzina);
            System.out.println(serviceimp.summa);
        }
        }


    }

