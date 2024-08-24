package com.cl.entity.view;

import com.cl.entity.ShenqingshebeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 申请设备
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
@TableName("shenqingshebei")
public class ShenqingshebeiView  extends ShenqingshebeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenqingshebeiView(){
	}
 
 	public ShenqingshebeiView(ShenqingshebeiEntity shenqingshebeiEntity){
 	try {
			BeanUtils.copyProperties(this, shenqingshebeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
