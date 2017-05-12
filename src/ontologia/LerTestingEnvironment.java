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
public class LerTestingEnvironment {
    
    public LerTestingEnvironment(){
        
    }
    
    public void ReadTestingEnvironment(){
        
        try {
            File fXmlFile = new File("C:/Program Files (x86)/Jenkins/workspace/game-of-life/gameoflife-core/target/surefire-reports/TEST-com.wakaleo.gameoflife.domain.WhenYouCreateACell.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

            Environment testingEnvironment = new Environment();
         
            NodeList listOfProperties = doc.getElementsByTagName("properties");
            NodeList listOfSubProperties = doc.getDocumentElement().getElementsByTagName("properties").item(0).getChildNodes();

            for (int j = 0; j < listOfProperties.getLength(); j++) {
                for (int i = 0; i < listOfSubProperties.getLength() / 2; i++) {

                    String name = (((Element) doc.getDocumentElement().getElementsByTagName("properties").item(j)).getElementsByTagName("property").item(i).getAttributes().getNamedItem("name").getNodeValue());

                    switch (name) {
                        case "java.class.version":
                            testingEnvironment.setJavaClassVersion((((Element) doc.getDocumentElement().getElementsByTagName("properties").item(j)).getElementsByTagName("property").item(i).getAttributes().getNamedItem("value").getNodeValue()));
                            break;

                        case "java.runtime.name":
                            testingEnvironment.setJavaRuntimeName((((Element) doc.getDocumentElement().getElementsByTagName("properties").item(j)).getElementsByTagName("property").item(i).getAttributes().getNamedItem("value").getNodeValue()));
                            break;

                        case "java.runtime.version":
                            testingEnvironment.setJavaRuntimeVersion(((Element) doc.getDocumentElement().getElementsByTagName("properties").item(j)).getElementsByTagName("property").item(i).getAttributes().getNamedItem("value").getNodeValue());
                            break;

                        case "java.specification.name":
                            testingEnvironment.setJavaSpecificationName(((Element) doc.getDocumentElement().getElementsByTagName("properties").item(j)).getElementsByTagName("property").item(i).getAttributes().getNamedItem("value").getNodeValue());
                            break;

                        case "java.specification.version":
                            testingEnvironment.setJavaVmSpecificationVersion(((Element) doc.getDocumentElement().getElementsByTagName("properties").item(j)).getElementsByTagName("property").item(i).getAttributes().getNamedItem("value").getNodeValue());
                            break;

                        case "java.vm.specification.version":
                            testingEnvironment.setJavaVmSpecificationVersion(((Element) doc.getDocumentElement().getElementsByTagName("properties").item(j)).getElementsByTagName("property").item(i).getAttributes().getNamedItem("value").getNodeValue());
                            break;

                        case "java.vm.version":
                            testingEnvironment.setJavaVmVersion(((Element) doc.getDocumentElement().getElementsByTagName("properties").item(j)).getElementsByTagName("property").item(i).getAttributes().getNamedItem("value").getNodeValue());
                            break;

                        case "os.name":
                            testingEnvironment.setOsName(((Element) doc.getDocumentElement().getElementsByTagName("properties").item(j)).getElementsByTagName("property").item(i).getAttributes().getNamedItem("value").getNodeValue());
                            break;

                        case "os.version":
                            testingEnvironment.setOsVersion(((Element) doc.getDocumentElement().getElementsByTagName("properties").item(j)).getElementsByTagName("property").item(i).getAttributes().getNamedItem("value").getNodeValue());
                            break;

                        default:

                    }

                }
            }

            System.out.println("----Testing Environment-----");
            System.out.println(testingEnvironment.getJavaClassVersion());
            System.out.println(testingEnvironment.getJavaRuntimeName());
            System.out.println(testingEnvironment.getJavaRuntimeVersion());
            System.out.println(testingEnvironment.getJavaSpecificationName());
            System.out.println(testingEnvironment.getJavaVmSpecificationVersion());
            System.out.println(testingEnvironment.getJavaVmVersion());
            System.out.println(testingEnvironment.getOsName());
            System.out.println(testingEnvironment.getOsVersion());

        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
    
    
    
    
    
    
}
