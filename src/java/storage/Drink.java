package storage;

import java.util.stream.IntStream;

public class Drink extends StorageElement {
    /**
     * Drink class shall be used to follow the states of our drinks
     * The drinks shall be identified by name (creating new classes are not necessary)
     * The amount of each drink shall be also followed
     *
     * hint: List
     */

    Boolean isAlcoholic;


    public Drink(String name, Integer quantity, Boolean isAlcoholic) {
        super(name, quantity);
        this.isAlcoholic = isAlcoholic;
    }

//    public Boolean getAlcoholic() {
//        return isAlcoholic;
//    }
//
//
//    public void setAlcoholic(Boolean alcoholic) {
//        isAlcoholic = alcoholic;
//    }
}
