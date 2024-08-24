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


import com.cl.dao.ShebeixinxiDao;
import com.cl.entity.ShebeixinxiEntity;
import com.cl.service.ShebeixinxiService;
import com.cl.entity.view.ShebeixinxiView;

@Service("shebeixinxiService")
public class ShebeixinxiServiceImpl extends ServiceImpl<ShebeixinxiDao, ShebeixinxiEntity> implements ShebeixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeixinxiEntity> page = this.selectPage(
                new Query<ShebeixinxiEntity>(params).getPage(),
                new EntityWrapper<ShebeixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeixinxiEntity> wrapper) {
		  Page<ShebeixinxiView> page =new Query<ShebeixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShebeixinxiView> selectListView(Wrapper<ShebeixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeixinxiView selectView(Wrapper<ShebeixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
