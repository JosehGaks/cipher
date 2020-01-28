public class Encrypt {
    private String inputText;
    private int key;

    public Encrypt(String inputText, int key) {
        this.key = key;
        this.inputText = inputText;
    }
    public String getInput() {
        return inputText;
    }
}
