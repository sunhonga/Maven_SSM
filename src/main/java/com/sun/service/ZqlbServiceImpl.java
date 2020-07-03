package com.sun.service;

import com.sun.mapper.ZqlbMapper;
import com.sun.pojo.Zqlb;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Priority;
import javax.annotation.Resource;
import java.util.List;
/**
 * 2019-1-12
 * 创建人 SunHong
 */
@Service
public class ZqlbServiceImpl implements ZqlbService, InitializingBean, BeanNameAware, ApplicationContextAware , BeanFactoryAware {

	@Autowired
	//@Qualifier("zsunHongImpl1")			//一个接口有多个实现的时候,先判断实现类上是否有@Primary注解,有就进行注入,如果存在多个@Primary就报错.
	ZsunHong zsunHong;						//在判断实现类上是否有@Priority注解,去其属性值value最小的进行注入。
											//或者加@Qualifier并指定类名,@Qualifier("zsunHongImpl1")
											//或者@Resource注解,指定类名
											//@Autowired获得的bean是单例对象,如果要获得原型对象如何获取???


	@Autowired
	ZqlbMapper zqlbMapper;


	@Autowired
	AutowiredImpl autowiredImpl;

	@Resource
	ResourceImpl resourceImpl;

	private String name;


	@Autowired
	ApplicationContext applicationContext;


	@Override
	public List<Zqlb> selectZqlbById(Integer id) {
//		List<Zqlb> list = new ArrayList<>();
//		Zqlb zqlb = new Zqlb();
//		zqlb.setId(21);
//		list.add(zqlb);
		return zqlbMapper.selectZqlbById(id);
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println(StringUtils.tokenizeToStringArray("com.sun com.hong,com.sunhong;com.hongsun\t\nsfsfsf",
				ConfigurableApplicationContext.CONFIG_LOCATION_DELIMITERS).toString());
		applicationContext.getBean(X.class).init();
	}

	@Override
	public void setBeanName(String name) {
		this.name = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		((DefaultListableBeanFactory)beanFactory).registerSingleton("test",new Object());	//手动增加自己的bean
	}
}
