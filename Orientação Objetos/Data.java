
public class Data
{
    private int dia, ano;
    private int mes;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
    }
    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
     public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
     public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public boolean bissexto(int ano){
        if(ano % 4 == 0){
            if(ano % 100 == 0){
                if(ano % 400 == 0){
                    return true;
                }else{
                    return false;
            }
        }else{
            return true;
        }
    }else{
        return false;
      }
  }
  
  public String mesExtenso(){
      String mesExtenso = "";
      
      switch(mes){
          case 1:
              mesExtenso = "Janeiro";
              break;
              case 2:
              mesExtenso = "Fevereiro";
              break;
              case 3:
              mesExtenso = "Março";
              break;
              case 4:
              mesExtenso = "Abril";
              break;
              case 5:
              mesExtenso = "Maio";
              break;
              case 6:
              mesExtenso = "Junho";
              break;
              case 7:
              mesExtenso = "Julho";
              break;
              case 8:
              mesExtenso = "Agosto";
              break;
              case 9:
              mesExtenso = "Setembro";
              break;
              case 10:
              mesExtenso = "Outubro";
              break;
              case 11:
              mesExtenso = "Novembro";
              break;
              case 12:
              mesExtenso = "Dezembro";
              break;
              
              default:
                  mesExtenso = "Mês inválido!";
                  break;
              
              
          
              
      }
      return mesExtenso;
  }
  public  String diaExtenso() {
        int dezenas = dia / 10;
        int unidades = dia % 10;
        String resultado = "";

        switch (dezenas) {
            case 1:
                switch (unidades) 
                {
                    case 0: return "dez";
                    case 1: return "onze";
                    case 2: return "doze";
                    case 3: return "treze";
                    case 4: return "quatorze";
                    case 5: return "quinze";
                    case 6: return "dezesseis";
                    case 7: return "dezessete";
                    case 8: return "dezoito";
                    case 9: return "dezenove";
                }
            case 2: resultado = "vinte"; break;
            case 3: resultado = "trinta"; break;
           
        }

        if (dezenas >= 2 && unidades != 0) {
            resultado += " e ";
        }

        if (dezenas != 1) {
            switch (unidades) {
                case 1: resultado += "um"; break;
                case 2: resultado += "dois"; break;
                case 3: resultado += "três"; break;
                case 4: resultado += "quatro"; break;
                case 5: resultado += "cinco"; break;
                case 6: resultado += "seis"; break;
                case 7: resultado += "sete"; break;
                case 8: resultado += "oito"; break;
                case 9: resultado += "nove"; break;
            }
        }

        return resultado;
}

   public  boolean verificaData() 
   {
        // Verifica se o ano esta no intervaloo
        if (ano < 1900 || ano > 2024) {
            return false;
        }

        // Verifica se os meses e os dias estao no intervaloo
        if (mes < 1 || mes > 12 || dia <1) {
            return false;
        }

        // Verifica os dias de cada mes , considerando anos bissextos
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return dia <= 31;
            case 4: case 6: case 9: case 11:
                return dia <= 30;
            case 2:
                if (bissexto(ano)) {
                    return dia <= 29;
                } else {
                    return dia <= 28;
                }
            default:
                return false;
        }
    }
}



    



