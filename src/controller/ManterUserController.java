/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import model.Agent;
import model.Person;
import classes.LerIdBuild;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Camila
 */
public class ManterUserController {

    public ManterUserController() {

    }

    public Person ReadUsuario() {

        LerIdBuild build = new LerIdBuild(); // lê o número do build
        int id = build.ReadIdBuild(); // insere o numero do buil como chave primária
        Agent agent = new Agent(id); // cria um agente
        Person person = new Person(); // cria uma pessoa
        person.setId_person(id); // set id person
        person.setId_agent(agent); // set agent
        
        try {
            File fXmlFile = new File("C:\\Program Files (x86)\\Jenkins\\jobs\\game-of-life\\builds\\172\\build.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

            NodeList listOfSuite = doc.getElementsByTagName("build"); // cria uma lista de builds
            NodeList listOfNames = doc.getElementsByTagName("userId"); // cria uma lista de usuários

            if (listOfNames.getLength() == 1) { // testa o tamanho da lista de usuarios
                for (int temp = 0; temp < listOfSuite.getLength(); temp++) {
                    Node nNode = listOfSuite.item(temp);

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        person.setName(eElement.getElementsByTagName("userId").item(0).getTextContent()); // caso tenha no xml
                    }

                }
            } else {
                String name = "Gerado Automatimente"; // caaso não tenha no xml
                person.setName(name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return person;
    }
    
    
    
    
    
    
    
    
}
