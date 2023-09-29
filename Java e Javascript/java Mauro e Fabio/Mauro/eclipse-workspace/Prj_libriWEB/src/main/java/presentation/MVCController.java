package presentation;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Libri;
import services.LibriServicesImpl;

@WebServlet("/leggimi")
public class MVCController extends HttpServlet{
	
	LibriServicesImpl service = new LibriServicesImpl();
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse responsive) throws ServletException, IOException {
		
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
if (request.getParameter("titolo")!=null) {
			
			String titolo = request.getParameter("titolo");
			String prezzo = request.getParameter("prezzo");
			String pagine = request.getParameter("pagine");
			
			Libri l = new Libri();
			l.setTitolo(titolo);
			l.setPrezzo(prezzo);
			l.setPagine(pagine);
			
			service.addLibro(l);
			System.out.println(titolo);
		}
		
		doGet(request, response);
	}
	
	public List<Libri> mostraLibri(){
		return service.getLibri();
	}
	
public void addLibro(String titolo, String prezzo, String pagine) {
		
		Libri l = new Libri();
		l.setTitolo(titolo);
		l.setPrezzo(prezzo);
		l.setPagine(pagine);
	
		service.addLibro(l);
	}
}