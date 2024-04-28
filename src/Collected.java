import java.util.ArrayDeque;
import java.util.Queue;

public class Collected {
  private char[][] map;
  private boolean[][] visited;

  private int steps;

  public Collected(char[][] map) {
    this.map = map;
    this.visited = new boolean[map.length][map[0].length];
  }

  private void BFS(int x, int y) {
    Queue<int[]> queue = new ArrayDeque<>();
    queue.offer(new int[]{x, y});
    visited[x][y] = true;
    while(!queue.isEmpty()) {
      int[] current = queue.poll();
      int currentX = current[0];
      int currentY = current[1];
      System.out.println("Checking " + currentX + ", " + currentY);
      int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
      for(int[] dir: directions) {
        int newX = currentX + dir[0];
        int newY = currentY + dir[1];
        if(newX >= 0 && newX < map.length && newY >= 0 && newY < map[0].length && !visited[newX][newY] && map[newX][newY] == 'L') {
          queue.offer(new int[]{newX, newY});
          visited[newX][newY] = true;
          steps++;
        }
      }
    }
  }

  public int island() {
    int count = 0;
    for(int i = 0; i < map.length; i++){
      for(int j = 0; j < map[0].length; j++){
        if(map[i][j] == 'L' && !visited[i][j]){
          BFS(i, j);
          count++;
        }
      }
    }
    return count;
  }

  public int getSteps() {
    return steps;
  }
}
