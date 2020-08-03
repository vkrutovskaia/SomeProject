package entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Date;

@JsonIgnoreProperties(value = {"model", "colour"})
@JsonRootName(value = "electronic_shop")
public class JsonObject {
    private String vendor;

    private String model;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
    private Date manufacturing_date;

    private String colour;

    private int price;

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getManufacturing_date() {
        return manufacturing_date;
    }

    public void setManufacturing_date(Date manufacturing_date) {
        this.manufacturing_date = manufacturing_date;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public JsonObject(String vendor, String model, Date manufacturing_date, String colour, int price) {
        this.vendor = vendor;
        this.model = model;
        this.manufacturing_date = manufacturing_date;
        this.colour = colour;
        this.price = price;
    }
}
