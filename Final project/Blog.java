import java.util.ArrayList;
import java.util.List;

public class Blog {
    private List<User> users;
    private List<Post> posts;

    public Blog() {
        this.users = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    // Register a new user
    public void registerUser(String username, String password) {
        User user = new User(username, password);
        users.add(user);
    }

    // Getters
    public List<User> getUsers() {
        return users;
    }

    public List<Post> getPosts() {
        return posts;
    }

    // Create a new post
    public void createPost(User user, String title, String content) {
        user.createPost(title, content);
    }

    // Add comment to a post
    public void addComment(User user, Post post, String content) {
        user.addCommentToPost(post, content);
    }
}
