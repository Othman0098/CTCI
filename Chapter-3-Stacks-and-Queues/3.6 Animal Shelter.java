import java.util.LinkedList;

/**
 * Created by Muchen on 6/11/16.
 */
public class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;
    
    public void enqueue(Animal animal){
        animal.setOrder(order++);
        
        if(animal instanceof Dog)
            dogs.add((Dog) animal);
        else
            cats.add((Cat) animal);
    }
    
    public Animal dequeueAny(){
        if(dogs.isEmpty() && cats.isEmpty())
            return null;
        
        if(dogs.isEmpty())
            return dequeueCat();
        
        if(cats.isEmpty())
            return dequeueDog();
        
        Dog dog = dogs.peek();
        Cat cat = cats.peek();
        
        return (dog.isOlderThan(cat)) ? dequeueDog() : dequeueCat();
    }
    
    public Dog dequeueDog(){
        return dogs.poll();
    }
    
    public Cat dequeueCat(){
        return cats.poll();
    }
}

abstract class Animal {
    private int order;
    protected String name;
    
    public Animal(String name){
        this.name = name;
    }
    
    public void setOrder(int order){
        this.order = order;
    }
    
    public int getOrder(){
        return this.order;
    }
    
    public boolean isOlderThan(Animal other){
        return this.order < other.order;
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
}
