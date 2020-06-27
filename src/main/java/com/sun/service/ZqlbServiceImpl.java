package com.sun.service;

import com.sun.mapper.ZqlbMapper;
import com.sun.pojo.Zqlb;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class ZqlbServiceImpl implements ZqlbService, InitializingBean, BeanNameAware, ApplicationContextAware {

	@Autowired
	//@Qualifier("zsunHongImpl1")
	ZsunHong zsunHong;						//@Autowired获得的bean是单例对象,如果要获得原型对象如何获取???


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
}
