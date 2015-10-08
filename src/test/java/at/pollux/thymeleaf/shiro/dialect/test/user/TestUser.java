package at.pollux.thymeleaf.shiro.dialect.test.user;

import java.util.Collections;
import java.util.Set;

/**
 * Created by void on 08.10.15.
 */
public class TestUser {
    private final String email;
    private final String password;
    private final Set<TestRoles> roles;

    public TestUser(String email, String password, Set<TestRoles> roles) {
        this.email = email;
        this.password = password;
        this.roles = Collections.unmodifiableSet(roles);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Set<TestRoles> getRoles() {
        return roles;
    }
}
