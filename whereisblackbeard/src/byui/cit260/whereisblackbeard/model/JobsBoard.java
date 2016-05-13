/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.model;

import java.util.Objects;

/**
 *
 * @author josephclark
 */
public class JobsBoard {
    
    private int randJobs;
    private int goToJobScene;

    public JobsBoard() {
    }

    public int getRandJobs() {
        return randJobs;
    }

    public void setRandJobs(int randJobs) {
        this.randJobs = randJobs;
    }

    public int getGoToJobScene() {
        return goToJobScene;
    }

    public void setGoToJobScene(int goToJobScene) {
        this.goToJobScene = goToJobScene;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.randJobs;
        hash = 13 * hash + this.goToJobScene;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JobsBoard other = (JobsBoard) obj;
        if (this.randJobs != other.randJobs) {
            return false;
        }
        if (this.goToJobScene != other.goToJobScene) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString() {
        return "JobsBoard{" + "randJobs=" + randJobs + ", goToJobScene=" + goToJobScene + '}';
    }
      
}