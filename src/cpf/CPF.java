package cpf;

public class CPF {
   // Valida um digito verificador do cpf
   public boolean validaDigito(String cpfNumerico, int posicaoDigito) {
      int soma = 0;
      int peso = posicaoDigito + 1;

      for (int i = 0; i < posicaoDigito; i++) {
         // Transforma o caractere em um valor inteiro
         int num = Character.getNumericValue(cpfNumerico.charAt(i));
         soma += num * (peso - i);
      }

      int resto = soma % 11;
      int digitoCalculado = (resto < 2) ? 0 : 11 - resto; 
      // Transforma o caractere em um valor inteiro
      int digitoInformado = Character.getNumericValue(cpfNumerico.charAt(posicaoDigito));

      return digitoCalculado == digitoInformado;
   }

   // Valida um cpf
   public boolean validaCPF(String cpf) {
      // Remove todos os caracteres especiais da string
      String cpfNumerico = cpf.replaceAll("\\D", "");

      if(validaDigito(cpfNumerico, 9)) {
         if(validaDigito(cpfNumerico, 10)) {
            return true;
         }
      }

      return false;
   }
}
