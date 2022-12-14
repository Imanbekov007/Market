import java.math.BigDecimal;

public class Person {
    private String name;
    private BigDecimal money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return name ;
    }

    public Person(String name, BigDecimal money) {
        this.name = name;
        this.money = money;
    }
}
