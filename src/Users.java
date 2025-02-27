public class Users {
    private String name;
    private TaskList taskList;

    public Users(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    public String getName() {
        return name;
    }

    public void addTask(String description) {
        taskList.addTask(description);
    }

    public boolean markTaskAsCompleted(String description) {
        return taskList.markTaskAsCompleted(description);
    }

    public void showTasks() {
        System.out.println("Tasks for " + name + ":");
        taskList.printTasks();
    }
}
