package presentation;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.CanzoneService;
import services.CanzoneServiceImpl;


@WebServlet("/api/canzoni")
public class RESTController extends HttpServlet{

	private CanzoneService service = new CanzoneServiceImpl();
	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/json"); //MIME TYPE
		
		
		
		//JSONObject oggetto = new JSONObject(service.getCanzoni().get(0));
		
		JSONArray array = new JSONArray(service.getCanzoni());
		response.getWriter().print(array.toString());
		
		
		
	}
}
