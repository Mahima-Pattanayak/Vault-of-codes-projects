import java.util.Scanner;

public class BlogPlatformApp {
    private static Blog blog = new Blog();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Blog Platform!");
        System.out.println("-----------------------------");

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    createPost();
                    break;
                case 3:
                    addComment();
                    break;
                case 4:
                    displayPosts();
                    break;
                case 5:
                    System.out.println("Exiting the Blog Platform. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Register User");
        System.out.println("2. Create Post");
        System.out.println("3. Add Comment to Post");
        System.out.println("4. Display Posts");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void registerUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        blog.registerUser(username, password);
        System.out.println("User registered successfully.");
    }

    private static void createPost() {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        User user = findUser(username);

        if (user != null) {
            System.out.print("Enter post title: ");
            String title = scanner.nextLine();
            System.out.print("Enter post content: ");
            String content = scanner.nextLine();

            blog.createPost(user, title, content);
            System.out.println("Post created successfully.");
        } else {
            System.out.println("User not found.");
        }
    }

    private static void addComment() {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        User user = findUser(username);

        if (user != null) {
            System.out.print("Enter post index to add comment: ");
            int postIndex = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            List<Post> posts = blog.getPosts();
            if (postIndex >= 0 && postIndex < posts.size()) {
                Post post = posts.get(postIndex);
                System.out.print("Enter comment content: ");
                String content = scanner.nextLine();

                blog.addComment(user, post, content);
                System.out.println("Comment added successfully.");
            } else {
                System.out.println("Invalid post index.");
            }
        } else {
            System.out.println("User not found.");
        }
    }

    private static void displayPosts() {
        List<Post> posts = blog.getPosts();
        if (posts.isEmpty()) {
            System.out.println("No posts available.");
        } else {
            System.out.println("Posts:");
            for (int i = 0; i < posts.size(); i++) {
                Post post = posts.get(i);
                System.out.println("[" + i + "] " + post.getTitle());
                System.out.println("    By: " + post.getAuthor());
                System.out.println("    Date: " + post.getPublishDate());
                System.out.println("    " + post.getContent());
                System.out.println("    Comments:");

                List<Comment> comments = post.getComments();
                for (Comment comment : comments) {
                    System.out.println("        By " + comment.getCommenter() + " at " + comment.getCommentDate());
                    System.out.println("        " + comment.getContent());
                }
                System.out.println();
            }
        }
    }

    private static User findUser(String username) {
        for (User user : blog.getUsers()) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
