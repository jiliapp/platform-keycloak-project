#### keycloak 基础

1. 中文汉化
````
登录keycloak
点击左侧菜单栏中的Realm Settings
点击Themes，设置所有属性为keycloak
Internationalization Enabled选择ON
将Default Locale设置为zh-CN
重新登录时，在登录页面会显示语言切换项

https://blog.csdn.net/qq_30038111/article/details/83714903

````
2. mysql作为后端存储平台
````
https://www.lanhusoft.com/Article/742.html

create database keycloak default character set = "UTF8" default collate = "utf8_general_ci";



````
3. 定制化登录界面
```
keycloak主题开发
https://blog.csdn.net/hhj724/article/details/105991570


````

4. 创建用户
````

````