public class Dog {

    private String name;
    private String lastName;
    private int age;

    public Dog(String name){
        this.name = name;
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
