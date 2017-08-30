1. 日志系统，事务管理，安全模块
2. bean的生命周期：
new -> filling properties -> BeanNameAware.setBeanName() -> BeanFactoryAware.setBeanFactory() -> ApplicationContextAware.setApplicationContext() -> BeanPostProcessor.postProcessBeforeInitialization() -> initializingBean.afterPropertiesSet() -> diy.initMethod() -> BeanPostProcessor.postProcessAfterInitialization()
3. spring模块：
test: test
core: beans, core, context, expression, context-support
aop: aop, aspects
instrumentation: instrument, instrument tomcat
web: web, web-portlet, web-servlet, web-socket
dao: jdbc, transaction, orm, oxm, messaging, jms

