package c;

import java.util.Date;

public class Task {
 private String title;
 private String description;
 private String assignee;
 private Date dueDate;
 private boolean isCompleted;

 public Task(String title, String description, String assignee, Date dueDate) {
     this.title = title;
     this.description = description;
     this.assignee = assignee;
     this.dueDate = dueDate;
     this.isCompleted = false;
 }

 public void markAsCompleted() {
     this.isCompleted = true;
 }
 public String getTitle() { return title; }
 public String getDescription() { return description; }
 public String getAssignee() { return assignee; }
 public Date getDueDate() { return dueDate; }
 public boolean isCompleted() { return isCompleted; }
 public void setTitle(String title) { this.title = title; }
 public void setDescription(String description) { this.description = description; }
 public void setAssignee(String assignee) { this.assignee = assignee; }
 public void setDueDate(Date dueDate) { this.dueDate = dueDate; }
}
