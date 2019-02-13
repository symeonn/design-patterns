package creational.builder;

import lombok.Setter;

@Setter
class ProductBuildDirector {

    ProductBuilder productBuilder;

    void construct() {

        productBuilder.create()
                .addName()
                .isPacked()
                .addWarrantyYears();
    }

    Product getProduct() {

        return productBuilder.build();
    }

}
