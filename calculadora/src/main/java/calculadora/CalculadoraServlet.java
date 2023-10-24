package calculadora;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/solicitarCalculo")
public class CalculadoraServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public CalculadoraServlet() {
		super();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String primeiroNumero = request.getParameter("numero1");
		String segundoNumero = request.getParameter("numero2");
		var escolha = request.getParameter("escolha");
		double resultado = 0;
		
		if ("soma".equals(escolha)) {
			resultado = Double.parseDouble(primeiroNumero) + Double.parseDouble(segundoNumero);
		} else if ("subtracao".equals(escolha)) {
			resultado = Double.parseDouble(primeiroNumero) - Double.parseDouble(segundoNumero);
		} else if ("divisao".equals(escolha)) {
			resultado = Double.parseDouble(primeiroNumero) / Double.parseDouble(segundoNumero);
		} else if ("multiplicacao".equals(escolha)) {
			resultado = Double.parseDouble(primeiroNumero) * Double.parseDouble(segundoNumero);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<p id=\"resultado\">Resultado: " + resultado + "</p>");
	}
}
