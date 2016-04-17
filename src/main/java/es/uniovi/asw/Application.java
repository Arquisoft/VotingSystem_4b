package es.uniovi.asw;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import es.uniovi.asw.dbupdate.PartidoRepository;
import es.uniovi.asw.dbupdate.modelo.Partido;

@EnableAutoConfiguration
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

	@Bean
	public CommandLineRunner demo(final PartidoRepository partidoRepository) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {

				try {

					Partido partido1 = new Partido("Partido Popular",
							"Mariano Rajoy", "PP");
					Partido partido2 = new Partido(
							"Partido Socialista Obrero Español",
							"Pedro Sánchez", "PSOE");
					Partido partido3 = new Partido("Podemos", "Pablo Iglesias",
							"Podemos");
					Partido partido4 = new Partido("Partido de la ciudadanía",
							"Albert Rivera", "C´s");

					partidoRepository.save(partido1);
					partidoRepository.save(partido2);
					partidoRepository.save(partido3);
					partidoRepository.save(partido4);

				} catch (Exception e) {
					System.out.println("Excepcion..." + e);
				}
			}
		};
	}
}