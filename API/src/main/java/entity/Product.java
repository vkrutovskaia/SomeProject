package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
    @XmlElement
    private String vendor;

    @XmlElement
    private String model;

    @XmlElement
    private String manufacturing_date;

    @XmlElement
    private String colour;

    @XmlElement
    private int price;

    @Override
    public String toString() {
        return "Product{" +
                "vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", manufacturing_date='" + manufacturing_date + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
