package storage;

public class Meal extends StorageElement {
    /**
     * Meal class shall be used to follow the amount of our food
     * The food shall be identified by name (creating new classes are not necessary)
     *
     * hint: Set
     */

    Integer availableQuantity;

    public Meal(String name, Integer quantity, Integer availableQuantity) {
        super(name, quantity);
        this.availableQuantity = availableQuantity;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}
