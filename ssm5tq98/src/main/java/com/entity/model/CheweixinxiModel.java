package com.entity.model;

import com.entity.CheweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 车位信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-20 23:09:01
 */
public class CheweixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车场地址
	 */
	
	private String chechangdizhi;
		
	/**
	 * 车位编号
	 */
	
	private String cheweibianhao;
		
	/**
	 * 车位状态
	 */
	
	private String cheweizhuangtai;
		
	/**
	 * 小时费用
	 */
	
	private Float xiaoshifeiyong;
		
	/**
	 * 车位介绍
	 */
	
	private String cheweijieshao;
		
	/**
	 * 车位图片
	 */
	
	private String cheweitupian;
				
	
	/**
	 * 设置：车场地址
	 */
	 
	public void setChechangdizhi(String chechangdizhi) {
		this.chechangdizhi = chechangdizhi;
	}
	
	/**
	 * 获取：车场地址
	 */
	public String getChechangdizhi() {
		return chechangdizhi;
	}
				
	
	/**
	 * 设置：车位编号
	 */
	 
	public void setCheweibianhao(String cheweibianhao) {
		this.cheweibianhao = cheweibianhao;
	}
	
	/**
	 * 获取：车位编号
	 */
	public String getCheweibianhao() {
		return cheweibianhao;
	}
				
	
	/**
	 * 设置：车位状态
	 */
	 
	public void setCheweizhuangtai(String cheweizhuangtai) {
		this.cheweizhuangtai = cheweizhuangtai;
	}
	
	/**
	 * 获取：车位状态
	 */
	public String getCheweizhuangtai() {
		return cheweizhuangtai;
	}
				
	
	/**
	 * 设置：小时费用
	 */
	 
	public void setXiaoshifeiyong(Float xiaoshifeiyong) {
		this.xiaoshifeiyong = xiaoshifeiyong;
	}
	
	/**
	 * 获取：小时费用
	 */
	public Float getXiaoshifeiyong() {
		return xiaoshifeiyong;
	}
				
	
	/**
	 * 设置：车位介绍
	 */
	 
	public void setCheweijieshao(String cheweijieshao) {
		this.cheweijieshao = cheweijieshao;
	}
	
	/**
	 * 获取：车位介绍
	 */
	public String getCheweijieshao() {
		return cheweijieshao;
	}
				
	
	/**
	 * 设置：车位图片
	 */
	 
	public void setCheweitupian(String cheweitupian) {
		this.cheweitupian = cheweitupian;
	}
	
	/**
	 * 获取：车位图片
	 */
	public String getCheweitupian() {
		return cheweitupian;
	}
			
}
