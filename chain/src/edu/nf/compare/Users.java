package edu.nf.compare;

/**
 * @author wangl
 * @date 2020/11/23
 */
public class Users {
    private String name;
    private Integer age;

    public Users() {
    }

    public Users(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
