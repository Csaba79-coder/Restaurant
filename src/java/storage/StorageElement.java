package storage;

public class StorageElement {
    /**
     * StorageElement shall be a parent class for the element types in the Storage
     */
    String name;  // setter name, and setter in.quantity
    Integer initialQuantity;

    public StorageElement(String name, Integer quantity) {
        this.name = name;
        this.initialQuantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getInitialQuantity() {
        return initialQuantity;
    }

    public void setInitialQuantity(Integer initialQuantity) {
        this.initialQuantity = initialQuantity;
    }
}
