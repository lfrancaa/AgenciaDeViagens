package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HoteisDAO;
import modelo.Hoteis;

@WebServlet(urlPatterns = { "/hoteis", "/create-hoteis", "/edit", "/update", "/delet" })
public class HoteisServelet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	HoteisDAO hoteisDAO = new HoteisDAO();
	Hoteis hoteis = new Hoteis();

	public HoteisServelet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		switch (action) {
		case "/hoteis":
			read(request, response);
			break;
		case "/create-hoteis":
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
		List<Hoteis> lista = hoteisDAO.getHoteis();
		request.setAttribute("hoteis", lista);
		RequestDispatcher rd = request.getRequestDispatcher("./views/hoteis/Hoteis.jsp");
		rd.forward(request, response);
	}

	// CREATE
	protected void create(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		hoteis.setLocalHotel(request.getParameter("setLocalHotel"));
		hoteis.setValorHospedagem(request.getParameter("setValorHospedagem"));
		hoteisDAO.save(hoteis);
		response.sendRedirect("hoteis");
	}

	// READ BY ID
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int IdHotel = Integer.parseInt(request.getParameter("id"));
		hoteis = hoteisDAO.getHoteisById(IdHotel);
		request.setAttribute("IdHotel", hoteis.getIdHotel());
		request.setAttribute("LocalHotel", hoteis.getLocalHotel());
		request.setAttribute("ValorHospedagem", hoteis.getValorHospedagem());
		RequestDispatcher rd = request.getRequestDispatcher("./views/hoteis/Hoteis.jsp");
		rd.forward(request, response);
	}

	// UPDATE
	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		hoteis.setIdHotel(Integer.parseInt(request.getParameter("id")));
		hoteis.setLocalHotel(request.getParameter("setLocalHotel"));
		hoteis.setValorHospedagem(request.getParameter("setValorHospedagem"));
		hoteisDAO.update(hoteis);
		response.sendRedirect("hoteis");
	}

	// DELET
	protected void delet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		hoteisDAO.removeById(id);
		response.sendRedirect("hoteis");
	}

}