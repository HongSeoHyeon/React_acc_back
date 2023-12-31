package kr.co.seoulit.account.operate.system.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import kr.co.seoulit.account.operate.system.to.CustomerBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import kr.co.seoulit.account.sys.common.util.BeanCreator;

import kr.co.seoulit.account.operate.system.service.SystemService;

import kr.co.seoulit.account.operate.system.to.BusinessBean;
import kr.co.seoulit.account.operate.system.to.DetailBusinessBean;
import kr.co.seoulit.account.operate.system.to.WorkplaceBean;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@CrossOrigin("*")
@RestController
@RequestMapping("/operate")
public class CustomerController {

	@Autowired
	private SystemService systemService;

	 ModelAndView mav;
	 ModelMap map = new ModelMap();

	// 업체리스트조회
	@GetMapping("/businesslist")
	public ArrayList<BusinessBean> findBusinessList() {

			ArrayList<BusinessBean>	businessList = systemService.findBusinessList();

		return businessList;

	}

	//거래처 조회
//	@GetMapping("/customers")
//	public HashMap<String , Object> getCustomerList(){
//		HashMap<String , Object> map = new HashMap<>();
//
//		map.put("accountCustomerList" , systemService.getCustomerList());
//
//		return map;
//	}

	//거래처 조회
	@GetMapping("/customers")
	public ArrayList<CustomerBean> getCustomerList(){
		ArrayList<CustomerBean> accountCustomerList = systemService.getCustomerList();
		System.out.println("메롱메롱");
		System.out.println("화났대요");
		return accountCustomerList;
	}

	//거래처 삭제
	@DeleteMapping("/deleteCustomers")
	public void removeCustomerList(@RequestParam String customerCode){
		System.out.println("컨트롤러 : " + customerCode);
		systemService.removeCustomer(customerCode);
	}

	//거래처 추가
	@PostMapping("/insertCustomers")
	public void registerCustomerList(@RequestBody CustomerBean customerBean){
		System.out.println("컨트롤러 : " + customerBean);
		systemService.registerCustomer(customerBean);
	}

	//거래처 수정
	@PutMapping("/updateCustomers")
	public void updateCustomerList(@RequestBody CustomerBean customerBean){
		System.out.println("컨트롤러 : " + customerBean);
		systemService.updateCustomer(customerBean);
	}

	@GetMapping("/creditCard")
	public HashMap<String, Object> getCreditCard(){
		HashMap<String ,Object> map = new HashMap<>();
		map.put("creditCardList" , systemService.getCreditCard());
		return map;
	}

	@GetMapping("/detailbusiness")
	public ArrayList<DetailBusinessBean> findDetailBusiness(@RequestParam String businessCode) {

			ArrayList<DetailBusinessBean> detailBusinessList = systemService.findDetailBusiness(businessCode);

	            return detailBusinessList;
	}

	@GetMapping("/registerworkplace")
	public void registerworkPlace(@RequestParam String workplaceAddItems) {

         JSONObject workplaceAddItemsAll = JSONObject.fromObject(workplaceAddItems);
         WorkplaceBean workplaceBean = BeanCreator.getInstance().create(workplaceAddItemsAll, WorkplaceBean.class);

         systemService.registerWorkplace(workplaceBean); //insert

 }
    @GetMapping("/workplaceremoval")
    public void removeWorkplace(@RequestParam String codes) {

    	ArrayList<String> getCodes=null;
     	getCodes=new ArrayList<>();

			JSONArray jsonArray=JSONArray.fromObject(codes);
			for(Object obj :jsonArray) {
				String code=(String)obj;
				getCodes.add(code);
			}

			systemService.removeWorkplace(getCodes); //delete

 }
    @PostMapping("/workplace")
	public WorkplaceBean findWorkplace(@RequestParam String workplaceCode) {

     WorkplaceBean  workplaceBean = new WorkplaceBean();

     workplaceBean = systemService.findWorkplace(workplaceCode);

     return workplaceBean;
 }

	@PostMapping("/allworkplacelist")
	public ArrayList<WorkplaceBean> findAllWorkplaceList() {

		ArrayList<WorkplaceBean> allWorkplaceList = new ArrayList<>();
		allWorkplaceList = systemService.findAllWorkplaceList();

		return allWorkplaceList;

	}

	@GetMapping("/approvalstatusmodification")
	public void modifyApprovalStatus(@RequestParam String status,
											 @RequestParam String codes	) {

		ArrayList<String> getCodes=new ArrayList<>();

			JSONArray jsonArray=JSONArray.fromObject(codes);
			for(Object obj :jsonArray) {
				String code=(String)obj;
				getCodes.add(code);
			}

			systemService.modifyApprovalStatus(getCodes,status);

	}


}
