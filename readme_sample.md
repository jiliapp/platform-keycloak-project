#### keycloak 权限体系
````

1. POSTMAN PASSWORD模式

http://localhost:8080/auth/realms/felord.cn/protocol/openid-connect/token
Content-Type: application/x-www-form-urlencoded

client_id=spring-boot-client
username=17380072170
password=123456
grant_type=password


{
    "access_token": "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJDY2Z0X0J1S3BYUy11NDVnZWFuTnVTUUoxNURTeG1KbmpKZVRnVDh6X3NjIn0.eyJleHAiOjE2NDEzNjczNTQsImlhdCI6MTY0MTM2NzA1NCwianRpIjoiYjVlZWY2OWYtM2RhMi00OGQzLWJkZTgtOTY1M2FjMWMyYjg3IiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL2F1dGgvcmVhbG1zL2ZlbG9yZC5jbiIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJmODAxZmE1MC05Mzg0LTQ3NWItYTUxNy1jMmE2ZGM4MjU3YTEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJzcHJpbmctYm9vdC1jbGllbnQiLCJzZXNzaW9uX3N0YXRlIjoiZTA3OTU2ZGUtNTI1OC00OWU0LWI3NWYtYTU0NzY1OGExNTY2IiwiYWNyIjoiMSIsInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJkZWZhdWx0LXJvbGVzLWZlbG9yZC5jbiIsImJhc2VfdXNlciIsIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6InByb2ZpbGUgZW1haWwiLCJzaWQiOiJlMDc5NTZkZS01MjU4LTQ5ZTQtYjc1Zi1hNTQ3NjU4YTE1NjYiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIm5hbWUiOiJ6aGFuZyBzYW4iLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiIxNzM4MDA3MjE3MCIsImdpdmVuX25hbWUiOiJ6aGFuZyIsImZhbWlseV9uYW1lIjoic2FuIn0.iYyl9wTsxRmxuRxjkOxybKFRqxTGJtgVewX1Lh7eV50WmMG1mFhxOBU7x7qzpJ38WHKEjHCaeGSR0I53SCLt2fLsbbBrj5a52_QdDMYDykwAEzTHz7ehNLIgbKcBhNMtyT1Y1PyRdf_Zhr9w3y-vyUYhPHo3vVbBCNMPM7Q2ZY6D3tFTaKhCRtXwhwCJ2gtSlY9Ri7yuzSEp0JGmS2n7dlmDgvlT5Z028Q1czrshKyQc1jskYXCNdk-lFAY_fJVjMrdxwc9PhFeSkxIteFngO4S3tgi_vtVOgvhuhgyF2AFSir5L_yRs8v9bnFKpvCDhuXSDMTV8zL4IsxvoTRGKVw",
    "expires_in": 300,
    "refresh_expires_in": 1800,
    "refresh_token": "eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIwNzZhN2I5Zi0yOTJjLTQ3YWYtYmUwMy0xNjc2M2M4ODdiYzQifQ.eyJleHAiOjE2NDEzNjg4NTQsImlhdCI6MTY0MTM2NzA1NCwianRpIjoiZDlkMDZkZGItNjM1Zi00NWU3LWEyNDEtYzI1MDdjMDQxZGYzIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL2F1dGgvcmVhbG1zL2ZlbG9yZC5jbiIsImF1ZCI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MC9hdXRoL3JlYWxtcy9mZWxvcmQuY24iLCJzdWIiOiJmODAxZmE1MC05Mzg0LTQ3NWItYTUxNy1jMmE2ZGM4MjU3YTEiLCJ0eXAiOiJSZWZyZXNoIiwiYXpwIjoic3ByaW5nLWJvb3QtY2xpZW50Iiwic2Vzc2lvbl9zdGF0ZSI6ImUwNzk1NmRlLTUyNTgtNDllNC1iNzVmLWE1NDc2NThhMTU2NiIsInNjb3BlIjoicHJvZmlsZSBlbWFpbCIsInNpZCI6ImUwNzk1NmRlLTUyNTgtNDllNC1iNzVmLWE1NDc2NThhMTU2NiJ9.yYCGEMRgqywq_3HcaPQSXN9-201Xux7DenX4MhvFVsY",
    "token_type": "Bearer",
    "not-before-policy": 0,
    "session_state": "e07956de-5258-49e4-b75f-a547658a1566",
    "scope": "profile email"
}

token解析


{
    "exp": 1641367354,
    "iat": 1641367054,
    "jti": "b5eef69f-3da2-48d3-bde8-9653ac1c2b87",
    "iss": "http://localhost:8080/auth/realms/felord.cn",
    "aud": "account",
    "sub": "f801fa50-9384-475b-a517-c2a6dc8257a1",
    "typ": "Bearer",
    "azp": "spring-boot-client",
    "session_state": "e07956de-5258-49e4-b75f-a547658a1566",
    "acr": "1",
    "realm_access": {
        "roles": ["default-roles-felord.cn", "base_user", "offline_access", "uma_authorization"]
    },
    "resource_access": {
        "account": {
            "roles": ["manage-account", "manage-account-links", "view-profile"]
        }
    },
    "scope": "profile email",
    "sid": "e07956de-5258-49e4-b75f-a547658a1566",
    "email_verified": false,
    "name": "zhang san",
    "preferred_username": "17380072170",
    "given_name": "zhang",
    "family_name": "san"
}


2. code模式
浏览器访问

http://localhost:7788/user/bar

未登录，跳转
http://localhost:8080/auth/realms/felord.cn/protocol/openid-connect/auth?response_type=code&client_id=spring-boot-client&redirect_uri=http%3A%2F%2Flocalhost%3A7788%2Fuser%2Fbar&state=1394170f-7a60-4a48-9821-04b1f369ee67&login=true&scope=openid

输入用户密码

跳转回
http://localhost:7788/user/bar


````