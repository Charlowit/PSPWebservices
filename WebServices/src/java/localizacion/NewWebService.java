/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localizacion;

import ORM.NewHibernateUtil;
import ORM.User;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Properties;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Charlowit
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "loginuser")
    public String loginuser(@WebParam(name = "login") String login, @WebParam(name = "password") String password) {
        String resultado="incorrecto";
        Transaction t = null; 
        Session s = NewHibernateUtil.getInstance().getSessionFactory().openSession();
        t = s.beginTransaction(); 
        List<User> lista = s.createQuery("FROM User").list();

        for(User usuario:lista){
            if (usuario.getIdUser().equals(login)&& usuario.getPassword().equals(password)){
                resultado="correcto";
            }
        }

    s.close();

        return resultado;
      
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calculator")
    public String calculator(@WebParam(name = "parametro1") String parametro1, @WebParam(name = "parametro2") String parametro2, @WebParam(name = "operador") String operador) {
        int a=1;
        int b=1;
        int total= 0;
        if(operador.equals("+")){
            a = Integer.parseInt(parametro1);
            b = Integer.parseInt(parametro2);
            total = a + b ;
            
        }
        else if(operador.equals("-")){
            a = Integer.parseInt(parametro1);
            b = Integer.parseInt(parametro2);
            total = a - b ;
            
        }
        else if(operador.equals("*")){
            a = Integer.parseInt(parametro1);
            b = Integer.parseInt(parametro2);
            total = a * b ;
            
        }
        else if(operador.equals("/")){
            a = Integer.parseInt(parametro1);
            b = Integer.parseInt(parametro2);
            total = a / b ;
            
        }
        return String.valueOf(total);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "smtp")
    public void smtp(@WebParam(name = "destinatario") String destinatario, @WebParam(name = "asunto") String asunto, @WebParam(name = "cuerpo") String cuerpo) {
       	String remitente = "carlosgalvez2dam@gmail.com";  //Para la dirección nomcuenta@gmail.com
	String clave = "josegras";
	Properties props = System.getProperties();
	props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
	props.put("mail.smtp.user", remitente);
	props.put("mail.smtp.clave", clave);    //La clave de la cuenta
	props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
	props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
	props.put("mail.smtp.port", "25"); //El puerto SMTP seguro de Google
	javax.mail.Session session = javax.mail.Session.getDefaultInstance(props);
	MimeMessage message = new MimeMessage(session);

	try {
		message.setFrom(new InternetAddress(remitente));
		message.addRecipients(Message.RecipientType.TO, destinatario);
		message.setSubject(asunto);
		message.setText(cuerpo);
		Transport transport = session.getTransport("smtp");
		transport.connect("smtp.gmail.com", remitente, clave);
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();
	}
	catch (MessagingException me) {
		me.printStackTrace();   //Si se produce un error
	}
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "random")
    public int random() {
        int numero = -1;
        try {
            Runtime runTime = Runtime.getRuntime();
            Process process = runTime.exec("D:\\PSP\\Conector JDBC\\susmuertos.exe");
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
            numero = Integer.parseInt(stdInput.readLine());
            System.out.println("NUMERO GENERADO: " + numero);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numero;
    }
    
}
