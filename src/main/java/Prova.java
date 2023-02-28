public enum Prova {
    CARTA1, CARTA2, CARTA3, CARTA4;




    public boolean check (int tabellone) {
        switch(this) {
            case CARTA1 -> {return true;}
            case CARTA2 -> {return false; }
            default -> {return true;}
        }

    }
}
