package ro.sda.spring_di_3.beans;

public class Owner {

    @lombok.Getter
    private String name;
    private Dog dog;

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
