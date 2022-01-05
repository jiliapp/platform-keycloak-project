package cn.jiliapp.keycloak.ctr;

import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.representations.AccessTokenResponse;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/create")
    public Object createUser(){
        String serverUrl="http://localhost:8080/auth";
        String masterRealm="master";
        String masterUsername="admin";
        String masterPassword="123456";
        String masterClientId="admin-cli";

        Keycloak kcMaster = Keycloak.getInstance(serverUrl, masterRealm, masterUsername, masterPassword, masterClientId);



         String userName="151082809070";
         String firstName="li";
         String lastName="si";
         String email="qq@qq.com";
         String password="123456";
         String companyName="lanhai";

        // 初始化keycloak客户端
/*        Keycloak kc = KeycloakBuilder.builder()
                .serverUrl(serverUrl)
                .grantType(OAuth2Constants.PASSWORD)
                .realm("master")
                .username("admin")
                .password("admin")
                .clientId("admin-cli")
                .resteasyClient(
                        new ResteasyClientBuilder()
                                .connectionPoolSize(10).build()
                ).build();

        AccessTokenResponse accessTokenResponse=kc.tokenManager().getAccessToken();
*/
        UserRepresentation user = new UserRepresentation();
        // 设置用户名
            user.setUsername(userName);
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);
        CredentialRepresentation credential = new CredentialRepresentation();
        //credential.setType(CredentialRepresentation.PASSWORD);
        credential.setValue(password);
        credential.setTemporary(false);
        List<CredentialRepresentation> credentials = new ArrayList<>();
        credentials.add(credential);
        // 设置用户凭据，即密码
        user.setCredentials(credentials);
        // 设置启用该用户，接下来还可以设置角色等等
        user.setEnabled(true);
        try {
            Response response=kcMaster.realm(companyName).users().create(user);
            return response;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
