package creational.builder;

class ProductBuilderB extends ProductBuilder{

	ProductBuilder addName() {
		product.setName("ProductB");
		return this;
	}

	ProductBuilder isPacked() {
		product.setPacked(false);
		return this;
	}

	ProductBuilder addWarrantyYears() {
		product.setWarrantyYears(5);
		return this;
	}
}
