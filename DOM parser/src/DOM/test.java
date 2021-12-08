package DOM;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class test {

    public static void main(String[] args) {
        //DocumentBuilderFactory factory = DocumentBulilderFactory.newInstance();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("D://Worked File/XML work File/Creating dom parser/employee.xml");
            //read the data from document sequestially

            //get the root element from document object
            Element element = document.getDocumentElement();  //root element
            System.out.println(element.getNodeName());
            //get the child elements
            NodeList list = element.getChildNodes();
            for (int i = 0; i < list.getLength(); i++) {
                //get child node object from NodeList
                Node node = list.item(i);
                if (node.getNodeType() == node.ELEMENT_NODE) {
                    System.out.println(node.getNodeName() + "-->" + node.getTextContent());
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
