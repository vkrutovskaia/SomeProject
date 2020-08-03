import entity.Customer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

public class Unmarshal {
    public static void main(String[] args) throws Exception {

        final XMLInputFactory xif = XMLInputFactory.newInstance();
        final StreamSource xml = new StreamSource("Implementation/src/main/resources/shop.xml");
        XMLStreamReader xsr;
        xsr = xif.createXMLStreamReader(xml);
        xsr.nextTag();
        while (xsr.hasNext()) {
            if (xsr.isStartElement() && xsr.getLocalName().equals("smartphones_and_gadgets")) {
                break;
            }
            xsr.next();
        }

        final JAXBContext jc = JAXBContext.newInstance(Customer.class);
        final Unmarshaller unmarshaller = jc.createUnmarshaller();
        final JAXBElement<Customer> jb = unmarshaller.unmarshal(xsr, Customer.class);

        Customer customer = jb.getValue();
        System.out.println("XML to string: " + customer.getProducts().toString());
    }
}
