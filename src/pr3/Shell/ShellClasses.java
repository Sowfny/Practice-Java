package pr3.Shell;

public class ShellClasses {
    public static void main(String[] args) {
        Double a = Double.valueOf(5);
        System.out.println(a);
        Double b = Double.valueOf(2.6);
        System.out.println(b);
        Double c = Double.valueOf(0);
        System.out.println(c);
        Double.parseDouble("0011");

        Double S = 5.6;
        S.intValue();
        System.out.println(S);
        S.byteValue();
        System.out.println(S);
        S.floatValue();
        System.out.println(S);
        S.longValue();
        System.out.println(S);
        S.shortValue();
        System.out.println(S);

        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
