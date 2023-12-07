class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}

class BabyDog extends Dog{
    void weep(){
        System.out.println("Weeping");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        BabyDog dog = new BabyDog();
        dog.eat();
        dog.bark();
        dog.weep();
    }
}