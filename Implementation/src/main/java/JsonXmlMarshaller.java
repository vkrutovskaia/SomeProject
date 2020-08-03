import com.fasterxml.jackson.databind.ObjectMapper;
import entity.JsonObject;
import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonXmlMarshaller {
    public JsonXmlMarshaller() {
    }

    public static void main(String[] args) throws IOException, ParseException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        Date date = simpleDateFormat.parse("20-07-2020 12:30");

        JsonObject jsonObject = new JsonObject("Buro", "BU-112", date, "black", 600);
        String jsonString = mapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(jsonObject);
        System.out.println("This is converted Json: " + jsonString);

        //unmarshalling json to xml
        JSONObject json = new JSONObject(jsonString);
        String xml = XML.toString(json);
        System.out.println("XML from json: " + xml);
    }
}
