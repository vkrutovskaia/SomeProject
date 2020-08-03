package entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "smartphones_and_gadgets")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {

        @XmlElement(name = "product")
        private ArrayList<Product> products;

        public ArrayList<Product> getProducts() {
            return products;
        }

        public void setProducts(ArrayList<Product> products) {
            this.products = products;
        }
}
