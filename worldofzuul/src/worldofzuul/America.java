package worldofzuul;

import static worldofzuul.Game.name;



public class America {
    
    public static void slowPrint(String message, long milliSecPerChar) {
        for (int i = 0; i < message.length(); i ++) {
            System.out.print(message.charAt(i));

            try {
                Thread.sleep(milliSecPerChar);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void america() {
        String message = "                                                                                                \n" +
        "     o:`:dys+:-`                                                                                    \n" +
        "     dMMNMMMMMMMNmhyo+/-.`                                                                    .:`   \n" +
        "    `mMMMMMMMMMMMMMMMMMMMMNmdhyso++/:---..```       -                                        oMMm   \n" +
        "    +MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNyoo/.`.`                                dMMMy. \n" +
        "   -NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMmo: `:`                          `/MMMMMd.\n" +
        "  .mMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMms//sNmy/+ydo/               -/+shmMMMMs-  \n" +
        " -NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMh+-`ss/`           .hMMMMMMMMh.    \n" +
        " oMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm/ :dMMM:           +MMMMMMMMMo     \n" +
        " hMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM- hMMMmsh`     +yhmMMMMMMMMMMN+.   \n" +
        "yMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN` +MMMMMM:    :dMMMMMMMMMMmyo-     \n" +
        "oMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM- -MMMMM+  -omMMMMMMMMMMM+         \n" +
        "sMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNsNMMMMMNmNMMMMMMMMMMMMMM+        \n" +
        " dMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNMdy.         \n" +
        " +MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMhdM/          \n" +
        " `NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMos.          \n" +
        "  yMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm+           \n" +
        "   hMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM+          \n" +
        "   /sNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMh:          \n" +
        "     `oNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMmo-           \n" +
        "        yMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMms.             \n" +
        "        .osyhNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm.               \n" +
        "             `/yNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN+`                \n" +
        "                 :sdNMMMMMNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN.                  \n" +
        "                     .-:/+` `-hMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMy                   \n" +
        "                               :hMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMmMMNMMMMMMMMMN.                  \n" +
        "                                -MMMMdmMMMMMMMMMMMMMMMMMMMMMMMMN+.```   :o: -yNMMm-                 \n" +
        "                                 .+y:  `oMMMMMMMMMMMNs:..-:.+dy+/`            :MMMM/                \n" +
        "                                         oMMMMMMMNy/`                         .hMMMM/               \n" +
        "                                          :mMMMm-                              .hMMMN.              \n" +
        "                                           /MMMd                                 :yMM-              \n" +
        "                                            `/oo                                   ::               \n" +
        "                                                                                                    \n" +
        "                                                                                                    \n";
        slowPrint(message,1);
    }
        
    
    public void map() {
        String map = "  .-`::``````                                                                                     \n" +
"    . .:-      `..-``````                                                                    ....   \n" +
"    -.`-` WA    . -      ````````````.`````````````..                                        .  ``  \n" +
"    -..         . .`                 .          -   ````.```..:```                          `.   `.`\n" +
"   .` `````````-`  `.                .           .        .```.-  ``.`                    `.-   `...\n" +
"  ``           `.  .-                .           .      `-..-.`..`.`-:-.             ```.. -.` .`   \n" +
" .`    OR     ..    `.   ``          -```````````:     `-     `.---`:-`.-.          -`   - . .-     \n" +
" -            .      `.`.. ``````````.           .`     -       :: -.   -`.     `.`--    `.-`.-     \n" +
" -```````     .   ID    .           ``           ``     `..      - -   ...:    `:``       -``:--.   \n" +
"-       -````..````     .           -```         ..```````..    `` -     `. ``-:.``````..`-.::      \n" +
"-      .`         -`````.           .   ```````.`-`        `-.```- - ````:.--`-        `-`:.`       \n" +
"-      -          .    `.`````      .             -        `.`   ..`` .   `   -        .. .         \n" +
"`.`   `.    NV    .        .  ``````.``.`          -```````-      .   `.      :..--:-`----`         \n" +
" -:`   `.        .   UT   `.           ..``````````-.`    `-      .    .    `-`  .-  :--`.          \n" +
" ..      .`      .        .            .            ..      ..    -   .-.....   .`    .::`          \n" +
"  .  CA   `.    `.        .            .             .       -`  .-...`     -.`..    `-:-.          \n" +
"  `-        .` `-`````````-```````     .             .        `-.:       `.-.`.``````` `-/`         \n" +
"   .``       ...`        `.      ````:.-....`````````-`````````-.`.``````  `..         `:-`         \n" +
"   `...`      `.         .           .     .         .       `-`         .--.```.``.  `.`           \n" +
"    ` -..     .`   AZ    .           .     .          .      `-```-````-`  `..      -.`             \n" +
"      ` .````..          .           .     ..`.`    ` .     `.    .    `.     ..   ..               \n" +
"             ````       `.          ``         `...```-`    -     .     .`      --.                 \n" +
"                ````    . `  ````   .                 `-````..    .      -      `-                  \n" +
"                    ````.`.```.``````                  -    -     .  ````-   ``.-`                  \n" +
"                               `.                      `.   .``-``-::-`.` `-.  ` -                  \n" +
"                                 -   ```             ` ..` `` .-/` `     .`  ..   ..                \n" +
"                                 ```.`  ..          `/`` ``....-.-             .   .`               \n" +
"                                         `.     `-:.`                          :`   .`              \n" +
"                                          `.   `/`                              .-   .              \n" +
"                                           `.  `:                                 `.`-              \n" +
"                                             ```:                                 `..`              \n" +
"Take a good look. Get a sense of the generel direction between the states.\n";
        slowPrint(map, 1);
    }

    

    
    
    
    
    
    
    public void california() {
            
            System.out.println(
"           _ _  __                 _       \n" +
"          | (_)/ _|               (_)      \n" +
"  ___ __ _| |_| |_ ___  _ __ _ __  _  __ _ \n" +
" / __/ _` | | |  _/ _ \\| '__| '_ \\| |/ _` |\n" +
"| (_| (_| | | | || (_) | |  | | | | | (_| |\n" +
" \\___\\__,_|_|_|_| \\___/|_|  |_| |_|_|\\__,_|"
            );
 
    }
}
