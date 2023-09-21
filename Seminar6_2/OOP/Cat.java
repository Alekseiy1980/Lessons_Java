package OOP;

public class Cat {

    private String name;
    private int age;
    private String breed;
    private String date;
    private int weight;
    private Boolean state;

    public Cat(String name, int age, String breed, String date, int weight, Boolean state) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.date = date;
        this.weight = weight;
        this.state = state;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", date=" + date +
                ", weight=" + weight +
                ", state=" + state +
                '}';
    }
}

