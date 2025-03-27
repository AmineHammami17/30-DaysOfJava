public class Mammal extends Animal{

    private String furColor;
    private int gestationPeriod;
    private int numberOfLegs;
    private boolean hasTail;

    public Mammal(String name, int age, double weight, double height, boolean isDomesticated ,String furColor, int gestationPeriod, int numberOfLegs, boolean hasTail) {
        super(name,age,weight,height,isDomesticated);
        this.furColor = furColor;
        this.gestationPeriod = gestationPeriod;
        this.numberOfLegs = numberOfLegs;
        this.hasTail = hasTail;
    }
    public Mammal(){

    }

    @Override
    void eat() {
        System.out.println("The Mammal chews food");
    }

    @Override
    public void moves(){
        System.out.println("The Mammal walks");

    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getGestationPeriod() {
        return gestationPeriod;
    }

    public void setGestationPeriod(int gestationPeriod) {
        this.gestationPeriod = gestationPeriod;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }


}



//Dog: furColor="Brown", numberOfLegs=4, hasTail=true, diet="Carnivore"
//Elephant: furColor="Gray", numberOfLegs=4, hasTail=true, diet="Herbivore"

