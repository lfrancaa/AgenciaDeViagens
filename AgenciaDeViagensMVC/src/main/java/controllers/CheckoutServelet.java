package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CheckoutDAO;
import modelo.Checkout;

@WebServlet(urlPatterns = { "/checkout", "/create-checkout", "/edit", "/update", "/delet" })
public class CheckoutServelet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	CheckoutDAO checkoutDAO = new CheckoutDAO();
	Checkout checkout = new Checkout();

	public CheckoutServelet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		switch (action) {
		case "/checkout":
			read(request, response);
			break;
		case "/create-checkout":
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

		List<Checkout> lista = checkoutDAO.getCheckouts();
		request.setAttribute("checkout", lista);
		RequestDispatcher rd = request.getRequestDispatcher("./views/pagamento/PagamentoD01.jsp");
		rd.forward(request, response);
	}

	// CREATE
	protected void create(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		checkout.setNome(request.getParameter("Nome"));
		checkout.setSobrenome(request.getParameter("Sobrenome"));
		checkout.setEmail(request.getParameter("Email"));
		checkout.setEndereco(request.getParameter("Endereco"));
		checkout.setComplemento(request.getParameter("Complemento"));
		checkout.setPais(request.getParameter("Pais"));
		checkout.setEstado(request.getParameter("Estado"));
		checkout.setCep(request.getParameter("Cep"));
		checkout.setPrecoPassagem(request.getParameter("PrecoPassagem"));
		checkout.setFormasPagamento(request.getParameter("FormasPagamento"));
		checkoutDAO.save(checkout);
		response.sendRedirect("checkout");
	}

	// READ BY ID
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int IdCheckout = Integer.parseInt(request.getParameter("id"));
		checkout = checkoutDAO.getCheckoutsById(IdCheckout);
		request.setAttribute("IdCheckout", checkout.getIdCheckout());
		request.setAttribute("Nome", checkout.getNome());
		request.setAttribute("Sobrenome", checkout.getSobrenome());
		request.setAttribute("Email", checkout.getEmail());
		request.setAttribute("Endereco", checkout.getEndereco());
		request.setAttribute("Complemento", checkout.getComplemento());
		request.setAttribute("Pais", checkout.getPais());
		request.setAttribute("Estado", checkout.getEstado());
		request.setAttribute("Cep", checkout.getCep());
		request.setAttribute("PrecoPassagem", checkout.getPrecoPassagem());
		request.setAttribute("FormasPagamento", checkout.getFormasPagamento());

		RequestDispatcher rd = request.getRequestDispatcher("./views/pagamento/PagamentoD01.jsp");
		rd.forward(request, response);
	}

	// UPDATE
	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		checkout.setIdCheckout(Integer.parseInt(request.getParameter("id")));
		checkout.setNome(request.getParameter("Nome"));
		checkout.setSobrenome(request.getParameter("Sobrenome"));
		checkout.setEmail(request.getParameter("Email"));
		checkout.setEndereco(request.getParameter("Endereco"));
		checkout.setComplemento(request.getParameter("Complemento"));
		checkout.setPais(request.getParameter("Pais"));
		checkout.setEstado(request.getParameter("Estado"));
		checkout.setCep(request.getParameter("Cep"));
		checkout.setPrecoPassagem(request.getParameter("PrecoPassagem"));
		checkout.setFormasPagamento(request.getParameter("FormasPagamento"));
		checkoutDAO.update(checkout);
		response.sendRedirect("checkout");
	}

	// DELET
	protected void delet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		checkoutDAO.removeById(id);
		response.sendRedirect("checkout");
	}

}