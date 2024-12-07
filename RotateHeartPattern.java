public class RotateHeartPattern {
  private static final String[] heart = {
    "                              #&(@@(&               #&(@@(&                       \n"
        + "                      #/%@&&@@%/&((&         #/%@&&@@%/&((&                     \n"
        + "                  ((#/%@%%%&#/@@@@@@@@@@#((%#&@@#@@@%(@@&%@%%@&                 \n"
        + "                (&@(%&@@&@%%@@#&#&#/@@@*#%&/@@#@@#@@&@@@(@@&@@/@&#&             \n"
        + "              #/@/%#@&%(#@@#%&@@/@#(/(%(@##&@@@@@&@@@@@@(#@@%%@#@#@&(#          \n"
        + "             ####%@&@##(@@&@(&@@&(/(@(#&#/#%%#/@@#@@%@@#&%@@&@@(%#@%%&@%        \n"
        + "           &//@%/%((&(@(%/#(@/@&@#@/*#*(/%(@/(&&@@(@@@@&#@@@(%&@@@@@/(@@#       \n"
        + "          //(@%%&(&@#@&@%(#@@@@@@@@@@@@@@@@@@@@@@@@(##@@%@%&@%(&@@&@#%%@&       \n"
        + "         (/(((@@##(**/*%(@@@@@/**/*,/&@@@@@@@@@@@@@@@%@@@&/@#@&@@%&/#@&&&       \n"
        + "         /##/***(&#/&/(#*,/%/*#@##%%/((((@@@@@@@@@@@@@@(%@&@#@#@%@5@%@&##       \n"
        + "         /#&,*///###%((/#%(#(/#&#&(%@&%&%//@@@@@@@@@@@&(@@@@%@(%(%r%&@&##       \n"
        + "         %**//(###/((#/#%##&&&#&#%&@&%((%##(@@@@@@@@@@@&@#(@@@&@@@@#@@&&%       \n"
        + "          /#*(#//#%&@@@%(#(%@@(/%@@@&&%&@#%(@@@@@@@@@%(&@&@(@%@%@#@&#&&@&       \n"
        + "           /**///#%%%&@@&#///(@@%/%%%&&#((/@&@@@@@@@@@@@(@&@(&@@&@#@@@@#        \n"
        + "           */**/%(/(((/##//(&&((##%%((#/(@@@@@@@@@#@%@#(@@@@@@@@(@@&&#          \n"
        + "             /#(*/((%&&#(%#&#((&&(#%%(/(@@@@@@@@@@@@&((@&@@@@&/%#&@@@#          \n"
        + "               /*#%./*%#(/((&/((##((//@@@@@@@@@@%&@&%@@@%@/@(@%@@##%            \n"
        + "                /#&@/***/(/%/%#(*.@@@@@@@@@@@%#@@%@#@(@%@&@(@%%&((%             \n"
        + "                 %/%#@#/,**//*(@#&##@@@@@@(#(@%&@#@#@&@&@(%#&@&&&               \n"
        + "                  #/%/%(%/((#(#@&/&(@%(@@#%&@%@##@(@/@(@&%@&&                   \n"
        + "                    #(%/%(@((*#%%(/%@&%(@&%@&%@@%@%@&%@#(//                     \n"
        + "                      %/*&&##&#@&@@(@(&(@@/@@(@(@(@/%@%%                        \n"
        + "                        %/##((@&%@&@@@%%&@#&%@%##@%((%                          \n"
        + "                           #%&/%@%&@(&/@@(@%(#@#((#                             \n"
        + "                             /(#(#%((#@&(@(@%((%                                \n"
        + "                                 //&@%&/@/@#/                                   \n"
        + "                                    &((/%                                       \n"
        + "                                      &                                         \n"
        + "                                                                                \n"
  };

  public static void main(String[] args) throws InterruptedException {
    int numRows = heart.length;
    int numCols = heart[0].length();
    int maxShift = 5;

    while (true) {
      for (int shift = -maxShift; shift <= maxShift; shift++) {
        clearConsole();
        printHeart(shift, numRows, numCols);
        Thread.sleep(100);
      }
    }
  }

  // Prints the heart with a horizontal shift
  private static void printHeart(int shift, int numRows, int numCols) {
    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numCols; j++) {
        int idx = (j + shift) % heart[i].length(); // Calculate adjusted index
        if (idx < 0) {
          idx += heart[i].length(); // Handle negative indices
        }
        System.out.print(heart[i].charAt(idx));
      }
      System.out.println();
    }
  }

  // Clears the terminal screen (works in many terminals)
  private static void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
