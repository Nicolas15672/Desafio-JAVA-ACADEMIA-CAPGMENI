public class Desafio03 {
    public static void main(String[] args) {

        String frase1 = new String("tenha um bom dia");
        String frase2 = new String("ola mundo");

        System.out.println(formatarFrase(frase1));
        System.out.println(formatarFrase(frase2));


    }
    public static String formatarFrase(String string){
        StringBuilder frase = new StringBuilder();
        int x;

        string = string.replaceAll("\\s+","");
        x = (int) Math.ceil(Math.sqrt(string.length()));

        String[] valor = string.split("(?<=\\G.{"+ x +"})");

        for(int i= 0; i < x; i++){
            if(i != 0) {
                frase.append(" ");
            }
            for (String line : valor){
                if(i<line.length()){
                    frase.append(line.charAt(i));
                }
            }

        }
        return frase.toString();

    }

}
