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


import com.dao.ErjifenleiDao;
import com.entity.ErjifenleiEntity;
import com.service.ErjifenleiService;
import com.entity.vo.ErjifenleiVO;
import com.entity.view.ErjifenleiView;

@Service("erjifenleiService")
public class ErjifenleiServiceImpl extends ServiceImpl<ErjifenleiDao, ErjifenleiEntity> implements ErjifenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ErjifenleiEntity> page = this.selectPage(
                new Query<ErjifenleiEntity>(params).getPage(),
                new EntityWrapper<ErjifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ErjifenleiEntity> wrapper) {
		  Page<ErjifenleiView> page =new Query<ErjifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ErjifenleiVO> selectListVO(Wrapper<ErjifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ErjifenleiVO selectVO(Wrapper<ErjifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ErjifenleiView> selectListView(Wrapper<ErjifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ErjifenleiView selectView(Wrapper<ErjifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
