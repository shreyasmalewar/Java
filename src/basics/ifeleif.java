package basics;

public class ifeleif {
    public static void main(String[] args) {
        int t = 32;
        if(t > 30)
        {
            System.out.println("It is a hot day");
            System.out.println("Drink plenty of water");
        }

        else if(t > 20 && t <= 30)
        {
            System.out.println("Beautiful day");
        }

        else
        {
            System.out.println("Cold Day");
        }
    }
}