package basics;

public class ifstate {
public static void main(String[] args) {
    int income = 120_000;
    boolean hasHighIncome;
    if(income > 100_000)
        hasHighIncome = true;

    else
        hasHighIncome = false;

    System.out.println(hasHighIncome);
}
}