package com.java.zd.model;

import java.io.Serializable;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author djin
 *    Dept实体类
 * @date 2020-04-11 09:51:25
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class DeptEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
      //部门主键id
	  private Integer deptno;
      //部门名称
	  private String dname;
      //部门地址
	  private String loc;

	  /**
	   * 设置：部门主键id
	   */
	  public void setDeptno(Integer deptno) {
		  this.deptno = deptno;
	  }
	  /**
	   * 获取：部门主键id
	   */
	  public Integer getDeptno() {
	   	  return deptno;
	  }
	  /**
	   * 设置：部门名称
	   */
	  public void setDname(String dname) {
		  this.dname = dname;
	  }
	  /**
	   * 获取：部门名称
	   */
	  public String getDname() {
	   	  return dname;
	  }
	  /**
	   * 设置：部门地址
	   */
	  public void setLoc(String loc) {
		  this.loc = loc;
	  }
	  /**
	   * 获取：部门地址
	   */
	  public String getLoc() {
	   	  return loc;
	  }

	 
	  @Override
	  public String toString() {
		  return  ReflectionToStringBuilder.toString(this);
	  }

}
