public class Main {
    public static void main(String[] args) {
        try (TaskRepository repository = new TaskRepository()) {
            System.out.println("Connected to database");

            repository.createTable();
            System.out.println("Table ready");

            int id1 = repository.insertTask("Finish Java practical");
            int id2 = repository.insertTask("Write reflection answers");
            System.out.println("Inserted task IDs: " + id1 + ", " + id2);

            System.out.println("\nAll tasks:");
            repository.listTasks();

            repository.markDone(id1, true);
            System.out.println("\nAfter update:");
            repository.listTasks();
        } catch (Exception e) {
            System.err.println("Application error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
