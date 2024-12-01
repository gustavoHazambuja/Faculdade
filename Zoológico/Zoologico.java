import java.text.Normalizer;
import java.util.HashSet;
import java.util.Set;

public class Zoologico {
    
    private Set<Animal> animais;

    public Zoologico(){
        animais = new HashSet<Animal>();
    }


    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    public void buscarAnimalPorNome(String nome){
        boolean encontrou = false;

        String nomeNormalizado = removerAcentos(nome);

        for (Animal a : animais) {
              // Normaliza o nome do animal
              String nomeAnimalNormalizado = removerAcentos(a.getNome());

            if (nomeAnimalNormalizado.equals(nomeNormalizado)) {
                System.out.println("Animal encontrado!");
                System.out.println(a);
                encontrou = true;
                break;
            }
        }  
            if(!encontrou){
                System.out.println("Animal não encontrado!");
            }
        
    }

    // Método para remover acentos e converter para minúsculas
    private String removerAcentos(String str) {
        if (str == null) {
            return null;
        }
        return Normalizer.normalize(str, Normalizer.Form.NFD)
                         .replaceAll("[^\\p{ASCII}]", "")
                         .toLowerCase();
    }

    public void listarAnimais(){
        if(animais.isEmpty()){
            System.out.println("Nenhum animal no zoológico!");
        }
        else{
            for(Animal a: animais){
                System.out.println(a);
                System.out.println("************************");
            }
        }
    }

    // public Set<Animal> getAnimais(){
    //     return animais;
    // }
}
