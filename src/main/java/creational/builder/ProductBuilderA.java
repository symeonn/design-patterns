package creational.builder;

class ProductBuilderA extends ProductBuilder{

	ProductBuilder addName() {
		product.setName("ProductA");
		return this;
	}

	ProductBuilder isPacked() {
		product.setPacked(true);
		return this;
	}

	ProductBuilder addWarrantyYears() {
		product.setWarrantyYears(20);
		return this;
	}
}
