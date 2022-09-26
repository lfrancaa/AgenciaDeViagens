package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PromocoesDAO;
import modelo.Promocoes;

@WebServlet(urlPatterns = { "/promocao", "/create-promocao", "/edit", "/update", "/delet" })
public class PromocoesServelet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	PromocoesDAO promocoesDAO = new PromocoesDAO();
	Promocoes promocoes = new Promocoes();

	public PromocoesServelet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		switch (action) {
		case "/promocao":
			read(request, response);
			break;
		case "/create-promocao":
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
		List<Promocoes> lista = promocoesDAO.getPromocoes();
		request.setAttribute("promocoes", lista);
		RequestDispatcher rd = request.getRequestDispatcher("./views/promocoes/Promocoes.jsp");
		rd.forward(request, response);
	}

	// CREATE
	protected void create(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		promocoes.setLocalViagem(request.getParameter("LocalViagem"));
		promocoes.setValorViagem(request.getParameter("ValorViagem"));
		promocoesDAO.save(promocoes);
		response.sendRedirect("promocoes");
	}

	// READ BY ID
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int IdPromocao = Integer.parseInt(request.getParameter("id"));
		promocoes = promocoesDAO.getPromocoesById(IdPromocao);

		request.setAttribute("IdPromocao", promocoes.getIdPromocao());
		request.setAttribute("LocalViagem", promocoes.getLocalViagem());
		request.setAttribute("ValorViagem", promocoes.getValorViagem());

		RequestDispatcher rd = request.getRequestDispatcher("./views/promocoes/Promocoes.jsp");
		rd.forward(request, response);
	}

	// UPDATE
	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		promocoes.setIdPromocao(Integer.parseInt(request.getParameter("id")));
		promocoes.setLocalViagem(request.getParameter("LocalViagem"));
		promocoes.setValorViagem(request.getParameter("ValorViagem"));
		promocoesDAO.update(promocoes);
		response.sendRedirect("promocoes");
	}

	// DELET
	protected void delet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		promocoesDAO.removeById(id);
		response.sendRedirect("promocoes");
	}

}