package br.com.totvs.testeSelecao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Boot
{

   public static void main(String[] args)
   {
      SpringApplication.run(Boot.class);
   }

}
