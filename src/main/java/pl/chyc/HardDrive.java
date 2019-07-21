package pl.chyc;

public class HardDrive {
    private int power;
    private String name;

   /* public HardDrive(int power, String name){
        this.power = power;
        this.name = name;
    }*/

    public int getPower() {
        System.out.println(power);
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
