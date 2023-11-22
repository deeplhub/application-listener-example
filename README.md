ApplicationListener 监听执行顺序


> 项目启动时就可以看到加载顺序。


监听事件业如下：

ApplicationStartingEvent：启动开始的时候执行的事件
ApplicationEnvironmentPreparedEvent：上下文创建之前运行的事件
ApplicationContextInitializedEvent：上下文初始化
ApplicationPreparedEvent：上下文创建完成，注入的bean还没加载完成
ContextRefreshedEvent：上下文刷新
ServletWebServerInitializedEvent：/web服务器初始化
ApplicationStartedEvent：应用程序启动事件
ApplicationReadyEvent：启动成功
ApplicationFailedEvent：启动Spring发生异常时触发


示例：

```java
import com.mgk.demov1.annotation.Student;
import com.sun.org.apache.bcel.internal.generic.SWITCH;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
 
public class MyListenery implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        switch (event.getClass().getSimpleName()){
            case "ApplicationStartingEvent":
                System.out.println("启动开始的时候执行的事件");
                break;
            case "ApplicationEnvironmentPreparedEvent":
                System.out.println("上下文创建之前运行的事件");
                break;
            case "ApplicationContextInitializedEvent":
                System.out.println("上下文初始化");
                break;
            case "ApplicationPreparedEvent":
                System.out.println("上下文创建完成，注入的bean还没加载完成");
                break;
            case "ContextRefreshedEvent":
                System.out.println("上下文刷新");
                if( event instanceof ContextRefreshedEvent){
                    Object stu = ((ContextRefreshedEvent) event).getApplicationContext().getBean("stu");
                    System.out.println(stu);
                }
                break;
            case "ApplicationStartedEvent":
                System.out.println("ApplicationStartedEvent");
                break;
            case "ApplicationReadyEvent":
                System.out.println("启动成功");
                break;
            case "ApplicationFailedEvent":
                break;
        }
    }
}
```