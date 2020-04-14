package com.java.zd.service.test;

import com.java.zd.model.DeptEntity;
import com.java.zd.service.DeptService;
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
 *    DeptService 业务层测试类
 * @date 2020-04-11 09:51:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DeptServiceTest{

    @Resource
    private DeptService deptService;

    //测试分页查询
    @Test
    public void test01(){
        Map<String,Object> map = new HashMap<String, Object>();
		DeptEntity pramasDept = new DeptEntity();
        try {
            map = deptService.findListByPramas(1,3,pramasDept);
            System.out.println("总共有"+map.get("count")+"数据");
            List<DeptEntity> depts = (List<DeptEntity>)map.get("data");
            for (DeptEntity dept:depts) {
                System.out.println(dept);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
