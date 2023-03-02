public class Main {
    public static void main(String[] args) {
        Java j = new Java();
        j.setName("JAVA");
        System.out.println(j.getName());
        j.type();
        System.out.println(j.calculate(10,20));
        System.out.println(j.calculate(10,20,30));
        System.out.println(j.calculate(10.2, 20.8));
    }
}