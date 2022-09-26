package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DestinosDAO;
import modelo.Destinos;

@WebServlet(urlPatterns = { "/destinos", "/create-destino", "/edit", "/update", "/delet" })
public class DestinosServelet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	DestinosDAO destinosDAO = new DestinosDAO();
	Destinos destinos = new Destinos();

	public DestinosServelet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		switch (action) {
		case "/destinos":
			read(request, response);
			break;
		case "/create-destino":
			create(request, response);
			break;
		case "/edit":
			edit(request, response);
			break;
		case "/update":
			update(request, response);
			break;
		case "/delet":
			delet(request, response);
			break;
		default:
			response.sendRedirect("Home.html");
			break;
		}
	}

	// READ
	protected void read(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Destinos> lista = destinosDAO.getDestinos();
		request.setAttribute("destinos", lista);
		RequestDispatcher rd = request.getRequestDispatcher("./views/destino/Destinopg.01.jsp");
		rd.forward(request, response);
	}

	// CREATE
	protected void create(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		destinos.setLocalViagem(request.getParameter("LocalViagem"));
		destinos.setValorViagem(request.getParameter("ValorViagem"));
		destinosDAO.save(destinos);
		response.sendRedirect("destinos");
	}

	// READ BY ID
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int IdDestinos = Integer.parseInt(request.getParameter("id"));
		destinos = destinosDAO.getDestinosById(IdDestinos);
		request.setAttribute("IdDestinos", destinos.getIdDestino());
		request.setAttribute("LocalViagem", destinos.getLocalViagem());
		request.setAttribute("ValorViagem", destinos.getValorViagem());
		RequestDispatcher rd = request.getRequestDispatcher("./views/destino/Destinopg.01.jsp");
		rd.forward(request, response);
	}

	// UPDATE
	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		destinos.setIdDestino(Integer.parseInt(request.getParameter("id")));
		destinos.setLocalViagem(request.getParameter("LocalViagem"));
		destinos.setValorViagem(request.getParameter("ValorViagem"));
		destinosDAO.update(destinos);
		response.sendRedirect("destinos");
	}

	// DELET
	protected void delet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		destinosDAO.removeById(id);
		response.sendRedirect("destinos");
	}

}