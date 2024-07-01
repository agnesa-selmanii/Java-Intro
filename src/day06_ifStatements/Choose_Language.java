package day06_ifStatements;

public class Choose_Language {
    public static void main(String[] args) {
        int selection = 2;
        String result = "";

        if(selection == 1){
            result = "Hello, thanks for your call";
        }

        if(selection == 2){
            result = "Hola, gracias para llamar";
        }

        if(selection == 3){
            result = "Merhaba, aradiginiz icin tesekkurler";
        }

        if(selection == 4){
            result = "Privet, spasibo za vash zvonok";
        }

        if(selection == 5){
            result = "Merci ,pour votre appel";
        }

        System.out.println(result);

    }
}
