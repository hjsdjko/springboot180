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

import com.cl.entity.ShebeichukuEntity;
import com.cl.entity.view.ShebeichukuView;

import com.cl.service.ShebeichukuService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 设备出库
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
@RestController
@RequestMapping("/shebeichuku")
public class ShebeichukuController {
    @Autowired
    private ShebeichukuService shebeichukuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShebeichukuEntity shebeichuku,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("cangkuguanliyuan")) {
			shebeichuku.setCangguanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShebeichukuEntity> ew = new EntityWrapper<ShebeichukuEntity>();

		PageUtils page = shebeichukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeichuku), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShebeichukuEntity shebeichuku, 
		HttpServletRequest request){
        EntityWrapper<ShebeichukuEntity> ew = new EntityWrapper<ShebeichukuEntity>();

		PageUtils page = shebeichukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeichuku), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShebeichukuEntity shebeichuku){
       	EntityWrapper<ShebeichukuEntity> ew = new EntityWrapper<ShebeichukuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shebeichuku, "shebeichuku")); 
        return R.ok().put("data", shebeichukuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShebeichukuEntity shebeichuku){
        EntityWrapper< ShebeichukuEntity> ew = new EntityWrapper< ShebeichukuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shebeichuku, "shebeichuku")); 
		ShebeichukuView shebeichukuView =  shebeichukuService.selectView(ew);
		return R.ok("查询设备出库成功").put("data", shebeichukuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShebeichukuEntity shebeichuku = shebeichukuService.selectById(id);
		shebeichuku = shebeichukuService.selectView(new EntityWrapper<ShebeichukuEntity>().eq("id", id));
        return R.ok().put("data", shebeichuku);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShebeichukuEntity shebeichuku = shebeichukuService.selectById(id);
		shebeichuku = shebeichukuService.selectView(new EntityWrapper<ShebeichukuEntity>().eq("id", id));
        return R.ok().put("data", shebeichuku);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShebeichukuEntity shebeichuku, HttpServletRequest request){
    	shebeichuku.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shebeichuku);
        shebeichukuService.insert(shebeichuku);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShebeichukuEntity shebeichuku, HttpServletRequest request){
    	shebeichuku.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shebeichuku);
        shebeichukuService.insert(shebeichuku);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShebeichukuEntity shebeichuku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shebeichuku);
        shebeichukuService.updateById(shebeichuku);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shebeichukuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
