package c;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class ProjectManagementToolTest {

 private ProjectManagementTool tool;

 @Before
 public void setUp() {
     tool = new ProjectManagementTool();
 }

 @Test
 public void testCreateProject() {
     tool.createProject("Project Alpha", "This is a test project.");
     assertEquals(1, tool.getProjects().size());
     assertEquals("Project Alpha", tool.getProjects().get(0).getName());
 }

 @Test
 public void testAddTeamMember() {
     tool.addTeamMember("John Doe", "Developer");
     assertEquals(1, tool.getTeamMembers().size());
     assertEquals("John Doe", tool.getTeamMembers().get(0).getName());
 }

 @Test
 public void testAssignTaskToTeamMember() {
     tool.createProject("Project Beta", "Another test project.");
     tool.addTeamMember("Jane Doe", "Designer");

     Project project = tool.getProjects().get(0);
     TeamMember member = tool.getTeamMembers().get(0);

     Task task = new Task("Design Logo", "Design the project logo", "", new Date());
     tool.assignTask(project, task, member);

     assertEquals(1, project.getTasks().size());
     assertEquals("Design Logo", project.getTasks().get(0).getTitle());
     assertEquals("Jane Doe", project.getTasks().get(0).getAssignee());
 }

 @Test
 public void testMarkTaskAsCompleted() {
     tool.createProject("Project Gamma", "Test project for completion.");
     tool.addTeamMember("Alice Smith", "Manager");

     Project project = tool.getProjects().get(0);
     TeamMember member = tool.getTeamMembers().get(0);

     Task task = new Task("Prepare Report", "Prepare the final report", "", new Date());
     tool.assignTask(project, task, member);
     tool.markTaskAsCompleted(task);

     assertTrue(project.getTasks().get(0).isCompleted());
 }
}
