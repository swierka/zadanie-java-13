package pl.javastart.Zad1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/toSanta")
public class SantaClausWishes extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String textarea = request.getParameter("textarea");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        TextStats textStats = new TextStats();
        writer.println(textarea+"</br>");
        writer.println("Gratulacje! Powyzsze życzenia zostały wysłane do Swiętego Mikołaja!</br>");
        writer.println("</br>");
        writer.println("Poniżej krótka statystyka: </br>");
        writer.println("Całkowita liczba znaków to: "+textStats.countSigns(textarea)+".</br>");
        writer.println("Całkowita liczba znaków bez spacji to: "+textStats.countSignsWoBlanks(textarea)+".</br>");
        writer.println("Całkowita liczba wyrazów to: "+textStats.countWords(textarea)+".</br>");
        writer.println(textStats.isPalindrome(textarea));
    }
}
