public class Functionsclass {
    static int a=10;
    public static void main(String[] args) {
        Greet ab = new Greet();
        Greet.Hi ac = ab.new Hi();
        System.out.println("Hello, World! "+a);
        System.out.printf("hai, hello %d",ac.msg(a));

    }
}
class Greet{
    static int b = 20;
    public class Hi{
        public int msg(int a){
            System.out.println("Hii, World! "+ a +" "+b);
            return b;
        }
    }
}
