public class Bird extends Animal implements IFlyable{

    private double wingSpan;
    private boolean canFly;

    private String beakType;

    public Bird(String name, int age, double weight, double height, boolean isDomesticated, double wingSpan, boolean canFly, String beakType) {
        super(name,age,weight,height,isDomesticated);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
        this.beakType = beakType;
    }

    public Bird() {
    }

    @Override
    void eat() {
        System.out.println("The bird pecks at food");
    }

    @Override
    public void moves(){
        if (canFly) {
            System.out.println("The bird flies");
        } else {
            System.out.println("The bird waddles");
        }

    }


    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String getBeakType() {
        return beakType;
    }

    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }


    @Override
    public void fly() {
        System.out.println("The bird flies");
    }
}

//Eagle: canFly=true, beakType="Hooked", wingSpan=2.3
//
//Penguin: canFly=false, beakType="Straight", wingSpan=0.5