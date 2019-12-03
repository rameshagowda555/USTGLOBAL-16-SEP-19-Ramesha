package com.ustglobal.springmvcassessment.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.springmvcassessment.dto.OrderBean;
import com.ustglobal.springmvcassessment.dto.ProductBean;
import com.ustglobal.springmvcassessment.dto.RetailerBean;
import com.ustglobal.springmvcassessment.service.RetailerService;

@Controller
public class RetailerController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}

	// private RetailerService service = new RetailerServiceImpl();//creating
	// manually We can do it with the help of spring spring using auto wire
	@Autowired
	private RetailerService service;

	/* ****To Redirect to login******* */
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	/* ******To manage after login if its valid go to login else home page***** */

	@PostMapping("/login")
	public String login(int id, String password, HttpServletRequest request) {
		RetailerBean bean = service.login(id, password);// if bean nul invlid
		if (bean == null) {
			request.setAttribute("msg", "Invalid credentials :(");
			return "login";
		} else {
			HttpSession session = request.getSession();// equivalent to getsession(true)
			session.setAttribute("bean", bean);
			return "home";
		}
	}

	/* ****To Redirect to register******* */
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}

	/* ****To Redirect after register******* */
	@PostMapping("/register")
	public String register(RetailerBean bean, ModelMap map) {
		int check = service.register(bean);
		if (check > 0) {
			map.addAttribute("msg", "you are registerd . and Id is" + check);
		} else {
			map.addAttribute("msg", "Email Is repeated");
		}
		return "login";

	}

	@GetMapping("/home")
	public String home(@SessionAttribute(name = "bean", required = false) RetailerBean bean, ModelMap map) {
		if (bean == null) {
			map.addAttribute("msg", "Please login");
			return "login";
		} else {
			return "home";

		}
	}

	@PostMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/search")
	public String search(@RequestParam("id") int id, ModelMap map) {
		ProductBean bean = service.searchRetailer(id);
		if (bean == null) {
			map.addAttribute("msg", "Data not found");
		} else {
			map.addAttribute("bean", bean);

		}
		return "home";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}

	@GetMapping("/delete")
	public String deleteProfile(HttpSession session) {
		RetailerBean bean = (RetailerBean) session.getAttribute("bean");
		try {
			service.deleteRetailer(bean.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.invalidate();
		return "login";
	}

	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session != null) {
			return "changepassword";
		} else {
			return "login";
		}
	}

	@PostMapping("/changepassword")
	public String changePassword(String password, String confirmpassword,
			@SessionAttribute(name = "bean") RetailerBean bean, ModelMap map) {

		if (password.equals(confirmpassword)) {
			service.changePassword(bean.getId(), password);
			map.addAttribute("msg", "password changed");

		} else {
			map.addAttribute("msg", "password not changed");
		}
		return "home";
	}

	@PostMapping("/placeorder")
	public String makeOrder(OrderBean bean,ProductBean pbean,
		ModelMap map, HttpSession session, int quantity, int price) {
		session.setAttribute("pid", pbean.getPid());
		int amount = quantity * price;
		session.setAttribute("amount", amount);
		session.setAttribute("quantity", quantity);
		map.addAttribute("msg", "ORDER PLACED");
		map.addAttribute("amount", "Total price is " + amount);
		return "makeoder";

	}

	@PostMapping("/confirmorder")
	public String confirmOrder(OrderBean bean, ProductBean productBean, RetailerBean retailerBean, ModelMap map,
			HttpSession session) {
		int amount = (int) session.getAttribute("amount");
		int quantity = (int) session.getAttribute("quantity");
		int pid = (int) session.getAttribute("pid");
		productBean.setPid(pid);
		bean.setProductBean(productBean);
		bean.setRetailerBean(retailerBean);
		bean.setAmount(amount);
		bean.setQuantity(quantity);

		int check = service.makeOrder(bean);
		if (check > 0) {
			map.addAttribute("msg", "Order confirmed Successfully ");
		} else {
			map.addAttribute("msg", "Order not Confirmed");
		}
		return "makeoder";

	}

	@GetMapping("/vieworder")
	public String viewOrder(ModelMap map, HttpSession session) {
		RetailerBean bean = (RetailerBean) session.getAttribute("bean");
		OrderBean oBean;

		try {

			int id = bean.getId();
			oBean = service.viewOrder(1);
			if (oBean == null) {
				map.addAttribute("msg", "Data not found ");
			} else {
				map.addAttribute("oBean", oBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "viewOrder";

	}

}
