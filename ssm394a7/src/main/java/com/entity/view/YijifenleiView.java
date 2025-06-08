package com.entity.view;

import com.entity.YijifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 一级分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-23 23:49:23
 */
@TableName("yijifenlei")
public class YijifenleiView  extends YijifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YijifenleiView(){
	}
 
 	public YijifenleiView(YijifenleiEntity yijifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, yijifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
