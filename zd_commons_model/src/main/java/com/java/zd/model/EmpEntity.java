package com.java.zd.model;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author djin
 *    Emp实体类
 * @date 2020-04-11 09:51:25
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class EmpEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
      //员工编号
	  private Integer empno;
      //员工姓名
	  private String ename;
      //工作
	  private String job;
      //上司编号
	  private Integer mgr;
      //入职时间
      @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss" ,timezone = "GMT+8")
	  private Date hiredate;
      //工资
	  private Double sal;
      //奖金
	  private Double comm;
      //部门编号
	  private Integer deptno;

	  /**
	   * 设置：员工编号
	   */
	  public void setEmpno(Integer empno) {
		  this.empno = empno;
	  }
	  /**
	   * 获取：员工编号
	   */
	  public Integer getEmpno() {
	   	  return empno;
	  }
	  /**
	   * 设置：员工姓名
	   */
	  public void setEname(String ename) {
		  this.ename = ename;
	  }
	  /**
	   * 获取：员工姓名
	   */
	  public String getEname() {
	   	  return ename;
	  }
	  /**
	   * 设置：工作
	   */
	  public void setJob(String job) {
		  this.job = job;
	  }
	  /**
	   * 获取：工作
	   */
	  public String getJob() {
	   	  return job;
	  }
	  /**
	   * 设置：上司编号
	   */
	  public void setMgr(Integer mgr) {
		  this.mgr = mgr;
	  }
	  /**
	   * 获取：上司编号
	   */
	  public Integer getMgr() {
	   	  return mgr;
	  }
	  /**
	   * 设置：入职时间
	   */
	  public void setHiredate(Date hiredate) {
		  this.hiredate = hiredate;
	  }
	  /**
	   * 获取：入职时间
	   */
	  public Date getHiredate() {
	   	  return hiredate;
	  }
	  /**
	   * 设置：工资
	   */
	  public void setSal(Double sal) {
		  this.sal = sal;
	  }
	  /**
	   * 获取：工资
	   */
	  public Double getSal() {
	   	  return sal;
	  }
	  /**
	   * 设置：奖金
	   */
	  public void setComm(Double comm) {
		  this.comm = comm;
	  }
	  /**
	   * 获取：奖金
	   */
	  public Double getComm() {
	   	  return comm;
	  }
	  /**
	   * 设置：部门编号
	   */
	  public void setDeptno(Integer deptno) {
		  this.deptno = deptno;
	  }
	  /**
	   * 获取：部门编号
	   */
	  public Integer getDeptno() {
	   	  return deptno;
	  }

	 
	  @Override
	  public String toString() {
		  return  ReflectionToStringBuilder.toString(this);
	  }

}
