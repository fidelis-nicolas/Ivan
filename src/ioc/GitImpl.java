package ioc;

public class GitImpl implements GitCommands{
    @Override
    public void push() {
        System.out.println("Pushed successfully");
    }

    @Override
    public void commit(String message) {
        System.out.println("Commit code with message: " + message);
    }
}
