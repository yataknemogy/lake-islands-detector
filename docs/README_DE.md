# Bestimmung der Anzahl von Inseln auf einer Seenkarte

[RU](/README.md) | [EN](README_EN.md) | [FR](README_FR.md) |  [JP](README_JP.md) | [DE](README_DE.md) | [CH](README_CH.md) | [KR](README_KR.md)

## Beschreibung

Gegeben ist eine Seenkarte, die als zweidimensionales Array dargestellt ist, wobei jede Zelle entweder Wasser ('W') oder Land ('L') ist. Die Aufgabe besteht darin, die Anzahl einzelner Inseln auf dieser Karte zu bestimmen. Eine Insel wird definiert als eine Gruppe benachbarter (senkrecht oder waagerecht verbundener) Landzellen, die von Wasser umgeben sind.

## Beispiel

Beispiel Seenkarte:

[
['W', 'L', 'W', 'W'],
['W', 'L', 'L', 'W'],
['W', 'W', 'L', 'W'],
['L', 'W', 'W', 'L']
]

Erwartetes Ergebnis: Auf der Karte gibt es 3 separate Inseln. Eine Insel besteht aus zwei benachbarten 'L'-Zellen in der zweiten Spalte, die zweite besteht aus einer Zelle in der dritten Zeile, dritte Spalte, und die dritte besteht aus zwei nicht diagonal benachbarten Zellen in der letzten Zeile.

## Aufgaben

1. Entwickeln Sie einen Algorithmus mit Breitensuche (BFS), um die Anzahl der Inseln auf der Karte zu bestimmen.
2. Visualisieren Sie den Suchprozess, indem Sie besuchte und überprüfte Zellen markieren.
3. Zählen Sie die Anzahl der Schritte (Bewegungen) während des Suchprozesses.

## Algorithmus

1. Initialisieren Sie einen Inselzähler und eine leere Warteschlange für BFS.
2. Iterieren Sie durch jede Zelle auf der Karte.
3. Wenn die aktuelle Zelle Land ist und noch nicht besucht wurde, starten Sie BFS, um nach einer Insel zu suchen.
4. Während BFS markieren Sie besuchte Zellen und erhöhen Sie den Schrittzähler.
5. BFS endet, wenn wir alle benachbarten Zellen der aktuellen Insel durchlaufen haben.
6. Wiederholen Sie die Schritte 3-5 für alle Zellen auf der Karte.

## Visualisierung

Während der Ausführung des Algorithmus visualisieren wir besuchte und überprüfte Zellen. Dies hilft, den Prozess der Suche nach Inseln auf der Karte visuell darzustellen.

## Ergebnis

Nach Abschluss des Algorithmus erhalten wir die Anzahl der einzelnen Inseln auf der Seenkarte und die Anzahl der Schritte (Bewegungen) während des Suchprozesses.

# Lizenz

Dieses Projekt steht unter der MIT-Lizenz - siehe die Datei [LICENSE](/LICENSE) für Details.
