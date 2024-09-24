import java.util.Scanner;
//Construa a class Forma sabendo que ela possui nome, cor, lado e área. Defina os atributos e
//implemente os métodos de instância básicos adequados para esta classe. Apresente como saída
// na classe chamada AppForma o nome, a cor, o lado e a área da figura geométrica.


public class Forma
{
        private String nome, cor;
        private double lado, area;
        
        public Forma(String nome, String cor, double lado, double area){
            this.nome = nome;
            this.cor = cor;
            this.lado = lado;
            this.area = area;
            
        }
        
        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public String getCor(){
            return cor;
        }
        public void setCor(String cor){
            this.cor = cor;
        }
        public double getLado(){
            return lado;
        }
        public void setLado(double lado){
            this.lado = lado;
        }
        public double getArea(){
            return area;
        }
        public void setArea(double area){
            this.area = area;
        }
        
        public String toString(){
            return "Nome: " + getNome() + "\n Cor: " + getCor() + "\n Lado: " + getLado() + "\n Área: " + getArea();
        }
        
        
        
        
    
}
