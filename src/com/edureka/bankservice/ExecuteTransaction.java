package com.edureka.bankservice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ExecuteTransaction")
public class ExecuteTransaction extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private static final String FILENAME = "C:\\Users\\Saurav\\workspace\\DevopsBank\\src\\details.txt";

    public ExecuteTransaction() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
		HttpSession session=request.getSession();
		String acounnum=(String)session.getAttribute("account_number");
		String depositamount=(String) request.getAttribute("balance");
		//changing the balance for the given account
		BufferedReader br = null;
		int flag=-1;
		FileReader fr = null;
		try 
		{
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			String sCurrentLine;
			br = new BufferedReader(new FileReader(FILENAME));

			while ((sCurrentLine = br.readLine()) != null) 
			{
				//splitting the line into words and matching the userid and password
				String []logindata=sCurrentLine.split(",");
				
				if(logindata[0].equals(acounnum))
				{
					
					flag=1;
					break;
				}
			}
			//control will come down here after break
			if(flag==1)
			{
				
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("Home.html");
		        rd.forward(request, response);
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		
	}

}
