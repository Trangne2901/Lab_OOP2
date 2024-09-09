//Lớp cat kế thừa lớp Animal
public class Cat extends Animal {
    //    ví dụ về override
    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    //    ví dụ về overloading
    public void makeSound(String sound) {
        System.out.println("Cat makeSound " + sound);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
//        Cat eat
        cat.makeSound("Meo meo");
//        Cat makeSound Meo Meo
    }
        
}
