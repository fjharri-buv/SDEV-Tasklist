import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TaskRepository implements AutoCloseable {
    private static final String DB_URL = "jdbc:sqlite:app.db";

    private final Connection connection;

    public TaskRepository() throws SQLException {
        this.connection = DriverManager.getConnection(DB_URL);
    }

    public void createTable() {
        // TODO Part B:
        // Create table "tasks" with:
        // id INTEGER PRIMARY KEY AUTOINCREMENT
        // title TEXT NOT NULL
        // is_done INTEGER NOT NULL DEFAULT 0
        // created_at TEXT NOT NULL
    }

    public int insertTask(String title) {
        // TODO Part C:
        // Insert a new task and return the generated id.
        // SQL: INSERT INTO tasks(title, is_done, created_at) VALUES (?, ?, ?);
        return -1;
    }

    public void listTasks() {
        // TODO Part D:
        // Query and print all tasks sorted newest first.
        // SQL: SELECT id, title, is_done, created_at FROM tasks ORDER BY id DESC;
    }

    public void markDone(int id, boolean done) {
        // TODO Part E:
        // Update is_done using done ? 1 : 0 for the provided id.
        // SQL: UPDATE tasks SET is_done = ? WHERE id = ?;
    }

    // Optional extension methods
    public void printTaskById(int id) {
        // TODO Extension Option 1:
        // SQL: SELECT id, title, is_done, created_at FROM tasks WHERE id = ?;
    }

    public void renameTask(int id, String newTitle) {
        // TODO Extension Option 2:
        // SQL: UPDATE tasks SET title = ? WHERE id = ?;
    }

    @Override
    public void close() throws SQLException {
        connection.close();
    }
}
