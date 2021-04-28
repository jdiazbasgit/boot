package curso.cap.ejemploSpringBoot;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EjemploSpringBootApplicationTests {

	@Test
	void contextLoads() {
		assertNotNull(new String("a"));
	}

}
