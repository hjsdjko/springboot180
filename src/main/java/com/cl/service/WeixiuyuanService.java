package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.WeixiuyuanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WeixiuyuanView;


/**
 * 维修员
 *
 * @author 
 * @email 
 * @date 2024-02-20 10:49:43
 */
public interface WeixiuyuanService extends IService<WeixiuyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiuyuanView> selectListView(Wrapper<WeixiuyuanEntity> wrapper);
   	
   	WeixiuyuanView selectView(@Param("ew") Wrapper<WeixiuyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiuyuanEntity> wrapper);
   	

}

