package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YijifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YijifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YijifenleiView;


/**
 * 一级分类
 *
 * @author 
 * @email 
 * @date 2021-03-23 23:49:23
 */
public interface YijifenleiService extends IService<YijifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YijifenleiVO> selectListVO(Wrapper<YijifenleiEntity> wrapper);
   	
   	YijifenleiVO selectVO(@Param("ew") Wrapper<YijifenleiEntity> wrapper);
   	
   	List<YijifenleiView> selectListView(Wrapper<YijifenleiEntity> wrapper);
   	
   	YijifenleiView selectView(@Param("ew") Wrapper<YijifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YijifenleiEntity> wrapper);
   	
}

