public class Main {


  public static void main(String[] args) {
    char[][] maze = {
    {'W', 'L', 'W', 'W'},
    {'W', 'L', 'L', 'W'},
    {'W', 'W', 'L', 'W'},
    {'L', 'W', 'W', 'L'}
    };

    Collected collected = new Collected(maze);
    System.out.println(collected.island());
    System.out.println(collected.getSteps());
  }
}
