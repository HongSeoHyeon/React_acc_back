package kr.co.seoulit.account.operate.system.mapper;

import java.util.ArrayList;
import java.util.List;

import kr.co.seoulit.account.operate.system.to.CustomerBean;
import org.apache.ibatis.annotations.Mapper;

import kr.co.seoulit.account.operate.system.to.BusinessBean;
import kr.co.seoulit.account.operate.system.to.DetailBusinessBean;
import kr.co.seoulit.account.operate.system.to.WorkplaceBean;

@Mapper
public interface CustomerMapper {

    public ArrayList<BusinessBean> selectBusinessList();

    public void updateWorkplaceAccount(String code,String status); //사업장 승인상태 업데이트

    public WorkplaceBean selectWorkplace(String workplaceCode); //사업장조회

	public void insertWorkplace(WorkplaceBean workplaceBean); //사업장추가

	public void deleteWorkplace(String code); //사업장삭제

	public ArrayList<WorkplaceBean> selectAllWorkplaceList(); //모든사업장조회

	public ArrayList<DetailBusinessBean> selectDetailBusinessList(String businessCode);

	public ArrayList<CustomerBean> selectCustomerList(); //거래처 조회

	public void deleteCustomer(String customerCode); //거래처 삭제

	public void insertCustomer(CustomerBean customerBean); //거래처 추가

	public void updateCustomer(CustomerBean customerBean); //거래처 수정

	public List<CustomerBean> selectCreditCardList();
}
