package com.entity.model;

import com.entity.DingdanpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 订单评价
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-23 23:49:23
 */
public class DingdanpingjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图书名称
	 */
	
	private String tushumingcheng;
		
	/**
	 * 图书评价
	 */
	
	private String tushupingjia;
		
	/**
	 * 图书质量
	 */
	
	private String tushuzhiliang;
		
	/**
	 * 综合评分
	 */
	
	private String zonghepingfen;
		
	/**
	 * 评语
	 */
	
	private String pingyu;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：图书名称
	 */
	 
	public void setTushumingcheng(String tushumingcheng) {
		this.tushumingcheng = tushumingcheng;
	}
	
	/**
	 * 获取：图书名称
	 */
	public String getTushumingcheng() {
		return tushumingcheng;
	}
				
	
	/**
	 * 设置：图书评价
	 */
	 
	public void setTushupingjia(String tushupingjia) {
		this.tushupingjia = tushupingjia;
	}
	
	/**
	 * 获取：图书评价
	 */
	public String getTushupingjia() {
		return tushupingjia;
	}
				
	
	/**
	 * 设置：图书质量
	 */
	 
	public void setTushuzhiliang(String tushuzhiliang) {
		this.tushuzhiliang = tushuzhiliang;
	}
	
	/**
	 * 获取：图书质量
	 */
	public String getTushuzhiliang() {
		return tushuzhiliang;
	}
				
	
	/**
	 * 设置：综合评分
	 */
	 
	public void setZonghepingfen(String zonghepingfen) {
		this.zonghepingfen = zonghepingfen;
	}
	
	/**
	 * 获取：综合评分
	 */
	public String getZonghepingfen() {
		return zonghepingfen;
	}
				
	
	/**
	 * 设置：评语
	 */
	 
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
