public class Lampada2 {
    private char estado;

    public Lampada2() {
        this.estado = 'D';

    }

    public boolean ligar() {
        if (this.estado == 'Q') {
            return false;
        }
        
         if (this.estado == 'L') {
            return true;
        }

        double chance = Math.random();

        if (chance <= 0.3) {
            this.estado = 'Q';
            return false;
        } else {
            this.estado = 'L';
            return true;
        }
    }

    public boolean desligar() {
        if (this.estado == 'Q') {
            return false;
        } else {
            this.estado = 'D';
            return true;
        }
    }

    public String getEstado() {
        switch (this.estado) {
            case 'Q':
                return "Lâmpada queimada!";

            case 'L':
                return "Lâmpada ligada!";

            case 'D':
                return "Lâmpada desligada!";

            default:
                return "BUG";
        }
    }

}
