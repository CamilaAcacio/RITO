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
public class TestingSuite {
    
    private String file;
    private String name;
    private float duration;
    private float time;

    public TestingSuite(String file, String name, float duration, float time) {
        this.file = file;
        this.name = name;
        this.duration = duration;
        this.time = time;
    }

    public TestingSuite() {
        
    }    
    
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }
    
}
