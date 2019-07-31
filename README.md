# AntExample
Dieses GitHub-Repo ist eine Kopie des im Skript "Build-Verfahren" beschriebenen einfachen Java-Projekts, das eine Anwendungsklasse und zwei Klassen enthält. Dieses Beispiel verwenden wir als Demonstrationsobjekt für die Einführung in Ant und als Beispiel eines Jenkins-Projekts, das mit GitHub als SCM verbunden ist. 

Das GitHub-Repo enthält drei Branches:
- master
- javadoc
- doxygen
- externals

Die beiden branches javadoc und doxygen enthalten die gleichen Klassen, jeweils mit JavaDoc- und mit Doxygen-Kommentaren (im Qt-Style) versehen. Damit kann demonstriert werden, wie man in Jenkins verschiedene Branches eines GitHub-Projekts auswählt, und darüber hinaus, wie man ein Target für die Dokumentation anlegt.

Im branch externals liegt ein Ant-Projekt, das externe jar-Bibliotheken verwendet. Als Beispiel verwenden Logging mit log4j2.
