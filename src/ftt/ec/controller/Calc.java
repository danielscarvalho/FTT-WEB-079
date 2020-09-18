package ftt.ec.controller;

import java.math.BigInteger;

// JavaBean
// POJO

// http://localhost:8080/FTT-WEB-079/Calc?a=1002345234523523452352345234543250&b=7771234123412341234123477

/* MVC
 * 
 * M - Model - Persistência - BD - DAO - JDBC - ftt.ec.model
 * V - View - Interface com usuário - WEB: HTML5, CSS3, JavaScript - WebContent
 * C - Controller - Lógica - Regras de negócio - Algoritmos - Java - JavaBeans - POJO - ftt.ec.controller
 *                - WEB API - Middleware - req & resp - ftt.ec.api
 * 
 * M, C -> Back-end
 * V    -> Front-end
 * 
 * https://www.devmedia.com.br/introducao-aos-javabeans/8621
 * https://pt.wikipedia.org/wiki/JavaBeans#:~:text=JavaBeans%20s%C3%A3o%20componentes%20de%20software,de%20uma%20ferramenta%20de%20desenvolvimento%22.
 * https://www.geeksforgeeks.org/pojo-vs-java-beans/
 * 
 */

public class Calc {
	
	public BigInteger add(BigInteger a, BigInteger b) {
		
		return a.add(b);
		
	}
	
	public String add(String a, String b) {
		
		BigInteger ai = new BigInteger(a);
		BigInteger bi = new BigInteger(b);
		
		return String.valueOf(ai.add(bi));
		
	}

}
