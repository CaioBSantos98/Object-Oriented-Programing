package br.com.alura.desafios.trycatch.tres;

public class GitHubUser {
    private String name;
    private String url;
    private String avatar;

    public GitHubUser(GitHubUserApi user) {
        this.name = user.name();
        this.url = user.html_url();
        this.avatar = user.avatar_url();
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getAvatar() {
        return avatar;
    }

    @Override
    public String toString() {
        return "GitHubUser{" +
                "name='" + name + '\'' +
                '}';
    }
}
