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
public class LerSoftwareBuild {

    public LerSoftwareBuild() {

    }

    public void ReadSoftwareBuild() {

        try {
            File fXmlFile = new File("C:\\Program Files (x86)\\Jenkins\\jobs\\game-of-life\\builds\\172\\build.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

            SoftwareBuild softwareBuild = new SoftwareBuild();
            SoftwareExecution softwareExecution = new SoftwareExecution();
            TestingExecution testingExecution = new TestingExecution();

            NodeList listOfSuite = doc.getElementsByTagName("build");

            for (int temp = 0; temp < listOfSuite.getLength(); temp++) {
                Node nNode = listOfSuite.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    //buil
                    softwareBuild.setNumberBuild(Integer.valueOf(eElement.getElementsByTagName("hudsonBuildNumber").item(0).getTextContent()));
                   
                    //teting execution
                    testingExecution.setFailCount(Integer.valueOf(eElement.getElementsByTagName("failCount").item(0).getTextContent()));
                    testingExecution.setSkipCount(Integer.valueOf(eElement.getElementsByTagName("skipCount").item(0).getTextContent()));
                    testingExecution.setTotalCount(Integer.valueOf(eElement.getElementsByTagName("totalCount").item(0).getTextContent()));
                    testingExecution.setHealthScale(Float.valueOf(eElement.getElementsByTagName("healthScaleFactor").item(0).getTextContent()));
                    
                    //software execution
                    softwareExecution.setHudsonBuildNumber(Integer.valueOf(eElement.getElementsByTagName("hudsonBuildNumber").item(0).getTextContent()));
                    softwareExecution.setTimeStamp(String.valueOf(eElement.getElementsByTagName("timestamp").item(0).getTextContent()));
                    softwareExecution.setStarTime(String.valueOf(eElement.getElementsByTagName("startTime").item(0).getTextContent()));
                    softwareExecution.setResult(String.valueOf(eElement.getElementsByTagName("result").item(0).getTextContent()));
                    softwareExecution.setDuration(Integer.valueOf(eElement.getElementsByTagName("duration").item(0).getTextContent()));
                    softwareExecution.setCharSet(String.valueOf(eElement.getElementsByTagName("charset").item(0).getTextContent()));
                    softwareExecution.setKeepLog(String.valueOf(eElement.getElementsByTagName("keepLog").item(0).getTextContent()));
                    softwareExecution.setWorkSpace(String.valueOf(eElement.getElementsByTagName("workspace").item(0).getTextContent()));
                    softwareExecution.setHudsonVersion(String.valueOf(eElement.getElementsByTagName("hudsonVersion").item(0).getTextContent()));
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
