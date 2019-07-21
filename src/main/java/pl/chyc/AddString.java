package pl.chyc;

public class AddString {
    private String text;
    private String text2;

    public String getText() {
        System.out.println("text1: " + text);
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText2() {
        System.out.println("text2: " + text2);
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public void summary(){
        System.out.println(text + " " + text2);
    }
}
