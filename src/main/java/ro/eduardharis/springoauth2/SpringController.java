package ro.eduardharis.springoauth2;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class SpringController {

    @GetMapping("/user")
    public Map<String, Object> getUser(@AuthenticationPrincipal OAuth2User principal) {
        final Map<String, Object> stringObjectMap = Collections.singletonMap("name", principal.getAttribute("login"));
        System.out.println(stringObjectMap.toString());
        return stringObjectMap;
    }
}
