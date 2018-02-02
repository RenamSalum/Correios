package br.com.financiamento.executartest;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.financiamento.acceptance.DefaultAcceptanceTestRunner;
import br.com.financiamento.executartest.ExecutarTest;
import io.openbdt.run.SuiteTestRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/appcontext.xml")
public class ExecutarTest {
	
	private static final Logger LOG = Logger.getLogger(ExecutarTest.class.getName());
	
	@Autowired
	private SuiteTestRunner suiteTestRunner;
	
	@Test
	public void test() {
		LOG.info(">>>>>>>>>>>>>>> Start test "); 
		
		this.suiteTestRunner.runWithJunit(DefaultAcceptanceTestRunner.class);
		
		LOG.info(">>>>>>>>>>>>>>> End test ");
	}

}
