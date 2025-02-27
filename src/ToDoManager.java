public class ToDoManager {
    private User[] users;
    private int userCount;
    private final int MAX_USERS = 10; // Max limit for simplicity

    public ToDoManager() {
        users = new User[MAX_USERS];
        userCount = 0;
    }

    public boolean addUser(String name) {
        if (userCount >= MAX_USERS) {
            System.out.println("User limit reached!");
            return false;
        }
        if (getUser(name) != null) {
            System.out.println("User already exists!");
            return false;
        }
        users[userCount++] = new User(name);
        return true;
    }

    private User getUser(String name) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getName().equalsIgnoreCase(name)) {
                return users[i];
            }
        }
        return null;
    }

    public boolean addTaskToUser(String userName, String taskDescription) {
        User user = getUser(userName);
        if (user != null) {
            user.addTask(taskDescription);
            return true;
        }
        return false;
    }

    public boolean markTaskAsCompleted(String userName, String taskDescription) {
        User user = getUser(userName);
        return user != null && user.markTaskAsCompleted(taskDescription);
    }

    public void showUserTasks(String userName) {
        User user = getUser(userName);
        if (user != null) {
            user.showTasks();
        } else {
            System.out.println("User not found!");
        }
    }
}
