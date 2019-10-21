# springboot-dubbo-demo
springboot整合dubbo

#核心依赖
<dependency>
  <groupId>com.alibaba.boot</groupId>
  <artifactId>dubbo-spring-boot-starter</artifactId>
  <version>0.2.0</version>
</dependency>

#主要dubbo yml配置（服务提供者）
dubbo:
  application:
    name: xxxxx
  registry:
    address: zookeeper://127.0.0.1:2181
  protocol:
    name: dubbo
    port: 20880
    
#主要dubbo yml配置（服务消费者）
dubbo:
  application:
    name: xxxxx
  registry:
    address: zookeeper://127.0.0.1:2181

    
#主要注解
启动类上加 @EnableDubbo
对外暴露的实现方法加 @com.alibaba.dubbo.config.annotation.Service
引入的接口加 @Reference

@Reference(check = false) 表示不会在启动时简查dubbo关联服务是否启动
