package kr.co.seoulit.account.budget.formulation.controller;


import java.util.ArrayList;
import java.util.HashMap;

import kr.co.seoulit.account.budget.formulation.entity.BudgetEntityPK;
import kr.co.seoulit.account.budget.formulation.to.BudgetDTO;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import kr.co.seoulit.account.sys.common.util.BeanCreator;
import kr.co.seoulit.account.budget.formulation.service.FormulationService;
import kr.co.seoulit.account.budget.formulation.to.BudgetBean;
import kr.co.seoulit.account.budget.formulation.entity.BudgetEntity;
import kr.co.seoulit.account.budget.formulation.service.JpaBudgetService;


@CrossOrigin("*")
@RestController
@RequestMapping("/budget")
public class FormulationController {

    @Autowired
    private FormulationService formulationService;

    @Autowired
    private JpaBudgetService jpaBudgetService;

    ModelMap map = null;
    BeanCreator beanCreator = BeanCreator.getInstance();

    /**
     * 예산조회
     * @param accountInnerCode: 계정과목
     * @param accountPeriodNo: 회계기간
     * @param budgetingCode: 1:신청 2:편성 3:조정 4:대비 5:실적 6:초과
     * @param deptCode: 부서코드
     * @param workplaceCode: 작업장
     * */
    @GetMapping("/budgetList")
    public ResponseEntity<HashMap<String ,ArrayList<BudgetDTO>>> findBudget(@RequestParam String accountInnerCode,
                                                                               @RequestParam String accountPeriodNo,
                                                                               @RequestParam String budgetingCode,
                                                                               @RequestParam String deptCode,
                                                                               @RequestParam String workplaceCode) {

        BudgetEntityPK budgetEntityPK = new BudgetEntityPK();
        budgetEntityPK.setAccountInnerCode(accountInnerCode);
        budgetEntityPK.setAccountPeriodNo(accountPeriodNo);
        budgetEntityPK.setBudgetingCode(budgetingCode);
        budgetEntityPK.setDeptCode(deptCode);
        budgetEntityPK.setWorkplaceCode(workplaceCode);

        ArrayList<BudgetDTO> budgetList = jpaBudgetService.findBudget(budgetEntityPK);
        HashMap<String , ArrayList<BudgetDTO>> map =new HashMap<>();

        if(budgetList.isEmpty()){
            return ResponseEntity.status(400).body(null);
        } else {
            map.put("budgetList" , budgetList);
            return ResponseEntity.ok(map);
        }
    }

    /**
     * 예산신청(저장)
     * */
    @PostMapping("/budgetlist")
    public ResponseEntity<Object> registerBudget(@RequestBody BudgetEntity budgetEntity){
        jpaBudgetService.save(budgetEntity);
        return ResponseEntity.ok().build();
    }

    /**
     * 예산조정(수정)*/
    @PutMapping("/budgetlist")
    public ModelMap modifyBudget(@RequestParam(value = "budgetObj") String budgetObj) {
        JSONObject budgetJsonObj = JSONObject.fromObject(budgetObj); //예산
        BudgetBean budgetBean = beanCreator.create(budgetJsonObj, BudgetBean.class);
        map = new ModelMap();
        try {
            formulationService.modifyBudget(budgetBean);
            map.put("errorCode", 1);
            map.put("errorMsg", "성공!");
        } catch (Exception e) {
            map.put("errorCode", -1);
            map.put("exceptionClass", e.getClass());
        }
        return map;
    }


//    @GetMapping("/budgetstatus")
//    public HashMap<String, Object> findBudgetStatus(@RequestParam String budgetObj) {
//
//        HashMap<String, Object> params = new HashMap<>();
//        JSONObject budgetJsonObj = JSONObject.fromObject(budgetObj); //예산
//        BudgetBean budgetBean = beanCreator.create(budgetJsonObj, BudgetBean.class);
//        params.put("accountPeriodNo", budgetBean.getAccountPeriodNo());
//        params.put("deptCode", budgetBean.getDeptCode());
//        params.put("workplaceCode", budgetBean.getWorkplaceCode());
//        formulationService.findBudgetStatus(params);
//
//        return params;
//    }
@PostMapping("/budgetstatus")
public HashMap<String, Object> searchBudgetStatus(@RequestBody BudgetBean budgetBean) {
    System.out.println("야ㅡㅡ");
    System.out.println(budgetBean);
    System.out.println(budgetBean.getAccountPeriodNo()+","+budgetBean.getDeptCode()+","+budgetBean.getWorkplaceCode());
    HashMap<String, Object> params = new HashMap<>();
    params.put("accountPeriodNo", budgetBean.getAccountPeriodNo());
    params.put("deptCode", budgetBean.getDeptCode());
    params.put("workplaceCode", budgetBean.getWorkplaceCode());
    formulationService.findBudgetStatus(params);

    return params;
}

    @PostMapping("/comparisonBudget")
    public HashMap<String, Object> findComparisonBudget(@RequestBody BudgetBean budgetBean) {
        System.out.println("요청옴? ");
        HashMap<String, Object> params = new HashMap<>();
        System.out.println("버짓빈:" + budgetBean);

        params.put("accountPeriodNo", budgetBean.getAccountPeriodNo());
        params.put("deptCode", budgetBean.getDeptCode());
        params.put("workplaceCode", budgetBean.getWorkplaceCode());
        params.put("accountInnerCode", budgetBean.getAccountInnerCode());

        params = formulationService.findComparisonBudget(params);

        System.out.println("params = " + params);
        System.out.println(params);
        return params;
    }

    @GetMapping("/budgetappl")
    public BudgetBean findBudgetAppl(@RequestParam String budgetObj) {

        JSONObject budgetJsonObj = JSONObject.fromObject(budgetObj); //예산
        BudgetBean budgetBean = beanCreator.create(budgetJsonObj, BudgetBean.class);

        return formulationService.findBudgetAppl(budgetBean);
    }

    @GetMapping("/comparisonBudget")
    public HashMap<String, Object> findComparisonBudget(@RequestParam String budgetObj) {

        System.out.println("budgetObj = " + budgetObj);
        HashMap<String, Object> params = new HashMap<>();
        JSONObject budgetJsonObj = JSONObject.fromObject(budgetObj); //예산
        BudgetBean budgetBean = beanCreator.create(budgetJsonObj, BudgetBean.class);

        params.put("accountPeriodNo", budgetBean.getAccountPeriodNo());
        params.put("deptCode", budgetBean.getDeptCode());
        params.put("workplaceCode", budgetBean.getWorkplaceCode());
        params.put("accountInnerCode", budgetBean.getAccountInnerCode());

        params = formulationService.findComparisonBudget(params);

        System.out.println("params = " + params);
        return params;
    }

    /*@GetMapping("/currentbudget")
    public BudgetBean findCurrentBudget(@RequestParam String budgetObj) {

        JSONObject budgetJsonObj = JSONObject.fromObject(budgetObj); //예산
        BudgetBean budgetBean = beanCreator.create(budgetJsonObj, BudgetBean.class);


        return formulationService.findCurrentBudget(budgetBean);
    }*/

    @GetMapping("/currentbudget")
    public HashMap<String, Object> findCurrentBudget(
            @RequestParam("deptCode") String deptCode,
            @RequestParam("workplaceCode") String workplaceCode,
            @RequestParam("accountPeriodNo") String accountPeriodNo,
            @RequestParam("accountInnerCode") String accountInnerCode
    ){
        HashMap<String ,Object> map =new HashMap<>();
        ArrayList<BudgetBean> currentBudgetList = formulationService.findCurrentBudget(deptCode,workplaceCode,accountPeriodNo,accountInnerCode);
        map.put("currentBudgetList", currentBudgetList);
        return map;
    }
}
