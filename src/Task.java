public class Task {
    private String description;
    private boolean isCompleted;
    private Task next; // Pointer for the linked list

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
        this.next = null;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        isCompleted = true;
    }

    public Task getNext() {
        return next;
    }

    public void setNext(Task next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "[ " + (isCompleted ? "✔" : "✘") + " ] " + description; // Unicode Characters  Checkmark: \u2714, Cross: \u2718
    }
}
