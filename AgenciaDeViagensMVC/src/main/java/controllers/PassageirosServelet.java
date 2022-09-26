package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PassageirosDAO;
import modelo.Passageiros;

@WebServlet(urlPatterns = { "/passageiros", "/create-passageiro", "/edit", "/update", "/delet" })
public class PassageirosServelet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	PassageirosDAO passageirosDAO = new PassageirosDAO();
	Passageiros passageiros = new Passageiros();

	public PassageirosServelet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		switch (action) {
		case "/passageiros":
			read(request, response);
			break;
		case "/create-passageiro":
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
		List<Passageiros> lista = passageirosDAO.getPassageiros();
		request.setAttribute("passageiros", lista);
		RequestDispatcher rd = request.getRequestDispatcher("./views/cadastro/Cadastro.jsp");
		rd.forward(request, response);
	}

	// CREATE
	protected void create(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		passageiros.setNome(request.getParameter("Nome"));
		passageiros.setRg(request.getParameter("Rg"));
		passageiros.setCpf(request.getParameter("Cpf"));
		passageiros.setDataNascimento(request.getParameter("DataNascimento"));
		passageiros.setEndereco(request.getParameter("Endereco"));
		passageiros.setComplemento(request.getParameter("Complemento"));
		passageiros.setCep(request.getParameter("Cep"));
		passageiros.setEstado(request.getParameter("Estado"));
		passageiros.setEmail(request.getParameter("Email"));
		passageiros.setTelefone(request.getParameter("Telefone"));
		passageirosDAO.save(passageiros);
		response.sendRedirect("passageiros");
	}

	// READ BY ID
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int IdPassageiro = Integer.parseInt(request.getParameter("id"));
		passageiros = passageirosDAO.getPassageirosById(IdPassageiro);
		request.setAttribute("IdPassageiro", passageiros.getIdPassageiro());
		request.setAttribute("Nome", passageiros.getNome());
		request.setAttribute("Rg", passageiros.getRg());
		request.setAttribute("Cpf", passageiros.getCpf());
		request.setAttribute("DataNascimento", passageiros.getDataNascimento());
		request.setAttribute("Endereco", passageiros.getEndereco());
		request.setAttribute("Complemento", passageiros.getComplemento());
		request.setAttribute("Cep", passageiros.getCep());
		request.setAttribute("Estado", passageiros.getEstado());
		request.setAttribute("Email", passageiros.getEmail());
		request.setAttribute("Telefone", passageiros.getTelefone());
		RequestDispatcher rd = request.getRequestDispatcher("./views/cadastro/Cadastro.jsp");
		rd.forward(request, response);
	}

	// UPDATE
	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		passageiros.setIdPassageiro(Integer.parseInt(request.getParameter("id")));
		passageiros.setNome(request.getParameter("Nome"));
		passageiros.setRg(request.getParameter("Rg"));
		passageiros.setCpf(request.getParameter("Cpf"));
		passageiros.setDataNascimento(request.getParameter("DataNascimento"));
		passageiros.setEndereco(request.getParameter("Endereco"));
		passageiros.setComplemento(request.getParameter("Complemento"));
		passageiros.setCep(request.getParameter("Cep"));
		passageiros.setEstado(request.getParameter("Estado"));
		passageiros.setEmail(request.getParameter("Email"));
		passageiros.setTelefone(request.getParameter("Telefone"));
		passageirosDAO.update(passageiros);
		response.sendRedirect("passageiros");
	}

	// DELET
	protected void delet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		passageirosDAO.removeById(id);
		response.sendRedirect("passageiros");
	}

}