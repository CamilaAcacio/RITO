package ontologia;

import static com.oracle.jrockit.jfr.ContentType.Timestamp;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ontologia {

    public static void main(String[] args) {

        
       // LerUsuario lerUsuario = new LerUsuario();
       // lerUsuario.ReadLerUsuario();
        LerCommit commit = new LerCommit();
        commit.ReadCommit();
        
        LerProject project = new LerProject();
        project.ReadProject();
        //  LerSoftwareBuild lerSoftwareBuild = new LerSoftwareBuild();
        //   lerSoftwareBuild.ReadSoftwareBuild();
           LerTestingLog lerTestingLog = new LerTestingLog();
           lerTestingLog.ReadTestingLog();
        //   LerTestingEnvironment lerTestingEnvironment = new LerTestingEnvironment();
        //   lerTestingEnvironment.ReadTestingEnvironment();
    }

}
