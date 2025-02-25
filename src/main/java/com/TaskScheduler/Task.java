package com.TaskScheduler;

/* Create a task scheduler application that:
 * a) Create a Task class with: taskId, description, dueDate, priority(HIGH/MEDIUM/LOW)
 * b) Create a TaskManager class using ArrayList<Task>
 * c) Implement the following methods:
 *    - addTask(Task t)
 *    - removeTask(int taskId)
 *    - getTasksByPriority(Priority p)
 *    - getOverdueTasks(Date currentDate)
 *    - displayTasks()
 * d) Sort tasks by due date and priority
 * e) Include proper exception handling
 */


public class Task {
	private int taskID;
	private String description;
	private String dueDate;
	private Priority priority;
	public Task(int taskID, String description, String dueDate, Priority priority) {
		super();
		this.taskID = taskID;
		this.description = description;
		this.dueDate = dueDate;
		this.priority = priority;
	}
	public int getTaskID() {
		return taskID;
	}
	public String getDescription() {
		return description;
	}
	public String getDueDate() {
		return dueDate;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Task [taskID=" + taskID + ", description=" + description + ", dueDate=" + dueDate + ", priority="
				+ priority + "]";
	}
	
	
}
