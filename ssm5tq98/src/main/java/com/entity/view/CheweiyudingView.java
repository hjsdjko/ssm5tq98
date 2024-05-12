package com.entity.view;

import com.entity.CheweiyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车位预定
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-20 23:09:01
 */
@TableName("cheweiyuding")
public class CheweiyudingView  extends CheweiyudingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheweiyudingView(){
	}
 
 	public CheweiyudingView(CheweiyudingEntity cheweiyudingEntity){
 	try {
			BeanUtils.copyProperties(this, cheweiyudingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
