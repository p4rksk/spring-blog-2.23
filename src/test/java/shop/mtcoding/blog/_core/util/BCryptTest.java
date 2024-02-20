package shop.mtcoding.blog._core.util;

import org.junit.jupiter.api.Test;
import org.mindrot.jbcrypt.BCrypt;

public class BCryptTest {

    @Test
    public void login_test(){
        String joinPassword = "1234";
        String enc1Password = BCrypt.hashpw(joinPassword, BCrypt.gensalt());
        System.out.println("JOIN : "+enc1Password);

        String loginPassword = "12345";

        boolean test = BCrypt.checkpw(loginPassword, enc1Password);
        System.out.println(test);
    }

    // $2a$10$7L20HvqPfRZxHCTMlaetn.
    // $2a$10$FxeyzsJcMPwD0EA9eUr8S.
    @Test
    public void gensalt_test(){
        // hello_3u90gnjfah98
        // hello_gf498ik4mk
        String salt = BCrypt.gensalt();
        System.out.println(salt);
    }

    // $2a$10$r3p8EaWSkNMhlFExKx3uDO0NPmiOnj4eWJRXcHefwb9t5/xi6vb7e
    // $2a$10$Z8S0rgYI3ll7eyLuzcnlregOQxb3vMWHlHACg/N.9gZghWebEBwC.
    @Test
    public void hashpw_test(){
        String rawPassword = "1234";
        String encPassword = BCrypt.hashpw(rawPassword, BCrypt.gensalt());
        System.out.println(encPassword);
    }
}
