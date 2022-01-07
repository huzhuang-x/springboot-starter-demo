# springboot-starter-demo
***
### 本项目为springboot-starter简单实现，以redis启动器为例，实现自动配置在IOC容器中实例化Jedis这个Bean
主要分为三个子模块
+ redis-spring-boot-autoconfigure模块为核心自动配置模块
+ redis-spring-boot-starter内部依赖了redis-spring-boot-autoconfigure，仅包装成为starter
+ springboot-enable为客户端调用，可按前缀要求在application.properties中配置host和port动态指定redis机器