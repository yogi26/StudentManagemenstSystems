package com.TaskScheduler;

import java.util.ArrayList;

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

public class TaskManager {
	ArrayList<Task> tasks;
	
	public TaskManager() {
		tasks=new ArrayList<Task>();
	}
	public void addTask(Task t) {
		if(t!=null) {
			tasks.add(t);
		}else {
			System.err.println("Please initialize task first");
		}
	}
	public void removeTask(int taskId) {
		tasks.remove(taskId);
	}
	public Task getTasksByPriority(Priority p) {
		for(Task task:tasks) {
			if(task.getPriority().equals(p)) {
				return task;
			}
		}
		return null;
	}
	public Task getOverdueTasks(String currentDate) {
		for(Task task:tasks) {
			
		}
		return null;
	}
	public void displayTasks() {
		for(Task task:tasks) {
			System.out.println(task);
		}
	}
}
