import java.io.File;
import java.util.List;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.*;

import javax.xml.parsers.*;
import java.io.*;



public class TestQuestion{

    private List<String> xmlList = new ArrayList<>();

    public void loadXmlDOcument(String xmlPath){
        try{
            File inputFile = new File("/home/hubert/Pulpit/expert-system-hubert/" + xmlPath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("Rule");

            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);

                Element eElement = (Element) nNode;
                xmlList.add("Rule id: " + eElement.getAttribute("id"));
                xmlList.add("Question: " + eElement.getElementsByTagName("Question").item(0).getTextContent());

                Element nListAnswer = (Element)eElement.getElementsByTagName("Answer").item(0);

                Element nListSelection = (Element)nListAnswer.getElementsByTagName("Selection").item(0);
                Element nListSelection2 = (Element)nListAnswer.getElementsByTagName("Selection").item(1);
                xmlList.add("Selection first: " + nListSelection.getAttribute("value"));
                xmlList.add("Selection second: " + nListSelection2.getAttribute("value"));


                Element nListSingleValue = (Element)nListSelection.getElementsByTagName("SingleValue").item(0);
                //Element nListSingleValue2 = (Element)nListSelection.getElementsByTagName("SingleValue").item(1);

                // System.out.println(nListSingleValue.getNodeName());
                // System.out.println(nListSingleValue.getAttribute("value"));

                if((Element)nListSelection.getElementsByTagName("SingleValue").item(0) != null ||
                   (Element)nListSelection.getElementsByTagName("SingleValue").item(1) != null){
                    xmlList.add("SingleValue: " + nListSingleValue.getAttribute("value"));
                    //xmlList.add("SingleValue: " + nListSingleValue2.getAttribute("value"));
                }else{
                    Element nListMultipleValue = (Element)nListSelection.getElementsByTagName("MultipleValue").item(0);
                    xmlList.add("MultipleValue: " + nListMultipleValue.getAttribute("value"));

                    //Element nListMultipleValue2 = (Element)nListSelection.getElementsByTagName("MultipleValue").item(1);
                    //xmlList.add("MultipleValue: " + nListMultipleValue2.getAttribute("value"));
                }

                
            }
            for(int i=0; i<xmlList.size(); i++){
                System.out.println(xmlList.get(i));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }










    public static void main(String[] args){
        TestQuestion testQuestion = new TestQuestion();

       testQuestion.loadXmlDOcument("Rules.xml");
    }
}