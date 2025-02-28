import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoManager manager = new ToDoManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTo-Do List Manager");
            System.out.println("1. Add User");
            System.out.println("2. Add Task to User");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Show User Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    manager.addUser(userName);
                    break;

                case 2:
                    System.out.print("Enter user name: ");
                    String userForTask = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String taskDesc = scanner.nextLine();
                    manager.addTaskToUser(userForTask, taskDesc);
                    break;

                case 3:
                    System.out.print("Enter user name: ");
                    String userForCompletion = scanner.nextLine();
                    System.out.print("Enter task description to mark completed: ");
                    String completedTask = scanner.nextLine();
                    if (manager.markTaskAsCompleted(userForCompletion, completedTask)) {
                        System.out.println("Task marked as completed.");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter user name: ");
                    String userToShow = scanner.nextLine();
                    manager.showUserTasks(userToShow);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
