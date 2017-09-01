package com.crm.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.entity.SysRight;
import com.crm.entity.SysRole;
import com.crm.service.IRightService;
import com.crm.service.IRoleService;



@Controller
@RequestMapping("/role")
public class RoleController {
	@Resource
	private IRoleService roleService;
	@Resource
	private IRightService rightService;
		
	@RequestMapping("find")
	public @ResponseBody List<SysRole> find(){
		
		
		List<SysRole> list=roleService.find();
		
		
		//System.out.println(list);
		
		return list;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("findRights")
	public @ResponseBody List findRights(HttpServletRequest request){
		
		List<SysRight> rightList=rightService.find();
		
		
//		Map<SysRight, List> map=new HashMap<SysRight, List>();
//		List<SysRight> parentList=new ArrayList();
//		 for(SysRight sysRight:rightList){
//			if(sysRight.getRightParentCode().equals("ROOT_MENU")){
//				parentList.add(sysRight);
//			}	
//			
//		}
//		 for(SysRight parenPrivilege:parentList){
//			 List sonList=new ArrayList();
//			
//			 for(int i=0;i<rightList.size();i++){
//				 SysRight privilege= (SysRight)rightList.get(i);
//				
//			    if(privilege.getRightParentCode().equals(parenPrivilege.getRightCode())){
//			    	sonList.add(privilege);
//			    }
//			 }
//			 map.put(parenPrivilege, sonList);
//		 }
//		
	System.out.println(rightList);
		//request.setAttribute("maplist", map);
		return rightList;
		
	}
	
	
	@RequestMapping("add")
	public String add(){
		
		
		
		
	return "index";
	}

}
