package pl.chyc;

public class HelloWorld {
    private String message;
    private String message2;

    public String getMessage() {
        System.out.println("Message 1" + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage2() {
        System.out.println("Message 2 " + message2);
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }
}
