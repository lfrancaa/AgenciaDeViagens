package controllers;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.VoosDAO;
import modelo.Voos;

@WebServlet(urlPatterns = { "/voos", "/create-voos", "/edit", "/update", "/delet" })
public class VoosServelet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	VoosDAO voosDAO = new VoosDAO();
	Voos voos = new Voos();

	public VoosServelet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		switch (action) {
		case "/voos":
			read(request, response);
			break;
		case "/create-voos":
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
		List<Voos> lista = voosDAO.getVoos();
		request.setAttribute("voos", lista);
		RequestDispatcher rd = request.getRequestDispatcher("./views/voos/Voos.jsp");
		rd.forward(request, response);
	}

	// CREATE
	protected void create(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		voos.setLinhaAerea(request.getParameter("LinhaAerea"));
		voos.setOrigem(request.getParameter("Origem"));
		voos.setDestino(request.getParameter("Destino"));
		voos.setPartida(request.getParameter("Partida"));
		voos.setChegada(request.getParameter("Chegada"));
		voos.setParadas(request.getParameter("Paradas"));
		voos.setValorVoo(request.getParameter("ValorVoo"));
		voosDAO.save(voos);
		response.sendRedirect("voos");
	}

	// READ BY ID
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int IdVoo = Integer.parseInt(request.getParameter("id"));
		voos = voosDAO.getVoosById(IdVoo);
		request.setAttribute("IdVoo", voos.getIdVoo());
		request.setAttribute("Origem", voos.getOrigem());
		request.setAttribute("Destino", voos.getDestino());
		request.setAttribute("Partida", voos.getPartida());
		request.setAttribute("Chegada", voos.getChegada());
		request.setAttribute("Paradas", voos.getParadas());
		request.setAttribute("ValorVoo", voos.getValorVoo());
		RequestDispatcher rd = request.getRequestDispatcher("./views/voos/Voos.jsp");
		rd.forward(request, response);

	}
	
	// UPDATE
	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		voos.setIdVoo(Integer.parseInt(request.getParameter("id")));
		voos.setLinhaAerea(request.getParameter("LinhaAerea"));
		voos.setOrigem(request.getParameter("Origem"));
		voos.setDestino(request.getParameter("Destino"));
		voos.setPartida(request.getParameter("Partida"));
		voos.setChegada(request.getParameter("Chegada"));
		voos.setParadas(request.getParameter("Paradas"));
		voos.setValorVoo(request.getParameter("ValorVoo"));
		voosDAO.update(voos);
		response.sendRedirect("voos");
	}

	// DELET
	protected void delet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		voosDAO.removeById(id);
		response.sendRedirect("voos");
	}

}