package br.com.empresa.calculadoraRest.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class ControladorPrincipal {

  @GetMapping("/somar")
  public String somar(double valor1,double valor2) {
    double resultado = valor1 + valor2;
    return "Resultado: " + resultado;
  }

  @GetMapping("/subtrair")
  public String subtrair(double valor1,double valor2) {
    double resultado = valor1 - valor2;
    return "Resultado: " + resultado;
  }

  @GetMapping("/multiplicar")
  public String multiplicar(double valor1,double valor2) {
    double resultado = valor1 * valor2;
    return "Resultado: " + resultado;
  }

  @GetMapping("/dividir")
  public String dividir(double valor1,double valor2) {
    double resultado = valor1 / valor2;
    return "Resultado: " + resultado;
  }
}