package com.java.zd.service.test;

import com.java.zd.model.EmpEntity;
import com.java.zd.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author djin
 *    EmpService 业务层测试类
 * @date 2020-04-11 09:51:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmpServiceTest{

    @Resource
    private EmpService empService;

    //测试分页查询
    @Test
    public void test01(){
        Map<String,Object> map = new HashMap<String, Object>();
		EmpEntity pramasEmp = new EmpEntity();
        try {
            map = empService.findListByPramas(1,3,pramasEmp);
            System.out.println("总共有"+map.get("count")+"数据");
            List<EmpEntity> emps = (List<EmpEntity>)map.get("data");
            for (EmpEntity emp:emps) {
                System.out.println(emp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
