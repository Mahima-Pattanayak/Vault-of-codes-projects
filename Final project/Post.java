import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private String title;
    private String content;
    private String author;
    private Date publishDate;
    private List<Comment> comments;

    public Post(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.publishDate = new Date(); // Current date and time
        this.comments = new ArrayList<>();
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // Add a comment
    public void addComment(Comment comment) {
        comments.add(comment);
    }
}
