package day27;

public class DimensionalWithString {
    public static void main(String[] args) {
        String[] developersTeam ={"Vladislav","Hasan","Tolkun","Abide"};
        String[]testerTeam={"Zhibekchach","Mohammed Sorhrabi","Nursultan"};
        String[]businessAnalysesTeam={"Lisa","Ershad","Naila"};
        String[][]scrumTeam ={developersTeam,testerTeam,businessAnalysesTeam};
        //for finding long name what do I nned for ? max length!!
        int maxLength= scrumTeam[0][0].length();
        String longestString="";
        for(String[]herbirArray:scrumTeam   ) { //eachindex ne olmali oncelikle string[] koyuyorum
        for(String herbirisim:herbirArray){     //sonra sag tarafa engenelinin alaiyorum scrumteam ama
          if(maxLength<herbirisim.length()){    // buraya kadar sadece arrayleri aldi how abbout items
              maxLength=herbirisim.length();
              longestString=herbirisim;
          }
        }
        }
        System.out.println(maxLength);
        System.out.println(longestString);
        for(String[]herbirArray:scrumTeam){
            for(String herbirIsim: herbirArray){
                if(maxLength==herbirIsim.length()){
                    System.out.println(herbirIsim);
                }
            }

        }
    }
}
