package basics;

public class ternaryop {
  public static void main(String[] args) {
    int income = 120_000;
    String hasHighIncome = income > 100_000 ? "First" : "Economy";
    
    System.out.println(hasHighIncome);
  }
}