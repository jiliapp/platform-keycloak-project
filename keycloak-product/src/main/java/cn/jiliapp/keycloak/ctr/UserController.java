package cn.jiliapp.keycloak.ctr;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;
import java.security.Principal;
import java.util.Enumeration;

/**
 * OIDC协议是增强版oauth2协议
 */
@RestController
@RequestMapping("/user")
public class UserController {
//  在Controller方法中传入Authentication对象
//  authentication.getName()

//  在Controller方法中传入HttpServletRequest对象
//  request.getUserPrincipal().getName()

// 通过SecurityContextHolder工具类获取
// SecurityContextHolder.getContext().getAuthentication().getName()


    @GetMapping("/bar")
    public String bar(HttpServletRequest httpRequest, KeycloakPrincipal principal){


        String name1=principal.getName();
        KeycloakSecurityContext keycloakSecurityContext=principal.getKeycloakSecurityContext();
        String id=keycloakSecurityContext.getIdToken().getId();

        httpRequest.getHeaderNames();
        Enumeration<String> names = httpRequest.getHeaderNames();
        //输出所有的头信息的名字
        while(names.hasMoreElements()){
            //获取request 的请求头名字name
            String name = names.nextElement();
            //根据头名字获取对应的值
            String value = httpRequest.getHeader(name);
            //输出：
            //System.out.println(name + ":    " + value);
        }

        return "felord.cn";
    }
}
