# Determining the Number of Islands on a Lake Map

[RU](/README.md) | [EN](README_EN.md) | [FR](README_FR.md) |  [JP](README_JP.md) | [DE](README_DE.md) | [CH](README_CH.md) | [KR](README_KR.md)

## Description

Given a lake map represented as a two-dimensional array, where each cell is either water ('W') or land ('L'), the task is to determine the number of individual islands on this map. An island is defined as a group of adjacent (connected vertically or horizontally) land cells surrounded by water.

## Example

Example lake map:

[
['W', 'L', 'W', 'W'],
['W', 'L', 'L', 'W'],
['W', 'W', 'L', 'W'],
['L', 'W', 'W', 'L']
]

Expected result: There are 3 separate islands on the map. One island consists of two adjacent 'L' cells in the second column, the second one consists of one cell in the third row, third column, and the third one consists of two non-diagonally adjacent cells in the last row.

## Tasks

1. Develop an algorithm using breadth-first search (BFS) to determine the number of islands on the map.
2. Visualize the search process by marking visited and checked cells.
3. Count the number of steps (movements) taken during the search process.

## Algorithm

1. Initialize an island counter and an empty queue for BFS.
2. Iterate through each cell on the map.
3. If the current cell is land and has not been visited yet, initiate BFS to search for an island.
4. During BFS, mark visited cells and increment the step counter.
5. BFS terminates when we traverse all adjacent cells of the current island.
6. Repeat steps 3-5 for all cells on the map.

## Visualization

During the execution of the algorithm, we will visualize visited and checked cells. This will help to visually represent the process of searching for islands on the map.

## Result

After completing the algorithm, we will obtain the number of individual islands on the lake map and the number of steps (movements) taken during the search process.

# License

This project is licensed under the MIT License - see the [LICENSE](/LICENSE) file for details.
