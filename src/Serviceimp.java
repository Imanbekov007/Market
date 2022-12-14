import ENUMS.Fruits;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Serviceimp implements Service{
    List<Person>person=new ArrayList<>();
    List<Fruits>korzina=new ArrayList<>();
    int summa=0;
    @Override
    public String createadam() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write your name and how much money do you have");
        Person person1=new Person(scanner.nextLine(), scanner.nextBigDecimal());
        person.add(person1);
        return "Successfully created";
    }

    @Override
    public List<Person> getInfo() {
        return person;
    }

    @Override
    public String bought(List<Fruits> fruits) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Write fruit'name : ");
             {
                if (scanner.nextLine().toUpperCase().equals(Fruits.APPLE.name())) {
                    System.out.println("How many kg");
                    summa = scanner.nextInt() * 50;
                    korzina.add(Fruits.APPLE);
                }
                else if (scanner.nextLine().toUpperCase().equals(Fruits.BANANA.name())) {
                    System.out.println("How many kg");
                    summa = scanner.nextInt() * 80;
                    korzina.add(Fruits.BANANA);
                }
                else if (scanner.nextLine().toUpperCase().equals(Fruits.ORANGE.name())) {
                     System.out.println("How many kg");
                     summa = scanner.nextInt() * 380;
                     korzina.add(Fruits.ORANGE);
                 }
                 else if (scanner.nextLine().toUpperCase().equals(Fruits.CHEER.name())) {
                     System.out.println("How many kg");
                     summa = scanner.nextInt() * 480;
                     korzina.add(Fruits.CHEER);
                 }
                else if (scanner.nextLine().toUpperCase().equals(Fruits.GRAPES.name())) {
                     System.out.println("How many kg");
                     summa = scanner.nextInt() * 180;
                     korzina.add(Fruits.GRAPES);
                 }


            }
            return "Successfully bought";

    }


    @Override
    public List<Fruits> checklist() {
        return korzina;
    }


}
