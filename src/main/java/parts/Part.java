package parts;


import products.IProduct;

public class Part implements IPart{

    private String manufacturer;
    private long partNumber;
    private IProduct baseProduct;

    public Part(String manufacturer, long partNumber, IProduct baseProduct) {
        this.manufacturer = manufacturer;
        this.partNumber = partNumber;
        this.baseProduct = baseProduct;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public long getPartNumber() {
        return partNumber;
    }

    @Override
    public void setPartNumber(long partNumber) {
        this.partNumber = partNumber;
    }
// these methods below use composition instead of defining new we just uodate product class
    // the diffrence this time as apposed to what i was doing before when creating objects is
    // this class also has all the getters and setters, but it updates the product variables.
    // when we was creating objects we chose what we needed and then could do return object.get/set..Method();
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
