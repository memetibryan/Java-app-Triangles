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

    if (intSideA == intSideB && intSideA != intSideC) {
        System.out.println("Isosceles");
    }

    else if (intSideB == intSideC && intSideB != intSideA) {
        System.out.println("Isosceles");
    }

    else if (intSideA == intSideC && intSideA != intSideB) {
        System.out.println("Isosceles");
    }

    else if (intSideA != intSideB && intSideA != intSideC) {
        System.out.println("Scalene");
    }

    else {
        System.out.println("Equilateral");
    }
  }
}