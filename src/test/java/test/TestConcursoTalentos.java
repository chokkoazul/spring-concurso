package test;

import static org.junit.Assert.assertEquals;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concursantes.Concursante;
import concursantes.Malabarista;

public class TestConcursoTalentos {
	private static Log logger = LogFactory.getLog("TestConcursoTalentos");
	private Concursante malabarista1;
	private Concursante malabarista2;

	@Before
	public void before() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		malabarista1 = (Concursante) ctx.getBean("solei");
		malabarista2 = (Concursante) ctx.getBean("soleiRecitador");
	}

	@Test
	public void testMalabarista() {
		logger.info("Inicio de ejecutar Malabarista");
		int noPelotas = 10;
		malabarista1.ejecutar();
		assertEquals(noPelotas, ((Malabarista) malabarista1).getPelotas());
		logger.info("Fin de Ejecutar Malabarista");
		logger.info("Inicio de ejecutar MalabaristaRecitador");
		noPelotas = 15;
		malabarista2.ejecutar();
		assertEquals(noPelotas, ((Malabarista) malabarista2).getPelotas());
		logger.info("Fin de Ejecutar MalabaristaRecitador");
	}
}
