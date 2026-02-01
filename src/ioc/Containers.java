package ioc;

public class Containers implements GitCommands{
    @Override
    public void push() {
        System.out.println("Pushing from containers");
    }

    @Override
        public void commit(String message) {
        System.out.println("Commiting from container: " + message);
        }
}
