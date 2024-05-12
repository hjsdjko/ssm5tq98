package com.entity.vo;

import com.entity.CheweiyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 车位预定
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-20 23:09:01
 */
public class CheweiyudingVO  implements Serializable {
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
	 * 小时费用
	 */
	
	private Float xiaoshifeiyong;
		
	/**
	 * 预定时长
	 */
	
	private Integer yudingshizhang;
		
	/**
	 * 合计
	 */
	
	private Float heji;
		
	/**
	 * 停车时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tingcheshijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 车位图片
	 */
	
	private String cheweitupian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：预定时长
	 */
	 
	public void setYudingshizhang(Integer yudingshizhang) {
		this.yudingshizhang = yudingshizhang;
	}
	
	/**
	 * 获取：预定时长
	 */
	public Integer getYudingshizhang() {
		return yudingshizhang;
	}
				
	
	/**
	 * 设置：合计
	 */
	 
	public void setHeji(Float heji) {
		this.heji = heji;
	}
	
	/**
	 * 获取：合计
	 */
	public Float getHeji() {
		return heji;
	}
				
	
	/**
	 * 设置：停车时间
	 */
	 
	public void setTingcheshijian(Date tingcheshijian) {
		this.tingcheshijian = tingcheshijian;
	}
	
	/**
	 * 获取：停车时间
	 */
	public Date getTingcheshijian() {
		return tingcheshijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：车牌号
	 */
	 
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
