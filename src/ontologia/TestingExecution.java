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
public class TestingExecution {

    private int failCount;
    private int skipCount;
    private int totalCount;
    private float healthScale;

    public TestingExecution(int failCount, int skipCount, int totalCount, float healthScale, String commit, String tree, String parent, String author, String commiter, String date, String hour) {

        this.failCount = failCount;
        this.skipCount = skipCount;
        this.totalCount = totalCount;
        this.healthScale = healthScale;
    }

    public TestingExecution() {

    }

    public int getFailCount() {
        return failCount;
    }

    public void setFailCount(int failCount) {
        this.failCount = failCount;
    }

    public int getSkipCount() {
        return skipCount;
    }

    public void setSkipCount(int skipCount) {
        this.skipCount = skipCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public float getHealthScale() {
        return healthScale;
    }

    public void setHealthScale(float healthScale) {
        this.healthScale = healthScale;
    }

}
