/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontologia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Camila
 */
public class LerCommit {

    public LerCommit() {
    }

    public void ReadCommit() {

        String FILENAME = "C:\\Program Files (x86)\\Jenkins\\jobs\\game-of-life\\builds\\5\\changelog.xml";

        CommitingActivity commitingActivity = new CommitingActivity();
        int i = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                if (sCurrentLine.contains("commit") && i==0) {
                    String commit = sCurrentLine;
                    String splited[] = commit.split("\\s+");
                    commitingActivity.setCommit(splited[1]);
                    i = 1;
                } else {
                    if (sCurrentLine.contains("tree")) {
                        String tree = sCurrentLine;
                        String splited[] = tree.split("\\s+");
                        commitingActivity.setTree(splited[1]);
                    } else {
                        if (sCurrentLine.contains("parent")) {
                            String parent = sCurrentLine;
                            String splited[] = parent.split("\\s+");
                            commitingActivity.setParent(splited[1]);
                        } else {
                            if (sCurrentLine.contains("author")) {
                                String author = sCurrentLine;
                                String splited[] = author.split("\\s+");
                                commitingActivity.setAuthor(splited[1]);
                                commitingActivity.setDate(splited[3]);
                                commitingActivity.setHour(splited[4]);
                            } else {
                                if (sCurrentLine.contains("committer") && i==1) {
                                    String commiter = sCurrentLine;
                                    String splited[] = commiter.split("\\s+");
                                    commitingActivity.setCommiter(splited[1]);
                                } else {

                                }

                            }
                        }
                    }

                }

            }

            System.out.println(commitingActivity.getAuthor());
            System.out.println(commitingActivity.getCommit());
            System.out.println(commitingActivity.getCommiter());
            System.out.println(commitingActivity.getDate());
            System.out.println(commitingActivity.getHour());
            System.out.println(commitingActivity.getParent());
            System.out.println(commitingActivity.getTree());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
