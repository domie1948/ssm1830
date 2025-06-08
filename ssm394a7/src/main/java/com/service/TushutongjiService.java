package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TushutongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TushutongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TushutongjiView;


/**
 * 图书统计
 *
 * @author 
 * @email 
 * @date 2021-03-23 23:49:23
 */
public interface TushutongjiService extends IService<TushutongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TushutongjiVO> selectListVO(Wrapper<TushutongjiEntity> wrapper);
   	
   	TushutongjiVO selectVO(@Param("ew") Wrapper<TushutongjiEntity> wrapper);
   	
   	List<TushutongjiView> selectListView(Wrapper<TushutongjiEntity> wrapper);
   	
   	TushutongjiView selectView(@Param("ew") Wrapper<TushutongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TushutongjiEntity> wrapper);
   	
}

