/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontologia;

/**
 *
 * @author Camila
 */
public class Environment {
    private String javaClassVersion;
    private String javaRuntimeName;
    private String javaRuntimeVersion;
    private String javaSpecificationName;
    private String javaVmSpecificationVersion;
    private String javaVmVersion;
    private String osName;
    private String osVersion;

    public Environment(String javaClassVersion, String javaRuntimeName, String javaRuntimeVersion, String javaSpecificationName, String javaVmSpecificationVersion, String javaVmVersion, String osName, String osVersion) {
        this.javaClassVersion = javaClassVersion;
        this.javaRuntimeName = javaRuntimeName;
        this.javaRuntimeVersion = javaRuntimeVersion;
        this.javaSpecificationName = javaSpecificationName;
        this.javaVmSpecificationVersion = javaVmSpecificationVersion;
        this.javaVmVersion = javaVmVersion;
        this.osName = osName;
        this.osVersion = osVersion;
    }
    
    public Environment (){
        
    }

    public String getJavaClassVersion() {
        return javaClassVersion;
    }

    public void setJavaClassVersion(String javaClassVersion) {
        this.javaClassVersion = javaClassVersion;
    }

    public String getJavaRuntimeName() {
        return javaRuntimeName;
    }

    public void setJavaRuntimeName(String javaRuntimeName) {
        this.javaRuntimeName = javaRuntimeName;
    }

    public String getJavaRuntimeVersion() {
        return javaRuntimeVersion;
    }

    public void setJavaRuntimeVersion(String javaRuntimeVersion) {
        this.javaRuntimeVersion = javaRuntimeVersion;
    }

    public String getJavaSpecificationName() {
        return javaSpecificationName;
    }

    public void setJavaSpecificationName(String javaSpecificationName) {
        this.javaSpecificationName = javaSpecificationName;
    }

    public String getJavaVmSpecificationVersion() {
        return javaVmSpecificationVersion;
    }

    public void setJavaVmSpecificationVersion(String javaVmSpecificationVersion) {
        this.javaVmSpecificationVersion = javaVmSpecificationVersion;
    }

    public String getJavaVmVersion() {
        return javaVmVersion;
    }

    public void setJavaVmVersion(String javaVmVersion) {
        this.javaVmVersion = javaVmVersion;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
    
    
    
    
}
