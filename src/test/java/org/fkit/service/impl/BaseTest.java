package org.fkit.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations = {"classpath:WEB-INF/springmvc-config.xml","classpath:WEB-INF/applicationContext.xml"})    
public class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {


}
