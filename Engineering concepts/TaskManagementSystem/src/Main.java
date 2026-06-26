public class Main {

    public static void main(String[] args) {

        TaskManagement management = new TaskManagement();

        management.addTask(new Task(1, "Complete Assignment", "Pending"));
        management.addTask(new Task(2, "Study DSA", "In Progress"));
        management.addTask(new Task(3, "Prepare Presentation", "Pending"));
        management.addTask(new Task(4, "Submit Project", "Completed"));

        System.out.println("\nAll Tasks:");
        management.traverseTasks();

        System.out.println("\nSearching Task 3:");
        management.searchTask(3);

        System.out.println("\nDeleting Task 2:");
        management.deleteTask(2);

        System.out.println("\nTasks After Deletion:");
        management.traverseTasks();
    }
}