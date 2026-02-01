package ioc;

public class Main {
    public static void main(String[] args) {
       GitCommands git = new Containers();

        Programmer programmer = new Programmer(git);

        programmer.commit("First commit");
    }
}
