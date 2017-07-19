import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter First Side:");
    String sideA = myConsole.readLine();

    System.out.println("Enter Second Side:");
    String sideB = myConsole.readLine();

    System.out.println("Enter Third Side:");
    String sideC= myConsole.readLine();

    int intSideA = Integer.parseInt(sideA);
    int intSideB = Integer.parseInt(sideB);
    int intSideC = Integer.parseInt(sideC);

    // PingPong pingPong = new PingPong();
    // List<Object> pingPongResult = pingPong.runPingPong(intUserNumber);
    // System.out.println(pingPongResult);
  }
}