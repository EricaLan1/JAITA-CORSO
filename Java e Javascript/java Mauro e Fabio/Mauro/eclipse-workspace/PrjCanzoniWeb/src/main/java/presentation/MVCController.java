package presentation;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Canzone;
import services.CanzoneService;
import services.CanzoneServiceImpl;

@WebServlet("/")//route - URL endpoint http://localhost:8080/Canzoni/provami
public class MVCController extends HttpServlet {

	CanzoneService service = new CanzoneServiceImpl();
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("addLibro.jsp").forward(request, response);
		
	}
	


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("titolo")!=null) {
			
			String titolo = request.getParameter("titolo");
			String cantante = request.getParameter("cantante");
			
			Canzone c = new Canzone();
			c.setTitolo(titolo);
			c.setCantante(cantante);
			
			service.addCanzone(c);
			System.out.println(titolo);
		}
		
		doGet(request, response);
	}






	public List<Canzone> mostraCanzoni(){
		return service.getCanzoni();
	}

	public void addCanzone(String titolo, String cantante) {
		
		Canzone c = new Canzone();
		c.setTitolo(titolo);
		c.setCantante(cantante);
		service.addCanzone(c);
	}
	
}