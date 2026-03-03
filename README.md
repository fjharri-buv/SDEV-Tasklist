# SQLite CRUD in Java (No Maven/Gradle)

This is a starter skeleton for the classroom practical. Students only need to open the project in IntelliJ and complete the TODO methods.

## Project layout

- `src/Main.java` - starter flow and console output checks.
- `src/TaskRepository.java` - all CRUD TODOs for Parts B-E plus optional extension.
- `lib/` - place `sqlite-jdbc` jar here.
- `run.sh` - compile and run from terminal without Maven/Gradle.

## One-time driver file

Place the SQLite JDBC jar in `lib/` with this filename:

`lib/sqlite-jdbc-3.46.0.0.jar`

> If your environment blocks downloads, copy this jar from your teaching machine into the `lib` folder before distributing the starter.

## Run in IntelliJ

1. Open this folder as a project.
2. Add `lib/sqlite-jdbc-3.46.0.0.jar` as a module dependency if IntelliJ doesn't auto-detect it.
3. Run `Main`.

Expected output at start:

- `Connected to database`
- `Table ready`

## Run from terminal

```bash
./run.sh
```

The database file (`app.db`) is created automatically in the project root.
