package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.YihurenyuanDao;
import com.cl.entity.YihurenyuanEntity;
import com.cl.service.YihurenyuanService;
import com.cl.entity.view.YihurenyuanView;

@Service("yihurenyuanService")
public class YihurenyuanServiceImpl extends ServiceImpl<YihurenyuanDao, YihurenyuanEntity> implements YihurenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YihurenyuanEntity> page = this.selectPage(
                new Query<YihurenyuanEntity>(params).getPage(),
                new EntityWrapper<YihurenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YihurenyuanEntity> wrapper) {
		  Page<YihurenyuanView> page =new Query<YihurenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YihurenyuanView> selectListView(Wrapper<YihurenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YihurenyuanView selectView(Wrapper<YihurenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
