package attribute;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/PersonInformation"})
public class RequestAttributeServletExample extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PersonPojo personPojo1 = new PersonPojo( 1,"busra", "utmn", "12345", 22);
		PersonPojo personPojo2 = new PersonPojo( 2,"merve", "algin", "12345", 25);
		PersonPojo personPojo3 = new PersonPojo(3,"kubra", "utmn",  "12587", 22);
		PersonPojo personPojo4 = new PersonPojo(4,"elif", "ozgnr", "17645", 23);
		PersonPojo personPojo5 = new PersonPojo(5,"sevgi", "telli", "10945", 22);
		PersonPojo personPojo6 = new PersonPojo(6,"busra", "smsk","12298", 22);
		
		List<PersonPojo> list = new ArrayList<>();;
		list.add(personPojo1);
		list.add(personPojo2);
		list.add(personPojo3);
		list.add(personPojo4);
		list.add(personPojo5);
		list.add(personPojo6);
		
		request.setAttribute("personList", list);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
