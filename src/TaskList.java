public class TaskList {
    private Task head; // Head of the linked list

    public void addTask(String description) {
        Task newTask = new Task(description);
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newTask);
        }
    }

    public boolean markTaskAsCompleted(String description) {
        Task temp = head;
        while (temp != null) {
            if (temp.getDescription().equalsIgnoreCase(description)) {
                temp.markAsCompleted();
                return true;
            }
            temp = temp.getNext();
        }
        return false; // Task not found
    }

    public void printTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Task temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }
}
