package onlineshopping.entities;

public class StoreEvent extends Item {
    protected Store location;

    public StoreEvent(String name, Store location) {
        super(name, "EVENT", 0);
        setLocation(location);
    }

    public void setLocation(Store locationStore) {
        this.location = locationStore;
        location.addStoreEvent(this);
    }
}

