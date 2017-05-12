/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontologia;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Camila
 */
public class LerUsuario {

    public LerUsuario() {

    }

    public void ReadLerUsuario() {

        try {
            File fXmlFile = new File("C:\\Program Files (x86)\\Jenkins\\jobs\\game-of-life\\builds\\172\\build.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

            User user = new User();

            NodeList listOfSuite = doc.getElementsByTagName("build");
            NodeList listOfNames = doc.getElementsByTagName("userId");

            if (listOfNames.getLength() == 1) {
                for (int temp = 0; temp < listOfSuite.getLength(); temp++) {
                    Node nNode = listOfSuite.item(temp);

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        user.setName(eElement.getElementsByTagName("userId").item(0).getTextContent());
                    }

                }
            } else {
                String name = "Gerado Automatimente";
                user.setName(name);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
