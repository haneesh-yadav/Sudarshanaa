2026-06-27T14:12:23.005200031Z #16 9.102 [INFO] --- surefire:3.5.2:test (default-test) @ server ---
2026-06-27T14:12:23.119262399Z #16 9.401 [INFO] Tests are skipped.
2026-06-27T14:12:23.305190412Z #16 9.402 [INFO] 
2026-06-27T14:12:23.305242124Z #16 9.402 [INFO] --- jar:3.4.2:jar (default-jar) @ server ---
2026-06-27T14:12:23.721595082Z #16 10.00 [INFO] Building jar: /app/target/server-0.0.1-SNAPSHOT.jar
2026-06-27T14:12:23.821963232Z #16 10.10 [INFO] 
2026-06-27T14:12:23.821994003Z #16 10.10 [INFO] --- spring-boot:3.4.1:repackage (repackage) @ server ---
2026-06-27T14:12:24.342219833Z #16 10.62 [INFO] Replacing main artifact /app/target/server-0.0.1-SNAPSHOT.jar with repackaged archive, adding nested dependencies in BOOT-INF/.
2026-06-27T14:12:24.453010665Z #16 10.62 [INFO] The original artifact has been renamed to /app/target/server-0.0.1-SNAPSHOT.jar.original
2026-06-27T14:12:24.453051726Z #16 10.63 [INFO] ------------------------------------------------------------------------
2026-06-27T14:12:24.453055457Z #16 10.63 [INFO] BUILD SUCCESS
2026-06-27T14:12:24.453058157Z #16 10.63 [INFO] ------------------------------------------------------------------------
2026-06-27T14:12:24.453060777Z #16 10.63 [INFO] Total time:  9.321 s
2026-06-27T14:12:24.453063517Z #16 10.63 [INFO] Finished at: 2026-06-27T14:12:24Z
2026-06-27T14:12:24.453066017Z #16 10.63 [INFO] ------------------------------------------------------------------------
2026-06-27T14:12:24.453068557Z #16 DONE 10.7s
2026-06-27T14:12:24.78418575Z 
2026-06-27T14:12:24.784205641Z #17 [stage-1 3/3] COPY --from=build /app/target/*.jar app.jar
2026-06-27T14:12:24.956473138Z #17 DONE 0.2s
2026-06-27T14:12:25.109649377Z 
2026-06-27T14:12:25.109688887Z #18 exporting to image
2026-06-27T14:12:25.109694678Z #18 exporting layers
2026-06-27T14:12:25.241842677Z #18 exporting layers 0.3s done
2026-06-27T14:12:25.414391181Z #18 pushing layers
2026-06-27T14:12:27.778031283Z #18 pushing layers 2.5s done
2026-06-27T14:12:27.917416782Z #18 DONE 3.0s
2026-06-27T14:12:27.917435592Z 
2026-06-27T14:12:27.917440773Z #19 exporting cache to registry
2026-06-27T14:12:27.917445542Z #19 preparing build cache for export
2026-06-27T14:12:28.835850927Z #19 sending cache export
2026-06-27T14:12:35.704349448Z #19 sending cache export 6.9s done
2026-06-27T14:12:35.704374509Z #19 DONE 10.4s
2026-06-27T14:12:35.746616921Z ------
2026-06-27T14:12:35.746639282Z  > importing cache manifest
2026-06-27T14:12:35.746644072Z ------
2026-06-27T14:12:39.3403619Z ==> Deploying...
2026-06-27T14:12:39.418285245Z ==> Setting WEB_CONCURRENCY=1 by default, based on available CPUs in the instance
2026-06-27T14:12:46.11219391Z .env file not found, using system environment variables.
2026-06-27T14:13:01.313933308Z 
2026-06-27T14:13:01.313966011Z   .   ____          _            __ _ _
2026-06-27T14:13:01.313969901Z  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
2026-06-27T14:13:01.313972781Z ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2026-06-27T14:13:01.313975301Z  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
2026-06-27T14:13:01.313977712Z   '  |____| .__|_| |_|_| |_\__, | / / / /
2026-06-27T14:13:01.313979992Z  =========|_|==============|___/=/_/_/_/
2026-06-27T14:13:01.313982252Z 
2026-06-27T14:13:01.314897235Z  :: Spring Boot ::                (v3.4.1)
2026-06-27T14:13:01.314909596Z 
2026-06-27T14:13:02.61112039Z 2026-06-27T14:13:02.512Z  INFO 1 --- [sudarshana-server] [           main] c.s.server.SudarshanaApplication         : Starting SudarshanaApplication v0.0.1-SNAPSHOT using Java 17.0.19 with PID 1 (/app/app.jar started by root in /app)
2026-06-27T14:13:02.612821576Z 2026-06-27T14:13:02.612Z  INFO 1 --- [sudarshana-server] [           main] c.s.server.SudarshanaApplication         : The following 1 profile is active: "postgres"
2026-06-27T14:13:42.216044899Z 	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:194) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:42.216046929Z 	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:171) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:42.21604885Z 	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1431) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:42.2160508Z 	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1502) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:42.21605285Z 	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:66) ~[spring-orm-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.21605479Z 	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:390) ~[spring-orm-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.21605675Z 	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:419) ~[spring-orm-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216067741Z 	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:400) ~[spring-orm-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216070761Z 	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:366) ~[spring-orm-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216074012Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1855) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216077112Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1804) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216080222Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:601) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216083612Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:523) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216086813Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:336) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216089833Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:289) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216098183Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:334) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216101824Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216104594Z 	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:365) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216106574Z 	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:135) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216108494Z 	at org.springframework.beans.factory.support.ConstructorResolver.resolveConstructorArguments(ConstructorResolver.java:691) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216110504Z 	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:513) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216112455Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1357) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216114415Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1187) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216116325Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:563) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216118225Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:523) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216120145Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:336) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216122045Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:289) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216123985Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:334) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216126006Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216127906Z 	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:365) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216129816Z 	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:135) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216131756Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1707) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216143667Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1456) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216145957Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:600) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216147907Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:523) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216153128Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:336) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216155098Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:289) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216157018Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:334) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216159568Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216162888Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1573) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216166229Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1519) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216169289Z 	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:913) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216172619Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216175709Z 	at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:240) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.21617883Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1377) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.21618172Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1214) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.2161845Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:563) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216187141Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:523) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216189861Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:336) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216192931Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:289) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216196081Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:334) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216198451Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:204) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.216200411Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.getOrderedBeansOfType(ServletContextInitializerBeans.java:211) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216202392Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addAsRegistrationBean(ServletContextInitializerBeans.java:174) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216204372Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addAsRegistrationBean(ServletContextInitializerBeans.java:169) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216206372Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addAdaptableBeans(ServletContextInitializerBeans.java:154) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216211743Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.<init>(ServletContextInitializerBeans.java:87) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216219523Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.getServletContextInitializerBeans(ServletWebServerApplicationContext.java:266) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216221583Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.selfInitialize(ServletWebServerApplicationContext.java:240) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216223553Z 	at org.springframework.boot.web.embedded.tomcat.TomcatStarter.onStartup(TomcatStarter.java:52) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216225533Z 	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:4426) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216227544Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216229524Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1203) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216231444Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1193) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216234034Z 	at java.base/java.util.concurrent.FutureTask.run(Unknown Source) ~[na:na]
2026-06-27T14:13:42.216235984Z 	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216238274Z 	at java.base/java.util.concurrent.AbstractExecutorService.submit(Unknown Source) ~[na:na]
2026-06-27T14:13:42.216240195Z 	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:749) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216242105Z 	at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:772) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216244035Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216245995Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1203) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216248295Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1193) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216251396Z 	at java.base/java.util.concurrent.FutureTask.run(Unknown Source) ~[na:na]
2026-06-27T14:13:42.216254676Z 	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216257856Z 	at java.base/java.util.concurrent.AbstractExecutorService.submit(Unknown Source) ~[na:na]
2026-06-27T14:13:42.216261006Z 	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:749) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216264147Z 	at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:203) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216267217Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216270327Z 	at org.apache.catalina.core.StandardService.startInternal(StandardService.java:415) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216273077Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216276017Z 	at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:870) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216283048Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216285078Z 	at org.apache.catalina.startup.Tomcat.start(Tomcat.java:437) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:42.216287098Z 	at org.springframework.boot.web.embedded.tomcat.TomcatWebServer.initialize(TomcatWebServer.java:128) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216289039Z 	at org.springframework.boot.web.embedded.tomcat.TomcatWebServer.<init>(TomcatWebServer.java:107) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216291049Z 	at org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory.getTomcatWebServer(TomcatServletWebServerFactory.java:516) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216293069Z 	at org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory.getWebServer(TomcatServletWebServerFactory.java:222) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216295009Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.createWebServer(ServletWebServerApplicationContext.java:188) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216296959Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:162) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.21630931Z 	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:621) ~[spring-context-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:42.21631144Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.21631338Z 	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216315311Z 	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216317341Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216321691Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216323811Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:42.216330752Z 	at com.sudarshana.server.SudarshanaApplication.main(SudarshanaApplication.java:18) ~[!/:0.0.1-SNAPSHOT]
2026-06-27T14:13:42.216332822Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
2026-06-27T14:13:42.216334762Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source) ~[na:na]
2026-06-27T14:13:42.216337482Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source) ~[na:na]
2026-06-27T14:13:42.216340773Z 	at java.base/java.lang.reflect.Method.invoke(Unknown Source) ~[na:na]
2026-06-27T14:13:42.216344253Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102) ~[app.jar:0.0.1-SNAPSHOT]
2026-06-27T14:13:42.216347683Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64) ~[app.jar:0.0.1-SNAPSHOT]
2026-06-27T14:13:42.216351063Z 	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40) ~[app.jar:0.0.1-SNAPSHOT]
2026-06-27T14:13:42.216354244Z 
2026-06-27T14:13:42.216358314Z 2026-06-27T14:13:42.214Z ERROR 1 --- [sudarshana-server] [           main] j.LocalContainerEntityManagerFactoryBean : Failed to initialize JPA EntityManagerFactory: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
2026-06-27T14:13:42.216383506Z 2026-06-27T14:13:42.215Z ERROR 1 --- [sudarshana-server] [           main] o.s.b.web.embedded.tomcat.TomcatStarter  : Error starting Tomcat context. Exception: org.springframework.beans.factory.UnsatisfiedDependencyException. Message: Error creating bean with name 'jwtAuthenticationFilter' defined in URL [jar:nested:/app/app.jar/!BOOT-INF/classes/!/com/sudarshana/server/config/JwtAuthenticationFilter.class]: Unsatisfied dependency expressed through constructor parameter 1: Error creating bean with name 'userRepository' defined in com.sudarshana.server.repository.UserRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Cannot resolve reference to bean 'jpaSharedEM_entityManagerFactory' while setting bean property 'entityManager'
2026-06-27T14:13:42.712837721Z 2026-06-27T14:13:42.712Z  WARN 1 --- [sudarshana-server] [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.context.ApplicationContextException: Unable to start web server
2026-06-27T14:13:43.114658325Z 2026-06-27T14:13:43.112Z ERROR 1 --- [sudarshana-server] [           main] o.s.boot.SpringApplication               : Application run failed
2026-06-27T14:13:43.114692138Z 
2026-06-27T14:13:43.114696738Z org.springframework.context.ApplicationContextException: Unable to start web server
2026-06-27T14:13:43.114700539Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:165) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114703879Z 	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:621) ~[spring-context-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.114706329Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114709979Z 	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.11471284Z 	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.11471608Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.11471847Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.11472084Z 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114723211Z 	at com.sudarshana.server.SudarshanaApplication.main(SudarshanaApplication.java:18) ~[!/:0.0.1-SNAPSHOT]
2026-06-27T14:13:43.114725761Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
2026-06-27T14:13:43.114728201Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source) ~[na:na]
2026-06-27T14:13:43.114730651Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source) ~[na:na]
2026-06-27T14:13:43.114734361Z 	at java.base/java.lang.reflect.Method.invoke(Unknown Source) ~[na:na]
2026-06-27T14:13:43.114737212Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102) ~[app.jar:0.0.1-SNAPSHOT]
2026-06-27T14:13:43.114739622Z 	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64) ~[app.jar:0.0.1-SNAPSHOT]
2026-06-27T14:13:43.114742042Z 	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40) ~[app.jar:0.0.1-SNAPSHOT]
2026-06-27T14:13:43.114759813Z Caused by: org.springframework.boot.web.server.WebServerException: Unable to start embedded Tomcat
2026-06-27T14:13:43.114762704Z 	at org.springframework.boot.web.embedded.tomcat.TomcatWebServer.initialize(TomcatWebServer.java:147) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114765184Z 	at org.springframework.boot.web.embedded.tomcat.TomcatWebServer.<init>(TomcatWebServer.java:107) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114767664Z 	at org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory.getTomcatWebServer(TomcatServletWebServerFactory.java:516) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114770314Z 	at org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory.getWebServer(TomcatServletWebServerFactory.java:222) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114773735Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.createWebServer(ServletWebServerApplicationContext.java:188) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114776125Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:162) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114779305Z 	... 15 common frames omitted
2026-06-27T14:13:43.114784615Z Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'jwtAuthenticationFilter' defined in URL [jar:nested:/app/app.jar/!BOOT-INF/classes/!/com/sudarshana/server/config/JwtAuthenticationFilter.class]: Unsatisfied dependency expressed through constructor parameter 1: Error creating bean with name 'userRepository' defined in com.sudarshana.server.repository.UserRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Cannot resolve reference to bean 'jpaSharedEM_entityManagerFactory' while setting bean property 'entityManager'
2026-06-27T14:13:43.114787245Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:804) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.114789796Z 	at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:240) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.114804147Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1377) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.114806897Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1214) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.114809377Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:563) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.114811778Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:523) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.114814258Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:336) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.114816698Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:289) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.114819118Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:334) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.114821578Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:204) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.114831609Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.getOrderedBeansOfType(ServletContextInitializerBeans.java:211) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.11483648Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addAsRegistrationBean(ServletContextInitializerBeans.java:174) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114863982Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addAsRegistrationBean(ServletContextInitializerBeans.java:169) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114874743Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addAdaptableBeans(ServletContextInitializerBeans.java:154) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114878933Z 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.<init>(ServletContextInitializerBeans.java:87) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114882953Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.getServletContextInitializerBeans(ServletWebServerApplicationContext.java:266) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114885493Z 	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.selfInitialize(ServletWebServerApplicationContext.java:240) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114888554Z 	at org.springframework.boot.web.embedded.tomcat.TomcatStarter.onStartup(TomcatStarter.java:52) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114891044Z 	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:4426) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.114894284Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.114896834Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1203) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.114899254Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1193) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.114902085Z 	at java.base/java.util.concurrent.FutureTask.run(Unknown Source) ~[na:na]
2026-06-27T14:13:43.114904765Z 	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.114907305Z 	at java.base/java.util.concurrent.AbstractExecutorService.submit(Unknown Source) ~[na:na]
2026-06-27T14:13:43.114909745Z 	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:749) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.114912126Z 	at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:772) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.114914646Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.114917006Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1203) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.114919426Z 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1193) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.114921856Z 	at java.base/java.util.concurrent.FutureTask.run(Unknown Source) ~[na:na]
2026-06-27T14:13:43.114935447Z 	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.114939988Z 	at java.base/java.util.concurrent.AbstractExecutorService.submit(Unknown Source) ~[na:na]
2026-06-27T14:13:43.114944128Z 	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:749) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.114956489Z 	at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:203) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.114960619Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.11496423Z 	at org.apache.catalina.core.StandardService.startInternal(StandardService.java:415) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.11496823Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.11497201Z 	at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:870) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.11497464Z 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.114977111Z 	at org.apache.catalina.startup.Tomcat.start(Tomcat.java:437) ~[tomcat-embed-core-10.1.34.jar!/:na]
2026-06-27T14:13:43.114979621Z 	at org.springframework.boot.web.embedded.tomcat.TomcatWebServer.initialize(TomcatWebServer.java:128) ~[spring-boot-3.4.1.jar!/:3.4.1]
2026-06-27T14:13:43.114982091Z 	... 20 common frames omitted
2026-06-27T14:13:43.114985351Z Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'userRepository' defined in com.sudarshana.server.repository.UserRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Cannot resolve reference to bean 'jpaSharedEM_entityManagerFactory' while setting bean property 'entityManager'
2026-06-27T14:13:43.114987872Z 	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:377) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.114990282Z 	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:135) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.114992882Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1707) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.114995272Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1456) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.114997722Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:600) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115000173Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:523) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115002693Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:336) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115005143Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:289) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115007693Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:334) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115010073Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115012443Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1573) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115014834Z 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1519) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115021844Z 	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:913) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115027245Z 	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115031585Z 	... 61 common frames omitted
2026-06-27T14:13:43.115046016Z Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'jpaSharedEM_entityManagerFactory': Cannot resolve reference to bean 'entityManagerFactory' while setting constructor argument
2026-06-27T14:13:43.115050406Z 	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:377) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115054227Z 	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:135) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115058507Z 	at org.springframework.beans.factory.support.ConstructorResolver.resolveConstructorArguments(ConstructorResolver.java:691) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115062507Z 	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:513) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115066458Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1357) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115070508Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1187) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115073038Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:563) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115075599Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:523) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115078019Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:336) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115080389Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:289) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115082959Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:334) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115085449Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115087849Z 	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:365) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.11509021Z 	... 74 common frames omitted
2026-06-27T14:13:43.11509501Z Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
2026-06-27T14:13:43.115103061Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1808) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115105571Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:601) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115108041Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:523) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115110501Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:336) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115112971Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:289) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115115372Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:334) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115117762Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115128483Z 	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:365) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115132513Z 	... 86 common frames omitted
2026-06-27T14:13:43.115137553Z Caused by: org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
2026-06-27T14:13:43.115141894Z 	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:276) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.115149004Z 	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:238) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.115153055Z 	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:215) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.115156865Z 	at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.115160435Z 	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:226) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.115163615Z 	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:194) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.115166936Z 	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:171) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.115170036Z 	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1431) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.115171986Z 	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1502) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.115174126Z 	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:66) ~[spring-orm-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115176136Z 	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:390) ~[spring-orm-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115182367Z 	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:419) ~[spring-orm-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115184687Z 	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:400) ~[spring-orm-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115186607Z 	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:366) ~[spring-orm-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115188577Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1855) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115190528Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1804) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T14:13:43.115192448Z 	... 93 common frames omitted
2026-06-27T14:13:43.115196488Z Caused by: org.hibernate.HibernateException: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
2026-06-27T14:13:43.115198438Z 	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.determineDialect(DialectFactoryImpl.java:191) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.115200369Z 	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.buildDialect(DialectFactoryImpl.java:87) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.115202279Z 	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentWithDefaults(JdbcEnvironmentInitiator.java:181) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.11521542Z 	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:392) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.11521908Z 	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:129) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.11522114Z 	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:81) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.11522318Z 	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:130) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.115225131Z 	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T14:13:43.115227291Z 	... 108 common frames omitted
2026-06-27T14:13:43.115229871Z 
2026-06-27T14:13:45.725815377Z .env file not found, using system environment variables.