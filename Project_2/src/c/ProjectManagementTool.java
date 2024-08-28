package c;

import java.util.ArrayList;
import java.util.List;

public class ProjectManagementTool {
 private List<Project> projects;
 private List<TeamMember> teamMembers;

 public ProjectManagementTool() {
     this.projects = new ArrayList<>();
     this.teamMembers = new ArrayList<>();
 }

 public void createProject(String name, String description) {
     projects.add(new Project(name, description));
 }

 public void addTeamMember(String name, String role) {
     teamMembers.add(new TeamMember(name, role));
 }

 public void assignTask(Project project, Task task, TeamMember member) {
     task.setAssignee(member.getName());
     project.addTask(task);
 }

 public void markTaskAsCompleted(Task task) {
     task.markAsCompleted();
 }

 public List<Project> getProjects() {
     return projects;
 }

 public List<TeamMember> getTeamMembers() {
     return teamMembers;
 }
}
