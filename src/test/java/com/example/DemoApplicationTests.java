package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertTrue;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

    @Test
    public void shouldAnswerWithTrue()
    {
		logger.info("Hello World!");
        	assertTrue( true );
    }
    public Integer additionner(Integer a, Integer b) 
    {
	Integer somme;
	somme = a + b;
	return somme;
    }
    @Test
    public void additionner_integer_should_return_an_integer() 
    {
     Integer somme = additionner(2,3);
     if (somme == 5) {
  System.out.println("test OK");
    		    } else {
  System.out.println("test KO");
                    }
    }		
   public Integer soustraire(Integer a, Integer b) 
    {
	Integer somme;
	somme = a - b;
	return somme;
    }	
    @Test
    public void soustraire_integer_should_return_an_integer() 
    {
     Integer somme = soustraire(3,3);
     if (somme == 0) {
  System.out.println("test OK");
    		    } else {
  System.out.println("test KO");
  assertTrue( false );
                    }
    }	


}
