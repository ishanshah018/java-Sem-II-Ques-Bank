/*  QB-262:
Sports tournament organizer: 
Write a program that simulates a sports tournament using a PriorityQueue. The program 
should allow the user to input team names and their win-loss records. The program should 
then prioritize teams based on their win-loss records and add them to the PriorityQueue. 
When it's time for the next match, the program should remove the two highest priority 
teams from the PriorityQueue and display their names.
  */


import java.util.*;

class Team {
    String name;
    int win;
    int loss;

    public Team(String name, int win, int loss) {
        this.name = name;
        this.win = win;
        this.loss = loss;
    }

    public String toString() {
        return name;
    }

    public int getWinLossRatio() {
        return win - loss;
    }

}

class SportsTournament {
    public static void main(String[] args) {
        PriorityQueue<Team> TeamList = new PriorityQueue<>(Comparator.comparing(Team::getWinLossRatio).reversed());
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No.of Teams: ");
        int team = sc.nextInt();
        sc.nextLine();

        // To input team names and their win-loss records

        for (int i = 0; i < team; i++) {
            System.out.println("Enter Team name for " + (i + 1) + " th: ");
            String teamname = sc.nextLine();

            System.out.println("Enter number of wins: of " + teamname + "'s Team: ");
            int win = sc.nextInt();

            System.out.println("Enter number of loss: of " + teamname + "'s Team: ");
            int loss = sc.nextInt();

            sc.nextLine();

            Team t = new Team(teamname, win, loss);

            TeamList.add(t);

        }

        // Next-Match Maker

        System.out.println("~~~NEXT-MATCH~~~");
        if (!TeamList.isEmpty()) {
            Team t1 = TeamList.poll();
            Team t2 = TeamList.poll();

            System.out.println(t1 + " VS " + t2);
        } else {
            System.out.println("Not Enough Teams to Start the match (Min:2 Req.)");
        }

    }
}
