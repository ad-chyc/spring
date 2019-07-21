package pl.chyc;

public class AddNumber {
    private int number;
    private int number2;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int summary(){
        int sum = number + number2;
        System.out.println("Suma: " + sum);
        return sum;
    }
}
