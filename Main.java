class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int total;
    double blue;
    double red;
    double yellow;
    double green;
    double brown;
    double orange;
    double sum;

    total = 55 * 11;
    blue = total * .24;
    red = total * .13;
    yellow = total * .14;
    green = total * .16;
    brown = total * .13;
    orange = total * .20;
    sum = blue + red + yellow + green + brown + orange;

    System.out.println("blue: " + blue);
    System.out.println("red: " + red);
    System.out.println("yellow: " + red);
    System.out.println("green: " + green);
    System.out.println("brown: " + brown);
    System.out.println("orange: " + orange);
    System.out.println("Sum: " + sum);

    if (blue < brown && red > orange){
      System.out.println("Blue under brown and Red over Orange");
    }
    if (brown >= green){
      System.out.println("Brown is greater than or equal to Green");
    }
    if (sum == total){
      System.out.println("Numbers Match");
    }

  }
}