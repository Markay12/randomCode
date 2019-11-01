import java.util.Scanner;

public class memeData{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    //opening statement
    System.out.println("");
    System.out.println("-----Welcome-----");
    System.out.println("Here is the main data gathered from online samples and gathering of information");
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println();



    int total = 47; //total amount of memes


    // addition of certain websites

    int reddit_amt = 14;
    int ruinmyweek_amt = 4;
    int pinterest_amt = 4;
    int memedroid_amt = 2;
    int memebase_amt = 1;
    int runt_amt = 3;
    int canyouactually_amt = 1;
    int aminoapps_amt = 1;
    int imgur_amt = 12;
    int memes_com_amt = 1;
    int me_me_amt = 1;
    int tastelessgentlemen_amt = 1;
    int indy100_amt = 1;
    int hahahumor_amt = 1;

    // the website total to make sure there are 47

    int web_total = (reddit_amt + ruinmyweek_amt + pinterest_amt + memedroid_amt + memebase_amt + runt_amt
    + canyouactually_amt + aminoapps_amt + imgur_amt + memes_com_amt + me_me_amt + tastelessgentlemen_amt
    + indy100_amt + hahahumor_amt);

    // compute the averages and percentages

    Double reddit_average = (double)reddit_amt/web_total;
    Double ruinmyweek_average = (double)ruinmyweek_amt/web_total;
    Double imgur_average = (double)(imgur_amt)/web_total;

    System.out.printf("The amount of websites adds up to: %d\n", web_total);
    System.out.println();
    System.out.println();
    System.out.printf("reddit: %d\n", reddit_amt);
    System.out.printf("ruinmyweek: %d\n", ruinmyweek_amt);
    System.out.printf("pinterest: %d\n", pinterest_amt);
    System.out.printf("memedroid: %d\n", memedroid_amt);
    System.out.printf("memebase: %d\n", memebase_amt);
    System.out.printf("runt: %d\n", runt_amt);
    System.out.printf("canyouactually: %d\n", canyouactually_amt);
    System.out.printf("aminoapps: %d\n", aminoapps_amt);
    System.out.printf("imgur: %d\n", imgur_amt);
    System.out.printf("memes_com_amt: %d\n", memes_com_amt);
    System.out.printf("me.me: %d\n", me_me_amt);
    System.out.printf("tastelessgentlemen: %d\n", tastelessgentlemen_amt);
    System.out.printf("indy100: %d\n", indy100_amt);
    System.out.printf("hahahumor: %d\n", hahahumor_amt);
    System.out.println();

    // compute and display averages in percentages of top 3 from least to greatest

    String great = "";
    String mid = "";
    String small = "";
    Double greatest = 0.0;
    Double middle = 0.0;
    Double least = 0.0;

    if (reddit_average > ruinmyweek_average){
      great = "Reddit";
      small = "ruinmyweek";
      greatest = reddit_average * 100;
      least = ruinmyweek_average * 100;

    }
    else if (ruinmyweek_average > reddit_average){
      small = "reddit";
      greatest = ruinmyweek_average * 100;
      great = "ruinmyweek";
      least = reddit_average * 100;
    }
    else if (imgur_average * 100 < least){
      mid = small;
      middle = least;
      small = "imgur";
      least = imgur_average * 100;
    }
    else if (imgur_average * 100 > greatest){
      mid = great;
      middle = greatest;
      great = "imgur";
      greatest = imgur_average * 100;
    }
    else { middle = imgur_average * 100; mid = "imgur"; }

    System.out.printf("%s had the greatest amount represented with: %.2f%s\n\n", great, greatest, "%");
    System.out.printf("Imgur had the middle amount represented with: %.2f%s\n\n", imgur_average * 100, "%");
    System.out.printf("%s had the smallest amount represented with: %.2f%s\n\n", small, least, "%");

    System.out.println();
    System.out.println("Continue?");
    int cont = in.nextInt();

    System.out.println();
    System.out.println();
    System.out.println("----------------------------------------");
    System.out.println("Re-occuring authors");
    System.out.println("----------------------------------------");
    System.out.println();

    int user_max = 5;
    int user_JPizzle = 2;


    System.out.printf("Out of %d memes, only 2 authors had repeated memes\n\n", total);
    System.out.printf("The username: Max from ruinmyweek.com had: %d memes with a percentage of: %.2f%s\n", user_max, ((double)(user_max)/total) * 100, "%");
    System.out.printf("The username: JPizzlesaurus from imgur had: %d memes with a percentage of: %.2f%s\n\n\n", user_JPizzle, ((double)(user_JPizzle)/total) * 100, "%");

    System.out.println();
    System.out.println("Continue?");
    cont = in.nextInt();


    System.out.println();
    System.out.println();
    System.out.println("----------------------------------------");
    System.out.println("---Dates---");
    System.out.println("----------------------------------------");
    System.out.println();

    System.out.printf("The range of years in data is represented from the year 2015-2019\n\n");


    int gathered_years = 30;
    int count_2015 = 5;
    int count_2016 = 8;
    int count_2017 = 8;
    int count_2018 = 5;
    int count_2019 = 4;

    System.out.printf("Out of 47 meme websites: %d included dates with a year\n", gathered_years);
    System.out.printf("In the year 2015 there were: %d memes gathered, which is a percentage of: %.2f%s\n", count_2015, ((double)(count_2015)/gathered_years) * 100, "%");
    System.out.printf("In the year 2016 there were: %d memes gathered, which is a percentage of: %.2f%s\n", count_2016, ((double)(count_2016)/gathered_years) * 100, "%");
    System.out.printf("In the year 2017 there were: %d memes gathered, which is a percentage of: %.2f%s\n", count_2017, ((double)(count_2017)/gathered_years) * 100, "%");
    System.out.printf("In the year 2018 there were: %d memes gathered, which is a percentage of: %.2f%s\n", count_2018, ((double)(count_2018)/gathered_years) * 100, "%");
    System.out.printf("In the year 2019 there were: %d memes gathered, which is a percentage of: %.2f%s\n\n\n", count_2019, ((double)(count_2019)/gathered_years) * 100, "%");

    System.out.println();
    System.out.println("Continue?");
    cont = in.nextInt();

    System.out.println();
    System.out.println();
    System.out.println("----------------------------------------");
    System.out.println("---negitive Connotation---");
    System.out.println("----------------------------------------");
    System.out.println();

    System.out.println("Many words within the english language have neagtive connotation and many of the words described in this activity use them");
    System.out.printf("\n\n\n");

    int negitive_memes = 45;

    System.out.printf("Out of %d total memes. %d of them were negitive\n\n", total, negitive_memes);
    System.out.printf("For a total percentage of: %.2f%s\n\n\n", ((double)(negitive_memes)/total) * 100, "%");




    System.out.println();
    System.out.println("Continue?");
    cont = in.nextInt();

    System.out.printf("\n\n\n");

    System.out.println("//////////////////////////////////////");
    System.out.println();
    System.out.println("Greatest values");
    System.out.printf("\n\n");
    System.out.println("Website:");
    System.out.println("_________________");
    System.out.printf("%s had the greatest amount represented with: %.2f%s\n\n", great, greatest, "%");
    System.out.println("");
    System.out.println("Author:");
    System.out.println("_________________");
    System.out.printf("The username: Max from ruinmyweek.com had: %d memes with a percentage of: %.2f%s\n", user_max, ((double)(user_max)/total) * 100, "%");
    System.out.println("");
    System.out.println("Dates:");
    System.out.println("_________________");
    System.out.printf("In the year 2016 there were: %d memes gathered, which is a percentage of: %.2f%s\n\n", count_2016, ((double)(count_2016)/gathered_years) * 100, "%");
    System.out.printf("In the year 2017 there were: %d memes gathered, which is a percentage of: %.2f%s\n\n", count_2017, ((double)(count_2017)/gathered_years) * 100, "%");
    System.out.printf("//////////////////////////////////////\n\n\n");


  }
}
