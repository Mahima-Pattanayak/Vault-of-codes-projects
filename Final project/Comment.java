import java.util.Date;

public class Comment {
    private String content;
    private String commenter;
    private Date commentDate;

    public Comment(String content, String commenter) {
        this.content = content;
        this.commenter = commenter;
        this.commentDate = new Date(); // Current date and time
    }

    // Getters
    public String getContent() {
        return content;
    }

    public String getCommenter() {
        return commenter;
    }

    public Date getCommentDate() {
        return commentDate;
    }
}
