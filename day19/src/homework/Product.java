package homework;

import java.util.Objects;

/**
 * @author chenjie
 * @date 2021/5/25-17:07
 */
public class Product {
    private String id;
    private String name;
    private double price;
    private  int number;
    private String element;
    private String company;

    public Product() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && number == product.number && Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(element, product.element) && Objects.equals(company, product.company);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", element='" + element + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, number, element, company);
    }

    public Product(String id, String name, double price, int number, String element, String company) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.element = element;
        this.company = company;
    }
}
