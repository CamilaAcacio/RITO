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
public class CommitingActivity {
    
    protected String commit;
    protected String tree;
    protected String parent;
    protected String author;
    protected String commiter;
    protected String date;
    protected String hour;

    public CommitingActivity(String commit, String tree, String parent, String author, String commiter, String date, String hour) {
        this.commit = commit;
        this.tree = tree;
        this.parent = parent;
        this.author = author;
        this.commiter = commiter;
        this.date = date;
        this.hour = hour;
    }
    
    public CommitingActivity(){
        
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCommiter() {
        return commiter;
    }

    public void setCommiter(String commiter) {
        this.commiter = commiter;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
    
    
    
}
