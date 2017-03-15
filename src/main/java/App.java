import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {

    Console myConsole = System.console();
    System.out.println("Enter a number");
    int userNumber = Integer.parseInt(myConsole.readLine());

    PingPong pingpong = new PingPong();
    List<Object> results = new ArrayList();
    results = pingpong.runPingPong(userNumber);

    for(Object result : results) {
      System.out.println(result);
    }
  }
}
