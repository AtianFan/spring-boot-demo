# spring-boot-demo
此项目用于个人学习spring boot之用

## 项目简介
* 数据库准备 见`src/main/java/resources/db/initsql.sql`

* 项目结构介绍
```
org.spring.springboot.config.ds - 配置层，这里是数据源的配置，包括 master 和 cluster 的数据源配置
org.spring.springboot.controller - Controller 层
org.spring.springboot.dao - 数据操作层 DAO，细分了 master 和 cluster 包下的 DAO 操作类
org.spring.springboot.domain - 实体类
org.spring.springboot.service - 业务逻辑层
Application - 应用启动类
application.properties - 应用配置文件，应用启动会自动读取配置

// 大致结构如下
├── pom.xml
└── src
    └── main
        ├── java
        │   └── org
        │       └── spring
        │           └── springboot
        │               ├── Application.java
        │               ├── config
        │               │   └── ds
        │               │       ├── ClusterDataSourceConfig.java
        │               │       └── MasterDataSourceConfig.java
        │               ├── controller
        │               │   └── UserRestController.java
        │               ├── dao
        │               │   ├── cluster
        │               │   │   └── CityDao.java
        │               │   └── master
        │               │       └── UserDao.java
        │               ├── domain
        │               │   ├── City.java
        │               │   └── User.java
        │               └── service
        │                   ├── UserService.java
        │                   └── impl
        │                       └── UserServiceImpl.java
        └── resources
            ├── application.properties
            └── mapper
                ├── cluster
                │   └── CityMapper.xml
                └── master
                    └── UserMapper.xml

```
* 说明：
初始框架引自(https://github.com/JeffLi1993/springboot-learning-example), 在此表示感谢。
后面将陆续加入一些自己的学习过程。






