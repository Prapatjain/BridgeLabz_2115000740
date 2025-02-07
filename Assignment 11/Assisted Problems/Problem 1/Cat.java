
public class Cat extends Animal{
    Cat(String name, int age){
        super(name, age);
    }
    void makeSound(){
        System.out.println(name+" sounds like meow.(age= "+age+")");
    }
}
