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
public class TestingLog {
    
    private float duration;
    private boolean keepLogStudio;

    public TestingLog(float duration, boolean keepLogStudio) {
        this.duration = duration;
        this.keepLogStudio = keepLogStudio;
    }
    
    public TestingLog(){
        
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public boolean isKeepLogStudio() {
        return keepLogStudio;
    }

    public void setKeepLogStudio(boolean keepLogStudio) {
        this.keepLogStudio = keepLogStudio;
    }
    
    
    
}
