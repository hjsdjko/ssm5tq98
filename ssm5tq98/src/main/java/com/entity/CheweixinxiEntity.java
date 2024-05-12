package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 车位信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-20 23:09:01
 */
@TableName("cheweixinxi")
public class CheweixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CheweixinxiEntity() {
		
	}
	
	public CheweixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 车场名称
	 */
					
	private String chechangmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：车场名称
	 */
	public void setChechangmingcheng(String chechangmingcheng) {
		this.chechangmingcheng = chechangmingcheng;
	}
	/**
	 * 获取：车场名称
	 */
	public String getChechangmingcheng() {
		return chechangmingcheng;
	}
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
