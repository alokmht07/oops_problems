class Animal {
public void makeSound() {
System.out.println("The animal makes a sound");
}
}

class Bird extends Animal {
@Override
public void makeSound() {
System.out.println("The bird chirps");
}
}

class Cat extends Animal {
@Override
public void makeSound() {
System.out.println("The cat meows");
}
}

class exp_9 {
public static void main(String[] args) {
Animal animal = new Animal();
Bird bird = new Bird();
Cat cat = new Cat();
animal.makeSound();
bird.makeSound(); 
cat.makeSound(); 
}
}