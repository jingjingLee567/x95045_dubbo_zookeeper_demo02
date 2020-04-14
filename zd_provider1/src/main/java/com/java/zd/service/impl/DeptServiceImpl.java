package com.java.zd.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.zd.model.DeptEntity;
import com.java.zd.service.DeptService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author djin
 *    Dept业务层实现类
 * @date 2020-04-11 09:51:25
 */
@Service(version = "1.0.0")
@Transactional
public class DeptServiceImpl extends BaseServiceImpl<DeptEntity> implements DeptService {
	
}
