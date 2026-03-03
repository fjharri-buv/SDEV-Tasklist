#!/usr/bin/env bash
set -euo pipefail

JAR="lib/sqlite-jdbc-3.46.0.0.jar"

if [[ ! -f "$JAR" ]]; then
  echo "Missing SQLite JDBC driver: $JAR" >&2
  echo "Copy the driver jar into ./lib before running." >&2
  exit 1
fi

mkdir -p out
javac -cp "$JAR" -d out src/*.java
java -cp "out:$JAR" Main
