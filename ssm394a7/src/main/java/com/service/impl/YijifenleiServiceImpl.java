package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YijifenleiDao;
import com.entity.YijifenleiEntity;
import com.service.YijifenleiService;
import com.entity.vo.YijifenleiVO;
import com.entity.view.YijifenleiView;

@Service("yijifenleiService")
public class YijifenleiServiceImpl extends ServiceImpl<YijifenleiDao, YijifenleiEntity> implements YijifenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YijifenleiEntity> page = this.selectPage(
                new Query<YijifenleiEntity>(params).getPage(),
                new EntityWrapper<YijifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YijifenleiEntity> wrapper) {
		  Page<YijifenleiView> page =new Query<YijifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YijifenleiVO> selectListVO(Wrapper<YijifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YijifenleiVO selectVO(Wrapper<YijifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YijifenleiView> selectListView(Wrapper<YijifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YijifenleiView selectView(Wrapper<YijifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
