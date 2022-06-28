public class Human {
    int age = 20;
    public static void main(String[] args){
        Human human = new Human();
        System.out.println(human.getAge(5,0.3,true, human));
    }
    double getAge(int i, double b, boolean bool, Human human){
        return human.age;
    }
}
