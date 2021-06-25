package table;

import order.Order;

import java.util.ArrayList;

public class Table<ArraysList> {
    /**
     * Table class is used to follow our customer requests
     * Needs to contain and follow the storage elements requested by our customers
     */

    private Integer tableNumber;
    private Integer seatingCapacity;
    private Boolean isUnavailable = false; // default is false!!!
    private Boolean isIndoor;
    protected ArrayList<Order> myOrder;


    public Table(Integer tableNumber, Integer seatingCapacity, Boolean isIndoor) {
        this.tableNumber = tableNumber;
        this.seatingCapacity = seatingCapacity;
        this.isIndoor = isIndoor;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Integer getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(Integer seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public Boolean getAvailable() {
        return isUnavailable;
    }

    // or writing a method for reserving
    public void setAvailable(Boolean isUnavailable) {
        this.isUnavailable = isUnavailable;
    }

    public Boolean getIndoor() {
        return isIndoor;
    }

    public void setIndoor(Boolean indoor) {
        isIndoor = indoor;
    }

    // order can be made by scanner!!!

    public ArrayList<Order> getMyOrder() {
        return myOrder;
    }

    public void setMyOrder(ArrayList<Order> myOrder) {
        this.myOrder = myOrder;
    }
}
