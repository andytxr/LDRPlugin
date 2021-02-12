package andytxr.ldrplugins;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class CommandAlbums implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {

        if(sender instanceof Player)
        {

            Player p = (Player) sender;
            String album = null;
            String[] link = new String[5];
            String[] msg = new String[] {"Bela escolha!", "Grandissima escolha!", "Excelente escolha!", "Que bom gosto!"};
            Random random = new Random();

            link[0]="https://open.spotify.com/album/5VoeRuTrGhTbKelUfwymwu?si=O6h3wHRIRFi5iNI718RmGA";
            link[1]="https://open.spotify.com/album/1ORxRsK3MrSLvh7VQTF01F?si=7fX0nSD9QSyFjbVtA76cSw";
            link[2]="https://open.spotify.com/album/2DpEBrjCur1ythIZ10gJWw?si=NfsZvOwmTOmsytcb0_R9mw";
            link[3]="https://open.spotify.com/album/7xYiTrbTL57QO0bb4hXIKo?si=3ljpzbWpQOGVBgy2VA_IAQ";
            link[4]="https://open.spotify.com/album/5XpEKORZ4y6OrCZSKsi46A?si=cCcc6DMRSAeMWm9Uc55U0g";

            if(args.length==0)
            {
                p.sendMessage(ChatColor.AQUA+"Born to Die (2012), Ultraviolence(2014), Honeymoon(2016), Lust For Life(2017), Norman F. Rockwell(2019)");
                p.sendMessage(ChatColor.AQUA+"Dê '/albums escolher nomedoalbum' para escolher algum.");
            }

            else if(args[0].equalsIgnoreCase("escolher"))
            {

                if(args[1].equalsIgnoreCase("Born"))
                {
                    p.sendMessage(ChatColor.GOLD+ "Album escolhido: Born to Die. "+msg[random.nextInt(msg.length-1)]+" Acesse: " + link[0]);
                }
                else if(args[1].equalsIgnoreCase("Ultraviolence"))
                {
                    p.sendMessage(ChatColor.DARK_GRAY+ "Album escolhido: Ultraviolence. "+msg[random.nextInt(msg.length-1)]+" Acesse: " +link[1]);
                }
                else if(args[1].equalsIgnoreCase("Honeymoon"))
                {
                    p.sendMessage(ChatColor.YELLOW+ "Album escolhido: Honeymoon. "+msg[random.nextInt(msg.length-1)]+" Acesse: " + link[2]);
                }
                else if(args[1].equalsIgnoreCase("Lust"))
                {
                    p.sendMessage(ChatColor.GRAY+ "Album escolhido: Lust for Life. "+msg[random.nextInt(msg.length-1)]+" Acesse: " + link[3]);
                }
                else if(args[1].equalsIgnoreCase("Norman"))
                {
                    p.sendMessage(ChatColor.GREEN+ "Album escolhido: Norman Fucking Rockwell. "+msg[random.nextInt(msg.length-1)]+" Acesse: " + link[4]);
                }

            }

        }

        return true;

    }


}
