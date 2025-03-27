abstract class Animal {
    private String name;
    private int age;
    private double weight;
    private double height;
    private boolean isDomesticated;

    public Animal(String name, int age, double weight, double height, boolean isDomesticated) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.isDomesticated = isDomesticated;
    }

    public Animal() {
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setDomesticated(boolean domesticated) {
        isDomesticated = domesticated;
    }

    public void moves(){
        System.out.println("The Animal moves");
    }
    abstract void eat();
}
