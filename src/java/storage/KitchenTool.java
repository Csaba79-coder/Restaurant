package storage;

public class KitchenTool extends StorageElement {
    /**
     * KitchenTool class shall be used to follow the states of our tools
     * The tools shall be identified by name (creating new classes are not necessary)
     * The amount of each tool shall be also followed
     * The following states are mandatory:
     *      available
     *      in use
     *      dirty
     *      depreciated
     *
     * hint: Map
     */


    Integer depreciated;
    Integer inUse;
    Integer dirty;
    Integer available;

    public KitchenTool(String name, Integer quantity) {
        super(name, quantity);
        this.available = quantity;
        //available = (quantity - (inUse + dirty));
    }

    public Integer getDepreciated() {
        return depreciated;
    }

    public void setDepreciated(Integer depreciated) {
        this.depreciated = depreciated;
    }

}
