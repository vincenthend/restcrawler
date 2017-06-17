package model;

import java.util.LinkedList;

/**
 * Kelas model.User, berisi data tentang user.
 *
 * @author Vincent Hendryanto Halim / 13515089
 */
public class User {

  private String username;
  private LinkedList<Repository> repositoryList;
  private String name;
  private int repoCount;
  private int followersCount;

  public User() {
    name = "";
    username = "";
    repoCount = 0;
    followersCount = 0;
    repositoryList = new LinkedList<>();
  }

  public User(String username, String name, int repoCount, int followersCount) {
    this.username = username;
    this.name = name;
    this.repoCount = repoCount;
    this.followersCount = followersCount;
    repositoryList = new LinkedList<>();
  }

  public void addRepository(Repository repo) {
    repositoryList.addLast(repo);
  }

  /**
   * Getter username dari user.
   *
   * @return username dari user
   */
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Getter daftar repository yang dimiliki user.t[poikqww
   *
   * @return Linked list berisi daftar repository yang dimiliki user
   */
  public LinkedList<Repository> getRepositoryList() {
    return repositoryList;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getFollowersCount() {
    return followersCount;
  }

  public void setFollowersCount(int followersCount) {
    this.followersCount = followersCount;
  }

  public int getRepoCount() {
    return repoCount;
  }

  public void setRepoCount(int repoCount) {
    this.repoCount = repoCount;
  }
}
