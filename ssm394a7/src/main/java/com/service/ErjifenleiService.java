package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ErjifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ErjifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ErjifenleiView;


/**
 * 二级分类
 *
 * @author 
 * @email 
 * @date 2021-03-23 23:49:23
 */
public interface ErjifenleiService extends IService<ErjifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ErjifenleiVO> selectListVO(Wrapper<ErjifenleiEntity> wrapper);
   	
   	ErjifenleiVO selectVO(@Param("ew") Wrapper<ErjifenleiEntity> wrapper);
   	
   	List<ErjifenleiView> selectListView(Wrapper<ErjifenleiEntity> wrapper);
   	
   	ErjifenleiView selectView(@Param("ew") Wrapper<ErjifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ErjifenleiEntity> wrapper);
   	
}

