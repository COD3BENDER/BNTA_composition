package vehicles;

import products.IProduct;

public abstract class Vehicle implements IVehicle { // abstract classes can implement interfaces
    // it just means the extended classes would need to provide the implementation.
    // you dont have to provide the implementation in the abstract method but the object classes must
    // have the implementation
    // cntl + 0 is a shortcut to use to generate overide methods. (intellij)

    private float weight;
    private int maxSpeed;
    private IProduct baseProduct;

    public Vehicle(float weight, int maxSpeed, IProduct baseProduct) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.baseProduct = baseProduct;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public IProduct getBaseProduct() {
        return baseProduct;
    }

    public void setBaseProduct(IProduct baseProduct) {
        this.baseProduct = baseProduct;
    }

    @Override
    public float getPrice() {
        return this.baseProduct.getPrice();
    }

    @Override
    public long getInventory() {
        return this.baseProduct.getInventory();
    }

    @Override
    public void setPrice(float price) {
        this.baseProduct.setPrice(price);

    }

    @Override
    public void setInventory(long amount) {
        this.baseProduct.setInventory(amount);
    }

    @Override
    public String getTitle() {
        return this.baseProduct.getTitle();
    }

    @Override
    public void setTitle(String title) {
        this.baseProduct.setTitle(title);
    }

    @Override
    public void addInventory(long amount) {
        this.baseProduct.addInventory(amount);
    }

    @Override
    public void removeInventory(long amount) {
        this.baseProduct.removeInventory(amount);
    }
}
