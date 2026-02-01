package ioc;

public class Programmer {
    private GitCommands gitCommands;

    public Programmer(GitCommands gitCommands){
        this.gitCommands = gitCommands;
    }

    public void commit(String message){
        gitCommands.commit(message);
    }

    public GitCommands getGitCommands() {
        return gitCommands;
    }

    public void setGitCommands(GitCommands gitCommands) {
        this.gitCommands = gitCommands;
    }
}
