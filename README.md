# AntExample
Dieses GitHub-Repo ist eine Kopie des im Skript "Build-Verfahren" beschriebenen einfachen Java-Projekts, das eine Anwendungsklasse und zwei Klassen enthält. Dieses Beispiel verwenden wir als Demonstrationsobjekt für die Einführung in Ant und als Beispiel eines Jenkins-Projekts, das mit GitHub als SCM verbunden ist. 

Dieser branch zeigt ein Ant-Projekt mit externen jar-Dateien.
Dazu verwenden wir log4j2 zum Logging. Die jar-Dateien für log4j2 liegen im Verzeichnis
lib.

Die Anwendung wird im Verzeichnis bin ausgeführt. Dort wird nach compile auch die Konfigurationsdatei 
kopiert und run erhält den korrekten classpath für die Ausführung.
