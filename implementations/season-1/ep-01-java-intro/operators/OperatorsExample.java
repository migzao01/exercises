public class OperatorsExample {

  public static void main(String[] args) {

    int x=10;

    System.out.println( (x++ % 2 == 0)?"yes "+ x: " no "+x);

    x=10;

    System.out.println( (++x % 2 == 0)?"yes "+ x: " no "+x);

    int random = (int)(Math.random() * 10); // random number between 0 - 9

    int upperLimit = 20;
    int lowerLimit = 12;

    int randomBetweenLimits = (int)(Math.random() * (upperLimit - lowerLimit) + lowerLimit);

    System.out.println(randomBetweenLimits);

    // round number
    float f = 10.23f;

    double ceil = Math.ceil(f);
    int ceilInt = (int)Math.ceil(f);
    
    int floor = (int)Math.floor(f);
    int round = (int)Math.round(f);

    System.out.println(ceil);
  }
}
