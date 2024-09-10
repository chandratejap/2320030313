package c;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     ProjectManagementTool tool = new ProjectManagementTool();
     Scanner scanner = new Scanner(System.in);
     SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

     while (true) {
         System.out.println("\n--- Project Management Tool ---");
         System.out.println("1. Create Project");
         System.out.println("2. Add Team Member");
         System.out.println("3. Create Task and Assign to Team Member");
         System.out.println("4. Mark Task as Completed");
         System.out.println("5. View Projects and Tasks");
         System.out.println("6. Exit");
         System.out.print("Choose an option: ");
         int choice = scanner.nextInt();
         scanner.nextLine(); // Consume newline

         switch (choice) {
             case 1:
                 System.out.print("Enter project name: ");
                 String projectName = scanner.nextLine();
                 System.out.print("Enter project description: ");
                 String projectDescription = scanner.nextLine();
                 tool.createProject(projectName, projectDescription);
                 System.out.println("Project created successfully.");
                 break;

             case 2:
                 System.out.print("Enter team member name: ");
                 String memberName = scanner.nextLine();
                 System.out.print("Enter team member role: ");
                 String memberRole = scanner.nextLine();
                 tool.addTeamMember(memberName, memberRole);
                 System.out.println("Team member added successfully.");
                 break;

             case 3:
                 System.out.print("Enter project name to assign task to: ");
                 projectName = scanner.nextLine();
                 Project project = findProjectByName(tool.getProjects(), projectName);
                 if (project == null) {
                     System.out.println("Project not found.");
                     break;
                 }

                 System.out.print("Enter task title: ");
                 String taskTitle = scanner.nextLine();
                 System.out.print("Enter task description: ");
                 String taskDescription = scanner.nextLine();
                 System.out.print("Enter assignee name: ");
                 String assignee = scanner.nextLine();
                 System.out.print("Enter due date (dd-MM-yyyy): ");
                 String dueDateStr = scanner.nextLine();

                 try {
                     Date dueDate = dateFormat.parse(dueDateStr);
                     Task task = new Task(taskTitle, taskDescription, "", dueDate);
                     TeamMember member = findTeamMemberByName(tool.getTeamMembers(), assignee);
                     if (member == null) {
                         System.out.println("Team member not found.");
                         break;
                     }
                     tool.assignTask(project, task, member);
                     System.out.println("Task assigned successfully.");
                 } catch (Exception e) {
                     System.out.println("Invalid date format.");
                 }
                 break;

             case 4:
                 System.out.print("Enter project name: ");
                 projectName = scanner.nextLine();
                 project = findProjectByName(tool.getProjects(), projectName);
                 if (project == null) {
                     System.out.println("Project not found.");
                     break;
                 }

                 System.out.print("Enter task title to mark as completed: ");
                 taskTitle = scanner.nextLine();
                 Task task = findTaskByTitle(project.getTasks(), taskTitle);
                 if (task == null) {
                     System.out.println("Task not found.");
                 } else {
                     tool.markTaskAsCompleted(task);
                     System.out.println("Task marked as completed.");
                 }
                 break;

             case 5:
                 for (Project proj : tool.getProjects()) {
                     System.out.println("\nProject: " + proj.getName());
                     System.out.println("Description: " + proj.getDescription());
                     for (Task t : proj.getTasks()) {
                         System.out.println("  Task: " + t.getTitle() + ", Assigned to: " + t.getAssignee() + ", Due Date: " + dateFormat.format(t.getDueDate()) + ", Completed: " + t.isCompleted());
                     }
                 }
                 break;

             case 6:
                 System.out.println("Exiting...");
                 scanner.close();
                 return;

             default:
                 System.out.println("Invalid choice. Please try again.");
                 break;
         }
     }
 }

 private static Project findProjectByName(List<Project> projects, String name) {
     for (Project project : projects) {
         if (project.getName().equalsIgnoreCase(name)) {
             return project;
         }
     }
     return null;
 }

 private static TeamMember findTeamMemberByName(List<TeamMember> members, String name) {
     for (TeamMember member : members) {
         if (member.getName().equalsIgnoreCase(name)) {
             return member;
         }
     }
     return null;
 }

 private static Task findTaskByTitle(List<Task> tasks, String title) {
     for (Task task : tasks) {
         if (task.getTitle().equalsIgnoreCase(title)) {
             return task;
         }
     }
     return null;
 }
}
