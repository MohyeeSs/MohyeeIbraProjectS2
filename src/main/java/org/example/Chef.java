package org.example;

import java.util.ArrayList;
import java.util.List;

public class Chef {
    int chefId;
    String chefName;
    String password;
    List<String> expertise;
    Integer assignedTasks;

    public Chef(int chefId, String chefName,String password) {
          this.chefId=chefId;
          this.chefName=chefName;
          this.password=password;
        expertise=new ArrayList<String>();
        assignedTasks=0;

    }
    public Chef() {
    }
    public int getChefId() {
    return chefId;
    }
    public String getChefName(){
        return chefName;
    }
    public void addTask() {
        assignedTasks++;
    }
    public int getTaskCount() {
        return assignedTasks;
    }
    public boolean hasExpertise(String taskType) {
        return expertise.contains(taskType);
    }
    public void addExpertise(String expertises){
        expertise.add(expertises);
    }

    public void setTaskCount(Integer taskCount) {
        this.assignedTasks=taskCount;
    }
}
