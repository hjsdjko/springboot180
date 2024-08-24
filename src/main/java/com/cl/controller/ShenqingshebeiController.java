package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ShenqingshebeiEntity;
import com.cl.entity.view.ShenqingshebeiView;

import com.cl.service.ShenqingshebeiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 申请设备
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
@RestController
@RequestMapping("/shenqingshebei")
public class ShenqingshebeiController {
    @Autowired
    private ShenqingshebeiService shenqingshebeiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShenqingshebeiEntity shenqingshebei,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yihurenyuan")) {
			shenqingshebei.setRenyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("cangkuguanliyuan")) {
			shenqingshebei.setCangguanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenqingshebeiEntity> ew = new EntityWrapper<ShenqingshebeiEntity>();

		PageUtils page = shenqingshebeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenqingshebei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShenqingshebeiEntity shenqingshebei, 
		HttpServletRequest request){
        EntityWrapper<ShenqingshebeiEntity> ew = new EntityWrapper<ShenqingshebeiEntity>();

		PageUtils page = shenqingshebeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenqingshebei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShenqingshebeiEntity shenqingshebei){
       	EntityWrapper<ShenqingshebeiEntity> ew = new EntityWrapper<ShenqingshebeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shenqingshebei, "shenqingshebei")); 
        return R.ok().put("data", shenqingshebeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShenqingshebeiEntity shenqingshebei){
        EntityWrapper< ShenqingshebeiEntity> ew = new EntityWrapper< ShenqingshebeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shenqingshebei, "shenqingshebei")); 
		ShenqingshebeiView shenqingshebeiView =  shenqingshebeiService.selectView(ew);
		return R.ok("查询申请设备成功").put("data", shenqingshebeiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShenqingshebeiEntity shenqingshebei = shenqingshebeiService.selectById(id);
		shenqingshebei = shenqingshebeiService.selectView(new EntityWrapper<ShenqingshebeiEntity>().eq("id", id));
        return R.ok().put("data", shenqingshebei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShenqingshebeiEntity shenqingshebei = shenqingshebeiService.selectById(id);
		shenqingshebei = shenqingshebeiService.selectView(new EntityWrapper<ShenqingshebeiEntity>().eq("id", id));
        return R.ok().put("data", shenqingshebei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShenqingshebeiEntity shenqingshebei, HttpServletRequest request){
    	shenqingshebei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenqingshebei);
        shenqingshebeiService.insert(shenqingshebei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShenqingshebeiEntity shenqingshebei, HttpServletRequest request){
    	shenqingshebei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenqingshebei);
        shenqingshebeiService.insert(shenqingshebei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShenqingshebeiEntity shenqingshebei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shenqingshebei);
        shenqingshebeiService.updateById(shenqingshebei);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<ShenqingshebeiEntity> list = new ArrayList<ShenqingshebeiEntity>();
        for(Long id : ids) {
            ShenqingshebeiEntity shenqingshebei = shenqingshebeiService.selectById(id);
            shenqingshebei.setSfsh(sfsh);
            shenqingshebei.setShhf(shhf);
            list.add(shenqingshebei);
        }
        shenqingshebeiService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shenqingshebeiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
