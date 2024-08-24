package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YihurenyuanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YihurenyuanView;


/**
 * 医护人员
 *
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
public interface YihurenyuanService extends IService<YihurenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YihurenyuanView> selectListView(Wrapper<YihurenyuanEntity> wrapper);
   	
   	YihurenyuanView selectView(@Param("ew") Wrapper<YihurenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YihurenyuanEntity> wrapper);
   	

}

