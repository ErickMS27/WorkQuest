package workquest.storage;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ClassType {

    private String name;
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getName());
    }


   /* public static void menuClasses() {

        // Método para Classes

        ClassType artificer = new ClassType();
        artificer.setClassName("1) Artificer");
        ClassType barbarian = new ClassType();
        barbarian.setClassName("2) Barbarian");
        ClassType bard = new ClassType();
        bard.setClassName("3) Bard");
        ClassType cleric = new ClassType();
        cleric.setClassName("4) Cleric");
        ClassType druid = new ClassType();
        druid.setClassName("5) Druid");
        ClassType fighter = new ClassType();
        fighter.setClassName("6) Fighter");
        ClassType monk = new ClassType();
        monk.setClassName("7) Monk");
        ClassType paladin = new ClassType();
        paladin.setClassName("8) Paladin");
        ClassType ranger = new ClassType();
        ranger.setClassName("9) Ranger");
        ClassType rogue = new ClassType();
        rogue.setClassName("10) Rogue");
        ClassType sorcerer = new ClassType();
        sorcerer.setClassName("11) Sorcerer");
        ClassType warlock = new ClassType();
        warlock.setClassName("12) Warlock");
        ClassType wizard = new ClassType();
        wizard.setClassName("13) Wizard");


        List<ClassType> classType = new LinkedList<>();
        classType.add(artificer);
        classType.add(barbarian);
        classType.add(bard);
        classType.add(cleric);
        classType.add(druid);
        classType.add(fighter);
        classType.add(monk);
        classType.add(paladin);
        classType.add(ranger);
        classType.add(rogue);
        classType.add(sorcerer);
        classType.add(warlock);
        classType.add(wizard);

        for (ClassType i : classType) {
            System.out.println(i);

        }
        System.out.println("Possuimos um total de" + " " + classType.size() + " "
                + "classe no sistema D&D. Digite com qual classe, você deseja jogar:\n");

        Scanner enter_classes = new Scanner(System.in);
        String classes_player = enter_classes.nextLine();
        String class_artificer;
        String class_barbarian;
        String class_bard;
        String class_cleric;
        String class_druid;
        String class_fighter;
        String class_monk;
        String class_paladin;
        String class_ranger;
        String class_rogue;
        String class_sorcerer;
        String class_warlock;
        String class_wizard;

        switch (classes_player) {
            case "1", "Artífice", "artífice", "Artifice", "artifice":
                class_artificer = "Artífice";
                System.out.println("\nCerto, seu personagem será um " + class_artificer
                        + ". Agora vamos prosseguir para o seu antecedente.");
                break;
            case "2", "Bárbaro", "bárbaro", "Barbaro", "barbaro":
                class_barbarian = "Bárbaro";
                System.out.println("\nCerto, seu personagem será um " + class_barbarian
                        + ". Agora vamos prosseguir para o seu antecedente.");
                break;
            case "3", "Bardo", "bardo":
                class_bard = "Bardo";
                System.out.println("\nCerto, seu personagem será um " + class_bard
                        + ". Agora vamos prosseguir para o seu antecedente.");
                break;
            case "4", "Bruxo", "bruxo":
                class_warlock = "Bruxo";
                System.out.println("\nCerto, seu personagem será um " + class_warlock
                        + ". Agora vamos prosseguir para o seu antecedente.");
                break;
            case "5", "Clérigo", "clérigo", "Clerigo", "clerigo":
                class_cleric = "Clérigo";
                System.out.println("\nCerto, seu personagem será um " + class_cleric
                        + ". Agora vamos prosseguir para o seu antecedente.");
                break;
            case "6", "Druida", "druida", "Druída", "druída":
                class_druid = "Druida";
                System.out.println("\nCerto, seu personagem será um " + class_druid
                        + ". Agora vamos prosseguir para o seu antecedente.");
                break;
            case "7", "Feiticeiro", "feiticeiro":
                class_sorcerer = "Feiticeiro";
                System.out.println("\nCerto, seu personagem será um " + class_sorcerer
                        + ". Agora vamos prosseguir para o seu antecedente.");
                break;
            case "8", "Guerreiro", "guerreiro":
                class_fighter = "Guerreiro";
                System.out.println("\nCerto, seu personagem será um " + class_fighter
                        + ". Agora vamos prosseguir para o seu antecedente.");
                break;
            case "9", "Ladino", "ladino":
                class_rogue = "Ladino";
                System.out.println("\nCerto, seu personagem será um " + class_rogue
                        + ". Agora vamos prosseguir para o seu antecedente.");
                break;
            case "10", "Mago", "mago":
                class_wizard = "Mago";
                System.out.println("\nCerto, seu personagem será um " + class_wizard
                        + ". Agora vamos prosseguir para o seu antecedente.");
                break;
            case "11", "Monge", "monge":
                class_monk = "Monge";
                System.out.println("\nCerto, seu personagem será um " + class_monk
                        + ". Agora vamos prosseguir para o seu antecedente.");
                break;
            case "12", "Paladino", "paladino":
                class_paladin = "Paladino";
                System.out.println("\nCerto, seu personagem será um " + class_paladin
                        + ". Agora vamos prosseguir para o seu antecedente.");
                break;
            case "13", "Patrulheiro", "patrulheiro", "Guardião", "guardião", "Guardiao", "guardiao":
                class_ranger = "Patrulheiro";
                System.out.println("\nCerto, seu personagem será um " + class_ranger
                        + ". Agora vamos prosseguir para o seu antecedente.");
                break;
            default:
                System.out.println("\nOpção inválida, por favor digite uma das opções acima:");
                menuClasses();
        }


    }*/

   
}
