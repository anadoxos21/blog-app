public class App {
    public static void main(String[] args) {
        Dog dog = new Dog("");

        //System.out.println(dog.name);
        //System.out.println(dog.getName());
        //System.out.println(dog.getAge());

        dog.setAge(10);
        //System.out.println(dog.getAge());

        dog.setName("D");
        //System.out.println(dog.getName());
        System.out.println(dog.toString());


        Dog dog2 = new Dog("A");
        Dog dog3 = new Dog("B");

        dog2.setAge(5);
        //System.out.println("o skilos einai " + dog2.getAge());
        System.out.println(dog2.toString());

        User user = new User("Kostas", 40);
        System.out.println(user.toString());
        User user2 = new User("Akis",35);
        System.out.println(user2.toString());
        user.setAge(20);
        //user.dog = dog2;
        user.setDog(dog2);
        System.out.println(user.toString());



    }
}
