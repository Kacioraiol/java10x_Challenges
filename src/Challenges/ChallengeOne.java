package Challenges;

public class ChallengeOne {
    public static void main(String[] args) {

        String nameNinja1 = "Naruto Uzumaki";
        int ageNinja1 = 14;
        String missionNinja1 = "Pegar um gato";
        String missionStatus1 = "Em andamento";
        char levelMissionNinja1 = 'D';

            if(ageNinja1 < 15) {
                if (levelMissionNinja1 == 'C' || levelMissionNinja1 == 'D') {
                    missionStatus1 = "Concluida";
                } else {
                    missionStatus1 = "Não Concluida";
                }
            } else {
                missionStatus1 = "Concluida";
        }

        System.out.println("Nome do ninja: " + nameNinja1);
        System.out.println("Idade do ninja: " + ageNinja1);
        System.out.println("Missao: " + missionNinja1);
        System.out.println("Missao Status: " + missionStatus1);
        System.out.println("Nivel da Missao: " + levelMissionNinja1);
        System.out.println("======================================================================================");

        String nameNinja2 = "Gaara";
        int ageNinja2 = 17;
        String missionNinja2 = "Proteger Aldeia";
        String missionStatus2 = "Em andamento";
        char levelMissionNinja2 = 'S';

        if(ageNinja2 < 15) {
            if (levelMissionNinja2 == 'C' || levelMissionNinja2 == 'D') {
                missionStatus2 = "Concluida";
            } else {
                missionStatus2 = "Não Concluida";
            }
        } else {
            missionStatus2 = "Concluida";
        }

        System.out.println("======================================================================================");
        System.out.println("Nome do ninja: " + nameNinja2);
        System.out.println("Idade do ninja: " + ageNinja2);
        System.out.println("Missao: " + missionNinja2);
        System.out.println("Missao Status: " + missionStatus2);
        System.out.println("Nivel da Missao: " + levelMissionNinja2);
        System.out.println("======================================================================================");

        String nameNinja3 = "Sakuke";
        int ageNinja3 = 13;
        String missionNinja3 = "Pegar ervas";
        String missionStatus3 = "Em andamento";
        char levelMissionNinja3 = 'S';

        if(ageNinja3 < 15) {
            if (levelMissionNinja3 == 'C' || levelMissionNinja3 == 'D') {
                missionStatus3 = "Concluida";
            } else {
                missionStatus3 = "Não tem a idade minima para concluir a missão";
            }
        } else {
            missionStatus3 = "Concluida";
        }

        System.out.println("======================================================================================");
        System.out.println("Nome do ninja: " + nameNinja3);
        System.out.println("Idade do ninja: " + ageNinja3);
        System.out.println("Missao: " + missionNinja3);
        System.out.println("Missao Status: " + missionStatus3);
        System.out.println("Nivel da Missao: " + levelMissionNinja3);



    }
}
