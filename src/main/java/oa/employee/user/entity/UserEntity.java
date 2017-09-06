package oa.employee.user.entity;

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.Size;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-14:20
 */
public class UserEntity {

    private Integer id;

    @Size(max = 40)
    private String username;

    @Size(max = 255)
    private String password;

    private int age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
