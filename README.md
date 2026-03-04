# SQLite Task List (Maven)

This project has been rebuilt as a Maven application so students can simply open it and click **Run** on `Main`.

## What this setup gives you

- No manual jar downloads.
- SQLite JDBC is pulled automatically from Maven Central.
- The database file (`app.db`) is created automatically in the project root when the app starts.
- The `tasks` table is created automatically if it does not already exist.

## Project layout

- `pom.xml` - Maven project config and dependencies.
- `src/main/java/Main.java` - demo app flow.
- `src/main/java/TaskRepository.java` - SQLite CRUD operations.

## Run in IntelliJ (recommended for students)

1. Open this folder as a project in IntelliJ.
2. Wait for Maven import to finish.
3. Open `src/main/java/Main.java`.
4. Click the green **Run** button next to `main`.

That's it. The database and table are created automatically.

## Run from terminal

```bash
mvn -q compile exec:java
```

## Expected startup output

- `Connected to database`
- `Table ready`
