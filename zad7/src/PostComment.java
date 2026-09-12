import java.util.Arrays;

public class PostComment {
    private String text;
    private String[] whoLiked;

    public void setText(String text) {
        this.text = text;
    }

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }

    // Геттеры для доступа к закрытым полям внутри toString()
    public String getText() { return text; }
    public String[] getWhoLiked() { return whoLiked; }

    @Override
    public String toString() {
        return "PostComment{" +
                "text='" + text + '\'' +
                ", whoLiked=" + Arrays.toString(whoLiked) +
                '}';
    }
}