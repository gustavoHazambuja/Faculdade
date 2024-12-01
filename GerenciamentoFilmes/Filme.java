public class Filme implements Comparable<Filme>{

    private String titulo;
    private String diretor;
    private String genero;
    private String codigo;
    private int anoLancamento;
    private boolean estaAlugado;

    public Filme(String titulo, String diretor, String genero, String codigo, int ano) throws Exception{
        if(titulo == null || titulo.isEmpty()){
            throw new Exception("O título não pode ser nulo ou vazio!");
        }

        if(diretor == null || diretor.isEmpty()){
            throw new Exception("O diretor não pode ser nulo ou vazio!");
        }

        if(genero == null || genero.isEmpty()){
            throw new Exception("O gênero não pode ser nulo ou vazio!");
        }

        if(codigo == null || codigo.isEmpty()){
            throw new Exception("O código não pode ser nulo ou vazio!");
        }

        if(ano < 0){
            throw new Exception("O ano não pode ser negativo!");
        }

        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.codigo= codigo;
        this.anoLancamento = ano;
        this.estaAlugado = false;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getDiretor(){
        return diretor;
    }

    public String getGenero(){
        return genero;
    }

    public String getCodigo(){
        return codigo;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }

    public boolean alugar(){
       return estaAlugado = true;
    }

    public boolean isAlugado(){
        return this.estaAlugado;
    }

    public boolean devolver(){
        return estaAlugado = false;
    }

    @Override
    public int compareTo(Filme o){
        return anoLancamento - o.anoLancamento;
    }

    @Override
    public boolean equals(Object obj){
        Filme outro = (Filme) obj;
        return this.codigo.equals(outro.codigo);
    }

    public int hashCode(){
        return codigo.hashCode();
    }

    @Override
    public String toString(){
        return String.format("\nTítulo: %s\n" + 
        "Diretor: %s\n" +
        "Gênero: %s\n" +
        "Código: %s\n" +
        "Ano de lançamento: %d\n" ,
         titulo,diretor,genero,codigo,anoLancamento,
         "************************");
    }
    
}
