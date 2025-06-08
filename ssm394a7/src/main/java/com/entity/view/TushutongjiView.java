package com.entity.view;

import com.entity.TushutongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 图书统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-23 23:49:23
 */
@TableName("tushutongji")
public class TushutongjiView  extends TushutongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TushutongjiView(){
	}
 
 	public TushutongjiView(TushutongjiEntity tushutongjiEntity){
 	try {
			BeanUtils.copyProperties(this, tushutongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
