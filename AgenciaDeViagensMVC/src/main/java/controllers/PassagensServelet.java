package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PassagensDAO;
import modelo.Passagens;

@WebServlet(urlPatterns = { "/passagens", "/create-passagens", "/edit", "/update", "/delet" })
public class PassagensServelet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	PassagensDAO passagensDAO = new PassagensDAO();
	Passagens passagens = new Passagens();

	public PassagensServelet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		switch (action) {
		case "/passagens":
			read(request, response);
			break;
		case "/create-passagens":
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
		List<Passagens> lista = passagensDAO.getPassagens();
		request.setAttribute("passagens", lista);
		RequestDispatcher rd = request.getRequestDispatcher("./views/passagem/Passagem.jsp");
		rd.forward(request, response);
	}

	// CREATE
	protected void create(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		passagens.setHoraViagem(request.getParameter("HoraViagem"));
		passagens.setNomeLocalOrigem(request.getParameter("NomeLocalOrigem"));
		passagens.setNomeLocalDestino(request.getParameter("NomeLocalDestino"));
		passagens.setDataViagemIda(request.getParameter("DataViagemIda"));
		passagens.setDataViagemVolta(request.getParameter("DataViagemVolta"));
		passagensDAO.save(passagens);
		response.sendRedirect("passagens");
	}

	// READ BY ID
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int IdPassagem = Integer.parseInt(request.getParameter("id"));
		passagens = passagensDAO.getPassagensById(IdPassagem);
		request.setAttribute("IdPassagem", passagens.getIdPassagem());
		request.setAttribute("HoraViagem", passagens.getHoraViagem());
		request.setAttribute("NomeLocalOrigem", passagens.getNomeLocalOrigem());
		request.setAttribute("NomeLocalDestino", passagens.getNomeLocalDestino());
		request.setAttribute("DataViagemIda", passagens.getDataViagemIda());
		request.setAttribute("DataViagemVolta", passagens.getDataViagemVolta());
		RequestDispatcher rd = request.getRequestDispatcher("./views/passagem/Passagem.jsp");
		rd.forward(request, response);
	}

	// UPDATE
	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		passagens.setIdPassagem(Integer.parseInt(request.getParameter("id")));
		passagens.setHoraViagem(request.getParameter("HoraViagem"));
		passagens.setNomeLocalOrigem(request.getParameter("NomeLocalOrigem"));
		passagens.setNomeLocalDestino(request.getParameter("NomeLocalDestino"));
		passagens.setDataViagemIda(request.getParameter("DataViagemIda"));
		passagens.setDataViagemVolta(request.getParameter("DataViagemVolta"));
		passagensDAO.update(passagens);
		response.sendRedirect("passagens");
	}

	// DELET
	protected void delet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		passagensDAO.removeById(id);
		response.sendRedirect("passagens");
	}

}