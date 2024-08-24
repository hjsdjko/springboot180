package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShebeileixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShebeileixingView;


/**
 * 设备类型
 *
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
public interface ShebeileixingService extends IService<ShebeileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeileixingView> selectListView(Wrapper<ShebeileixingEntity> wrapper);
   	
   	ShebeileixingView selectView(@Param("ew") Wrapper<ShebeileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeileixingEntity> wrapper);
   	

}

