import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class OwnValidator{

    public static boolean validateXMLSchema(String xsdPath, String xmlPath){

        try {
            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException e) {
            System.out.println("Exception: "+e.getMessage());
            return false;
        } catch(org.xml.sax.SAXException e){
            System.out.println("Error while validating xml file against xsd!");
            return false;
        }
        return true;
    }





    public static void main(String[] args){

        validateXMLSchema("/home/hubert/Pulpit/expert-system-hubert/Rules.xsd", "/home/hubert/Pulpit/expert-system-hubert/Rules.xml");
        validateXMLSchema("/home/hubert/Pulpit/expert-system-hubert/Facts.xsd", "/home/hubert/Pulpit/expert-system-hubert/Facts.xml");

    }
}