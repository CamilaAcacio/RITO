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
public class LerProject {

    public LerProject() {
    }
    
    public void ReadProject(){
        
        try {
            File fXmlFile = new File("C:\\Program Files (x86)\\Jenkins\\jobs\\game-of-life\\builds\\5\\archive\\gameoflife-build\\pom.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

            Project project = new Project();
           
            NodeList listOfSuite = doc.getElementsByTagName("parent");

            for (int temp = 0; temp < listOfSuite.getLength(); temp++) {
                Node nNode = listOfSuite.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    
                    project.setName(eElement.getElementsByTagName("artifactId").item(0).getTextContent());
                    project.setVersion(eElement.getElementsByTagName("version").item(0).getTextContent());
                   
                }

            }
            
            System.out.println(project.getName());
            System.out.println(project.getVersion());

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
        
    }
    
}
