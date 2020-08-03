import org.xml.sax.SAXException;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class ShopXsdCheck {
    public static void main(String[] args) throws SAXException, IOException {
        SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");

        File schemaLocation = new File("Implementation/src/main/resources/shop.xsd");
        Schema schema = factory.newSchema(schemaLocation);

        Validator validator = schema.newValidator();

        Source source = new StreamSource(args[0]);

        try {
            validator.validate(source);
            System.out.println(args[0] + " is valid.");
        } catch (SAXException ex) {
            System.out.println(args[0] + "is not valid because ");
            System.out.println(ex.getMessage());
        }
    }
}
