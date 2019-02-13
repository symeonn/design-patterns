package creational.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
class Product {

    int id;

    String name;
    int warrantyYears;
    boolean packed;
    static int nextId;

    Product() {
        id = ++nextId;
    }

}
