package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestActionController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("TestActionController 수행");

//		return new ModelAndView("list");
		ModelAndView view = new ModelAndView(); // forwarding
		view.setViewName("list");
		view.addObject("msg", "스프링"); // request.setAttribute("msg", "스프링");
		
		return view;
	}
}