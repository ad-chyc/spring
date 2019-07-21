package pl.chyc;

public class Computer {
    private HardDrive hardDrive;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public int getPower(){
        System.out.println(""+hardDrive.getPower());
        return hardDrive.getPower();
    }
    public void setPower(int power){
        this.hardDrive.setPower(power);
    }

}
