package basics;

public class ifeleif {
    public static void main(String[] args) {
        //initialization
        int t = 32;

        //if statement
        if(t > 30)
        {
            System.out.println("It is a hot day");
            System.out.println("Drink plenty of water");
        }

        //Else if statement
        else if(t > 20 && t <= 30)
        {
            System.out.println("Beautiful day");
        }

        //Else statement
        else
        {
            System.out.println("Cold Day");
        }
    }
}