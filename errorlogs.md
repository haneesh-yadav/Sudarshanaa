2026-06-27T13:19:18.521070859Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:563) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.521073429Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:523) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.521076089Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:336) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.521078629Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:289) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.521081529Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:334) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.521084239Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.521086849Z 	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:365) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.521089639Z 	... 74 common frames omitted
2026-06-27T13:19:18.521093609Z Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
2026-06-27T13:19:18.521096259Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1808) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.52111367Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:601) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.52111641Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:523) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.52111923Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:336) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.52112197Z 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:289) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.52112474Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:334) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.52112758Z 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.52113656Z 	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:365) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.52113957Z 	... 86 common frames omitted
2026-06-27T13:19:18.52114299Z Caused by: org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
2026-06-27T13:19:18.52114561Z 	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:276) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521148381Z 	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:238) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.52115131Z 	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:215) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521154421Z 	at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521157281Z 	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:226) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521160011Z 	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:194) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521162631Z 	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:171) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521165381Z 	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1431) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521168041Z 	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1502) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521170761Z 	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:66) ~[spring-orm-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.521173451Z 	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:390) ~[spring-orm-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.521180481Z 	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:419) ~[spring-orm-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.521183201Z 	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:400) ~[spring-orm-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.521185821Z 	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:366) ~[spring-orm-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.521188551Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1855) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.521191221Z 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1804) ~[spring-beans-6.2.1.jar!/:6.2.1]
2026-06-27T13:19:18.521193842Z 	... 93 common frames omitted
2026-06-27T13:19:18.521197291Z Caused by: org.hibernate.HibernateException: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
2026-06-27T13:19:18.521199902Z 	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.determineDialect(DialectFactoryImpl.java:191) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521202622Z 	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.buildDialect(DialectFactoryImpl.java:87) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521208022Z 	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentWithDefaults(JdbcEnvironmentInitiator.java:181) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521222492Z 	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:392) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521225472Z 	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:129) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521228252Z 	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:81) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521230952Z 	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:130) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521233622Z 	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263) ~[hibernate-core-6.6.4.Final.jar!/:6.6.4.Final]
2026-06-27T13:19:18.521236412Z 	... 108 common frames omitted
2026-06-27T13:19:18.521239063Z 
2026-06-27T13:19:20.538344035Z ==> Exited with status 1
2026-06-27T13:19:20.54073678Z ==> Common ways to troubleshoot your deploy: https://render.com/docs/troubleshooting-deploys
2026-06-27T13:19:22.011026783Z .env file not found, using system environment variables.