package workquest.storage;

public class CharacterSheet {

    // Atributos de Char

    static String races;
    private ClassType classType;

    /*public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }*/


    static int strength = 0;
    static int dexterity = 0;
    static int constitution = 0;
    static int intelligence = 0;
    static int wisdom = 0;
    static int charisma = 0;

    // Modificadores de Atributos de Char

    static int modStr = 0;
    static int modDex = 0;
    static int modCon = 0;
    static int modInt = 0;
    static int modWis = 0;
    static int modCha = 0;

    // Testes de Resistências de Char

    static int saveThrowStr = modStr;
    static int saveThrowDex = modDex;
    static int saveThrowCon = modCon;
    static int saveThrowInt = modInt;
    static int saveThrowWis = modWis;
    static int saveThrowCha = modCha;

    // Informações de Char

    static int level = 1;
    static int proficiencyBonus = +2;
    static int initiative = modDex;
    static int armorClass = 10 + modDex;
    static int hpMax = 10 + modCon;
    static int passivePerception = 10 + modWis;
    static int passiveIntuition = passivePerception;
    static int inspirationPoints = 0;
    static int expPoints = 0;

    // Aprimoramento de Valores de Raças

    static int upMountainDwarfRace = strength + 2;
    static int upHillDwarfRace = wisdom + 1;
    static int upDarkElfRace = charisma + 1;
    static int upHighElfRace = intelligence + 1;
    static int upWoodElfRace = wisdom + 1;
    static int upRockGnomeRace = constitution + 1;
    static int upGroveGnomeRace = dexterity + 1;
    static int upLightFootHalflingRace = charisma + 1;
    static int upStoutHalflingRace = constitution + 1;

    // Perícias de Char

    static int acrobatics = modDex;
    static int animal_handling = modWis;
    static int arcana = modInt;
    static int atletics = modStr;
    static int deception = modWis;
    static int history = modWis;
    static int intimidation = modCha;
    static int investigation = modInt;
    static int medicine = modWis;
    static int nature = modInt;
    static int perception = modWis;
    static int performance = modCha;
    static int persuasion = modCha;
    static int religion = modInt;
    static int sleight_of_hand = modDex;
    static int stealth = modDex;
    static int survival = modWis;

// * Métodos *


    public static void calcModStr(int strength) {

        switch (strength) {

            case 1:

                modStr = -5;
                System.out.println("Seu modificador de Força é: " + modStr);
                return;

            case 2, 3:

                modStr = -4;
                System.out.println("Seu modificador de Força é: " + modStr);
                return;

            case 4, 5:

                modStr = -3;
                System.out.println("Seu modificador de Força é: " + modStr);
                return;

            case 6, 7:

                modStr = -2;
                System.out.println("Seu modificador de Força é: " + modStr);
                return;

            case 8, 9:

                modStr = -1;
                System.out.println("Seu modificador de Força é: " + modStr);
                return;

            case 10, 11:

                modStr = 0;
                System.out.println("Seu modificador de Força é: " + "+" + modStr);
                return;

            case 12, 13:

                modStr = +1;
                System.out.println("Seu modificador de Força é: " + "+" + modStr);
                return;

            case 14, 15:

                modStr = +2;
                System.out.println("Seu modificador de Força é: " + "+" + modStr);
                return;

            case 16, 17:

                modStr = +3;
                System.out.println("Seu modificador de Força é: " + "+" + modStr);
                return;

            case 18, 19:

                modStr = +4;
                System.out.println("Seu modificador de Força é: " + "+" + modStr);
                return;

            case 20, 21:

                modStr = +5;
                System.out.println("Seu modificador de Força é: " + "+" + modStr);
                return;

            case 22, 23:

                modStr = +6;
                System.out.println("Seu modificador de Força é: " + "+" + modStr);
                return;

            case 24, 25:

                modStr = +7;
                System.out.println("Seu modificador de Força é: " + "+" + modStr);
                return;

            case 26, 27:

                modStr = +8;
                System.out.println("Seu modificador de Força é: " + "+" + modStr);
                return;

            case 29, 28:

                modStr = +9;
                System.out.println("Seu modificador de Força é: " + "+" + modStr);
                return;

            case 30:

                modStr = +10;
                System.out.println("Seu modificador de Força é: " + "+" + modStr);
                return;
        }
    }

// Modificador de Destreza

    public static void calcModDex(int dexterity) {
        switch (dexterity) {

            case 1:

                modDex = -5;
                System.out.println("Seu modificador de Destreza é: " + modDex);
                return;

            case 2, 3:

                modDex = -4;
                System.out.println("Seu modificador de Destreza é: " + modDex);
                return;

            case 4, 5:

                modDex = -3;
                System.out.println("Seu modificador de Destreza é: " + modDex);
                return;

            case 6, 7:

                modDex = -2;
                System.out.println("Seu modificador de Destreza é: " + modDex);
                return;

            case 8, 9:

                modDex = -1;
                System.out.println("Seu modificador de Destreza é: " + modDex);
                return;

            case 10, 11:

                modDex = 0;
                System.out.println("Seu modificador de Destreza é: " + modDex);
                return;

            case 12, 13:

                modDex = +1;
                System.out.println("Seu modificador de Destreza é: " + "+" + modDex);
                return;

            case 14, 15:

                modDex = +2;
                System.out.println("Seu modificador de Destreza é: " + "+" + modDex);
                return;

            case 16, 17:

                modDex = +3;
                System.out.println("Seu modificador de Destreza é: " + "+" + modDex);
                return;

            case 18, 19:

                modDex = +4;
                System.out.println("Seu modificador de Destreza é: " + "+" + modDex);
                return;

            case 20, 21:

                modDex = +5;
                System.out.println("Seu modificador de Destreza é: " + "+" + modDex);
                return;

            case 22, 23:

                modDex = +6;
                System.out.println("Seu modificador de Destreza é: " + "+" + modDex);
                return;

            case 24, 25:

                modDex = +7;
                System.out.println("Seu modificador de Destreza é: " + "+" + modDex);
                return;

            case 26, 27:

                modDex = +8;
                System.out.println("Seu modificador de Destreza é: " + "+" + modDex);
                return;

            case 29, 28:

                modDex = +9;
                System.out.println("Seu modificador de Destreza é: " + "+" + modDex);
                return;

            case 30:

                modDex = +10;
                System.out.println("Seu modificador de Destreza é: " + "+" + modDex);
                return;

        }
    }

// Modificador de Constituiçãoe

    public static void calcModCon(int constitution) {
        switch (constitution) {

            case 1:

                modCon = -5;
                System.out.println("Seu modificador de Constituição é: " + modCon);
                return;

            case 2, 3:

                modCon = -4;
                System.out.println("Seu modificador de Constituição é: " + modCon);
                return;

            case 4, 5:

                modCon = -3;
                System.out.println("Seu modificador de Constituição é: " + modCon);
                return;

            case 6, 7:

                modCon = -2;
                System.out.println("Seu modificador de Constituição é: " + modCon);
                return;

            case 8, 9:

                modCon = -1;
                System.out.println("Seu modificador de Constituição é: " + modCon);
                return;

            case 10, 11:

                modCon = 0;
                System.out.println("Seu modificador de Constituição é: " + modCon);
                return;

            case 12, 13:

                modCon = +1;
                System.out.println("Seu modificador de Constituição é: " + "+" + modCon);
                return;

            case 14, 15:

                modCon = +2;
                System.out.println("Seu modificador de Constituição é: " + "+" + modCon);
                return;

            case 16, 17:

                modCon = +3;
                System.out.println("Seu modificador de Constituição é: " + "+" + modCon);
                return;

            case 18, 19:

                modCon = +4;
                System.out.println("Seu modificador de Constituição é: " + "+" + modCon);
                return;

            case 20, 21:

                modCon = +5;
                System.out.println("Seu modificador de Constituição é: " + "+" + modCon);
                return;

            case 22, 23:

                modCon = +6;
                System.out.println("Seu modificador de Constituição é: " + "+" + modCon);
                return;

            case 24, 25:

                modCon = +7;
                System.out.println("Seu modificador de Constituição é: " + "+" + modCon);
                return;

            case 26, 27:

                modCon = +8;
                System.out.println("Seu modificador de Constituição é: " + "+" + modCon);
                return;

            case 29, 28:

                modCon = +9;
                System.out.println("Seu modificador de Constituição é: " + "+" + modCon);
                return;

            case 30:

                modCon = +10;
                System.out.println("Seu modificador de Constituição é: " + "+" + modCon);
                return;
        }
    }

// Modificador de Inteligência

    public static void calcModInt(int intelligence) {
        switch (intelligence) {

            case 1:

                modInt = -5;
                System.out.println("Seu modificador de Inteligência é: " + modInt);
                return;

            case 2, 3:

                modInt = -4;
                System.out.println("Seu modificador de Inteligência é: " + modInt);
                return;

            case 4, 5:

                modInt = -3;
                System.out.println("Seu modificador de Inteligência é: " + modInt);
                return;

            case 6, 7:

                modInt = -2;
                System.out.println("Seu modificador de Inteligência é: " + modInt);
                return;

            case 8, 9:

                modInt = -1;
                System.out.println("Seu modificador de Inteligência é: " + modInt);
                return;

            case 10, 11:

                modInt = 0;
                System.out.println("Seu modificador de Inteligência é: " + modInt);
                return;

            case 12, 13:

                modInt = +1;
                System.out.println("Seu modificador de Inteligência é: " + "+" + modInt);
                return;

            case 14, 15:

                modInt = +2;
                System.out.println("Seu modificador de Inteligência é: " + "+" + modInt);
                return;

            case 16, 17:

                modInt = +3;
                System.out.println("Seu modificador de Inteligência é: " + "+" + modInt);
                return;

            case 18, 19:

                modInt = +4;
                System.out.println("Seu modificador de Inteligência é: " + "+" + modInt);
                return;

            case 20, 21:

                modInt = +5;
                System.out.println("Seu modificador de Inteligência é: " + "+" + modInt);
                return;

            case 22, 23:

                modInt = +6;
                System.out.println("Seu modificador de Inteligência é: " + "+" + modInt);
                return;

            case 24, 25:

                modInt = +7;
                System.out.println("Seu modificador de Inteligência é: " + "+" + modInt);
                return;

            case 26, 27:

                modInt = +8;
                System.out.println("Seu modificador de Inteligência é: " + "+" + modInt);
                return;

            case 28, 29:

                modInt = +9;
                System.out.println("Seu modificador de Inteligência é: " + "+" + modInt);
                return;

            case 30:

                modInt = +10;
                System.out.println("Seu modificador de Inteligência é: " + "+" + modInt);
                return;
        }
    }

// Modificador de Sabedoria

    public static void calcModWis(int wisdom) {
        switch (wisdom) {

            case 1:

                modWis = -5;
                System.out.println("Seu modificador de Sabedoria é: " + modWis);
                return;

            case 2, 3:

                modWis = -4;
                System.out.println("Seu modificador de Sabedoria é: " + modWis);
                return;

            case 4, 5:

                modWis = -3;
                System.out.println("Seu modificador de Sabedoria é: " + modWis);
                return;

            case 6, 7:

                modWis = -2;
                System.out.println("Seu modificador de Sabedoria é: " + modWis);
                return;

            case 8, 9:

                modWis = -1;
                System.out.println("Seu modificador de Sabedoria é: " + modWis);
                return;

            case 10, 11:

                modWis = 0;
                System.out.println("Seu modificador de Sabedoria é: " + modWis);
                return;

            case 12, 13:

                modWis = +1;
                System.out.println("Seu modificador de Sabedoria é: " + "+" + modWis);
                return;

            case 14, 15:

                modWis = +2;
                System.out.println("Seu modificador de Sabedoria é: " + "+" + modWis);
                return;

            case 16, 17:

                modWis = +3;
                System.out.println("Seu modificador de Sabedoria é: " + "+" + modWis);
                return;

            case 18, 19:

                modWis = +4;
                System.out.println("Seu modificador de Sabedoria é: " + "+" + modWis);
                return;

            case 20, 21:

                modWis = +5;
                System.out.println("Seu modificador de Sabedoria é: " + "+" + modWis);
                return;

            case 22, 23:

                modWis = +6;
                System.out.println("Seu modificador de Sabedoria é: " + "+" + modWis);
                return;

            case 24, 25:

                modWis = +7;
                System.out.println("Seu modificador de Sabedoria é: " + "+" + modWis);
                return;

            case 26, 27:

                modWis = +8;
                System.out.println("Seu modificador de Sabedoria é: " + "+" + modWis);
                return;

            case 28, 29:

                modWis = +9;
                System.out.println("Seu modificador de Sabedoria é: " + "+" + modWis);
                return;

            case 30:

                modWis = +10;
                System.out.println("Seu modificador de Sabedoria é: " + "+" + modWis);
                return;
        }
    }

// Modificador de Carisma

    public static void calcModCha(int charisma) {
        switch (charisma) {

            case 1:

                modCha = -5;
                System.out.println("Seu modificador de Carisma é: " + modCha);
                return;

            case 2, 3:

                modCha = -4;
                System.out.println("Seu modificador de Carisma é: " + modCha);
                return;

            case 4, 5:

                modCha = -3;
                System.out.println("Seu modificador de Carisma é: " + modCha);
                return;

            case 6, 7:

                modCha = -2;
                System.out.println("Seu modificador de Carisma é: " + modCha);
                return;

            case 8, 9:

                modCha = -1;
                System.out.println("Seu modificador de Carisma é: " + modCha);
                return;

            case 10, 11:

                modCha = 0;
                System.out.println("Seu modificador de Carisma é: " + modCha);
                return;

            case 12, 13:

                modCha = +1;
                System.out.println("Seu modificador de Carisma é: " + "+" + modCha);
                return;

            case 14, 15:

                modCha = +2;
                System.out.println("Seu modificador de Carisma é: " + "+" + modCha);
                return;

            case 16, 17:

                modCha = +3;
                System.out.println("Seu modificador de Carisma é: " + "+" + modCha);
                return;

            case 18, 19:

                modCha = +4;
                System.out.println("Seu modificador de Carisma é: " + "+" + modCha);
                return;

            case 20, 21:

                modCha = +5;
                System.out.println("Seu modificador de Carisma é: " + "+" + modCha);
                return;

            case 22, 23:

                modCha = +6;
                System.out.println("Seu modificador de Carisma é: " + "+" + modCha);
                return;

            case 24, 25:

                modCha = +7;
                System.out.println("Seu modificador de Carisma é: " + "+" + modCha);
                return;

            case 26, 27:

                modCha = +8;
                System.out.println("Seu modificador de Carisma é: " + "+" + modCha);
                return;

            case 28, 29:

                modCha = +9;
                System.out.println("Seu modificador de Carisma é: " + "+" + modCha);
                return;

            case 30:

                modCha = +10;
                System.out.println("Seu modificador de Carisma é: " + "+" + modCha);
                return;
        }
    }

}
