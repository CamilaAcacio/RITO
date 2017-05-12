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
public class SoftwareExecution{
    
    private int hudsonBuildNumber;
    private String timeStamp;
    private String starTime;
    private String result;
    private int duration;
    private String charSet;
    private String keepLog;
    private String workSpace;
    private String hudsonVersion;

    public SoftwareExecution(int hudsonBuildNumber, String timeStamp, String starTime, String result, int duration, String charSet, String keepLog, String workSpace, String hudsonVersion, String commit, String tree, String parent, String author, String commiter, String date, String hour) {
        this.hudsonBuildNumber = hudsonBuildNumber;
        this.timeStamp = timeStamp;
        this.starTime = starTime;
        this.result = result;
        this.duration = duration;
        this.charSet = charSet;
        this.keepLog = keepLog;
        this.workSpace = workSpace;
        this.hudsonVersion = hudsonVersion;
    }
    
    public SoftwareExecution(){
        
    }

    public int getHudsonBuildNumber() {
        return hudsonBuildNumber;
    }

    public void setHudsonBuildNumber(int hudsonBuildNumber) {
        this.hudsonBuildNumber = hudsonBuildNumber;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getStarTime() {
        return starTime;
    }

    public void setStarTime(String starTime) {
        this.starTime = starTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCharSet() {
        return charSet;
    }

    public void setCharSet(String charSet) {
        this.charSet = charSet;
    }

    public String getKeepLog() {
        return keepLog;
    }

    public void setKeepLog(String keepLog) {
        this.keepLog = keepLog;
    }

    public String getWorkSpace() {
        return workSpace;
    }

    public void setWorkSpace(String workSpace) {
        this.workSpace = workSpace;
    }

    public String getHudsonVersion() {
        return hudsonVersion;
    }

    public void setHudsonVersion(String hudsonVersion) {
        this.hudsonVersion = hudsonVersion;
    }

   
    
    
    
}
