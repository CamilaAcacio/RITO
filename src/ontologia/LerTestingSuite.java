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
public class LerTestingSuite {

    public LerTestingSuite() {

    }

    public void ReadLerTestingSuite() {
        try {
            File fXmlFile = new File("C:\\Program Files (x86)\\Jenkins\\jobs\\game-of-life\\builds\\172\\junitResult.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

            List<TestingSuite> ListTestSuite = new ArrayList<TestingSuite>();

            List<TestingSouceCode> ListTestingClass = new ArrayList<TestingSouceCode>();

            
            NodeList listOfSuite = doc.getElementsByTagName("suite");

            for (int temp = 0; temp < listOfSuite.getLength(); temp++) {
                Node nNode = listOfSuite.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    TestingSuite testSuite = new TestingSuite();
                    //Elementos Testsuite
                    testSuite.setFile(eElement.getElementsByTagName("file").item(0).getTextContent());
                    testSuite.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
                    testSuite.setDuration(Float.parseFloat(eElement.getElementsByTagName("duration").item(0).getTextContent()));
                    testSuite.setTime(Float.parseFloat(eElement.getElementsByTagName("time").item(0).getTextContent()));

                    ListTestSuite.add(testSuite);

                    NodeList listOfSubCases = eElement.getElementsByTagName("case");

                    for (int i = 0; i < listOfSubCases.getLength(); i++) {
                        Node caseNode = listOfSubCases.item(i);

                        if (caseNode.getNodeType() == Node.ELEMENT_NODE) {
                            Element caseElement = (Element) caseNode;

                            TestingSouceCode testClass = new TestingSouceCode();
                            //Elementos TestingSouceCode
                            testClass.setDurationClass(Float.parseFloat(caseElement.getElementsByTagName("duration").item(0).getTextContent()));
                            testClass.setClassName(caseElement.getElementsByTagName("className").item(0).getTextContent());
                            testClass.setTestName(caseElement.getElementsByTagName("testName").item(0).getTextContent());
                            testClass.setSkipped(Boolean.getBoolean(caseElement.getElementsByTagName("skipped").item(0).getTextContent()));
                            testClass.setFailed(Integer.valueOf(caseElement.getElementsByTagName("failedSince").item(0).getTextContent()));
                            //caso de falha em algum caso de teste
                            if(testClass.getFailed() !=0){
                                testClass.setErrorStrackTrace(caseElement.getElementsByTagName("errorStackTrace").item(0).getTextContent());
                                testClass.setErrorDetails(caseElement.getElementsByTagName("errorDetails").item(0).getTextContent());
                            }

                            ListTestingClass.add(testClass);
                        }

                    }
                }
            }

            for (int i = 0; i < ListTestSuite.size(); i++) {
                TestingSuite cc = ListTestSuite.get(i);
                System.out.println(cc.getFile());
                System.out.println(cc.getName());
                System.out.println(cc.getDuration());
                System.out.println(cc.getTime());
            }
            System.out.println("-------CLASSE--------");
            for (int i = 0; i < ListTestingClass.size(); i++) {
                TestingSouceCode cc = ListTestingClass.get(i);
                System.out.println("---------");
                System.out.println(cc.getDurationClass());
                System.out.println(cc.getClassName());
                System.out.println(cc.getTestName());
                System.out.println(cc.isSkipped());
                System.out.println(cc.getFailed());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
