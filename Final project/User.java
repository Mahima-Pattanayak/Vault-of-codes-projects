import java.util.ArrayList;
import java.util.List;

public class User{
    private String username;
    private String password; // For simplicity, not secure in real applications
    private List<Post> posts;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.posts = new ArrayList<>();
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    // Create a new post
    public void createPost(String title, String content) {
        Post post = new Post(title, content, username);
        posts.add(post);
    }

    // Add comment to a post
    public void addCommentToPost(Post post, String content) {
        Comment comment = new Comment(content, username);
        post.addComment(comment);
    }
}
