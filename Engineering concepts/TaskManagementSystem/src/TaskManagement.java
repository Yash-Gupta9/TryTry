public class TaskManagement {

    private Task head;

    // Add Task
    public void addTask(Task newTask) {

        if (head == null) {
            head = newTask;
        } else {

            Task temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newTask;
        }

        System.out.println("Task added successfully.");
    }

    // Search Task
    public void searchTask(int taskId) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == taskId) {
                System.out.println("Task Found:");
                temp.displayTask();
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task not found.");
    }

    // Traverse Tasks
    public void traverseTasks() {

        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Task temp = head;

        while (temp != null) {
            temp.displayTask();
            temp = temp.next;
        }
    }

    // Delete Task
    public void deleteTask(int taskId) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.taskId == taskId) {
            head = head.next;
            System.out.println("Task deleted successfully.");
            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != taskId) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Task not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Task deleted successfully.");
        }
    }
}