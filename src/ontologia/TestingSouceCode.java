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
public class TestingSouceCode extends TestingSuite{
    
   private float durationClass;
   private String className;
   private String testName;
   private boolean skipped;
   private int failed;
   private String errorStrackTrace;
   private String errorDetails;

    public TestingSouceCode(float durationClass, String className, String testName, boolean skipped, int failed, String errorStrackTrace, String errorDetails, String file, String name, float duration, float time) {
        super(file, name, duration, time);
        this.durationClass = durationClass;
        this.className = className;
        this.testName = testName;
        this.skipped = skipped;
        this.failed = failed;
        this.errorStrackTrace = errorStrackTrace;
        this.errorDetails = errorDetails;
    }

    
    public TestingSouceCode(){
        
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    
    public float getDurationClass() {
        return durationClass;
    }

    public void setDurationClass(float durationClass) {
        this.durationClass = durationClass;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public boolean isSkipped() {
        return skipped;
    }

    public void setSkipped(boolean skipped) {
        this.skipped = skipped;
    }

    public int getFailed() {
        return failed;
    }

    public void setFailed(int failed) {
        this.failed = failed;
    }

    public String getErrorStrackTrace() {
        return errorStrackTrace;
    }

    public void setErrorStrackTrace(String errorStrackTrace) {
        this.errorStrackTrace = errorStrackTrace;
    }

    public String getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }
    
    
    
}
