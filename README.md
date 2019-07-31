# AntExample
Dieses GitHub-Repo ist eine Kopie des im Skript "Build-Verfahren" beschriebenen einfachen Java-Projekts, das eine Anwendungsklasse und zwei Klassen enthält. Dieses Beispiel verwenden wir als Demonstrationsobjekt für die Einführung in Ant und als Beispiel eines Jenkins-Projekts, das mit GitHub als SCM verbunden ist. 

Das GitHub-Repo enthält vier branches:
- master
- javadoc
- doxygen
- externals

Die beiden Branches javadoc und doxygen enthalten die gleichen Klassen,
jeweils mit JavaDoc- und mit Doxygen-Kommentaren (im Qt-Style) versehen. 
Damit kann demonstriert werden, wie man in Jenkins verschiedene Branches eines 
GitHub-Projekts auswählt, und darüber hinaus, wie man ein Target für die Dokumentation anlegt.

Im branch externals wird gezeigt, wie wir externe jar-Dateien in das Projekt integrieren. 
Dazu verwenden wir log4j2 zum Logging. Die jar-Dateien für log4j2 liegen im Verzeichnis
lib.

Die Anwendung wird im Verzeichnis bin ausgeführt. Dort wird nach compile auch die Konfigurationsdatei 
kopiert und run erhält den korrekten classpath für die Ausführung.
