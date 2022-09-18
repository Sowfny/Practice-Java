package pr1;

public class Cmdargs {
    public static void main(String[] args) {
        //  java -classpath C:\Users\sonas\IdeaProjects\Practice-Java\out\production\HWjava pr1.Cmdargs  shefgsjef
        for (String s : args) {
            System.out.println(s);
        }
    }
}