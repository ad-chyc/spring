package pl.chyc;

public class BeanFirstTemplate {
    private String msg;
    private String msg2;
    private String msg3;

    public String getMsg2() {
        System.out.println(msg2);
        return msg2;
    }

    public void setMsg2(String msg2) {
        this.msg2 = msg2;
    }

    public String getMsg3() {
        System.out.println(msg3);
        return msg3;
    }

    public void setMsg3(String msg3) {
        this.msg3 = msg3;
    }

    public String getMsg() {
        System.out.println(msg);
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
