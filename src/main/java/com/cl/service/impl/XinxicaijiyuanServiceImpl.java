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


import com.cl.dao.XinxicaijiyuanDao;
import com.cl.entity.XinxicaijiyuanEntity;
import com.cl.service.XinxicaijiyuanService;
import com.cl.entity.view.XinxicaijiyuanView;

@Service("xinxicaijiyuanService")
public class XinxicaijiyuanServiceImpl extends ServiceImpl<XinxicaijiyuanDao, XinxicaijiyuanEntity> implements XinxicaijiyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinxicaijiyuanEntity> page = this.selectPage(
                new Query<XinxicaijiyuanEntity>(params).getPage(),
                new EntityWrapper<XinxicaijiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinxicaijiyuanEntity> wrapper) {
		  Page<XinxicaijiyuanView> page =new Query<XinxicaijiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XinxicaijiyuanView> selectListView(Wrapper<XinxicaijiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinxicaijiyuanView selectView(Wrapper<XinxicaijiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
