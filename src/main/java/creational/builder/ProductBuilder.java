package creational.builder;


abstract class ProductBuilder {

    Product product;

    ProductBuilder create() {
        this.product = new Product();
        return this;
    }

    abstract ProductBuilder addName();

    abstract ProductBuilder isPacked();

    abstract ProductBuilder addWarrantyYears();

    Product build(){
        return product;
    }

}
