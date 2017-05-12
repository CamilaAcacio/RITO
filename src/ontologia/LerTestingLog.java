/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontologia;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
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
public class LerTestingLog {
    
    public LerTestingLog(){
        
    }

    public void ReadTestingLog() {

        try {
            File fXmlFile = new File("C:\\Program Files (x86)\\Jenkins\\jobs\\game-of-life\\builds\\172\\junitResult.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

            NodeList listOfSuite = doc.getElementsByTagName("result");
            int num = listOfSuite.getLength();
            System.out.println(num);
            //doc.getDocumentElement().getElementsByTagName("properties").item(0).getChildNodes();

            TestingLog testingLog = new TestingLog();

            for (int temp = 0; temp < listOfSuite.getLength(); temp++) {
                Node nNode = listOfSuite.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    testingLog.setDuration(Float.parseFloat(eElement.getElementsByTagName("duration").item(0).getTextContent()));
                    testingLog.setKeepLogStudio(Boolean.getBoolean(eElement.getElementsByTagName("keepLongStdio").item(0).getTextContent()));
                    System.out.println(testingLog.isKeepLogStudio());
                    System.out.println(testingLog.getDuration());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
