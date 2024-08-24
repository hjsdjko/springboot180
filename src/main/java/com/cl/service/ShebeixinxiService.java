package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShebeixinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShebeixinxiView;


/**
 * 设备信息
 *
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
public interface ShebeixinxiService extends IService<ShebeixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeixinxiView> selectListView(Wrapper<ShebeixinxiEntity> wrapper);
   	
   	ShebeixinxiView selectView(@Param("ew") Wrapper<ShebeixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeixinxiEntity> wrapper);
   	

}

