import ENUMS.Fruits;
import ENUMS.Markets;

import java.math.BigDecimal;
import java.util.List;

public class Fruitshop {
    private Markets markets;
    private String skidka;

    private List<Fruits>fruitsList;
    private BigDecimal kassa;

    @Override
    public String toString() {
        return
                "market name : " + markets +
                "\nskidka :" + skidka + '\'' +
                "\nFruits List=" + fruitsList ;
    }

    public Markets getMarkets() {
        return markets;
    }

    public void setMarkets(Markets markets) {
        this.markets = markets;
    }

    public BigDecimal getKassa() {
        return kassa;
    }

    public void setKassa(BigDecimal kassa) {
        this.kassa = kassa;
    }

    public String getSkidka() {
        return skidka;
    }

    public void setSkidka(String skidka) {
        this.skidka = skidka;
    }

    public List<Fruits> getFruitsList() {
        return fruitsList;
    }

    public void setFruitsList(List<Fruits> fruitsList) {
        this.fruitsList = fruitsList;
    }

    public Fruitshop(Markets markets, String skidka, List<Fruits> fruitsList,BigDecimal kassa) {
        this.markets = markets;
        this.skidka = skidka;
        this.fruitsList = fruitsList;
        this.kassa= kassa;
    }

}
