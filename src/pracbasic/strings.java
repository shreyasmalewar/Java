package pracbasic;

public class strings {
    public static void main(String[] args) {

        String name = "Hey Shreyas";  //back slash is a special charecter
        
        System.out.println(name.endsWith("war"));
        
        System.out.println(name.startsWith("shr"));
        
        System.out.println(name.length());
        
        System.out.println(name.indexOf("eya"));
        
        System.out.println(name.replace("s", "S"));
        System.out.println(name);
        
        System.out.println(name.toLowerCase());
        
        System.out.println(name.trim());
        
        System.out.println(name);
    }
}